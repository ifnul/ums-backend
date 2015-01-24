package org.lnu.is.integration.reasons

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody


object ReasonIntegrationTest {

  val response = RawFileBody("data/reason/expected.json")
  
  val testCase = exec(http("Reasons Get Paged Result")
      .get("/reasons")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}