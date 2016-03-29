package org.lnu.is.integration.cases.benefit

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

object BenefitIntegrationTest {

  val testCase = exec(session => {
      session
      	.set("idnum", UUID.randomUUID())
      	.set("other_value_example", "value")
    })
    .exec(http("Post Benefit")
  		  .post("/benefits")
        .basicAuth("admin", "nimda")
    		.header("Content-Type", "application/json")
    		.body(ELFileBody("data/benefit/post.json"))
    		.asJSON
    		.check(status.is(201))
    		.check(jsonPath("$.enrolmentId").find.saveAs("benefitId")))
    .exec(http("Get Benefit")
        .get("/benefits/${benefitId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(http("Update Benefit")
        .put("/benefits/${benefitId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/benefit/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Benefit")
        .get("/benefits/${benefitId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.name").find.is("name1")))
    .exec(http("Delete Benefit")
  		  .delete("/benefits/${benefitId}")
  		  .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Get Benefit")
  		  .get("/benefits/${benefitId}")
        .basicAuth("admin", "nimda")
      	.check(status.is(404)))
      
}