package org.lnu.is.integration.cases.benefit.types

import org.lnu.is.integration.cases.BaseIntegrationTest

object BenefitTypeIntegrationTest extends BaseIntegrationTest {

  val url = "/benefits/types"
  val title = "Benefit Type Integration Test"

  val testCase = buildTestCaseToCheckFieldsExistence(url, title, List("id", "name", "priority", "uri"))
}