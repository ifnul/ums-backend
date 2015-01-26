package org.lnu.is.integration.invalid

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
import io.gatling.http.Predef.ELFileBody
import io.gatling.http.Predef.jsonPath
import io.gatling.core.Predef.csv
import io.gatling.core.Predef.jsonFile
import io.gatling.http.Predef.status
import io.gatling.http.request.builder.HttpRequestBuilder.toActionBuilder
import scala.concurrent.duration.DurationInt

object InvalidRequestBodyIntegrationTest {
    
    val urls = List("/assets", "/benefits", "/employees",
        "/enrolments", "/orders", "/partners", "/persons", "/specialties", "/timeperiods")
    
    val testCase = 
      exec(session => {
        session.set("urls", urls);
      })
      .foreach("${urls}", "url") {
          exec(http("Invalid Json Request Body Request ${url}")
            .post("${url}")
            .basicAuth("admin", "nimda")
            .header("Content-Type", "application/json")
            .body(ELFileBody("data/body-invalid.json"))
            .asJSON
            .check(status.is(422)))
      }
}