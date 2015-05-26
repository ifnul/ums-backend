package org.lnu.is.integration.cases.partner

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

object PartnerIntegrationTest {

  val testCase = exec(session => {
      session
      	.set("partnerName", UUID.randomUUID())
      	.set("partnerManager", UUID.randomUUID())
      	.set("newPartnerManager", UUID.randomUUID())
      	.set("partnerPhone", UUID.randomUUID())
      	.set("partnerEmail", UUID.randomUUID())
      	.set("partnerAbbr", UUID.randomUUID())
    })
    .exec(http("Post Partner")
  		  .post("/partners")
  		  .header("Content-Type", "application/json")
  		  .body(ELFileBody("data/partner/post.json"))
  		  .asJSON
  		  .check(status.is(201))
  		  .check(jsonPath("$.id").find.saveAs("partnerId")))
    .exec(http("Get Partner")
        .get("/partners/${partnerId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(http("Update Partner")
        .put("/partners/${partnerId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/partner/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Partner")
        .get("/partners/${partnerId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.manager").find.is("${newPartnerManager}")))
    .exec(http("Delete Partner")
  		  .delete("/partners/${partnerId}")
        .basicAuth("admin", "nimda")
  		  .check(status.is(204)))
    .exec(http("Get Partner")
  		  .get("/partners/${partnerId}")
        .basicAuth("admin", "nimda")
      	.check(status.is(404)))
      
}