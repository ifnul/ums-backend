package org.lnu.is.integration.cases.department.name

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
import io.gatling.core.structure.ChainBuilder
import org.lnu.is.integration.config.ComplexTest

object DepartmentNameIntegrationTest extends ComplexTest {

  val testCase = exec(init)
  .exec(before)
  .exec(http("Post Department Name")
      .post("/departments/${departmentId}/names")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/department/name/post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.enrolmentId").find.saveAs("departmentNametId")))
  .exec(http("Get Department Name")
      .get("/departments/${departmentId}/names/${departmentNametId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200)))
  .exec(http("Update Department Name")
        .put("/departments/${departmentId}/names/${departmentNametId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/department/name/put.json"))
        .asJSON
        .check(status.is(200)))
  .exec(http("Get Department Name")
        .get("/departments/${departmentId}/names/${departmentNametId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.name").find.is("Department of applied electronics1")))
  .exec(http("Delete Department Name")
      .delete("/departments/${departmentId}/names/${departmentNametId}")
      .basicAuth("admin", "nimda")
      .check(status.is(204)))
  .exec(after)
    
  def after(): ChainBuilder = {
    exec(http("Delete Department")
      .delete("/departments/${departmentId}")
      .basicAuth("admin", "nimda")
      .check(status.is(204)))
  }

  def before(): ChainBuilder = {
    exec(http("Post Department")
      .post("/departments")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/department/post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.enrolmentId").find.saveAs("departmentId")))
  }

  def init(): ChainBuilder = {
    exec(session => {
          session
            .set("departmentAbbrName", UUID.randomUUID())
            .set("departmentName", UUID.randomUUID())
            .set("departmentManager", UUID.randomUUID())
        })
  }    
    
}