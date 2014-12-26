package org.lnu.is.integration.address.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.json.Jackson
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.builder.AbstractHttpRequestBuilder.toActionBuilder

object AddressTypeIntegrationTest {

  val feed = jsonFile("data/address/types/json_data.json").circular

  val scn = scenario("Address type get scenario")
    .feed(feed)
    .exec(http("Address Types Get Paged Result")
      .get("${targetUrl}")
      .check(bodyString.transform(Jackson.parse).is("${expectedResponse}"))
    )

}
