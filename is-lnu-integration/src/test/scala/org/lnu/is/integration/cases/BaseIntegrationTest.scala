package org.lnu.is.integration.cases

import io.gatling.core.Predef.{checkBuilder2Check, exec, findCheckBuilder2ValidatorCheckBuilder, stringToExpression, validatorCheckBuilder2CheckBuilder, value2Expression, value2Success}
import io.gatling.http.Predef.{http, jsonPath, status}
import io.gatling.http.request.builder.HttpRequestBuilder
import io.gatling.http.request.builder.HttpRequestBuilder.toActionBuilder

/**
 * Created by orestkyrylchuk on 2/15/15.
 */
abstract class BaseIntegrationTest {

  val username = "admin"
  val password = "nimda"

  def buildTestCaseToCheckFieldsExistence(url: String, title: String, fields: List[String]) = {
    buildTestCase(url, title, buildHttpRequestWithFieldsExistenceCheck(
        http(title)
          .get(url + "/${resourceId}")
          .basicAuth(username, password)
          .check(status.is(200)), fields
      ))
  }

  def buildTestCase(url: String, title: String, httpRequest: HttpRequestBuilder) = {
    exec(http("Multiple " + title)
      .get(url)
      .basicAuth(username, password)
      .check(status.is(200))
      .check(jsonPath("$.count").find.saveAs("count"))
      .check(jsonPath("$.limit").find.saveAs("limit"))
      .check(jsonPath("$.offset").find.saveAs("offset"))
      .check(jsonPath("$.resources[*]").ofType[Map[String, Any]].findAll.saveAs("resources")))
    .exec(session => {
      val offset = session("offset").as[Int]
      val limit = session("limit").as[Int]
      val count = session("count").as[Int]

      // First occurrence -> Situation, when offset == 0 and needs to proceed.
      val result = offset + limit < count || offset <= count

      session.set("result", result)
    })
    .asLongAs(session => session("result").as[Boolean]) {
      exec(
        exec(http("Multiple Paged Request for: " + url)
          .get(url + "?offset=${offset}")
          .basicAuth(username, password)
          .check(status.is(200))
          .check(jsonPath("$.count").find.saveAs("count"))
          .check(jsonPath("$.limit").find.saveAs("limit"))
          .check(jsonPath("$.offset").find.saveAs("offset"))
          .check(jsonPath("$.resources[*]").ofType[Map[String, Any]].findAll.saveAs("resources"))))
      .foreach("${resources}", "resource") {
        exec( session => {
          val resource = session("resource").as[Map[String, Any]]
          val resourceId = resource("id")

          session.set("resourceId", resourceId)
        })
        .exec(httpRequest)
      }
      .exec(session => {
        val offset = session("offset").as[Int]
        val limit = session("limit").as[Int]
        val count = session("count").as[Int]

        // Can be a situation, when offset == 0 and offset + count will be > count
        // That's why we need to add additional check -> offset != null
        val result = offset + limit < count || (offset <= count && offset != 0)

        session
          .set("offset", offset + limit)
          .set("result", result)
      })
    }
  }

  def buildHttpRequestWithFieldsExistenceCheck(builder: HttpRequestBuilder, fields: List[String]): HttpRequestBuilder = fields match {
    case List() => builder
    case field::tail => buildHttpRequestWithFieldsExistenceCheck(builder.check(jsonPath("$." + field).find.exists), tail)
  }

}