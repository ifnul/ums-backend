package org.lnu.is.integration.address.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object AddressTypeIntegrationTest {

  val response = RawFileBody("data/address/types/response.json")

  val scn = scenario("Address type get scenario")
    .exec(http("Address Types Get Paged Result")
      .get("/addresstypes")
      .check(bodyString.is(response))
    )

}
