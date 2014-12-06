package org.lnu.is.integration


import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import org.lnu.is.integration._
import org.lnu.is.integration.enrolment.statustype.EnrolmentStatusTypeIntegrationTest

class IntegrationTest extends Simulation {

  val httpConf = http
    .baseURL("http://localhost:8080/is-lnu-rest-api/api")
    .acceptHeader("application/json")

  //http://stackoverflow.com/questions/25765457/gatling-compare-web-service-json-response-using-jsonfilefeeder
  setUp(
    PersonIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    EduFormTypeIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    AddressTypeIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    EnrolmentStatusTypeIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf)
    )
}
