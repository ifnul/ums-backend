package org.lnu.is.integration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object PersonIntegrationTest {

  val scn = scenario("Manage Persons")
    .exec(http("Post Person")
      .post("/persons")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/person/person-post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("identifier")))
    .pause(500 milliseconds, 2 seconds)
    .exec(
      http("Get Person")
        .get("/persons/${identifier}")
        .check(status.is(200)))
    .exec(
      http("Update Person")
        .put("/persons/${identifier}")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/person-put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(
      http("Get Person")
        .get("/persons/${identifier}")
        .check(status.is(200))
        .check(jsonPath("$.name").find.is("name1")))
    .exec(http("Delete Person")
      .delete("/persons/${identifier}")
      .check(status.is(204)))
      
}
