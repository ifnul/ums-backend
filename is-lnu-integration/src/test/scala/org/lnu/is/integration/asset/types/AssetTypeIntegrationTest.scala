package org.lnu.is.integration.asset.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.json.Jackson
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.builder.AbstractHttpRequestBuilder.toActionBuilder

object AssetTypeIntegrationTest {

  val feed = jsonFile("data/asset/type/json_data.json").circular

  val scn = scenario("Asset type get scenario")
    .feed(feed)
    .exec(http("Asset Type Get Paged Result")
      .get("${targetUrl}")
      .check(bodyString.transform(Jackson.parse).is("${expectedResponse}"))
    )

}
