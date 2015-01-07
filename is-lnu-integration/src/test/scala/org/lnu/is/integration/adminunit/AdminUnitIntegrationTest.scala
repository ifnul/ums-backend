package org.lnu.is.integration.adminunit

import scala.concurrent.duration.DurationInt

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.validatorCheckBuilder2CheckBuilder
import io.gatling.core.Predef.value2Expression
import io.gatling.core.Predef.value2Success
import io.gatling.http.Predef.ELFileBody
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.Predef.jsonPath
import io.gatling.http.Predef.status


object AdminUnitIntegrationTest {

  val feed = jsonFile("data/adminunit/response.json").circular

  val scn = scenario("Admin unit get scenario")
    .feed(feed)
    .exec(http("Admin Unit Get Paged Result")
      .get("${targetUrl}")
      .check(status.is(200))
      .check(jsonPath("$.count").find.saveAs("${count}"))
    )
}