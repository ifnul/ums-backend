package org.lnu.is.integration.cases

import org.lnu.is.integration.cases.access.AccessDeniedIntegrationTest
import org.lnu.is.integration.cases.adminunit.AdminUnitIntegrationTest
import org.lnu.is.integration.cases.assets.AssetIntegrationTest
import org.lnu.is.integration.cases.assets.address.AssetAddressIntegrationTest
import org.lnu.is.integration.cases.department.DepartmentIntegrationTest
import org.lnu.is.integration.cases.department.address.DepartmentAddressIntegrationTest
import org.lnu.is.integration.cases.department.contact.DepartmentContactIntegrationTest
import org.lnu.is.integration.cases.department.name.DepartmentNameIntegrationTest
import org.lnu.is.integration.cases.department.specialty.DepartmentSpecialtyIntegrationTest
import org.lnu.is.integration.cases.enrolment.EnrolmentIntegrationTest
import org.lnu.is.integration.cases.enrolment.benefit.EnrolmentBenefitIntegrtionTest
import org.lnu.is.integration.cases.enrolment.statuses.EnrolmentStatusIntegrationTest
import org.lnu.is.integration.cases.invalid.InvalidRequestBodyIntegrationTest
import org.lnu.is.integration.cases.multipleget.MultipleGetIntegrationTest
import org.lnu.is.integration.cases.order.OrderIntegrationTest
import org.lnu.is.integration.cases.partner.PartnerIntegrationTest
import org.lnu.is.integration.cases.person.PersonIntegrationTest
import org.lnu.is.integration.cases.person.address.PersonAddressIntegrationTest
import org.lnu.is.integration.cases.person.award.PersonAwardIntegrationTest
import org.lnu.is.integration.cases.person.contact.PersonContactIntegrationTest
import org.lnu.is.integration.cases.person.education.PersonEducationIntegrationTest
import org.lnu.is.integration.cases.person.enrolment.subject.PersonEnrolmentSubjectIntegrationTest
import org.lnu.is.integration.cases.person.name.PersonNameIntegrationTest
import org.lnu.is.integration.cases.person.paper.PersonPaperIntegrationTest
import org.lnu.is.integration.cases.publicactivity.PublicActivityIntegrationTest
import org.lnu.is.integration.cases.publicactivity.award.PublicActivityAwardIntegrationTest
import org.lnu.is.integration.cases.specialty.SpecialtyIntegrationTest
import org.lnu.is.integration.cases.specoffer.SpecofferIntegrationTest
import org.lnu.is.integration.cases.specoffer.benefit.SpecOfferBenefitIntegrationTest
import org.lnu.is.integration.cases.specoffer.subject.SpecOfferSubjectIntegrationTest
import org.lnu.is.integration.cases.specoffer.wave.SpecOfferWaveIntegrationTest
import org.lnu.is.integration.cases.timeperiod.TimePeriodIntegrationTest
import io.gatling.core.Predef.scenario
import org.lnu.is.integration.cases.person.language.PersonLanguageIntegrationTest
import org.lnu.is.integration.cases.person.family.PersonFamilyIntegrationTest
import org.lnu.is.integration.cases.config.Configuration


/**
 * All Test cases, that are in system.
 * @author ivanursul
 */
object TestCases {

    val scn = scenario("Integration test scenario")
              .exec(
                	Configuration.testCase,
            		
                    AdminUnitIntegrationTest.testCase,
                    
                    AssetIntegrationTest.testCase,
                    AssetAddressIntegrationTest.testCase,
                    
                    EnrolmentIntegrationTest.testCase,
                    EnrolmentBenefitIntegrtionTest.testCase,
                    EnrolmentStatusIntegrationTest.testCase,
                    
                    DepartmentIntegrationTest.testCase,
                    DepartmentAddressIntegrationTest.testCase,
                    DepartmentContactIntegrationTest.testCase,
                    DepartmentNameIntegrationTest.testCase,
                    DepartmentSpecialtyIntegrationTest.testCase,
                    
                    //DegreeTypeIntegrationTest.testCase,
                    //DutyTypeIntegrationTest.testCase,
                    
                    MultipleGetIntegrationTest.testCase,
                    
                    PartnerIntegrationTest.testCase,
                    
                    PersonIntegrationTest.testCase,
                    PersonAddressIntegrationTest.testCase,
                    PersonContactIntegrationTest.testCase,
                    PersonAwardIntegrationTest.testCase,
                    PersonNameIntegrationTest.testCase,
                    PersonPaperIntegrationTest.testCase,
                    PersonLanguageIntegrationTest.testCase,
                    PersonEnrolmentSubjectIntegrationTest.testCase,
                    PersonEducationIntegrationTest.testCase,
                                        
                    PublicActivityIntegrationTest.testCase,
                    PublicActivityAwardIntegrationTest.testCase,
                    
                    SpecialtyIntegrationTest.testCase,
                    
                    SpecofferIntegrationTest.testCase,
                    SpecOfferBenefitIntegrationTest.testCase,
                    SpecOfferSubjectIntegrationTest.testCase,
                    SpecOfferWaveIntegrationTest.testCase,
                    
                    OrderIntegrationTest.testCase,
                    
                    TimePeriodIntegrationTest.testCase,
                    AccessDeniedIntegrationTest.testCase,
                    InvalidRequestBodyIntegrationTest.testCase
              )
  
}
