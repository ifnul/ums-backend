package org.lnu.is.integration.paper.usage

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object PaperUsageIntegrationTest {
  
  val response = RawFileBody("data/paper/usage/response.json")
  
  val testCase = exec(http("Paper Usage Get Paged Result")
      .get("/papers/usages")
      .basicAuth("admin","nimda")
      .check(bodyString.is(response))
    )
}