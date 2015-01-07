package org.lnu.is.integration.enrolment.statustype

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object EnrolmentStatusTypeIntegrationTest {

  val response = RawFileBody("data/enrolment/statustype/response.json")

  val scn = scenario("Enrolment Status Type Simple GET Scenario")
    .exec(http("Enrolment Status Types Get Paged Result")
      .get("/enrolments/statustypes")
      .check(bodyString.is(response))
    )
}