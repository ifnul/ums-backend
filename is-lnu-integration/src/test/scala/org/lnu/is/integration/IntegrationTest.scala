package org.lnu.is.integration

import io.gatling.core.Predef._
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef._
import io.gatling.http.Predef.http
import io.gatling.http.config.HttpProtocolBuilder.toHttpProtocol
import io.gatling.jdbc.Predef._

/**
 * Class, that runs integration testing.
 * @author ivanursul
 */
class IntegrationTest extends Simulation {

	val host = System.getProperty("integration.host")
	val successPercent = Integer.getInteger("integration.successtests.percent", 95)
  
	val httpConf = http
			.baseURL(host)
			.acceptHeader("application/json")
	
	val injectStep = atOnceUsers(1);
	
  val scn = TestCases.scn;
 
	setUp(scn.inject(injectStep))
	  .protocols(httpConf)
	  .assertions(global.successfulRequests.percent.greaterThan(successPercent))
	
}
