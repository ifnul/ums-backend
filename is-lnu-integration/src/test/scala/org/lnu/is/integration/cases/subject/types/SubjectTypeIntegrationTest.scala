package org.lnu.is.integration.cases.subject.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody


object SubjectTypeIntegrationTest {

  val response = RawFileBody("data/subject/types/response.json")
  
  val testCase = exec(http("Subject Type Get Paged Result")
      .get("/subjects/types")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}