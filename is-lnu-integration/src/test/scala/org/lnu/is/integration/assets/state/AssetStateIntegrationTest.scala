package org.lnu.is.integration.assets.state

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object AssetStateIntegrationTest {

  val response = RawFileBody("data/asset/state/response.json")

  val testCase = exec(http("Asset State Get Paged Result")
      .get("/assets/states")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )

}
