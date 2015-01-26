package org.lnu.is.integration.person.paper

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

object PersonPaperIntegrationTest {

  val testCase = exec(session => {
      session
        .set("docSeries", UUID.randomUUID())
        .set("docNum", UUID.randomUUID())
        .set("docDate", "2010-01-01")
        .set("docIssued", UUID.randomUUID())
        .set("docPin", UUID.randomUUID())
   })
  .exec(http("Post Person")
    .post("/persons")
    .basicAuth("admin", "nimda")
    .header("Content-Type", "application/json")
    .body(ELFileBody("data/person/post.json"))
    .asJSON
    .check(status.is(201))
    .check(jsonPath("$.id").find.saveAs("personId")))
  .exec(http("Post Person Paper")
      .post("/persons/${personId}/papers")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/person/paper/post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("personPaperId")))
  .exec(http("Get Person Paper")
      .get("/persons/${personId}/papers/${personPaperId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200)))
  .exec(http("Update Person Paper")
        .put("/persons/${personId}/papers/${personPaperId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/paper/put.json"))
        .asJSON
        .check(status.is(200)))
  .exec(http("Get Person Paper")
    .get("/persons/${personId}/papers/${personPaperId}")
    .basicAuth("admin", "nimda")
    .check(status.is(200))
    .check(jsonPath("$.mark").find.is("4.8")))
  .exec(http("Delete Person Paper")
      .delete("/persons/${personId}/papers/${personPaperId}")
      .basicAuth("admin", "nimda")
      .check(status.is(204)))
  // Deleting person
  .exec(http("Delete Person")
    .delete("/persons/${personId}")
    .basicAuth("admin", "nimda")
    .check(status.is(204)))
}