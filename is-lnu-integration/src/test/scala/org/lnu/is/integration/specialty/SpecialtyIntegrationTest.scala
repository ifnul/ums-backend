package org.lnu.is.integration.specialty

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


object SpecialtyIntegrationTest {

  val scn = scenario("Manage Specialties")
    .exec(session => {
      session
      	.set("idnum", UUID.randomUUID())
    })
    .exec(http("Post Specialty")
		.post("/specialties")
		.header("Content-Type", "application/json")
		.body(ELFileBody("data/specialty/post.json"))
		.asJSON
		.check(status.is(201))
		.check(jsonPath("$.id").find.saveAs("specialtyId")))
    .exec(
      http("Get Specialty")
        .get("/specialties/${specialtyId}")
        .check(status.is(200)))
    .exec(
      http("Update Specialty")
        .put("/specialties/${specialtyId}")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specialty/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(
      http("Get Specialty")
        .get("/specialties/${specialtyId}")
        .check(status.is(200))
        .check(jsonPath("$.name").find.is("Теоретичні основи інформатики та кібернетики")))
    .exec(http("Delete Specialty")
		.delete("/specialties/${specialtyId}")
		.check(status.is(204))
    )
    .exec(http("Get Specialty")
		.get("/specialties/${specialtyId}")
    	.check(status.is(404))
    )
      
}