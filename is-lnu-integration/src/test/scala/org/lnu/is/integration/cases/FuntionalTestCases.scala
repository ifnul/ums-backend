package org.lnu.is.integration.cases

import io.gatling.core.Predef.scenario
import org.lnu.is.integration.cases.resource.ResourceByIdIntegrationTest

object FuntionalTestCases {

    val scn = scenario("Integration test scenario")
              .exec(ResourceByIdIntegrationTest.testCase)
}