package org.lnu.is.integration.enrolment.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object EnrolmentTypeIntegrationTest {

  val response = RawFileBody("data/enrolment/type/response.json")

  val testCase = exec(http("Enrolment Types Get Paged Result")
      .get("/enrolments/types")
      .check(bodyString.is(response))
    )
}