package org.lnu.is.integration.employee.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object EmployeeTypeIntegrationTest {

  val response = RawFileBody("data/employee/types/response.json")

  val testCase = exec(http("Employee Types Get Paged Result")
      .get("/employees/types")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}