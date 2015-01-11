package org.lnu.is.integration.timeperiod

import scala.concurrent.duration.DurationInt

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.validatorCheckBuilder2CheckBuilder
import io.gatling.core.Predef.value2Expression
import io.gatling.http.Predef.ELFileBody
import io.gatling.http.Predef.http
import io.gatling.http.Predef.jsonPath
import io.gatling.http.Predef.status

object TimePeriodIntegrationTest {

  val testCase = exec(http("Post TimePeriod")
		.post("/timeperiods")
		.header("Content-Type", "application/json")
		.body(ELFileBody("data/timeperiod/post.json"))
		.asJSON
		.check(status.is(201))
		.check(jsonPath("$.id").find.saveAs("timePeriodId")))
    .pause(500 milliseconds, 2 seconds)
    .exec(
      http("Get TimePeriod")
        .get("/timeperiods/${timePeriodId}")
        .check(status.is(200)))
    .exec(
      http("Update TimePeriod")
        .put("/timeperiods/${timePeriodId}")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/timeperiod/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(
      http("Get TimePeriod")
        .get("/timeperiods/${timePeriodId}")
        .check(status.is(200))
        .check(jsonPath("$.name").find.is("Enrolment company 2015")))
    .exec(http("Delete TimePeriod")
		.delete("/timeperiods/${timePeriodId}")
		.check(status.is(204))
    )
    .exec(http("Get TimePeriod")
		.get("/timeperiods/${timePeriodId}")
    	.check(status.is(404))
    )
}