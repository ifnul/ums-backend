package org.lnu.is.integration.benefit.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object BenefitTypeIntegrationTest {

  val response = RawFileBody("data/benefit/type/response.json")
  
  val testCase = exec(http("Benefit Type Get Paged Result")
      .get("/benefits/types")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}