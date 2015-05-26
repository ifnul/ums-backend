package org.lnu.is.integration.cases.enrolment.statuses

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
import org.lnu.is.integration.config.helper.BirthPlace
import scala.util.Random
import org.lnu.is.integration.config.helper.DocSeries

object EnrolmentStatusIntegrationTest extends ComplexTest {
  
    val testCase = exec(init)
    .exec(before)
    // Test case - start
    .exec(http("Post Enrolment Status")
        .post("/enrolments/${enrolmentId}/statuses")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/enrolment/status/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("enrolmentStatusId")))
    .exec(http("Get Enrolment Status")
        .get("/enrolments/${enrolmentId}/statuses/${enrolmentStatusId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(http("Update Enrolment Status")
        .put("/enrolments/${enrolmentId}/statuses/${enrolmentStatusId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/enrolment/status/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Enrolment Status")
        .get("/enrolments/${enrolmentId}/statuses/${enrolmentStatusId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.enrolmentId").find.is("${enrolmentId}"))
        .check(jsonPath("$.specOfferWaveId").find.is("${specofferWaveId}"))
        .check(jsonPath("$.enrolmentStatusTypeId").find.is("2"))
    )
    .exec(http("Delete Enrolment Status")
        .delete("/enrolments/${enrolmentId}/statuses/${enrolmentStatusId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Get Enrolment Status")
        .get("/enrolments/${enrolmentId}/statuses/${enrolmentStatusId}")
        .basicAuth("admin", "nimda")
        .check(status.is(404)))
    // Test case - end
    .exec(after)

  def after(): ChainBuilder = {
    // Delete Spec Offer Wave
    exec(http("Delete Specoffer Wave")
        .delete("/specoffers/${specofferId}/waves/${specofferWaveId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))    
    // Delete Enrolment
    .exec(http("Delete Enrolment")
        .delete("/enrolments/${enrolmentId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))    
    // Deleting person
    .exec(http("Delete Person Paper")
        .delete("/persons/${personId}/papers/${personPaperId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    // Deleting Person
    .exec(http("Delete Person")
        .delete("/persons/${personId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    // Deleting specoffer
    .exec(http("Delete Specoffer")
        .delete("/specoffers/${specofferId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    // Deleting Specialty
    .exec(http("Delete Specialty")
        .delete("/specialties/${specialtyId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    // Deleting department
    .exec(http("Delete Department")
        .delete("/departments/${departmentId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    // Deleting Time Period
    .exec(http("Delete TimePeriod")
        .delete("/timeperiods/${timePeriodId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))      
  }

  def before(): ChainBuilder = {
    // Creating new Time Period
    exec(http("Post TimePeriod")
        .post("/timeperiods")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/timeperiod/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("timePeriodId")))
    // Creating new Department
    .exec(http("Post Department")
        .post("/departments")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/department/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("departmentId")))
    // Create new Specialty
    .exec(http("Post Specialty")
        .post("/specialties")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specialty/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("specialtyId")))         
    // Creating new Spec Offer    
    .exec(http("Post Specoffer")
        .post("/specoffers")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specoffer/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("specofferId")))        

    // Creating new person
    .exec(http("Post Person")
        .post("/persons")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("personId")))
    // Creating new person Paper
    .exec(http("Post Person Paper")
        .post("/persons/${personId}/papers")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/person/paper/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("personPaperId")))
    // Creating new Enrolment
    .exec(http("Post Enrolment")
        .post("/enrolments")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/enrolment/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("enrolmentId")))
    .exec(http("Post Specoffer Wave")
        .post("/specoffers/${specofferId}/waves")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specoffer/wave/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.id").find.saveAs("specofferWaveId")))      
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
            
            //Department session fields
            .set("departmentAbbrName", UUID.randomUUID())
            .set("departmentName", UUID.randomUUID())
            .set("departmentManager", UUID.randomUUID())
            // Spec Offer
            .set("newNote", UUID.randomUUID())
            
            // Person Paper related fields
            .set("docSeries", UUID.randomUUID())
            .set("docNum", UUID.randomUUID())
            .set("docDate", "2010-01-01")
            .set("docIssued", UUID.randomUUID())
            .set("docPin", UUID.randomUUID())        
        })     
    }
}