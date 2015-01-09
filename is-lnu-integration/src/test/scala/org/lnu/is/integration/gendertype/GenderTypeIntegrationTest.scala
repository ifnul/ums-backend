package org.lnu.is.integration.gendertype

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object GenderTypeIntegrationTest {

  val response = RawFileBody("data/gendertype/response.json")
  
  val testCase = exec(http("Gender Types Get Paged Result")
      .get("/gendertypes")
      .check(bodyString.is(response))
    )
}