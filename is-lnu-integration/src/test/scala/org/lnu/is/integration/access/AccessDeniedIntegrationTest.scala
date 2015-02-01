package org.lnu.is.integration.access

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.doIf
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.foreach
import io.gatling.core.Predef.feed
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.validatorCheckBuilder2CheckBuilder
import io.gatling.core.Predef.value2Expression
import io.gatling.core.Predef.value2Success
import io.gatling.http.Predef.http
import io.gatling.http.Predef.jsonPath
import io.gatling.core.Predef.csv
import io.gatling.core.Predef.jsonFile
import io.gatling.http.Predef.status
import io.gatling.http.request.builder.HttpRequestBuilder.toActionBuilder
import scala.concurrent.duration.DurationInt

/**
 * Main purpose of this test is to be sure, 
 * that security of web service is working well.
 * That's why we retrieve multiple results using
 * admin credentials, and, after that, when we 
 * will get id of resource, we send 
 * "Resource By ID" request with fake credentials.
 * 
 */
object AccessDeniedIntegrationTest {
    
    val urls = List("/persons/types", "/streets/types", "/timeperiods/types","/papers/types" , 
        "/orders/types", "/marriedtypes", "/languages", "/gendertypes", "/honors/types",
        "/enrolments/types", "/enrolments/subjects", "/enrolments/statustypes",
        "/eduformtypes", "/educations/types", "/departments/types", "/courses/types",
        "/contacts/types", "/assets/types", "/assets/statuses", "/assets/states", "/adminunits", "/addresstypes")
    
    val testCase = 
      exec(session => {
        session.set("urls", urls);
      })
      .foreach("${urls}", "url") {
          exec(http("Getting First Paged Result for ${url}")
            .get("${url}")
            .basicAuth("admin", "nimda")
            .check(status.is(200))
            .check(jsonPath("$.resources[*]").ofType[Map[String, Any]].findAll.saveAs("resources")))
          .foreach("${resources}", "resource"){
                    exec( session => {
                        val resource = session("resource").as[Map[String, Any]]
                        val resourceId = resource("id")
                        session.set("resourceId", resourceId)
                    })
                    .exec(
                        http("Access Denied Request")
                          .get("${url}/${resourceId}")
                          .basicAuth("broken_student", "nevdaha")
                          .check(status.is(403))
                    )      
          }
      }
}
