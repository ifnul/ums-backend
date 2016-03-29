package org.lnu.is.integration.cases.assets

import java.util.UUID

import scala.concurrent.duration.DurationInt

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.validatorCheckBuilder2CheckBuilder
import io.gatling.core.Predef.value2Expression
import io.gatling.core.Predef.value2Success
import io.gatling.http.Predef.ELFileBody
import io.gatling.http.Predef.http
import io.gatling.http.Predef.jsonPath
import io.gatling.http.Predef.status

object AssetIntegrationTest {

  val testCase = exec(session => {
      session
      	.set("invNum", UUID.randomUUID())
        .set("newInvNum", UUID.randomUUID())
        .set("serialNum", UUID.randomUUID())
    })
    .exec(http("Post Asset")
		  .post("/assets")
		  .header("Content-Type", "application/json")
		  .body(ELFileBody("data/asset/post.json"))
		  .asJSON
		  .check(status.is(201))
		  .check(jsonPath("$.id").find.saveAs("assetId")))
    .pause(500 milliseconds, 2 seconds)
    .exec(http("Get Asset")
      .get("/assets/${assetId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200)))
    .exec(http("Update Asset")
      .put("/assets/${assetId}")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/asset/put.json"))
      .asJSON
      .check(status.is(200)))
    .exec(http("Get Asset")
      .get("/assets/${assetId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200))
      .check(jsonPath("$.invNum").find.is("${newInvNum}")))
    .exec(http("Delete Asset")
		  .delete("/assets/${assetId}")
      .basicAuth("admin", "nimda")
		  .check(status.is(204)))
    .exec(http("Get Asset")
		  .get("/assets/${assetId}")
      .basicAuth("admin", "nimda")
    	.check(status.is(404)))
      
}