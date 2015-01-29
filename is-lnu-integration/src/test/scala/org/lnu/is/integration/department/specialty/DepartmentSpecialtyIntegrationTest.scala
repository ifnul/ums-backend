package org.lnu.is.integration.department.specialty

import scala.concurrent.duration.DurationInt
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


object DepartmentSpecialtyIntegrationTest {

  val testCase = exec(session => {
      session
        .set("departmentAbbrName", UUID.randomUUID())
        .set("departmentName", UUID.randomUUID())
        .set("departmentPhone", UUID.randomUUID())
        .set("departmentEmail", UUID.randomUUID())
        .set("departmentManager", UUID.randomUUID())
    })
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
  .exec(http("Post Department Specialty")
      .post("/departments/${departmentId}/specialties")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/department/specialty/post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("departmentSpecialtytId")))
  .exec(http("Get Department Specialty")
      .get("/departments/${departmentId}/specialties/${departmentSpecialtytId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200)))
  .exec(http("Update Department Specialty")
      .put("/departments/${departmentId}/specialties/${departmentSpecialtytId}")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/department/specialty/put.json"))
      .asJSON
      .check(status.is(200)))
  .exec(http("Get Department Specialty")
      .get("/departments/${departmentId}/specialties/${departmentSpecialtytId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200))
      .check(jsonPath("$.specialtyId").find.is("${specialtyId}")))
  .exec(http("Delete Department Specialty")
      .delete("/departments/${departmentId}/specialties/${departmentSpecialtytId}")
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
}