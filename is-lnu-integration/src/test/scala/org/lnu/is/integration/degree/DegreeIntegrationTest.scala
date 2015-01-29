package org.lnu.is.integration.degree

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

object DegreeIntegrationTest {

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
    		.check(jsonPath("$.id").find.saveAs("personId")))
    .exec(http("Post Degree")
        .post("/degrees")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/degree/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("degreeId")))
    .exec(
      http("Get Degree")
        .get("/degrees/${degreeId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(
      http("Update Degree")
        .put("/degrees/${degreeId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/degree/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(
      http("Get Degree")
        .get("/degrees/${degreeId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.degreeTypeId").find.is("2")))
    .exec(http("Delete Degree")
        .delete("/degrees/${degreeId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Delete Person")
  		  .delete("/persons/${personId}")
  		  .basicAuth("admin", "nimda")
  		  .check(status.is(204)))

}