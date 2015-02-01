package org.lnu.is.integration.department.contact

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

object DepartmentContactIntegrationTest {

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
    .check(jsonPath("$.id").find.saveAs("departmentId")))
  .exec(http("Post Department Contact")
      .post("/departments/${departmentId}/contacts")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/department/contact/post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("departmentContactId")))
  .exec(http("Get Department Contact")
      .get("/departments/${departmentId}/contacts/${departmentContactId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200)))
  .exec(http("Update Department Contact")
        .put("/departments/${departmentId}/contacts/${departmentContactId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/department/contact/put.json"))
        .asJSON
        .check(status.is(200)))
  .exec(http("Get Department Contact")
        .get("/departments/${departmentId}/contacts/${departmentContactId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.value").find.is("value1")))
  .exec(http("Delete Department Contact")
      .delete("/departments/${departmentId}/contacts/${departmentContactId}")
      .basicAuth("admin", "nimda")
      .check(status.is(204)))
  .exec(http("Delete Department")
    .delete("/departments/${departmentId}")
    .basicAuth("admin", "nimda")
    .check(status.is(204)))
}