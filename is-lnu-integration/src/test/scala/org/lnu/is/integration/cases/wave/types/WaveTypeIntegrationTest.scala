package org.lnu.is.integration.cases.wave.types

import org.lnu.is.integration.cases.BaseIntegrationTest

object WaveTypeIntegrationTest extends BaseIntegrationTest {

  val url = "/wave/types"
  val title = "Wave Type Get Paged Result"

  val testCase = buildTestCaseToCheckFieldsExistence(url, title, List("id", "name", "uri"))
}