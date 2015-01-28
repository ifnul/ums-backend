package org.lnu.is.integration.timesheet.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

//TODO:Add to case
object TimeSheetTypeIntegrationTest {

  val response = RawFileBody("data/timesheet/type/response.json")
  
  val testCase = exec(http("Timesheet Type Get Paged Result")
      .get("/timesheets/types")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}
