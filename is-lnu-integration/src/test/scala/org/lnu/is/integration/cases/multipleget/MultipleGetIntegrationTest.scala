package org.lnu.is.integration.cases.multipleget

import org.lnu.is.integration.cases.BaseMultipleGetIntegrationTest

/**
 * @author OlehZanevych
 */

object MultipleGetIntegrationTest extends BaseMultipleGetIntegrationTest {

  val methods = Array(
      
      (
          "Multiple Get Address Type",
          "/addresstypes",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Admin Unit Type",
          "/adminunits/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Asset State",
          "/assets/states",
          Array(
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Asset Status",
          "/assets/statuses",
          Array(
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Asset Type",
          "/assets/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Benefit Type",
          "/benefits/types",
          Array(
              "name" -> "String",
              "priority" -> "Integer"
          )
      ),

      (
          "Multiple Get Broadcasting Message",
          "/broadcastings",
          Array(
              "content" -> "String",
              "topic" -> "String"
          )
      ),

      (
          "Multiple Get Contact Type",
          "/contacts/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Course Type",
          "/courses/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Degree Type",
          "/degrees/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Department Type",
          "/departments/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Duty Type",
          "/duties/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Education Type",
          "/educations/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Edu Form Type",
          "/eduformtypes",
          Array(
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Employee Status",
          "/employees/statuses",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Employee Type",
          "/employees/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Enrolment Status Type",
          "/enrolments/statustypes",
          Array(
              "abbrName" -> "String",
              "name" -> "String",
              "description" -> "String"
          )
      ),

      (
          "Multiple Get Enrolment Foreign Type",
          "/enrolmentforeignes/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Family Type",
          "/families/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Gender Type",
          "/gendertypes",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Honor Type",
          "/honors/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Job Type",
          "/jobtypes",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Markscale Type",
          "/markscales/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Operation Type",
          "/operationtypes",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Paper Usage",
          "/papers/usages",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Person Type",
          "/persons/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Reason",
          "/reasons",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Specialty Type",
          "/specialties/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Street Type",
          "/streets/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Subject Type",
          "/subjects/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Time Period Type",
          "/timeperiods/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Time Sheet Type",
          "/timesheets/types",
          Array(
              "abbrName" -> "String",
              "name" -> "String"
          )
      ),

      (
          "Multiple Get Wave Type",
          "/wave/types",
          Array(
              "name" -> "String"
          )
      )
      
  )

  val testCase = buildTestCase(methods)
  
}