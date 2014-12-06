package org.lnu.is.integration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import io.gatling.core.json.Jackson

object AddressTypeIntegrationTest {

  val myFeed = jsonFile("data/address/types/json_data.json").circular

  val scn = scenario("Address type get scenario")
    .feed(myFeed)
    .exec(http("Address Types Get Paged Result")
      .get("${targetUrl}")
      .check(bodyString.transform(Jackson.parse).is("${expectedResponse}"))
    )

}
