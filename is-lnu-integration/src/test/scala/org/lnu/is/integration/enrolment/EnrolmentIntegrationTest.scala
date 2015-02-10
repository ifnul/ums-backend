package org.lnu.is.integration.enrolment

import java.util.UUID
import scala.concurrent.duration.DurationInt
import org.lnu.is.integration.helpers.ApiHelper
import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.validatorCheckBuilder2CheckBuilder
import io.gatling.core.Predef.value2Expression
import io.gatling.core.Predef.value2Success
import io.gatling.http.Predef.ELFileBody
import io.gatling.http.Predef.http
import io.gatling.http.Predef.jsonPath
import io.gatling.http.Predef.status
import io.gatling.http.request.builder.HttpRequestBuilder.toActionBuilder
import org.lnu.is.integration.helpers.ComplexTest
import io.gatling.http.request.builder.HttpRequestBuilder
import io.gatling.core.structure.ChainBuilder

/**
 * TODO: Improve this test case -> Add additional data - person address, contact and
 * other optional API's.
 */
object EnrolmentIntegrationTest extends ComplexTest {

  val username = "admin"
  val password = "nimda"

  val timePeriod = new ApiHelper("timeperiod", "Time Period")
  val department = new ApiHelper("department", "Department")
  val specialty = new ApiHelper("specialty", "Specialty")
  val specoffer = new ApiHelper("specoffer", "Spec Offer")
  val person = new ApiHelper("person", "Person")
  val personPaper = new ApiHelper("person/paper", "Person Paper")

  val testCase = 
     exec(init) 
    .exec(before) 
    .exec(http("Post Enrolment")
      .post("/enrolments")
      .basicAuth(username, password)
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/enrolment/post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("enrolmentId")))
    .exec(http("Get Enrolment")
      .get("/enrolments/${enrolmentId}")
      .basicAuth(username, password)
      .check(status.is(200)))
    .exec(http("Update Enrolment")
      .put("/enrolments/${enrolmentId}")
      .basicAuth(username, password)
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/enrolment/put.json"))
      .asJSON
      .check(status.is(200)))
    .exec(http("Get Enrolment")
      .get("/enrolments/${enrolmentId}")
      .basicAuth(username, password)
      .check(status.is(200))
      .check(jsonPath("$.docText").find.is("SOME UPDATED DOC TEXT")))
    .exec(http("Delete Enrolment")
      .delete("/enrolments/${enrolmentId}")
      .basicAuth(username, password)
      .check(status.is(204)))
    .exec(http("Get Enrolment")
      .get("/enrolments/${enrolmentId}")
      .basicAuth(username, password)
      .check(status.is(404)))
    .exec(after) 

  def init(): ChainBuilder = {
    exec(session => {
    session
      .set("idnum", UUID.randomUUID())
      .set("departmentAbbrName", UUID.randomUUID())
      .set("departmentName", UUID.randomUUID())
      .set("departmentManager", UUID.randomUUID())
      .set("note", UUID.randomUUID())
      .set("newNote", UUID.randomUUID())
      .set("docSeries", UUID.randomUUID())
      .set("docNum", UUID.randomUUID())
      .set("docDate", "2010-01-01")
      .set("docIssued", UUID.randomUUID())
      .set("docPin", UUID.randomUUID())
    })
  }      
  
  def before():ChainBuilder = {
    exec(timePeriod.create(username, password, "/timeperiods")
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("timePeriodId")))
    .exec(department.create(username, password, "/departments")
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("departmentId")))
    .exec(specialty.create(username, password, "/specialties")
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("specialtyId")))
    .exec(specoffer.create(username, password, "/specoffers")
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("specofferId")))
    .exec(person.create(username, password, "/persons")
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("personId")))
    .exec(personPaper.create(username, password, "/persons/${personId}/papers")
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("personPaperId")))
  }

  def after(): ChainBuilder = {
    exec(personPaper.delete(username, password, "/persons/${personId}/papers/${personPaperId}")
      .check(status.is(204)))
    .exec(person.delete(username, password, "/persons/${personId}")
      .check(status.is(204)))
    .exec(specoffer.delete(username, password, "/specoffers/${specofferId}")
      .check(status.is(204)))
    .exec(specialty.delete(username, password, "/specialties/${specialtyId}")
      .check(status.is(204)))
    .exec(department.delete(username, password, "/departments/${departmentId}")
      .check(status.is(204)))
    .exec(timePeriod.delete(username, password, "/timeperiods/${timePeriodId}")
      .check(status.is(204)))
  }


}