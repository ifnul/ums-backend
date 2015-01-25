package org.lnu.is.integration.family.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object FamilyTypeIntegrationTest {

  val response = RawFileBody("data/family/types/response.json")

  val testCase = exec(http("Family Types Get Paged Result")
      .get("/families/types")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}