package org.lnu.is.integration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import org.lnu.is.integration._
import org.lnu.is.integration.address.types.AddressTypeIntegrationTest
import org.lnu.is.integration.adminunit.AdminUnitIntegrationTest
import org.lnu.is.integration.wave.types.WaveTypeIntegrationTest
import org.lnu.is.integration.access.AccessDeniedIntegrationTest
import org.lnu.is.integration.assets.state.AssetStateIntegrationTest
import org.lnu.is.integration.street.types.StreetTypeIntegrationTest
import org.lnu.is.integration.enrolment.types.EnrolmentTypeIntegrationTest
import org.lnu.is.integration.enrolment.subject.EnrolmentSubjectIntegrationTest
import org.lnu.is.integration.assets.types.AssetTypeIntegrationTest
import org.lnu.is.integration.invalid.InvalidRequestBodyIntegrationTest
import org.lnu.is.integration.benefit.types.BenefitTypeIntegrationTest
import org.lnu.is.integration.department.address.DepartmentAddressIntegrationTest
import org.lnu.is.integration.sallary.types.SallaryTypeIntegrationTest
import org.lnu.is.integration.timeperiod.types.TimePeriodTypeIntegrationTest
import org.lnu.is.integration.specialty.types.SpecialtyTypeIntegrationTest
import org.lnu.is.integration.eduformtypes.EduFormTypeIntegrationTest
import org.lnu.is.integration.honor.types.HonorTypeIntegrationTest
import org.lnu.is.integration.duties.types.DutyTypeIntegrationTest
import org.lnu.is.integration.department.types.DepartmentTypeIntegrationTest
import org.lnu.is.integration.department.specialty.DepartmentSpecialtyIntegrationTest
import org.lnu.is.integration.partner.PartnerIntegrationTest
import org.lnu.is.integration.gendertype.GenderTypeIntegrationTest
import org.lnu.is.integration.employee.types.EmployeeTypeIntegrationTest
import org.lnu.is.integration.subject.types.SubjectTypeIntegrationTest
import org.lnu.is.integration.person.name.PersonNameIntegrationTest
import org.lnu.is.integration.publicactivity.types.PublicActivityTypeIntegrationTest
import org.lnu.is.integration.department.DepartmentIntegrationTest
import org.lnu.is.integration.specialty.SpecialtyIntegrationTest
import org.lnu.is.integration.department.contact.DepartmentContactIntegrationTest
import org.lnu.is.integration.paper.types.PaperTypeIntegrationTest
import org.lnu.is.integration.person.address.PersonAddressIntegrationTest
import org.lnu.is.integration.contact.types.ContactTypeIntegrationTest
import org.lnu.is.integration.degree.types.DegreeTypeIntegrationTest
import org.lnu.is.integration.person.PersonIntegrationTest
import org.lnu.is.integration.subject.SubjectIntegrationTest
import org.lnu.is.integration.family.types.FamilyTypeIntegrationTest
import org.lnu.is.integration.order.types.OrderTypeIntegrationTest
import org.lnu.is.integration.timesheet.types.TimeSheetTypeIntegrationTest
import org.lnu.is.integration.operation.types.OperationTypeIntegrationTest
import org.lnu.is.integration.education.types.EducationTypeIntegrationTest
import org.lnu.is.integration.person.paper.PersonPaperIntegrationTest
import org.lnu.is.integration.assets.statuses.AssetStatusIntegrationTest
import org.lnu.is.integration.person.types.PersonTypeIntegrationTest
import org.lnu.is.integration.reasons.ReasonIntegrationTest
import org.lnu.is.integration.enrolment.statustype.EnrolmentStatusTypeIntegrationTest
import org.lnu.is.integration.timeperiod.TimePeriodIntegrationTest
import org.lnu.is.integration.language.LanguageIntegrationTest
import org.lnu.is.integration.employee.status.EmployeeStatusIntegrationTest
import org.lnu.is.integration.department.name.DepartmentNameIntegrationTest
import org.lnu.is.integration.course.types.CourseTypeIntegrationTest
import org.lnu.is.integration.paper.types.PaperTypeIntegrationTest
import org.lnu.is.integration.publicactivity.PublicActivityIntegrationTest
import org.lnu.is.integration.paper.usage.PaperUsageIntegrationTest
import org.lnu.is.integration.publicactivity.award.PublicActivityAwardIntegrationTest
import org.lnu.is.integration.adminunit.types.AdminUnitTypeIntegrationTest
import org.lnu.is.integration.specoffer.SpecofferIntegrationTest
import org.lnu.is.integration.assets.AssetIntegrationTest
import org.lnu.is.integration.specoffer.types.SpecofferTypeIntegrationTest
import org.lnu.is.integration.enrolment.EnrolmentIntegrationTest


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
                    PersonNameIntegrationTest.testCase,
                    PersonPaperIntegrationTest.testCase,
                    PersonTypeIntegrationTest.testCase,
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
                    AssetIntegrationTest.testCase,
                    //AssetAddressIntegrationTest.testCase,
                    SpecofferTypeIntegrationTest.testCase,
                    
                    AccessDeniedIntegrationTest.testCase,
                    InvalidRequestBodyIntegrationTest.testCase
              )
  
}
