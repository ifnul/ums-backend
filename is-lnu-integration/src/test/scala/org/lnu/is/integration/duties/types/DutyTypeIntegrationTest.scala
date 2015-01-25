package org.lnu.is.integration.duties.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody


object DutyTypeIntegrationTest {

  val response = RawFileBody("data/duty/types/response.json")

  val testCase = exec(http("Duty Status Get Paged Result")
      .get("/duties/types")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}