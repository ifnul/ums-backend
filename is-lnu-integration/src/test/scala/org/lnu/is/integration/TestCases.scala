package org.lnu.is.integration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import org.lnu.is.integration._
import org.lnu.is.integration.access.AccessDeniedIntegrationTest
import org.lnu.is.integration.assets.state.AssetStateIntegrationTest
import org.lnu.is.integration.street.types.StreetTypeIntegrationTest
import org.lnu.is.integration.enrolment.types.EnrolmentTypeIntegrationTest
import org.lnu.is.integration.enrolment.subject.EnrolmentSubjectIntegrationTest
import org.lnu.is.integration.assets.types.AssetTypeIntegrationTest
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
import org.lnu.is.integration.assets.statuses.AssetStatusIntegrationTest
import org.lnu.is.integration.resource.ResourceByIdIntegrationTest
import org.lnu.is.integration.department.DepartmentIntegrationTest
import org.lnu.is.integration.department.types.DepartmentTypeIntegrationTest
import org.lnu.is.integration.family.types.FamilyTypeIntegrationTest
import org.lnu.is.integration.degree.types.DegreeTypeIntegrationTest
import org.lnu.is.integration.employee.types.EmployeeTypeIntegrationTest
import org.lnu.is.integration.employee.status.EmployeeStatusIntegrationTest
import org.lnu.is.integration.duties.types.DutyTypeIntegrationTest
import org.lnu.is.integration.specialty.types.SpecialtyTypeIntegrationTest
import org.lnu.is.integration.reasons.ReasonIntegrationTest
import org.lnu.is.integration.operation.types.OperationTypeIntegrationTest
import org.lnu.is.integration.sallary.types.SallaryTypeIntegrationTest
import org.lnu.is.integration.subject.SubjectIntegrationTest
import org.lnu.is.integration.subject.types.SubjectTypeIntegrationTest
import org.lnu.is.integration.person.address.PersonAddressIntegrationTest
import org.lnu.is.integration.person.paper.PersonPaperIntegrationTest
import org.lnu.is.integration.invalid.InvalidRequestBodyIntegrationTest


/**
 * All Test cases, that are in system.
 * @author ivanursul
 */
object TestCases {

    val scn = scenario("Integration test scenario")
              .exec(
                    AdminUnitIntegrationTest.testCase,
                    AddressTypeIntegrationTest.testCase,
                    AssetTypeIntegrationTest.testCase,
                    AssetStatusIntegrationTest.testCase,
                    AssetStateIntegrationTest.testCase,
                    PersonIntegrationTest.testCase,
                    PersonNameIntegrationTest.testCase,
                    PersonAddressIntegrationTest.testCase,
                    PersonTypeIntegrationTest.testCase,
                    PersonPaperIntegrationTest.testCase,
                    ContactTypeIntegrationTest.testCase,
                    CourseTypeIntegrationTest.testCase,
                    EduFormTypeIntegrationTest.testCase,
                    EducationTypeIntegrationTest.testCase,
                    EmployeeTypeIntegrationTest.testCase,
                    EmployeeStatusIntegrationTest.testCase,
                    DepartmentIntegrationTest.testCase,
                    DepartmentTypeIntegrationTest.testCase,
                    DegreeTypeIntegrationTest.testCase,
                    DutyTypeIntegrationTest.testCase,
                    FamilyTypeIntegrationTest.testCase,
                    SallaryTypeIntegrationTest.testCase,
                    StreetTypeIntegrationTest.testCase,
                    SpecialtyTypeIntegrationTest.testCase,
                    SubjectIntegrationTest.testCase,
                    SubjectTypeIntegrationTest.testCase,
                    EnrolmentStatusTypeIntegrationTest.testCase,
                    EnrolmentTypeIntegrationTest.testCase,
                    EnrolmentSubjectIntegrationTest.testCase,
                    GenderTypeIntegrationTest.testCase,
                    LanguageIntegrationTest.testCase,
                    OrderTypeIntegrationTest.testCase,
                    OperationTypeIntegrationTest.testCase,
                    TimePeriodIntegrationTest.testCase,
                    TimePeriodTypeIntegrationTest.testCase,
                    PartnerIntegrationTest.testCase,
                    ReasonIntegrationTest.testCase,
                    HonorTypeIntegrationTest.testCase,
                    PaperTypeIntegrationTest.testCase,
                    
                    AccessDeniedIntegrationTest.testCase,
                    InvalidRequestBodyIntegrationTest.testCase
              )
  
}