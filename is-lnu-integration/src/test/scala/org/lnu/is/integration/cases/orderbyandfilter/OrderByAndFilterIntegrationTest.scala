package org.lnu.is.integration.cases.orderbyandfilter

import org.lnu.is.integration.cases.BaseOrderByAndFilterIntegrationTest

/**
 * @author OlehZanevych
 */

object OrderByAndFilterIntegrationTest extends BaseOrderByAndFilterIntegrationTest {

  val methods = Array(
      ("Multiple Get Address Type With Order By and Filter", "/addresstypes", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Admin Unit With Order By and Filter", "/admiunits", Array("adminUnitTypeId" -> "1", "parentId" -> "1", "identifier" -> "identifier", "identifier1" -> "identifier1", "identifier2" -> "identifier2", "identifier3" -> "identifier3", "name" -> "name", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29")), 
      ("Multiple Get Admin Unit Type With Order By and Filter", "/adminunits/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Asset With Order By and Filter", "/assets", Array("assetTypeId" -> "1", "assetStateId" -> "1", "assetStatusId" -> "1", "departmentId" -> "1", "employeeId" -> "1", "partnerId" -> "1", "orderId" -> "1", "parentId" -> "1", "name" -> "name", "invNum" -> "invnum", "serialNum" -> "serialnum", "prodDate" -> "2015-03-29", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29", "price" -> "1.0", "amount" -> "1.0", "suma" -> "1.0", "description" -> "description")), 
      //("Multiple Get Asset State With Order By and Filter", "/assets/states", Array("name" -> "name")), 
      ("Multiple Get Asset Status With Order By and Filter", "/assets/statuses", Array("name" -> "name")), 
      ("Multiple Get Asset Type With Order By and Filter", "/assets/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Benefit With Order By and Filter", "/benefits", Array("benefitTypeId" -> "1", "parentId" -> "1", "abbrName" -> "abbrname", "name" -> "name", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29", "description" -> "description")), 
      ("Multiple Get Benefit Type With Order By and Filter", "/benefits/types", Array("name" -> "name", "priority" -> "1")), 
      ("Multiple Get Broadcasting Message With Order By and Filter", "/broadcastings", Array("content" -> "content", "topic" -> "topic")), 
      ("Multiple Get Contact Type With Order By and Filter", "/contacts/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Course Type With Order By and Filter", "/courses/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Degree With Order By and Filter", "/degrees", Array("personId" -> "1", "degreeTypeId" -> "1")), 
      //("Multiple Get Degree Type With Order By and Filter", "/degrees/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Department With Order By and Filter", "/departments", Array("parentId" -> "1", "departmentTypeId" -> "1", "orderId" -> "1", "abbrName" -> "abbrname", "name" -> "name", "manager" -> "manager", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29")), 
      //("Multiple Get Department Type With Order By and Filter", "/departments/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Duty Type With Order By and Filter", "/duties/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Education Type With Order By and Filter", "/educations/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Edu Form Type With Order By and Filter", "/eduformtypes", Array("name" -> "name")), 
      //("Multiple Get Employee With Order By and Filter", "/employees", Array("employeeTypeId" -> "1", "personId" -> "1", "genderTypeId" -> "1", "departmentId" -> "1", "postId" -> "1", "jobTypeId" -> "1", "employeeStatusId" -> "1", "orderId" -> "1", "parentId" -> "1", "name" -> "name", "firstName" -> "firstname", "fatherName" -> "fathername", "surname" -> "surname", "birthDate" -> "2015-03-29", "invNum" -> "invnum", "rate" -> "1.0", "isPlurality" -> "1", "isPensioner" -> "1", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29", "docSeries" -> "docseries", "docNum" -> "docnum", "phone" -> "phone", "email" -> "email")), 
      ("Multiple Get Employee Status With Order By and Filter", "/employees/statuses", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Employee Type With Order By and Filter", "/employees/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Enrolment With Order By and Filter", "/enrolments", Array("personId" -> "1", "specOfferId" -> "1", "departmentId" -> "1", "personPaperId" -> "1", "enrolmentTypeId" -> "1", "parentId" -> "1", "mark" -> "1.0", "docSeries" -> "docseries", "docNum" -> "docnum", "docText" -> "doctext", "isState" -> "1", "isContract" -> "1", "isPrivilege" -> "1", "isHostel" -> "1", "evDate" -> "2015-03-29", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29", "priority" -> "1")), 
      ("Multiple Get Enrolment Status Type With Order By and Filter", "/enrolments/statustypes", Array("abbrName" -> "abbrname", "name" -> "name", "description" -> "description")), 
      ("Multiple Get Enrolment Subject With Order By and Filter", "/enrolments/subjects", Array("parentId" -> "1", "abbrName" -> "abbrname", "name" -> "name", "isTesting" -> "1")), 
      //("Multiple Get Enrolment Type With Order By and Filter", "/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Enrolment Foreign Type With Order By and Filter", "/enrolmentforeignes/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Family Type With Order By and Filter", "/families/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Gender Type With Order By and Filter", "/gendertypes", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Honor Type With Order By and Filter", "/honors/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Job Type With Order By and Filter", "/jobtypes", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Language With Order By and Filter", "/languges", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Markscale With Order By and Filter", "/markscales", Array("markscaleTypeId" -> "1", "abbrName" -> "abbrname", "name" -> "name", "markMin" -> "1.0", "markMax" -> "1.0")), 
      ("Multiple Get Markscale Type With Order By and Filter", "/markscales/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Married Type With Order By and Filter", "/marriedtypes", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Operation Type With Order By and Filter", "/operationtypes", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Order With Order By and Filter", "/orders", Array("orderTypeId" -> "1", "employeeId" -> "1", "assetId" -> "1", "partnerId" -> "1", "operationTypeId" -> "1", "departmentId" -> "1", "reasonId" -> "1", "parentId" -> "1", "timePeriodId" -> "1", "reasonText" -> "reasontext", "docSeries" -> "docseries", "docNum" -> "docnum", "docDate" -> "2015-03-29", "docIssued" -> "docissued", "evDate" -> "2015-03-29", "title" -> "title", "description" -> "description")), 
      ("Multiple Get Order Type With Order By and Filter", "/orders/types", Array("abbrName" -> "abbrname", "name" -> "name", "parentId" -> "1")), 
      ("Multiple Get Paper Type With Order By and Filter", "/papers/types", Array("paperUsageId" -> "1", "abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Paper Usage With Order By and Filter", "/papers/usages", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Partner With Order By and Filter", "/partners", Array("parentId" -> "1", "abbrName" -> "abbrname", "name" -> "name", "manager" -> "manager", "phone" -> "phone", "email" -> "email", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29")), 
      //("Multiple Get Person With Order By and Filter", "/persons", Array("parentId" -> "1", "personTypeId" -> "1", "genderTypeId" -> "1", "marriedTypeId" -> "1", "citizenCountryId" -> "1", "name" -> "name", "firstName" -> "firstname", "fatherName" -> "fathername", "surname" -> "surname", "photo" -> "photo", "docSeries" -> "docseries", "docNum" -> "docnum", "identifier" -> "identifier", "resident" -> "1", "birthPlace" -> "birthplace", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29", "isMilitary" -> "1", "isHostel" -> "1")), 
      ("Multiple Get Person Type With Order By and Filter", "/persons/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Public Activity With Order By and Filter", "/publicactivities", Array("publicActivityTypeId" -> "1", "timePeriodId" -> "1", "name" -> "name", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29")), 
      //("Multiple Get Public Activity Type With Order By and Filter", "publicactivities/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Reason With Order By and Filter", "/reasons", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Sallary Type With Order By and Filter", "/sallaries/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Specialty With Order By and Filter", "/specialties", Array("parentId" -> "1", "specialtyTypeId" -> "1", "abbrName" -> "abbrname", "name" -> "name", "cipher" -> "cipher", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29")), 
      ("Multiple Get Specialty Type With Order By and Filter", "/specialties/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Spec Offer With Order By and Filter", "/specoffers", Array("specialtyId" -> "1", "departmentId" -> "1", "timePeriodId" -> "1", "timePeriodCourseId" -> "1", "eduFormTypeId" -> "1", "specofferTypeId" -> "1", "docSeries" -> "docseries", "docNum" -> "docnum", "licCount" -> "1", "stateCount" -> "1", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29")), 
      ("Multiple Get Spec Offer Type With Order By and Filter", "/specoffers/types", Array("timePeriodId" -> "1", "abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Street Type With Order By and Filter", "/streets/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Study Plan Cycle With Order By and Filter", "/studyplans/cycles", Array("abbrName" -> "abbrname", "name" -> "name")), 
      //("Multiple Get Subject With Order By and Filter", "/subjects", Array("subjectTypeId" -> "1", "name" -> "name")), 
      ("Multiple Get Subject Type With Order By and Filter", "/subjects/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Time Period With Order By and Filter", "/timeperiods", Array("parentId" -> "1", "timePeriodTypeId" -> "1", "name" -> "name", "numValue" -> "1", "begDate" -> "2015-03-29", "endDate" -> "2015-03-29")), 
      ("Multiple Get Time Period Type With Order By and Filter", "/timeperiods/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Time Sheet Type With Order By and Filter", "/timesheets/types", Array("abbrName" -> "abbrname", "name" -> "name")), 
      ("Multiple Get Wave Type With Order By and Filter", "/wave/types", Array("name" -> "name"))
  )

  val testCase = buildTestCase(methods)
  
}