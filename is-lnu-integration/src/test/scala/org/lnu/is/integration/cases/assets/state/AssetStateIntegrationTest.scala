package org.lnu.is.integration.cases.assets.state

import org.lnu.is.integration.cases.BaseIntegrationTest

object AssetStateIntegrationTest extends BaseIntegrationTest {

    val url = "/assets/states"
    val title = "Asset State Integration Test"
 
    val testCase = buildTestCaseToCheckFieldsExistence(url, title, List("id", "name", "uri"))
}
