package org.lnu.is.integration.enrolment.subject

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object EnrolmentSubjectIntegrationTest {

  val response = RawFileBody("data/enrolment/subject/response.json")
  
  val testCase = exec(http("Enrolment subject Types Get Paged Result")
      .get("/enrolments/subjects")
      .check(bodyString.is(response))
    )
}