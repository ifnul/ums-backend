package org.lnu.is.integration

import org.lnu.is.integration.resource.ResourceByIdIntegrationTest

import io.gatling.core.Predef.scenario

object FuntionalTestCases {

    val scn = scenario("Integration test scenario")
              .exec(ResourceByIdIntegrationTest.testCase)
}