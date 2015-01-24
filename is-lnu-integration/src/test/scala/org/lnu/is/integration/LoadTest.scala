package org.lnu.is.integration

import scala.concurrent.duration.DurationInt
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.global
import io.gatling.core.Predef.rampUsers
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.http
import io.gatling.http.config.HttpProtocolBuilder.toHttpProtocol

/**
 * Class, that runs load testing.
 * @author ivanursul
 */
class LoadTest extends Simulation {

  val host = System.getProperty("integration.host")
  val successPercent = Integer.getInteger("integration.successtests.percent", 95)
  
  val httpConf = http
      .baseURL(host)
      .acceptHeader("application/json")
  
  val injectStep = rampUsers(20) over (20 seconds)
  
  val scn = TestCases.scn;
 
  setUp(scn.inject(injectStep))
    .protocols(httpConf)
    .assertions(global.successfulRequests.percent.greaterThan(successPercent))
  
}
