package org.lnu.is.integration.cases.address.types

import org.lnu.is.integration.cases.BaseIntegrationTest

object AddressTypeIntegrationTest extends BaseIntegrationTest {

  val url = "/addresstypes"
  val title = "Address Type Integration Test"

  val testCase = buildTestCaseToCheckFieldsExistence(url, title, List("id", "name", "abbrName", "uri"))

}
