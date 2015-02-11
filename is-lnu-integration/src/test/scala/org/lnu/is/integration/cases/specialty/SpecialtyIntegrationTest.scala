package org.lnu.is.integration.cases.specialty

import java.util.UUID

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

object SpecialtyIntegrationTest {

  val testCase = exec(session => {
      session
      	.set("idnum", UUID.randomUUID())
    })
    .exec(http("Post Specialty")
    		.post("/specialties")
        .basicAuth("admin", "nimda")
    		.header("Content-Type", "application/json")
    		.body(ELFileBody("data/specialty/post.json"))
    		.asJSON
    		.check(status.is(201))
    		.check(jsonPath("$.id").find.saveAs("specialtyId")))
    .exec(http("Get Specialty")
        .get("/specialties/${specialtyId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(http("Update Specialty")
        .put("/specialties/${specialtyId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specialty/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Specialty")
        .get("/specialties/${specialtyId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.name").find.is("Теоретичні основи інформатики та кібернетики")))
    .exec(http("Delete Specialty")
  		  .delete("/specialties/${specialtyId}")
  		  .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Get Specialty")
  		  .get("/specialties/${specialtyId}")
        .basicAuth("admin", "nimda")
      	.check(status.is(404)))
      
}