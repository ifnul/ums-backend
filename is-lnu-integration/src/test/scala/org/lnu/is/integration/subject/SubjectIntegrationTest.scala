package org.lnu.is.integration.subject
import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object SubjectIntegrationTest {

  val response = RawFileBody("data/subject/response.json")
  
  val testCase = exec(http("Subject Get Paged Result")
      .get("/subjects")
      .basicAuth("admin", "nimda")
      .check(bodyString.is(response))
    )
}