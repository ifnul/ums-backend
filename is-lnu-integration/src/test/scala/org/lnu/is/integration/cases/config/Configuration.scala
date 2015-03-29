package org.lnu.is.integration.cases.config

import org.lnu.is.integration.cases.BaseIntegrationTest
import org.lnu.is.integration.cases.OrderByType
object Configuration extends BaseIntegrationTest {
/*
 assets/1/address
 * */
  
/**
 * format:
	Map(
	   "name" -> "",
	   "url" -> "",
	   "title" -> " Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   )
 */
  /**
   *щоб вимкнути тести певної групи траба відповідно у globalCongiguration відповідне значення поставити false
   */
val globalCongiguration=Map(
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> true
)
val data =List(
	Map(
	   "name" -> "adresstype",
	   "url" -> "/addresstypes",
	   "title" -> "Address Type Integration Test",
	   "filds" -> List[String]("id", "name", "abbrName","uri"),
	   "filter" -> Map[String,Any]("id" -> 1, "name" -> "as", "abbrName" -> "asd"),
	   "order" -> Map[String,OrderByType.OrderByType]("id" -> OrderByType.ASC, "name" -> OrderByType.DESC, "abbrName" -> OrderByType.ASC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	   
	Map(
	   "name" -> "adminunit",
	   "url" -> "/adminunits",
	   "title" -> "Admin Unit Integration Test",
	   "filter" -> Map[String,Any]("adminUnitTypeId"->1, "parentId" -> 1, "identifier"->"001", "identifier1" -> "010" , "identifier2" -> "010", "identifier3" ->"00051" , "name" -> "Cd", "begDate"-> "2015-02-07", "endDate" -> "2015-03-01" ),
	   "order" -> Map[String,OrderByType.OrderByType]("adminUnitTypeId"->OrderByType.ASC, "parentId" -> OrderByType.ASC, "identifier"->OrderByType.DESC , "identifier1" -> OrderByType.DESC  , "identifier2" -> OrderByType.ASC, "identifier3" ->OrderByType.ASC , "name" -> OrderByType.DESC , "begDate"-> OrderByType.ASC, "endDate" -> OrderByType.ASC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	   
	Map(
	   "name" -> "adminunittype",
	   "url" -> "/adminunits/types",
	   "title" -> "Admin Unit Type Integration Test",
	   "filds" -> List[String]("id", "name", "abbrName", "uri"),
	   "filter" -> Map[String,Any]("id" -> 1, "name" -> "as", "abbrName" -> "asd"),
	   "order" -> Map[String,OrderByType.OrderByType]("id" -> OrderByType.ASC, "name" -> OrderByType.DESC, "abbrName" -> OrderByType.ASC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	   
	Map(
	   "name" -> "asset", 
	   "url" -> "/assets",
	   "title" -> "Asset Integration Test",
	   "filter" -> Map[String,Any]("id" -> 1, "invNum" -> "as", "prodDate" -> "2015-02-07",  "endDate"-> "2015-02-07",  "serialNum"-> "serl",  "begDate"-> "2015-02-07", "amount"-> 3,  "price"-> 100,  "suma"-> 300,  "assetTypeId"-> 1,  "assetStatusId"-> 1,  "assetStateId"-> 1,  "description"-> "description",  "name"-> "name"),
	   "order" -> Map[String, OrderByType.OrderByType]("id" -> OrderByType.ASC, "invNum" -> OrderByType.DESC,  "prodDate" -> OrderByType.DESC,  "endDate"-> OrderByType.ASC ,  "serialNum"-> OrderByType.DESC,  "begDate"-> OrderByType.ASC, "amount"-> OrderByType.DESC,  "price"-> OrderByType.DESC,  "suma"-> OrderByType.ASC,  "assetTypeId"-> OrderByType.DESC,  "assetStatusId"-> OrderByType.DESC,  "assetStateId"-> OrderByType.ASC,  "description"-> OrderByType.DESC,  "name"-> OrderByType.DESC),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),

	Map(
	   "name" -> "assetaddress",
	   "url" -> "/assets/${assetId}/addresses",
	   "title" -> "Asset Address Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),
	   
	Map(
	   "name" -> "assetstate",
	   "url" -> "/assets/states",
	   "title" -> "Asset State Integration Test",
	   "filds" -> List[String]("id", "name", "uri"),
	   "filter" -> Map[String, Any]("id" -> 1, "name" -> "as"),
	   "order" -> Map[String,OrderByType.OrderByType]("id" -> OrderByType.ASC, "name" -> OrderByType.DESC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	   
	Map(
	   "name" -> "assetstatus",
	   "url" -> "/assets/statuses",
	   "title" -> "Asset Status Integration Test",
	   "filds" -> List[String]("id", "name", "uri"),
	   "filter" -> Map[String, Any]("id" -> 1, "name" -> "as"),
	   "order" -> Map[String,OrderByType.OrderByType]("id" -> OrderByType.ASC, "name" -> OrderByType.DESC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	   
	Map(
	   "name" -> "assettype",
	   "url" -> "/assets/types",
	   "title" -> "Asset Type Integration Test",
	   "filds" -> List[String]("id", "name", "abbrName", "uri"),
	   "filter" -> Map[String,Any]("id" -> 1, "name" -> "as", "abbrName" -> "asd"),
	   "order" -> Map[String,OrderByType.OrderByType]("id" -> OrderByType.ASC, "name" -> OrderByType.DESC, "abbrName" -> OrderByType.DESC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	  
	Map(
	   "name" -> "benefit",
	   "url" -> "/benefits",
	   "title" -> "Benefit Integration Test",
	   "filter" -> Map[String,Any]("abbrName" -> 1, "name" -> "as", "endDate"-> "2012-01-01", "begDate"-> "2012-02-02",  "benefitTypeId"-> 1,  "description"-> "DEscription"),
	   "order" -> Map[String,OrderByType.OrderByType]("id" -> OrderByType.ASC, "name" -> OrderByType.DESC, "endDate"-> OrderByType.ASC , "begDate" -> OrderByType.ASC  ,  "benefitTypeId" -> OrderByType.ASC,  "description"-> OrderByType.DESC),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	  
	Map(
	   "name" -> "benefittype",
	   "url" -> "/benefits/types",
	   "title" -> "Benefit Type Integration Test",
	   "filds" -> List[String]("id", "name", "priority", "uri"),
	   "filter" -> Map[String,Any]("id" -> 1, "name" -> "as", "priority" -> 1),
	   "order" -> Map[String,OrderByType.OrderByType]("id" -> OrderByType.ASC, "name" -> OrderByType.DESC, "priority" -> OrderByType.ASC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	   
	Map(
	   "name" -> "contattype",
	   "url" -> "/contacts/types",
	   "title" -> "Contact Type Integration Test",
	   "filds" -> List[String]("id", "name", "abbrName", "uri"),
	   "filter" -> Map[String,Any]("id" -> 1, "name" -> "as", "abbrName" -> "asd"),
	   "order" -> Map[String,OrderByType.OrderByType]("id" -> OrderByType.ASC, "name" -> OrderByType.DESC, "abbrName" -> OrderByType.DESC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	   
	Map(
	   "name" -> "coursetype",
	   "url" -> "/courses/types",
	   "title" -> "Course Type Integration Test",
	   "filds" -> List[String]("id", "name", "abbrName", "uri"),
	   "filter" -> Map[String,Any]("id" -> 1, "name" -> "as", "abbrName" -> "asd"),
	   "order" -> Map[String,OrderByType.OrderByType]("id" -> OrderByType.ASC, "name" -> OrderByType.DESC, "abbrName" -> OrderByType.DESC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),

	   // TODO: Add releation
	Map(
	   "name" -> "degree",
	   "url" -> "/degrees",
	   "title" -> "Degree Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("personId" -> 1, "degreeTypeId" -> 1),
	   "order" -> Map[String,OrderByType.OrderByType]("personId" -> OrderByType.ASC, "degreeTypeId" ->OrderByType.ASC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),
	
	Map(
	   "name" -> "degretype",
	   "url" -> "/degrees/types",
	   "title" -> "Degree Types Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("abbrName" -> "test", "name" -> "sdf"),
	   "order" -> Map[String,OrderByType.OrderByType]("abbrName" -> OrderByType.ASC, "name" -> OrderByType.DESC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),

	Map(
	   "name" -> "department",
	   "url" -> "/departments",
	   "title" -> "Department Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("parentId" -> 1, "departmentTypeId" -> 1, "abbrName" -> "an", "name" -> "n", "manager" -> "men", "identifir" -> "10.01.01", "begDate" -> "2015-02-02", "endDate" -> "2015-02-02"),//TODO: Add "oder"->1
	   "order" -> Map[String,OrderByType.OrderByType]("parentId" -> OrderByType.ASC , "orderId" -> OrderByType.DESC , "departmentTypeId" -> OrderByType.ASC , "abbrName" -> OrderByType.ASC , "name" -> OrderByType.ASC , "manager" -> OrderByType.DESC , "identifir" -> OrderByType.DESC , "begDate" -> OrderByType.DESC , "endDate" -> OrderByType.DESC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "departmentaddress",
	   "url" -> "/departments/${departmentId}/addresses",
	   "title" -> "Department Address Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "departmentcontact",
	   "url" -> "/departments/${departmentId}/contacts",
	   "title" -> "Department Contact Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "departmentname",
	   "url" -> "/departments/${departmentId}/names",
	   "title" -> "Department Name Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "departmentspecialty",
	   "url" -> "/departments/${departmentId}/specialties",
	   "title" -> "Department Specialty Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),
	 
	Map(
	   "name" -> "departmenttype",
	   "url" -> "/departments/types",
	   "title" -> "Department Type Integration Test",
	   "filds" -> List[String]("id",  "name", "uri"), // TODO: add "abbrName"
	   "filter" -> Map[String,Any]("abbrName" -> "123", "name" -> "neme"),
	   "order" -> Map[String,OrderByType.OrderByType]("abbrName" -> OrderByType.ASC, "name" -> OrderByType.ASC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	   
	Map(
	   "name" -> "dutytepe",
	   "url" -> "/duties/types",
	   "title" -> "Duty Status Integration Test",
	   "filds" -> List[String]("id", "name", "uri"),
	   "filter" -> Map[String,Any]("abbrName" -> "123", "name" -> "neme"),
	   "order" -> Map[String,OrderByType.OrderByType]("abbrName" -> OrderByType.ASC, "name" -> OrderByType.ASC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
	   ),
	
	Map(
	   "name" -> "educationtype",
	   "url" -> "/educations/types",
	   "title" -> "Education Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("abbrName" -> "123", "name" -> "neme"),
	   "order" -> Map[String,OrderByType.OrderByType]("abbrName" -> OrderByType.ASC, "name" -> OrderByType.ASC ),
	   "pathData" -> "data/education/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> true
   	   ),
   	
	Map(
	   "name" -> "eduformtype",
	   "url" -> "/eduformtypes",
	   "title" -> "Edu Form Types Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("name" -> "new"),
	   "order" -> Map[String,OrderByType.OrderByType]("name" -> OrderByType.ASC ),
	   "pathData" -> "data/eduformtypes/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> true
   	   ),
   	//TODO:Is not test
   	Map(
	   "name" -> "employee",
	   "url" -> "/employees",
	   "title" -> "Employee Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("name" -> "new"),
	   "order" -> Map[String,OrderByType.OrderByType]("name" -> OrderByType.ASC ),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> false
   	   ),
   	   
	Map(
	   "name" -> "employeestatus",
	   "url" -> "/employees/statuses",
	   "title" -> "Employee Status Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("abbrName" -> "123", "name" -> "neme"),
	   "order" -> Map[String,OrderByType.OrderByType]("abbrName" -> OrderByType.ASC, "name" -> OrderByType.DESC ),
	   "pathData" -> "data/employee/status/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "employeetype",
	   "url" -> "/employees/types",
	   "title" -> "Employee Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("abbrName" -> "123", "name" -> "neme"),
	   "order" -> Map[String,OrderByType.OrderByType]("abbrName" -> OrderByType.ASC, "name" -> OrderByType.ASC  ),
	   "pathData" -> "data/employee/types/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "enrolment",
	   "url" -> "/enrolments",
	   "title" -> "Enrolment Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "enrolmentbenefit",
	   "url" -> "/enrolments/${enrolmentId}/benefits",
	   "title" -> "Enrolment Benefit Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "enrolmentstatuse",
	   "url" -> "/enrolments/${enrolmentId}/statuses",
	   "title" -> "Enrolment Status Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "enrolmentstatustype",
	   "url" -> "/enrolments/statustypes",
	   "title" -> "Enrolment Status Types Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("abbrName" -> "qwe", "name" -> "nqm","description" -> "desc"),
	   "order" -> Map[String,OrderByType.OrderByType]("abbrName" ->OrderByType.ASC, "name" ->OrderByType.ASC, "description" ->  OrderByType.ASC ),
	   "pathData" -> "data/enrolment/statustype/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "enrolmentsubject",
	   "url" -> "/enrolments/subjects",
	   "title" -> "Enrolment Subject Types Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("parentId" -> 3, "abbrName" -> "укр", "name" ->"213","isTesting" -> 1),
	   "order" -> Map[String,OrderByType.OrderByType]("parentId" -> OrderByType.ASC , "abbrName" -> OrderByType.DESC , "name" ->OrderByType.ASC ,"isTesting" -> OrderByType.ASC ),
	   "pathData" -> "data/enrolment/subject/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "enrolmenttype",
	   "url" -> "/enrolments/types",
	   "title" -> "Enrolment Types Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("abbrName" -> "123", "name" -> "neme"),
	   "order" -> Map[String,OrderByType.OrderByType]("abbrName" -> OrderByType.ASC, "name" -> OrderByType.ASC  ),
	   "pathData" -> "data/enrolment/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "familytype",
	   "url" -> "/families/types",
	   "title" -> "Family Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("abbrName" -> "123", "name" -> "neme"),
	   "order" -> Map[String,OrderByType.OrderByType]("abbrName" -> OrderByType.ASC, "name" -> OrderByType.ASC),
	   "pathData" -> "data/family/types/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "gendertype",
	   "url" -> "/gendertypes",
	   "title" -> "Gender Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any]("abbrName" -> "123", "name" -> "neme"),
	   "order" -> Map[String,OrderByType.OrderByType]("abbrName" -> OrderByType.DESC , "name" -> OrderByType.DESC ),
	   "pathData" -> "data/gendertype/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> true,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "honortype",
	   "url" -> "/honors/types",
	   "title" -> "Honor Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/honor/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "language",
	   "url" -> "/languages",
	   "title" -> "Language Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/language/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "marriedtype",
	   "url" -> "/marriedtypes",
	   "title" -> "Married Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/marriedtype/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "operationtype",
	   "url" -> "/operationtypes",
	   "title" -> "Operation Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/operation/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "order",
	   "url" -> "/orders",
	   "title" -> "Order Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "ordertype",
	   "url" -> "/orders/types",
	   "title" -> "Order Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/order/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "papertype",
	   "url" -> "/papers/types",
	   "title" -> "Paper Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/paper/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "paperusage",
	   "url" -> "/papers/usages",
	   "title" -> "Paper Usage Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/paper/usage/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "partner",
	   "url" -> "/partners",
	   "title" -> "Partner Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "person",
	   "url" -> "/persons",
	   "title" -> "Person Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "personaddress",
	   "url" -> "/persons/${personId}/addresses",
	   "title" -> "Person Address Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "personaward",
	   "url" -> "/persons/${personId}/awards",
	   "title" -> "Person Award Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "personcontact",
	   "url" -> "/persons/${personId}/contacts",
	   "title" -> "Person Contact Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "personeducation",
	   "url" -> "/persons/${personId}/educations",
	   "title" -> "Person Education Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "personenrolmentsubject",
	   "url" -> "/persons/${personId}/enrolmentsubjects",
	   "title" -> "Person Enrolment Subject Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "personfamily",
	   "url" -> "/persons/${personId}/families",
	   "title" -> "Person Family Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "personlanguage",
	   "url" -> "/persons/${personId}/languages",
	   "title" -> "Person Language Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "personname",
	   "url" -> "/persons/${personId}/names",
	   "title" -> "Person Name Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "personpaper",
	   "url" -> "/persons/${personId}/papers",
	   "title" -> "Person Paper Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "persontype",
	   "url" -> "/persons/types",
	   "title" -> "Person Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/person/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "publicactivity",
	   "url" -> "/publicactivities",
	   "title" -> "Public Activity Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "publicactivityaward",
	   "url" -> "/publicactivities/{publicActivityId}/awards",
	   "title" -> "Public Activity Award Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "publicactivitytype",
	   "url" -> "/publicactivities/types",
	   "title" -> "Public Activity Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/publicactivity/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "reason",
	   "url" -> "/reasons",
	   "title" -> "Reason Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/reason/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "sallarytype",
	   "url" -> "/sallaries/types",
	   "title" -> "Sallary Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/sallary/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "specialty",
	   "url" -> "/specialties",
	   "title" -> "Specialty Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "specialtytype",
	   "url" -> "/specialties/types",
	   "title" -> " Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/specialty/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "specoffer",
	   "url" -> "/specoffers",
	   "title" -> "Specoffer Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "specofferbenefit",
	   "url" -> "/specoffers/${specofferId}/benefits",
	   "title" -> "Specoffer Benefit Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "specoffersubject",
	   "url" -> "/specoffers/${specofferId}/subjects",
	   "title" -> "Specoffer Subject Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "specoffertype",
	   "url" -> "/specoffers/types",
	   "title" -> "Specoffer Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/specoffer/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "specofferwave",
	   "url" -> "/specoffers/${specofferId}/waves",
	   "title" -> "Specoffer Wave Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "streettype",
	   "url" -> "/streets/types",
	   "title" -> "Street Types Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/street/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "studyplancycle",
	   "url" -> "/studyplans/cycles",
	   "title" -> "StudyPlan Cycle Integration Test",
	   "filds" -> List[String]("id", "name", "abbrName", "uri"),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map( 
	   "name" -> "subject",
	   "url" -> "/subjects",
	   "title" -> "Subject Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/subject/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "subjecttype",
	   "url" -> "/subjects/types",
	   "title" -> "Subject Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/subject/types/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "timeperiod",
	   "url" -> "/timeperiods",
	   "title" -> "Time Period Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
   	   ),

	Map(
	   "name" -> "timeperiodtype",
	   "url" -> "/timeperiods/types",
	   "title" -> "Time Period Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/timeperiod/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),

	Map(
	   "name" -> "timesheettype",
	   "url" -> "/timesheets/types",
	   "title" -> "Timesheet Type Integration Test",
	   "filds" -> List[String](),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "data/timesheet/type/response.json",
	   "checkFieldsExistence"-> false,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> true
   	   ),
	   
	Map(
	   "name" -> "wavetype",
	   "url" -> "/wave/types",
	   "title" -> "Wave Type Get Paged Result",
	   "filds" -> List[String]("id", "name", "uri"),
	   "filter" -> Map[String,Any](),
	   "order" -> Map[String,OrderByType.OrderByType](),
	   "pathData" -> "",
	   "checkFieldsExistence"-> true,
	   "checkOrderAndFilter" -> false,
	   "checkData" -> false
	   )
	   
	 )
	 	
  val testCase = buildAllTestCase(data,globalCongiguration)
}
	