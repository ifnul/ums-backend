package org.lnu.is.integration.department

import org.lnu.is.integration.helpers.Department.getDepartment
import org.lnu.is.integration.helpers.Department.createDepartment
import org.lnu.is.integration.helpers.Department.deleteDepartment
import org.lnu.is.integration.helpers.Department.updateDepartment

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
import io.gatling.http.request.builder.HttpRequestBuilder

/**
 * Integration test for testing Department API.
 */
object DepartmentIntegrationTest {

  val username = "admin"
  val password = "nimda"
  
  val testCase = exec(session => {
      session
        .set("departmentAbbrName", UUID.randomUUID())
        .set("departmentName", UUID.randomUUID())
        .set("departmentManager", UUID.randomUUID())
    })
    .exec(createDepartment(username, password, "data/department/post.json")
          .check(jsonPath("$.id").find.saveAs("department_identifier"))
          .check(status.is(201)))
    .exec(getDepartment(username, password, "/departments/${department_identifier}")
          .check(status.is(200)))
    .exec(updateDepartment(username, password, 
        "/departments/${department_identifier}", "data/department/put.json"))
    .exec(getDepartment(username, password, "/departments/${department_identifier}")
          .check(status.is(200))
          .check(jsonPath("$.name").find.is("t_name${departmentName}_updated")))
    .exec(deleteDepartment(username, password, "/departments/${department_identifier}")
          .check(status.is(204)))
    .exec(getDepartment(username, password, "/departments/${department_identifier}")
          .check(status.is(404)))
        
}