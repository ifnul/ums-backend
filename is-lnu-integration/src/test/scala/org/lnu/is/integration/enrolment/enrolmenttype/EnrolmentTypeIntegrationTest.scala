package org.lnu.is.integration.enrolment.enrolmenttype

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import io.gatling.core.json.Jackson

object EnrolmentTypeIntegrationTest {

  val feed = jsonFile("data/enrolment/type/json_data.json").circular

  val scn = scenario("Enrolment Type Simple GET Scenario")
    .feed(feed)
    .exec(http("Enrolment Types Get Paged Result")
      .get("${targetUrl}")
      .check(bodyString.transform(Jackson.parse).is("${expectedResponse}"))
    )
}