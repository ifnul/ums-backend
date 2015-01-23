package org.lnu.is.integration.adminunit

import scala.concurrent.duration.DurationInt

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.feed
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

  val feeder = jsonFile("data/adminunit/response.json").circular

  val testCase = feed(feeder)
    .exec(http("Admin Unit Get Paged Result")
      .get("${targetUrl}")
      .basicAuth("admin", "nimda")
      .check(status.is(200))
      .check(jsonPath("$.count").find.saveAs("${count}"))
    )
}