package org.lnu.is.integration.cases.assets.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object AssetTypeIntegrationTest {

  val response = RawFileBody("data/asset/type/response.json")

  val testCase = exec(http("Asset Type Get Paged Result")
      .get("/assets/types")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )

}
