package org.lnu.is.integration.cases.department.types

import org.lnu.is.integration.cases.BaseIntegrationTest

object DepartmentTypeIntegrationTest extends BaseIntegrationTest {

  val url = "/departments/types"
  val title = "Department Type Get Paged Result"

  val testCase = buildTestCaseToCheckFieldsExistence(url, title, List("id", "name", "uri"))

}