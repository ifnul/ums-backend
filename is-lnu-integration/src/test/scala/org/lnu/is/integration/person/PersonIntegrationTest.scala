package org.lnu.is.integration.person

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

object PersonIntegrationTest {

  val testCase = exec(session => {
      session
      	.set("idnum", UUID.randomUUID())
    })
    .exec(http("Post Person")
  		.post("/persons")
      .basicAuth("admin", "nimda")
  		.header("Content-Type", "application/json")
  		.body(ELFileBody("data/person/post.json"))
  		.asJSON
  		.check(status.is(201))
  		.check(jsonPath("$.id").find.saveAs("identifier")))
    .pause(500 milliseconds, 2 seconds)
    .exec(
      http("Get Person")
        .get("/persons/${identifier}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(
      http("Update Person")
        .put("/persons/${identifier}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(
      http("Get Person")
        .get("/persons/${identifier}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.name").find.is("name1")))
    .exec(http("Delete Person")
		.delete("/persons/${identifier}")
      .basicAuth("admin", "nimda")
		  .check(status.is(204)))
    .exec(http("Get Person")
		.get("/persons/${identifier}")
      .basicAuth("admin", "nimda")
    	.check(status.is(404)))

}
