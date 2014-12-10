package org.lnu.is.integration

import org.lnu.is.integration.enrolment.enrolmenttype.EnrolmentTypeIntegrationTest
import org.lnu.is.integration.enrolment.statustype.EnrolmentStatusTypeIntegrationTest
import org.lnu.is.integration.enrolment.subject.EnrolmentSubjectIntegrationTest
import org.lnu.is.integration.gendertype.GenderTypeIntegrationTest
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.atOnceUsers
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.http
import io.gatling.http.config.HttpProtocolBuilder.toHttpProtocol
import org.lnu.is.integration.language.LanguageIntegrationTest
import org.lnu.is.integration.person.name.PersonNameIntegrationTest

class IntegrationTest extends Simulation {

  val httpConf = http
    .baseURL("http://localhost:8080/is-lnu-rest-api/api")
    .acceptHeader("application/json")

  //http://stackoverflow.com/questions/25765457/gatling-compare-web-service-json-response-using-jsonfilefeeder
  setUp(
    PersonIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    PersonNameIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    EduFormTypeIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    AddressTypeIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    EnrolmentStatusTypeIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    EnrolmentTypeIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    EnrolmentSubjectIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    GenderTypeIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf),
    LanguageIntegrationTest.scn.inject(atOnceUsers(1)).protocols(httpConf)
    )
}
