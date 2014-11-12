package org.lnu.is.integration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import io.gatling.core.json.Jackson

object EduFormTypeIntegrationTest {

  val myFeed = jsonFile("data/eduformtypes/json_data.json").circular

  val scn = scenario("Scenario Name")
    .feed(myFeed)
    .exec(http("Edu Form Types Get Paged Result")
      .get("${targetUrl}")
      .check(bodyString.transform(Jackson.parse).is("${expectedResponse}"))
    )        

}
