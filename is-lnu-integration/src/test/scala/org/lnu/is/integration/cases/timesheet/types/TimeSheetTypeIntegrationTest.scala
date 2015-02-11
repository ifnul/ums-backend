package org.lnu.is.integration.cases.timesheet.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object TimeSheetTypeIntegrationTest {

  val response = RawFileBody("data/timesheet/type/response.json")
  val url = "/timesheets/types"
  val username = "admin"
  val password = "nimda"
  
  val testCase = exec(http("Timesheet Type Get Paged Result")
      .get(url)
      .basicAuth(username, password)
      .check(bodyString.is(response))
    )
}
