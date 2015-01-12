package org.lnu.is.integration.street.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object StreetTypeIntegrationTest {

  val response = RawFileBody("data/street/type/expected.json")
  
  val testCase = exec(http("Street Type Get Paged Result")
      .get("/streets/types")
      .check(bodyString.is(response))
    )
}