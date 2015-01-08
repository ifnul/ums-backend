package org.lnu.is.integration.honor.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object HonorTypeIntegrationTest {
  
  val response = RawFileBody("data/honor/type/response.json")
  
  val scn = scenario("Honor Types Simple GET Scenario")
    .exec(http("Honor Types Get Paged Result")
      .get("/honors/types")
      .check(bodyString.is(response))
    )
}