package org.lnu.is.integration.cases.degree.types

import org.lnu.is.integration.cases.BaseIntegrationTest

object DegreeTypeIntegrationTest extends BaseIntegrationTest {

  val title = "Degree Types Get Paged Result"
  val url = "/degrees/types"

  val testCase = buildTestCaseToCheckFieldsExistence(url, title, List())

}