package org.lnu.is.integration.cases.publicactivity

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


object PublicActivityIntegrationTest extends ComplexTest {
  
  val testCase = exec(before)    
    .exec(http("Post Public Activity")
        .post("/publicactivities")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/publicactivity/post.json"))
        .asJSON
        .check(status.is(201))
        .check(jsonPath("$.enrolmentId").find.saveAs("publicActivityId")))
    .exec(http("Get Public Activity")
        .get("/publicactivities/${publicActivityId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200)))
    .exec(http("Update Public Activity")
        .put("/publicactivities/${publicActivityId}")
        .basicAuth("admin", "nimda")
        .header("Content-Type", "application/json")
        .body(ELFileBody("data/publicactivity/put.json"))
        .asJSON
        .check(status.is(200)))
    .exec(http("Get Public Activity")
        .get("/publicactivities/${publicActivityId}")
        .basicAuth("admin", "nimda")
        .check(status.is(200))
        .check(jsonPath("$.name").find.is("Public Activity1")))
    .exec(http("Delete Public Activity")
        .delete("/publicactivities/${publicActivityId}")
        .basicAuth("admin", "nimda")
        .check(status.is(204)))
    .exec(http("Get Public Activity")
        .get("/publicactivities/${publicActivityId}")
        .basicAuth("admin", "nimda")
        .check(status.is(404)))
    .exec(after)        

  def after(): ChainBuilder = {
    exec(http("Delete TimePeriod")
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
  }

  def init(): ChainBuilder = { exec(session => { session }) }
}