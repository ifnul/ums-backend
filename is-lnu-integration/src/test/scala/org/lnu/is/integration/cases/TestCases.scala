package org.lnu.is.integration.cases

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import org.lnu.is.integration._
import org.lnu.is.integration.cases.address.types.AddressTypeIntegrationTest
import org.lnu.is.integration.cases.adminunit.AdminUnitIntegrationTest
import org.lnu.is.integration.cases.wave.types.WaveTypeIntegrationTest
import org.lnu.is.integration.cases.access.AccessDeniedIntegrationTest
import org.lnu.is.integration.cases.assets.state.AssetStateIntegrationTest
import org.lnu.is.integration.cases.street.types.StreetTypeIntegrationTest
import org.lnu.is.integration.cases.enrolment.types.EnrolmentTypeIntegrationTest
import org.lnu.is.integration.cases.enrolment.subject.EnrolmentSubjectIntegrationTest
import org.lnu.is.integration.cases.assets.types.AssetTypeIntegrationTest
import org.lnu.is.integration.cases.invalid.InvalidRequestBodyIntegrationTest
import org.lnu.is.integration.cases.benefit.types.BenefitTypeIntegrationTest
import org.lnu.is.integration.cases.department.address.DepartmentAddressIntegrationTest
import org.lnu.is.integration.cases.sallary.types.SallaryTypeIntegrationTest
import org.lnu.is.integration.cases.timeperiod.types.TimePeriodTypeIntegrationTest
import org.lnu.is.integration.cases.specialty.types.SpecialtyTypeIntegrationTest
import org.lnu.is.integration.cases.eduformtypes.EduFormTypeIntegrationTest
import org.lnu.is.integration.cases.honor.types.HonorTypeIntegrationTest
import org.lnu.is.integration.cases.duties.types.DutyTypeIntegrationTest
import org.lnu.is.integration.cases.department.types.DepartmentTypeIntegrationTest
import org.lnu.is.integration.cases.department.specialty.DepartmentSpecialtyIntegrationTest
import org.lnu.is.integration.cases.partner.PartnerIntegrationTest
import org.lnu.is.integration.cases.gendertype.GenderTypeIntegrationTest
import org.lnu.is.integration.cases.employee.types.EmployeeTypeIntegrationTest
import org.lnu.is.integration.cases.subject.types.SubjectTypeIntegrationTest
import org.lnu.is.integration.cases.person.name.PersonNameIntegrationTest
import org.lnu.is.integration.cases.publicactivity.types.PublicActivityTypeIntegrationTest
import org.lnu.is.integration.cases.department.DepartmentIntegrationTest
import org.lnu.is.integration.cases.specialty.SpecialtyIntegrationTest
import org.lnu.is.integration.cases.department.contact.DepartmentContactIntegrationTest
import org.lnu.is.integration.cases.paper.types.PaperTypeIntegrationTest
import org.lnu.is.integration.cases.person.address.PersonAddressIntegrationTest
import org.lnu.is.integration.cases.contact.types.ContactTypeIntegrationTest
import org.lnu.is.integration.cases.degree.types.DegreeTypeIntegrationTest
import org.lnu.is.integration.cases.person.PersonIntegrationTest
import org.lnu.is.integration.cases.subject.SubjectIntegrationTest
import org.lnu.is.integration.cases.family.types.FamilyTypeIntegrationTest
import org.lnu.is.integration.cases.order.types.OrderTypeIntegrationTest
import org.lnu.is.integration.cases.timesheet.types.TimeSheetTypeIntegrationTest
import org.lnu.is.integration.cases.operation.types.OperationTypeIntegrationTest
import org.lnu.is.integration.cases.education.types.EducationTypeIntegrationTest
import org.lnu.is.integration.cases.person.paper.PersonPaperIntegrationTest
import org.lnu.is.integration.cases.assets.statuses.AssetStatusIntegrationTest
import org.lnu.is.integration.cases.person.types.PersonTypeIntegrationTest
import org.lnu.is.integration.cases.reasons.ReasonIntegrationTest
import org.lnu.is.integration.cases.enrolment.statustype.EnrolmentStatusTypeIntegrationTest
import org.lnu.is.integration.cases.timeperiod.TimePeriodIntegrationTest
import org.lnu.is.integration.cases.language.LanguageIntegrationTest
import org.lnu.is.integration.cases.employee.status.EmployeeStatusIntegrationTest
import org.lnu.is.integration.cases.department.name.DepartmentNameIntegrationTest
import org.lnu.is.integration.cases.course.types.CourseTypeIntegrationTest
import org.lnu.is.integration.cases.paper.types.PaperTypeIntegrationTest
import org.lnu.is.integration.cases.publicactivity.PublicActivityIntegrationTest
import org.lnu.is.integration.cases.paper.usage.PaperUsageIntegrationTest
import org.lnu.is.integration.cases.publicactivity.award.PublicActivityAwardIntegrationTest
import org.lnu.is.integration.cases.adminunit.types.AdminUnitTypeIntegrationTest
import org.lnu.is.integration.cases.specoffer.SpecofferIntegrationTest
import org.lnu.is.integration.cases.assets.AssetIntegrationTest
import org.lnu.is.integration.cases.specoffer.types.SpecofferTypeIntegrationTest
import org.lnu.is.integration.cases.enrolment.EnrolmentIntegrationTest
import org.lnu.is.integration.cases.enrolment.benefit.EnrolmentBenefitIntegrtionTest
import org.lnu.is.integration.cases.specoffer.wave.SpecOfferWaveIntegrationTest
import org.lnu.is.integration.cases.enrolment.statuses.EnrolmentStatusIntegrationTest
import org.lnu.is.integration.cases.specoffer.subject.SpecOfferSubjectIntegrationTest
import org.lnu.is.integration.cases.person.enrolment.subject.PersonEnrolmentSubjectIntegrationTest
import org.lnu.is.integration.cases.person.education.PersonEducationIntegrationTest
import org.lnu.is.integration.cases.person.contact.PersonContactIntegrationTest


/**
 * All Test cases, that are in system.
 * @author ivanursul
 */
object TestCases {

    val scn = scenario("Integration test scenario")
              .exec(
                    AddressTypeIntegrationTest.testCase,
                    AdminUnitIntegrationTest.testCase,
                    
                    AssetTypeIntegrationTest.testCase,
                    AssetStatusIntegrationTest.testCase,
                    
                    AssetStateIntegrationTest.testCase,
                    BenefitTypeIntegrationTest.testCase,
                    ContactTypeIntegrationTest.testCase,
                    CourseTypeIntegrationTest.testCase,
                    EduFormTypeIntegrationTest.testCase,
                    EducationTypeIntegrationTest.testCase,
                    EmployeeStatusIntegrationTest.testCase,
                    EmployeeTypeIntegrationTest.testCase,
                    
                    EnrolmentIntegrationTest.testCase,
                    EnrolmentBenefitIntegrtionTest.testCase,
                    EnrolmentStatusIntegrationTest.testCase,
                    EnrolmentStatusTypeIntegrationTest.testCase,
                    EnrolmentSubjectIntegrationTest.testCase,
                    EnrolmentTypeIntegrationTest.testCase,
                    
                    DepartmentIntegrationTest.testCase,
                    DepartmentAddressIntegrationTest.testCase,
                    DepartmentContactIntegrationTest.testCase,
                    DepartmentNameIntegrationTest.testCase,
                    DepartmentSpecialtyIntegrationTest.testCase,
                    DepartmentTypeIntegrationTest.testCase,
                    
                    DegreeTypeIntegrationTest.testCase,
                    DutyTypeIntegrationTest.testCase,
                    FamilyTypeIntegrationTest.testCase,
                    GenderTypeIntegrationTest.testCase,
                    HonorTypeIntegrationTest.testCase,
                    LanguageIntegrationTest.testCase,
                    PaperTypeIntegrationTest.testCase,
                    PaperUsageIntegrationTest.testCase,
                    
                    PartnerIntegrationTest.testCase,
                    
                    PersonIntegrationTest.testCase,
                    PersonAddressIntegrationTest.testCase,
                    PersonContactIntegrationTest.testCase,
                    PersonNameIntegrationTest.testCase,
                    PersonPaperIntegrationTest.testCase,
                    PersonTypeIntegrationTest.testCase,
                    PersonEnrolmentSubjectIntegrationTest.testCase,
                    PersonEducationIntegrationTest.testCase,
                                        
                    PublicActivityIntegrationTest.testCase,
                    PublicActivityAwardIntegrationTest.testCase,
                    PublicActivityTypeIntegrationTest.testCase,
                    
                    ReasonIntegrationTest.testCase,
                    SallaryTypeIntegrationTest.testCase,
                    
                    SpecialtyIntegrationTest.testCase,
                    SpecialtyTypeIntegrationTest.testCase,
                    
                    StreetTypeIntegrationTest.testCase,
                    SubjectIntegrationTest.testCase,
                    SubjectTypeIntegrationTest.testCase,
                    OrderTypeIntegrationTest.testCase,
                    OperationTypeIntegrationTest.testCase,
                    TimePeriodIntegrationTest.testCase,
                    TimePeriodTypeIntegrationTest.testCase,
                    TimeSheetTypeIntegrationTest.testCase,
                    WaveTypeIntegrationTest.testCase,
                    AdminUnitTypeIntegrationTest.testCase,
                    SpecofferIntegrationTest.testCase,
                    SpecOfferSubjectIntegrationTest.testCase,
                    SpecOfferWaveIntegrationTest.testCase,
                    SpecofferTypeIntegrationTest.testCase,
                    AssetIntegrationTest.testCase,
                    //AssetAddressIntegrationTest.testCase,
                    
                    AccessDeniedIntegrationTest.testCase,
                    InvalidRequestBodyIntegrationTest.testCase
              )
  
}
