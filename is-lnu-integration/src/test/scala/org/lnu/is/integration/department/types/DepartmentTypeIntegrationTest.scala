package org.lnu.is.integration.department.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.json.Jackson
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object DepartmentTypeIntegrationTest {

  val response = RawFileBody("data/department/type/response.json")
  
  val scn = scenario("Department Type Simple GET Scenario")
    .exec(http("Department Type Get Paged Result")
      .get("/departments/types")
      .check(bodyString.is(response))
    )
}