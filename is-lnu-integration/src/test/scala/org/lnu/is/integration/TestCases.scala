package org.lnu.is.integration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import org.lnu.is.integration._
import org.lnu.is.integration.access.AccessDeniedIntegrationTest
import org.lnu.is.integration.asset.state.AssetStateIntegrationTest
import org.lnu.is.integration.street.types.StreetTypeIntegrationTest
import org.lnu.is.integration.enrolment.types.EnrolmentTypeIntegrationTest
import org.lnu.is.integration.enrolment.subject.EnrolmentSubjectIntegrationTest
import org.lnu.is.integration.asset.types.AssetTypeIntegrationTest
import org.lnu.is.integration.timeperiod.types.TimePeriodTypeIntegrationTest
import org.lnu.is.integration.eduformtypes.EduFormTypeIntegrationTest
import org.lnu.is.integration.adminunit.AdminUnitIntegrationTest
import org.lnu.is.integration.honor.types.HonorTypeIntegrationTest
import org.lnu.is.integration.partner.PartnerIntegrationTest
import org.lnu.is.integration.gendertype.GenderTypeIntegrationTest
import org.lnu.is.integration.person.name.PersonNameIntegrationTest
import org.lnu.is.integration.paper.types.PaperTypeIntegrationTest
import org.lnu.is.integration.contact.types.ContactTypeIntegrationTest
import org.lnu.is.integration.person.PersonIntegrationTest
import org.lnu.is.integration.order.types.OrderTypeIntegrationTest
import org.lnu.is.integration.education.types.EducationTypeIntegrationTest
import org.lnu.is.integration.address.types.AddressTypeIntegrationTest
import org.lnu.is.integration.person.types.PersonTypeIntegrationTest
import org.lnu.is.integration.enrolment.statustype.EnrolmentStatusTypeIntegrationTest
import org.lnu.is.integration.timeperiod.TimePeriodIntegrationTest
import org.lnu.is.integration.language.LanguageIntegrationTest
import org.lnu.is.integration.course.types.CourseTypeIntegrationTest
import org.lnu.is.integration.asset.status.AssetStatusIntegrationTest
import org.lnu.is.integration.resource.ResourceByIdIntegrationTest


/**
 * All Test cases, that are in system.
 * @author ivanursul
 */
object TestCases {

    val scn = scenario("Integration test scenario")
              .exec(AdminUnitIntegrationTest.testCase,
                    AddressTypeIntegrationTest.testCase,
                    AssetTypeIntegrationTest.testCase,
                    AssetStatusIntegrationTest.testCase,
                    AssetStateIntegrationTest.testCase,
                    PersonIntegrationTest.testCase,
                    PersonNameIntegrationTest.testCase,
                    PersonTypeIntegrationTest.testCase,
                    ContactTypeIntegrationTest.testCase,
                    CourseTypeIntegrationTest.testCase,
                    EduFormTypeIntegrationTest.testCase,
                    EducationTypeIntegrationTest.testCase,
                    StreetTypeIntegrationTest.testCase,
                    EnrolmentStatusTypeIntegrationTest.testCase,
                    EnrolmentTypeIntegrationTest.testCase,
                    EnrolmentSubjectIntegrationTest.testCase,
                    GenderTypeIntegrationTest.testCase,
                    LanguageIntegrationTest.testCase,
                    OrderTypeIntegrationTest.testCase,
                    TimePeriodIntegrationTest.testCase,
                    TimePeriodTypeIntegrationTest.testCase,
                    PartnerIntegrationTest.testCase,
                    HonorTypeIntegrationTest.testCase,
                    PaperTypeIntegrationTest.testCase,
                    
                    AccessDeniedIntegrationTest.testCase
              )
  
}