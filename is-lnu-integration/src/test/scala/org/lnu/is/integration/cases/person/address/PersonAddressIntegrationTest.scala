package org.lnu.is.integration.cases.person.address

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

object PersonAddressIntegrationTest {

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
	.exec(http("Post Person Address")
	    .post("/persons/${personId}/addresses")
      .basicAuth("admin", "nimda")
	    .header("Content-Type", "application/json")
	    .body(ELFileBody("data/person/address/post.json"))
	    .asJSON
	    .check(status.is(201))
	    .check(jsonPath("$.id").find.saveAs("personAddressId")))
	.exec(http("Get Person Address")
	    .get("/persons/${personId}/addresses/${personAddressId}")
      .basicAuth("admin", "nimda")
	    .check(status.is(200)))
  .exec(http("Update Person Address")
        .put("/persons/${personId}/addresses/${personAddressId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/address/put.json"))
        .asJSON
        .check(status.is(200)))
  .exec(http("Get Person Address")
		.get("/persons/${personId}/addresses/${personAddressId}")
    .basicAuth("admin", "nimda")
		.check(status.is(200))
		.check(jsonPath("$.zipCode").find.is("790901")))
	.exec(http("Delete Person Address")
	    .delete("/persons/${personId}/addresses/${personAddressId}")
      .basicAuth("admin", "nimda")
	    .check(status.is(204)))
  .exec(http("Delete Person")
		.delete("/persons/${personId}")
    .basicAuth("admin", "nimda")
		.check(status.is(204)))
}
