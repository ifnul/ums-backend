package org.lnu.is.integration.department.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.json.Jackson
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object DepartmentTypeIntegrationTest {

  val response = RawFileBody("data/department/type/response.json")
  
  val testCase = exec(http("Department Type Get Paged Result")
      .get("/departments/types")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}