package org.lnu.is.integration.cases.person.enrolment.subject

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
import org.lnu.is.integration.config.helper.FirstName
import org.lnu.is.integration.config.helper.FatherName
import org.lnu.is.integration.config.helper.LastName
import org.lnu.is.integration.config.helper.Photo
import org.lnu.is.integration.config.helper.DocSeries
import org.lnu.is.integration.config.helper.BirthPlace
import java.util.Random

object PersonEnrolmentSubjectIntegrationTest {

  val testCase = exec(init)
  .exec(before)
  .exec(http("Post Person Enrolment Subject")
      .post("/persons/${personId}/enrolmentsubjects")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/person/enrolment/subject/post.json"))
      .asJSON
      .check(status.is(201))
      .check(jsonPath("$.id").find.saveAs("personEnrolmentSubjectId")))
  .exec(http("Get Person Enrolment Subject")
      .get("/persons/${personId}/enrolmentsubjects/${personEnrolmentSubjectId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200)))
  .exec(http("Update Person Enrolment Subject")
      .put("/person/${personId}/enrolmentsubjects/${personEnrolmentSubjectId}")
      .basicAuth("admin", "nimda")
      .header("Content-Type", "application/json")
      .body(ELFileBody("data/person/enrolment/subject/put.json"))
      .asJSON
      .check(status.is(200)))
  .exec(http("Get Person Enrolment Subject")
      .get("/persons/${personId}/enrolmentsubjects/${personEnrolmentSubjectId}")
      .basicAuth("admin", "nimda")
      .check(status.is(200))
      .check(jsonPath("$.enrolmentSubjectId").find.is("2"))
      .check(jsonPath("$.mark").find.is("4.37")))
  .exec(http("Delete Person Enrolment Subject")
      .delete("/persons/${personId}/enrolmentsubjects/${personEnrolmentSubjectId}")
      .basicAuth("admin", "nimda")
      .check(status.is(204)))
  .exec(http("Get Person Enrolment Subject")
      .get("/persons/${personId}/enrolmentsubjects/${personEnrolmentSubjectId}")
      .basicAuth("admin", "nimda")
      .check(status.is(404)))      
  .exec(after)
    
  def after(): ChainBuilder = {
    exec(http("Delete Specoffer")
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
    .exec(http("Delete Person Paper")
        .delete("/persons/${personId}/papers/${personPaperId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Delete Person")
        .delete("/persons/${personId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))             
    .exec(http("Delete Enrolment")
      .delete("/enrolments/${enrolmentId}")
      .basicAuth("admin", "nimda")
      .check(status.is(204)))
}

  def before(): ChainBuilder = {
    exec(http("Post TimePeriod")
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
    .exec(http("Post Person")
        .post("/persons")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("personId")))
    .exec(http("Post Person Paper")
        .post("/persons/${personId}/papers")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/paper/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("personPaperId")))         
    .exec(http("Post Enrolment")
        .post("/enrolments")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/enrolment/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("enrolmentId")))
  }

  def init(): ChainBuilder = {
    exec(session => {
          session
          .set("person_idnum", UUID.randomUUID())
          .set("person_firstname", FirstName.generate())
          .set("person_fathername", FatherName.generate())
          .set("person_lastname", LastName.generate())
          .set("person_photo", Photo.generate())
          .set("person_birthplace", BirthPlace.generate())
          .set("person_docnum", new Random().nextLong())
          .set("person_docseries", DocSeries.generate())        
          .set("begDate", "2010-01-01")
          .set("endDate", "2014-12-01")

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
  
}