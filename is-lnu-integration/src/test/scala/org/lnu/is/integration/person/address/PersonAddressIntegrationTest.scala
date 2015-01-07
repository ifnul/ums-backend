package org.lnu.is.integration.person.address

import java.util.UUID

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

object PersonAddressIntegrationTest {

  val scn = scenario("Manage Person Addresses")
    .exec(session => {
      session
      	.set("idnum", UUID.randomUUID())
      	.set("begDate", "2010-01-01")
      	.set("endDate", "2014-12-01")
    })
    //Creating new person
    .exec(http("Post Person")
		.post("/persons")
		.header("Content-Type", "application/json")
		.body(ELFileBody("data/person/post.json"))
		.asJSON
		.check(status.is(201))
		.check(jsonPath("$.id").find.saveAs("personId")))
	// Creating new person address
	.exec(http("Post Person Address")
	    .post("/persons/${personId}/addresses")
	    .header("Content-Type", "application/json")
	    .body(ELFileBody("data/person/address/post.json"))
	    .asJSON
	    .check(status.is(201))
	    .check(jsonPath("$.id").find.saveAs("personAddressId")))
	// Getting created earlier person address    
	.exec(http("Get Person Address")
	    .get("/persons/${personId}/addresses/${personAddressId}")
	    .check(status.is(200)))
    // Updating person address
    .exec(http("Update Person Address")
        .put("/persons/${personId}/addresses/${personAddressId}")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/address/put.json"))
        .asJSON
        .check(status.is(200)))
    // Checking updated person address
    .exec(http("Get Person Address")
		.get("/persons/${personId}/addresses/${personAddressId}")
		.check(status.is(200))
		.check(jsonPath("$.zipCode").find.is("zipCode1")))
	// Deleting person address
	.exec(http("Delete Person Address")
	    .delete("/persons/${personId}/addresses")
	    .check(status.is(204)))
	// Deleting person
    .exec(http("Delete Person")
		.delete("/persons/${personId}")
		.check(status.is(204))
    )
}
