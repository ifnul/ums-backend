package org.lnu.is.integration.person.name

import scala.concurrent.duration.DurationInt
import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.validatorCheckBuilder2CheckBuilder
import io.gatling.core.Predef.value2Expression
import io.gatling.core.Predef.value2Success
import io.gatling.http.Predef.ELFileBody
import io.gatling.http.Predef.http
import io.gatling.http.Predef.jsonPath
import io.gatling.http.Predef.status
import io.gatling.http.request.builder.AbstractHttpRequestBuilder.toActionBuilder
import java.util.UUID


object PersonNameIntegrationTest {

  val scn = scenario("Manage Person Name")
    .exec(session => {
      session
      	.set("idnum", UUID.randomUUID())
    })
    // Creating new person -> Needed to test person
    .exec(http("Post Person")
		.post("/persons")
		.header("Content-Type", "application/json")
		.body(ELFileBody("data/person/post.json"))
		.asJSON
		.check(status.is(201))
		.check(jsonPath("$.id").find.saveAs("personId")))
	.exec(http("Post Person Name")
	    .post("/persons/${personId}/names")
	    .header("Content-Type", "application/json")
	    .body(ELFileBody("data/person/name/post.json"))
	    .asJSON
	    .check(status.is(201))
	    .check(jsonPath("$.id").find.saveAs("personNameId")))
	.exec(http("Get Person Name")
	    .get("/persons/${personId}/names/${personNameId}")
	    .check(status.is(200)))
    .exec(http("Update Person Name")
        .put("/persons/${personId}/names/${personNameId}")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/name/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Person Name")
        .get("/persons/${personId}/names/${personNameId}")
        .check(status.is(200))
        .check(jsonPath("$.firstName").find.is("Северинко")))
    .exec(http("Delete Person Name")
		.delete("/persons/${personId}/names/${personNameId}")
		.check(status.is(204)))
	// Deleting person
	.exec(http("Delete Person")
		.delete("/persons/${personId}")
		.check(status.is(204))
    )
}