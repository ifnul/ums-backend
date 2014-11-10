package org.lnu.is.integration.person

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class PersonIntegrationTest extends Simulation {

  val httpConf = http
    .baseURL("http://localhost:8080/is-lnu-rest-api/api")
    .acceptHeader("application/json")

  val scn = scenario("Manage Persons")
    .exec(http("Post Person")
      .post("/persons")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/person-post.json"))
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
        .body(ELFileBody("data/person-put.json"))
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

  setUp(
    scn.inject(atOnceUsers(1)).protocols(httpConf))
}
