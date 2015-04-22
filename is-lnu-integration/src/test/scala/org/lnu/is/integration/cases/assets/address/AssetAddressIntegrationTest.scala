package org.lnu.is.integration.cases.assets.address

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
import org.lnu.is.integration.config.ComplexTest
import io.gatling.core.structure.ChainBuilder

object AssetAddressIntegrationTest extends ComplexTest {

  val testCase = exec(init)
    .exec(before)
    .exec(http("Post Asset Address")
        .post("/assets/${assetId}/addresses")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/asset/address/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("assetAddressId")))
    .exec(http("Get Asset Address")
        .get("/assets/${assetId}/addresses/${assetAddressId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(http("Update Asset Address")
        .put("/assets/${assetId}/addresses/${assetAddressId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/asset/address/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Asset Address")
        .get("/assets/${assetId}/addresses/${assetAddressId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
    .exec(http("Delete Asset Address")
		    .delete("/assets/${assetId}/addresses/${assetAddressId}")
        .basicAuth("admin", "nimda")
		    .check(status.is(204)))
    .exec(http("Get Asset Address")
		    .get("/assets/${assetId}/addresses/${assetAddressId}")
        .basicAuth("admin", "nimda")
    	  .check(status.is(404)))
    .exec(after)
    
  def init(): ChainBuilder = {
    exec(session => {
          session
            .set("invNum", UUID.randomUUID())
            .set("serialNum", UUID.randomUUID())
            .set("newNote", UUID.randomUUID())
        })    
  }

  def before(): ChainBuilder = {
    exec(http("Post Asset")
        .post("/assets")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/asset/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("assetId")))
  }
  
  def after(): ChainBuilder = {
    exec(http("Delete Asset")
        .delete("/assets/${assetId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))    
  }
      
}