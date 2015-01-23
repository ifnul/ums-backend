package org.lnu.is.integration.access

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.doIf
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.foreach
import io.gatling.core.Predef.feed
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.validatorCheckBuilder2CheckBuilder
import io.gatling.core.Predef.value2Expression
import io.gatling.core.Predef.value2Success
import io.gatling.http.Predef.http
import io.gatling.http.Predef.jsonPath
import io.gatling.core.Predef.csv
import io.gatling.core.Predef.jsonFile
import io.gatling.http.Predef.status
import io.gatling.http.request.builder.HttpRequestBuilder.toActionBuilder
import scala.concurrent.duration.DurationInt

object AccessDeniedIntegrationTest {
    
    val links = csv("data/access/links.csv").random
  
    val testCase = 
      feed(links)
      .pause(1 seconds)  
      .exec(http("Access Denied Get Paged Result")
        .get("${url}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.resources[*]").ofType[Map[String, Any]].findAll.saveAs("resources")))
      .pause(2 seconds)  
      .exec(
            foreach("${resources}", "resource"){
                  exec( session => {
                      val resource = session("resource").as[Map[String, Any]]
                      val resourceId = resource("id")
                      session.set("resourceId", resourceId)
                  })
                  .exec(
                      http("Checking Access Denied Request Access")
                        .get("${url}/${resourceId}")
                        .basicAuth("broken_student", "nevdaha")
                        .check(status.is(403))
                  )      
            })
      .pause(1 seconds)  
}
