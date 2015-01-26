package org.lnu.is.integration.assets

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.value2Expression
import io.gatling.http.Predef.ELFileBody
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status
import io.gatling.http.request.builder.HttpRequestBuilder.toActionBuilder

object AssetInvalidRequestBodyIntegrationTest {

  val testCase = exec(http("Post Invalid Asset Data")
                    .post("/assets")
                    .basicAuth("admin", "nimda")
                    .header("Content-Type", "application/json")
                    .body(ELFileBody("data/body-invalid.json"))
                    .check(status.is(422))
                    .asJSON)

}