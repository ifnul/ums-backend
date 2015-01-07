package org.lnu.is.integration.specialty.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody


object SpecialtyTypeIntegrationTest {

  val response = RawFileBody("data/specialty/type/response.json")
  
  val scn = scenario("Specialty Type Simple GET Scenario")
    .exec(http("Specialty Type Get Paged Result")
      .get("/specialties/types")
      .check(bodyString.is(response))
    )
}