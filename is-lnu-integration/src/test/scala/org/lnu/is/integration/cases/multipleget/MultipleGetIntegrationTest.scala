package org.lnu.is.integration.cases.multipleget

import org.lnu.is.integration.cases.BaseMultipleGetIntegrationTest

/**
 * @author OlehZanevych
 */

object MultipleGetIntegrationTest extends BaseMultipleGetIntegrationTest {

  val methods = Array(
      
      (
          "Address Type",
          "/addresstypes",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Admin Unit",
          "/adminunits",
          Array(
              "adminUnitTypeId",
              "parentId"
          ),
          Array(
              "identifier" -> "String",
              "identifier1" -> "String",
              "identifier2" -> "String",
              "identifier3" -> "String",
              "name" -> "String",
              "begDate" -> "Date",
              "endDate" -> "Date"
          )
      ),

      (
          "Admin Unit Type",
          "/adminunits/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Asset",
          "/assets",
          Array(
              "assetTypeId",
              "assetStateId",
              "assetStatusId",
              "departmentId",
              "employeeId",
              "partnerId",
              "orderId",
              "parentId"
          ),
          Array(
              "name" -> "String",
              "invNum" -> "String",
              "serialNum" -> "String",
              "prodDate" -> "Date",
              "begDate" -> "Date",
              "endDate" -> "Date",
              "price" -> "Double",
              "amount" -> "Double",
              "suma" -> "Double",
              "description" -> "String"
          )
      ),

      (
          "Asset State",
          "/assets/states",
          Array(
          ),
          Array(
              "name" -> "String"
          )
      ),

      (
          "Asset Status",
          "/assets/statuses",
          Array(
          ),
          Array(
              "name" -> "String"
          )
      ),

      (
          "Asset Type",
          "/assets/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Benefit",
          "/benefits",
          Array(
              "benefitTypeId",
              "parentId"
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String",
              "begDate" -> "Date",
              "endDate" -> "Date",
              "description" -> "String"
          )
      ),

      (
          "Benefit Type",
          "/benefits/types",
          Array(
          ),
          Array(
              "name" -> "String",
              "priority" -> "Integer"
          )
      ),

      (
          "Broadcasting Message",
          "/broadcastings",
          Array(
          ),
          Array(
              "content" -> "String",
              "topic" -> "String"
          )
      ),

      (
          "Contact Type",
          "/contacts/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Course Type",
          "/courses/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Degree",
          "/degrees",
          Array(
              "personId",
              "degreeTypeId"
          ),
          Array(
          )
      ),

      (
          "Degree Type",
          "/degrees/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Department",
          "/departments",
          Array(
              "parentId",
              "departmentTypeId",
              "orderId"
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String",
              "manager" -> "String",
              "begDate" -> "Date",
              "endDate" -> "Date"
          )
      ),

      (
          "Department Type",
          "/departments/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Duty Type",
          "/duties/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Education Type",
          "/educations/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Education Form Type",
          "/educations/forms/types",
          Array(
          ),
          Array(
              "name" -> "String"
          )
      ),

      (
          "Employee",
          "/employees",
          Array(
              "employeeTypeId",
              "personId",
              "genderTypeId",
              "departmentId",
              "postId",
              "jobTypeId",
              "employeeStatusId",
              "orderId",
              "parentId"
          ),
          Array(
              "name" -> "String",
              "firstName" -> "String",
              "fatherName" -> "String",
              "surname" -> "String",
              "birthDate" -> "Date",
              "invNum" -> "String",
              "rate" -> "Double",
              "isPlurality" -> "Integer",
              "isPensioner" -> "Integer",
              "begDate" -> "Date",
              "endDate" -> "Date",
              "docSeries" -> "String",
              "docNum" -> "String",
              "phone" -> "String",
              "email" -> "String"
          )
      ),

      (
          "Employee Status",
          "/employees/statuses",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Employee Type",
          "/employees/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Enrolment",
          "/enrolments",
          Array(
              "personId",
              "specOfferId",
              "departmentId",
              "personPaperId",
              "enrolmentTypeId",
              "parentId"
          ),
          Array(
              "mark" -> "Double",
              "docSeries" -> "String",
              "docNum" -> "String",
              "docText" -> "String",
              "isState" -> "Integer",
              "isContract" -> "Integer",
              "isPrivilege" -> "Integer",
              "isHostel" -> "Integer",
              "evDate" -> "Date",
              "begDate" -> "Date",
              "endDate" -> "Date",
              "priority" -> "Integer"
          )
      ),

      (
          "Enrolment Status Type",
          "/enrolments/statustypes",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String",
              "description" -> "String"
          )
      ),

      (
          "Enrolment Subject",
          "/enrolments/subjects",
          Array(
              "parentId"
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String",
              "isTesting" -> "Integer"
          )
      ),

      (
          "Enrolment Type",
          "/enrolments/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Enrolment Foreign Type",
          "/enrolmentforeignes/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Family Type",
          "/families/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Gender Type",
          "/gendertypes",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Honor Type",
          "/honors/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Job Type",
          "/jobtypes",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Language",
          "/languages",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Markscale",
          "/markscales",
          Array(
              "markscaleTypeId"
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String",
              "markMin" -> "Double",
              "markMax" -> "Double"
          )
      ),

      (
          "Markscale Type",
          "/markscales/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Married Type",
          "/marriedtypes",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Operation Type",
          "/operationtypes",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Order",
          "/orders",
          Array(
              "orderTypeId",
              "employeeId",
              "assetId",
              "partnerId",
              "operationTypeId",
              //"departmentId",
              "reasonId",
              "parentId",
              "timePeriodId"
          ),
          Array(
              "reasonText" -> "String",
              "docSeries" -> "String",
              "docNum" -> "String",
              "docDate" -> "Date",
              "docIssued" -> "String",
              "evDate" -> "Date",
              "title" -> "String",
              "description" -> "String"
          )
      ),

      (
          "Order Type",
          "/orders/types",
          Array(
              "parentId"
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Paper Type",
          "/papers/types",
          Array(
              "paperUsageId"
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Paper Usage",
          "/papers/usages",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Partner",
          "/partners",
          Array(
              "parentId"
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String",
              "manager" -> "String",
              "phone" -> "String",
              "email" -> "String",
              "begDate" -> "Date",
              "endDate" -> "Date"
          )
      ),

      (
          "Person",
          "/persons",
          Array(
              "parentId",
              "personTypeId",
              "genderTypeId",
              "marriedTypeId"//,
              //"citizenCountryId"
          ),
          Array(
              "name" -> "String",
              "firstName" -> "String",
              "fatherName" -> "String",
              "surname" -> "String",
              "photo" -> "String",
              "docSeries" -> "String",
              "docNum" -> "String",
              "identifier" -> "String",
              "resident" -> "Integer",
              "birthPlace" -> "String",
              "begDate" -> "Date",
              "endDate" -> "Date",
              "isMilitary" -> "Integer",
              "isHostel" -> "Integer"
          )
      ),

      (
          "Person Type",
          "/persons/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Public Activity",
          "/publicactivities",
          Array(
              "publicActivityTypeId",
              "timePeriodId"
          ),
          Array(
              "name" -> "String",
              "begDate" -> "Date",
              "endDate" -> "Date"
          )
      ),

      (
          "Public Activity Type",
          "/publicactivities/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Reason",
          "/reasons",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Salary Type",
          "/salaries/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Specialty",
          "/specialties",
          Array(
              "parentId",
              "specialtyTypeId"
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String",
              "cipher" -> "String",
              "begDate" -> "Date",
              "endDate" -> "Date"
          )
      ),

      (
          "Specialty Type",
          "/specialties/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Spec Offer",
          "/specoffers",
          Array(
              "specialtyId",
              "departmentId",
              "timePeriodId",
              "timePeriodCourseId",
              "eduFormTypeId",
              "specofferTypeId"
          ),
          Array(
              "docSeries" -> "String",
              "docNum" -> "String",
              "licCount" -> "Integer",
              "stateCount" -> "Integer",
              "begDate" -> "Date",
              "endDate" -> "Date"
          )
      ),

      (
          "Spec Offer Type",
          "/specoffers/types",
          Array(
              "timePeriodId"
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Street Type",
          "/streets/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Study Plan Cycle",
          "/studyplans/cycles",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Subject",
          "/subjects",
          Array(
              "subjectTypeId"
          ),
          Array(
              "name" -> "String"
          )
      ),

      (
          "Subject Type",
          "/subjects/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Time Period",
          "/timeperiods",
          Array(
              "parentId",
              "timePeriodTypeId"
          ),
          Array(
              "name" -> "String",
              "numValue" -> "Integer",
              "begDate" -> "Date",
              "endDate" -> "Date"
          )
      ),

      (
          "Time Period Type",
          "/timeperiods/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Time Sheet Type",
          "/timesheets/types",
          Array(
          ),
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Wave Type",
          "/wave/types",
          Array(
          ),
          Array(
              "name" -> "String"
          )
      )
      
  )

  val testCase = buildTestCase(methods)
  
}
