package org.lnu.is.integration.cases.specoffer.subject

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

object SpecOfferSubjectIntegrationTest {

  val testCase = exec(session => {
      session
        .set("departmentAbbrName", UUID.randomUUID())
        .set("departmentName", UUID.randomUUID())
        .set("departmentManager", UUID.randomUUID())
        .set("idnum", UUID.randomUUID())
        .set("note", UUID.randomUUID())
        .set("newNote", UUID.randomUUID())
    })
    .exec(http("Post TimePeriod")
        .post("/timeperiods")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/timeperiod/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("timePeriodId")))
    .exec(http("Post Department")
        .post("/departments")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/department/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("departmentId")))
    .exec(http("Post Specialty")
        .post("/specialties")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specialty/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("specialtyId")))
    .exec(http("Post Specoffer")
    		.post("/specoffers")
    		.basicAuth("admin", "nimda")
    		.header("Content-Type", "application/json")
    		.body(ELFileBody("data/specoffer/post.json"))
    		.asJSON
    		.check(status.is(201))
    		.check(jsonPath("$.id").find.saveAs("specofferId")))
    // Test case - start.    
    .exec(http("Post Specoffer Subject")
        .post("/specoffers/${specofferId}/subjects")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specoffer/subject/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("specofferSubjectId")))
    .exec(http("Get Specoffer Subject")
        .get("/specoffers/${specofferId}/subjects/${specofferSubjectId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(http("Update Specoffer Subject")
        .put("/specoffers/${specofferId}/subjects/${specofferSubjectId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specoffer/subject/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Specoffer Subject")
        .get("/specoffers/${specofferId}/subjects/${specofferSubjectId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.note").find.is("${newNote}")))
    .exec(http("Delete Specoffer Subject")
        .delete("/specoffers/${specofferId}/subjects/${specofferSubjectId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Get Specoffer Subject")
        .get("/specoffers/${specofferId}/subjects/${specofferSubjectId}")
        .basicAuth("admin", "nimda")
        .check(status.is(404)))
    // Test case - end.
    .exec(http("Delete Specoffer")
        .delete("/specoffers/${specofferId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Delete Specialty")
        .delete("/specialties/${specialtyId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))        
    .exec(http("Delete Department")
        .delete("/departments/${departmentId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Delete TimePeriod")
        .delete("/timeperiods/${timePeriodId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
}