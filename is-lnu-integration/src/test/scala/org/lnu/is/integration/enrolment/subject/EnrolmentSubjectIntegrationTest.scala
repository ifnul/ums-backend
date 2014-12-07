package org.lnu.is.integration.enrolment.subject

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import io.gatling.core.json.Jackson
import java.util.UUID
import java.util.Date

object EnrolmentSubjectIntegrationTest {

  val myFeed = jsonFile("data/enrolment/subject/json_data.json").circular
  
  val scn = scenario("Enrolment subject Type Simple GET Scenario")
    .feed(myFeed)
    .exec(http("Enrolment subject Types Get Paged Result")
      .get("${targetUrl}")
      .check(bodyString.transform(Jackson.parse).is("${expectedResponse}")))
}