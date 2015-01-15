package org.lnu.is.integration

import org.lnu.is.integration.address.types.AddressTypeIntegrationTest
import org.lnu.is.integration.adminunit.AdminUnitIntegrationTest
import org.lnu.is.integration.asset.state.AssetStateIntegrationTest
import org.lnu.is.integration.asset.status.AssetStatusIntegrationTest
import org.lnu.is.integration.asset.types.AssetTypeIntegrationTest
import org.lnu.is.integration.contact.types.ContactTypeIntegrationTest
import org.lnu.is.integration.course.types.CourseTypeIntegrationTest
import org.lnu.is.integration.education.types.EducationTypeIntegrationTest
import org.lnu.is.integration.eduformtypes.EduFormTypeIntegrationTest
import org.lnu.is.integration.enrolment.statustype.EnrolmentStatusTypeIntegrationTest
import org.lnu.is.integration.enrolment.subject.EnrolmentSubjectIntegrationTest
import org.lnu.is.integration.enrolment.types.EnrolmentTypeIntegrationTest
import org.lnu.is.integration.gendertype.GenderTypeIntegrationTest
import org.lnu.is.integration.language.LanguageIntegrationTest
import org.lnu.is.integration.order.types.OrderTypeIntegrationTest
import org.lnu.is.integration.partner.PartnerIntegrationTest
import org.lnu.is.integration.person.PersonIntegrationTest
import org.lnu.is.integration.person.name.PersonNameIntegrationTest
import org.lnu.is.integration.person.types.PersonTypeIntegrationTest
import org.lnu.is.integration.timeperiod.TimePeriodIntegrationTest
import org.lnu.is.integration.timeperiod.types.TimePeriodTypeIntegrationTest
import io.gatling.core.Predef._
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.atOnceUsers
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef._
import io.gatling.http.Predef.http
import io.gatling.http.config.HttpProtocolBuilder.toHttpProtocol
import io.gatling.jdbc.Predef._
import org.lnu.is.integration.honor.types.HonorTypeIntegrationTest
import org.lnu.is.integration.paper.types.PaperTypeIntegrationTest
import org.lnu.is.integration.street.types.StreetTypeIntegrationTest
import scala.concurrent.duration._

/**
 * Class, that runs load testing.
 * @author ivanursul
 */
class LoadTest extends Simulation {

  val host = System.getProperty("integration.host")
  val successPercent = Integer.getInteger("integration.successtests.percent", 95)
  
  val httpConf = http
      .baseURL(host)
      .basicAuth("admin", "nimda")
      .acceptHeader("application/json")
  
  val injectStep = rampUsers(20) over (20 seconds)
  
  val scn = TestCases.scn;
 
  setUp(scn.inject(injectStep))
    .protocols(httpConf)
    .assertions(global.successfulRequests.percent.greaterThan(successPercent))
  
}
