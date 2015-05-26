package org.lnu.is.integration.cases.department.address

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
import org.lnu.is.integration.config.ComplexTest
import io.gatling.core.structure.ChainBuilder

object DepartmentAddressIntegrationTest extends ComplexTest {

  val testCase = exec(init)
  .exec(before)
  .exec(http("Post Department Address")
      .post("/departments/${departmentId}/addresses")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/department/address/post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("departmentAddressId")))
  .exec(http("Get Department Address")
      .get("/departments/${departmentId}/addresses/${departmentAddressId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200)))
  .exec(http("Update Department Address")
      .put("/departments/${departmentId}/addresses/${departmentAddressId}")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/department/address/put.json"))
      .asJSON
      .check(status.is(200)))
  .exec(http("Get Department Address")
      .get("/departments/${departmentId}/addresses/${departmentAddressId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200))
      .check(jsonPath("$.house").find.is("new HARA")))
  .exec(http("Delete Department Address")
      .delete("/departments/${departmentId}/addresses/${departmentAddressId}")
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
        .check(jsonPath("$.id").find.saveAs("departmentId")))
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