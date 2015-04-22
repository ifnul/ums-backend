package org.lnu.is.integration.cases.order

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

object OrderIntegrationTest extends ComplexTest {

  val testCase = exec(init)
    .exec(before)
    .exec(http("Post Order")
        .post("/orders")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/order/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("orderId")))
    .exec(http("Get Order")
        .get("/orders/${orderId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(http("Update Order")
        .put("/orders/${orderId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/order/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Order")
        .get("/orders/${orderId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
    .exec(http("Delete Order")
		    .delete("/orders/${orderId}")
        .basicAuth("admin", "nimda")
		    .check(status.is(204)))
    .exec(http("Get Order")
		    .get("/orders/${orderId}")
        .basicAuth("admin", "nimda")
    	  .check(status.is(404)))
    .exec(after)
    
  def init(): ChainBuilder = {
    exec(session => {
          session
            .set("invNum", UUID.randomUUID())
            .set("serialNum", UUID.randomUUID())
            .set("note", UUID.randomUUID())
            .set("newNote", UUID.randomUUID())
            .set("partnerName", UUID.randomUUID())
            .set("partnerManager", UUID.randomUUID())
            .set("partnerPhone", UUID.randomUUID())
            .set("partnerEmail", UUID.randomUUID())
            .set("partnerAbbr", UUID.randomUUID())
            .set("departmentAbbrName", UUID.randomUUID())
            .set("departmentName", UUID.randomUUID())
            .set("departmentManager", UUID.randomUUID())
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
    .exec(http("Post Partner")
        .post("/partners")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/partner/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("partnerId")))
    .exec(http("Post Department")
        .post("/departments")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/department/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("departmentId")))
    .exec(http("Post TimePeriod")
        .post("/timeperiods")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/timeperiod/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("timePeriodId")))  
  }
  
  def after(): ChainBuilder = {
    exec(http("Delete TimePeriod")
        .delete("/timeperiods/${timePeriodId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Delete Department")
        .delete("/departments/${departmentId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Delete Partner")
        .delete("/partners/${partnerId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Delete Asset")
        .delete("/assets/${assetId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))    
  }
      
}