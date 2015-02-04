package org.lnu.is.integration.person.contact

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

object PersonContactIntegrationTest {

  val testCase = exec(session => {
      session
      	.set("idnum", UUID.randomUUID())
      	.set("begDate", "2010-01-01")
      	.set("endDate", "2014-12-01")
    })
  .exec(http("Post Person")
		.post("/persons")
    .basicAuth("admin", "nimda")
		.header("Content-Type", "application/json")
		.body(ELFileBody("data/person/post.json"))
		.asJSON
		.check(status.is(201))
		.check(jsonPath("$.id").find.saveAs("personId")))
  .exec(http("Post Person Contact")
      .post("/persons/${personId}/contacts")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/person/contact/post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("personContactId")))
  .exec(http("Get Person Contact")
      .get("/persons/${personId}/contacts/${personContactId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200)))
  .exec(http("Update Person Contact")
        .put("/person/${personId}/contacts/${personContactId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/contact/put.json"))
        .asJSON
        .check(status.is(200)))
  .exec(http("Get Person Contact")
        .get("/persons/${personId}/contacts/${personContactId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.value").find.is("value1")))
  .exec(http("Delete Person Contact")
      .delete("/persons/${personId}/contacts/${personContactId}")
      .basicAuth("admin", "nimda")
      .check(status.is(204)))
  .exec(http("Delete Person")
    .delete("/persons/${personId}")
    .basicAuth("admin", "nimda")
    .check(status.is(204)))
}