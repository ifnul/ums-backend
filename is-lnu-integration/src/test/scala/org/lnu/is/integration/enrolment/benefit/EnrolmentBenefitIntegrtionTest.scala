package org.lnu.is.integration.enrolment.benefit

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
import org.lnu.is.integration.helpers.ComplexTest
import io.gatling.core.structure.ChainBuilder
import org.lnu.is.integration.helpers.ApiHelper

object EnrolmentBenefitIntegrtionTest extends ComplexTest {

  val username = "admin"
  val password = "nimda"
  
  val timePeriod = new ApiHelper("timeperiod", "Enrolment")
  val department = new ApiHelper("department", "Department")
  val specialty = new ApiHelper("specialty", "Specialty")
  val specoffer = new ApiHelper("specoffer", "SpecOffer")
  val person = new ApiHelper("person", "Person")
  val personPaper = new ApiHelper("person/paper", "Person Paper")
  val enrolment = new ApiHelper("enrolment", "Enrolment")
  
  val testCase = exec(init())
    .exec(before())
    .exec(http("Post Enrolment Benefit")
        .post("/enrolments/${enrolmentId}/benefits")
        .basicAuth(username, password)
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/enrolment/benefit/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("enrolmentBenefitId")))
    .exec(http("Get Enrolment Benefit")
        .get("/enrolments/${enrolmentId}/benefits/${enrolmentBenefitId}")
        .basicAuth(username, password)
        .check(status.is(200)))
    .exec(http("Update Enrolment Benefit")
        .put("/enrolments/${enrolmentId}/benefits/${enrolmentBenefitId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/enrolment/benefit/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Enrolment Benefit")
        .get("/enrolments/${enrolmentId}/benefits/${enrolmentBenefitId}")
        .basicAuth(username, password)
        .check(status.is(200))
        .check(jsonPath("$.enrolmentId").find.is("${enrolmentId}"))
        .check(jsonPath("$.benefitId").find.is("2")))
    .exec(http("Delete Enrolment Benefit")
        .delete("/enrolments/${enrolmentId}/benefits/${enrolmentBenefitId}")
        .basicAuth(username, password)
        .check(status.is(204)))
    .exec(http("Get Enrolment Benefit")
        .get("/enrolments/${enrolmentId}/benefits/${enrolmentBenefitId}")
        .basicAuth(username, password)
        .check(status.is(404)))
    .exec(after())

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
  
  def before(): ChainBuilder = {
    exec(timePeriod.create(username, password, "/timeperiods")
      .check(jsonPath("$.id").find.saveAs("timePeriodId")))
    .exec(department.create(username, password, "/departments")
      .check(jsonPath("$.id").find.saveAs("departmentId")))
    .exec(specialty.create(username, password, "/specialties")
      .check(jsonPath("$.id").find.saveAs("specialtyId")))
    .exec(specoffer.create(username, password, "/specoffers")
      .check(jsonPath("$.id").find.saveAs("specofferId")))
    .exec(person.create(username, password, "/persons")
      .check(jsonPath("$.id").find.saveAs("personId")))
    .exec(personPaper.create(username, password, "/persons/${personId}/papers")
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("personPaperId")))
    .exec(enrolment.create(username, password, "/enrolments")
      .check(jsonPath("$.id").find.saveAs("enrolmentId")))		  
  }

  def after(): ChainBuilder = {
    exec(enrolment.delete(username, password, "/enrolments/${enrolmentId}")
      .check(status.is(204)))
    .exec(personPaper.delete(username, password, "/persons/${personId}/papers/${personPaperId}")
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