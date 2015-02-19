package org.lnu.is.integration.cases.assets.statuses

import org.lnu.is.integration.cases.BaseIntegrationTest
import org.lnu.is.integration.cases.assets.state.AssetStateIntegrationTest._


object AssetStatusIntegrationTest extends BaseIntegrationTest {

    val url = "/assets/statuses"
    val title = "Asset Status Integration Test"
 
    val testCase = buildTestCaseToCheckFieldsExistence(url, title, List("id", "name", "uri"))
}