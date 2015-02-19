package org.lnu.is.integration.cases.contact.types

import org.lnu.is.integration.cases.BaseIntegrationTest
import org.lnu.is.integration.cases.address.types.AddressTypeIntegrationTest._


object ContactTypeIntegrationTest extends BaseIntegrationTest {

  val url = "/contacts/types"
  val title = "Contact Type Integration Test"

  val testCase = buildTestCaseToCheckFieldsExistence(url, title, List("id", "name", "abbrName", "uri"))

}