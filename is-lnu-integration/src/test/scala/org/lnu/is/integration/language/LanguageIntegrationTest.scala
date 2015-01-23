package org.lnu.is.integration.language

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object LanguageIntegrationTest {

  val response = RawFileBody("data/language/response.json")
  
  val testCase = exec(http("Language Get Paged Result")
      .get("/languages")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}