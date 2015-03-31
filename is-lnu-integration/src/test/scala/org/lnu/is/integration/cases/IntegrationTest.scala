package org.lnu.is.integration.cases

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
   
  def toInt(s: String, default:Int): Int = {
    try {
      s.toInt
    } catch {

      case e: Exception => { default }
    }
  }
   
	val host = System.getProperty("integration.host")
	val successPercent = toInt(System.getProperty("integration.successtests.percent"), 95)
	val httpConf = http
			.baseURL(host)
      .header("Content-Type", "application/json") // Instead of adding this header in all test cases.
			.acceptHeader("application/json")
	
	val injectStep = atOnceUsers(1);
	
  val scn = getTestCases()
 
	setUp(scn.inject(injectStep))
	  .protocols(httpConf)
	  .assertions(global.successfulRequests.percent.greaterThan(successPercent))
	
  def getTestCases() = TestCases.scn  
    
}
