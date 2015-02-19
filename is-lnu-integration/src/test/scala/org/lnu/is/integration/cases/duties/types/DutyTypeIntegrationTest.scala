package org.lnu.is.integration.cases.duties.types

import org.lnu.is.integration.cases.BaseIntegrationTest


object DutyTypeIntegrationTest extends BaseIntegrationTest {

  val url = "/duties/types"
  val title = "Duty Status Get Paged Result"

  val testCase = buildTestCaseToCheckFieldsExistence(url, title, List("id", "name", "uri"))
}