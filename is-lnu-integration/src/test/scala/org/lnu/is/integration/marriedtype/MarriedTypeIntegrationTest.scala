package org.lnu.is.integration.marriedtype

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody


object MarriedTypeIntegrationTest {

  val response = RawFileBody("data/marriedtype/response.json")
  
  val scn = scenario("Married Types Simple GET Scenario")
    .exec(http("Married Types Get Paged Result")
      .get("/marriedtypes")
      .check(bodyString.is(response))
    )
}