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
import io.gatling.http.request.builder.AbstractHttpRequestBuilder.toActionBuilder
import org.lnu.is.integration.PersonIntegrationTest

object PersonAddressIntegrationTest {
	
  val scn = scenario("Manage Persons")
    .exec(session => {
      session
      	.set("idnum", UUID.randomUUID())
      	.set("other_value_example", "value")
    })
    // Firstly, create person
    .exec(http("Post Person")
		.post("/persons")
		.header("Content-Type", "application/json")
		.body(ELFileBody("data/person/post.json"))
		.asJSON
		.check(status.is(201))
		.check(jsonPath("$.id").find.saveAs("personId")))
    // Then create address for that person
	.exec(http("Post address")
	    .post("/persons/${personId}/addresses")
	    .header("Content-Type", "application/json")
	    .body(ELFileBody("data/person/address/post.json"))
	    .asJSON
	    .check(status.is(201))
	    .check(jsonPath("$.id").find.saveAs("personAddressId"))
    )
	// Get request
    // Put request
    // Get request to verify updated address
    // Delete request for address
    .exec(http("Delete address")
        .delete("/persons/${personId}/addresses/${personAddressId}")
        .header("Content-Type", "application/json")
        .check(status.is(204))
    )
    // Delete person
	.exec(http("Delete Person")
		.delete("/persons/${personId}")
		.check(status.is(204))
    )
      
}