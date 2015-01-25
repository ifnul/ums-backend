package org.lnu.is.integration.employee.status

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object EmployeeStatusIntegrationTest {

  val response = RawFileBody("data/employee/status/response.json")

  val testCase = exec(http("Employee Status Get Paged Result")
      .get("/employees/statuses")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}