package org.lnu.is.integration.asset.status

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object AssetStatusIntegrationTest {

  val response = RawFileBody("data/asset/status/response.json")

  val testCase = exec(http("Asset Status Get Paged Result")
      .get("/assets/statuses")
      .check(bodyString.is(response))
    )

}