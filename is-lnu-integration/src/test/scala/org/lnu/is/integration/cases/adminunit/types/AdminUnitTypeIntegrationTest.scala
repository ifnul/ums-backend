package org.lnu.is.integration.cases.adminunit.types

import org.lnu.is.integration.cases.BaseIntegrationTest

object AdminUnitTypeIntegrationTest extends BaseIntegrationTest {

    val url = "/adminunits/types"
    val title = "Admin Unit Type Integration Test"
 
    val testCase = buildTestCaseToCheckFieldsExistence(url, title, List("id", "name", "abbrName", "uri"))

}