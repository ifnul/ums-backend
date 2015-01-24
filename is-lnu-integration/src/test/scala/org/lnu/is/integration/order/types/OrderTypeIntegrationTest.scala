package org.lnu.is.integration.order.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody


object OrderTypeIntegrationTest {

  val response = RawFileBody("data/order/type/response.json")
  
  val testCase = exec(http("Order Type Get Paged Result")
      .get("/orders/types")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}