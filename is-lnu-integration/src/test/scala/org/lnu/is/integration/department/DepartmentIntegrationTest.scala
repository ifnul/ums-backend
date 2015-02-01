package org.lnu.is.integration.department

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


object DepartmentIntegrationTest {

  val testCase = exec(session => {
      session
        .set("departmentAbbrName", UUID.randomUUID())
        .set("departmentName", UUID.randomUUID())
        .set("departmentManager", UUID.randomUUID())
    })
    .exec(http("Post Department")
      .post("/departments")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/department/post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("department_identifier")))
    .pause(500 milliseconds, 2 seconds)
    .exec(
      http("Get Department")
        .get("/departments/${department_identifier}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(
      http("Update Department")
        .put("/departments/${department_identifier}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/department/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(
      http("Get Department")
        .get("/departments/${department_identifier}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.name").find.is("t_name${departmentName}_updated")))
    .exec(http("Delete Department")
    .delete("/departments/${department_identifier}")
      .basicAuth("admin", "nimda")
      .check(status.is(204)))
    .exec(http("Get Department")
    .get("/departments/${department_identifier}")
      .basicAuth("admin", "nimda")
      .check(status.is(404)))

}