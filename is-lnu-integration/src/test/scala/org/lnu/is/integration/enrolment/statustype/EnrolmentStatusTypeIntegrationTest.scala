package org.lnu.is.integration.enrolment.statustype

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import io.gatling.core.json.Jackson

object EnrolmentStatusTypeIntegrationTest {

  val myFeed = jsonFile("data/enrolment/statustype/json_data.json").circular

  val scn = scenario("Enrolment Status Type Simple GET Scenario")
    .feed(myFeed)
    .exec(http("Enrolment Status Types Get Paged Result")
      .get("${targetUrl}")
      .check(bodyString.transform(Jackson.parse).is("${expectedResponse}"))
    )
}