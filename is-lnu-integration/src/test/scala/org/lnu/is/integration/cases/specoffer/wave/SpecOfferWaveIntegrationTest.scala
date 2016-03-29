package org.lnu.is.integration.cases.specoffer.wave

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

object SpecOfferWaveIntegrationTest extends ComplexTest {

  val testCase = exec(init)
    .exec(before)
    .exec(http("Post Specoffer Wave")
        .post("/specoffers/${specofferId}/waves")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specoffer/wave/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.enrolmentId").find.saveAs("specofferWaveId")))
    .exec(http("Get Specoffer Wave")
        .get("/specoffers/${specofferId}/waves/${specofferWaveId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(http("Update Specoffer Wave")
        .put("/specoffers/${specofferId}/waves/${specofferWaveId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specoffer/wave/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Specoffer Wave")
        .get("/specoffers/${specofferId}/waves/${specofferWaveId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.stateCount").find.is("20")))
    .exec(http("Delete Specoffer Wave")
        .delete("/specoffers/${specofferId}/waves/${specofferWaveId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Get Specoffer Wave")
        .get("/specoffers/${specofferId}/waves/${specofferWaveId}")
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
  }

  def before(): ChainBuilder = {
    exec(http("Post TimePeriod")
        .post("/timeperiods")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/timeperiod/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.enrolmentId").find.saveAs("timePeriodId")))
    .exec(http("Post Department")
        .post("/departments")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/department/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.enrolmentId").find.saveAs("departmentId")))
    .exec(http("Post Specialty")
        .post("/specialties")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specialty/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.enrolmentId").find.saveAs("specialtyId")))
    .exec(http("Post Specoffer")
        .post("/specoffers")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/specoffer/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.enrolmentId").find.saveAs("specofferId")))
  }

  def init(): ChainBuilder = {
      exec(session => {
            session
              .set("departmentAbbrName", UUID.randomUUID())
              .set("departmentName", UUID.randomUUID())
              .set("departmentManager", UUID.randomUUID())
              .set("idnum", UUID.randomUUID())
              .set("newNote", UUID.randomUUID())
          })
  }
}