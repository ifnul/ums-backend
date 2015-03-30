package org.lnu.is.integration.cases

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.value2Expression
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status
import io.gatling.core.structure.ChainBuilder

import scala.util.Random
import java.util.Calendar
import java.text.SimpleDateFormat

/**
 * @author OlehZanevych
 */

abstract class BaseMultipleGetIntegrationTest {
  
  val username = "admin"
  val password = "nimda"
  
  def buildTestCase(methods: Array[(String, String, Array[(String, String)])]): ChainBuilder = {
    var result = exec()
    methods.foreach{method => {
      result = result.exec(checkUrl(method._1, method._2))
      val titleWithOrderBy = method._1 + " With Order By"
      val urlWithOrderBy = method._2 + "?orderBy=" + method._3.map{str => str._1 + "-asc"}.mkString(",")
      result = result.exec(checkUrl(titleWithOrderBy, urlWithOrderBy))
      val titleWithFilter = method._1 + " With Filter"
      val urlWithFilter = method._2 + "?" + method._3.map{str => str._1 + "=" + getRandomValue(str._2)}.mkString("&")
      result = result.exec(checkUrl(titleWithFilter, urlWithFilter))
    }}
    return result
  }
  
  def checkUrl(title: String, url: String) =
    http(title)
        .get(url)
        .basicAuth(username, password)
        .check(status.is(200))
     
  def getRandomValue(valueType: String): String = {
    val random = new Random() 
    return valueType match {
      case "Double" => (random.nextDouble() + 3.0).toString()
      case "Long" => random.nextInt(1000000).toString()
      case "Date" => new SimpleDateFormat("YYYY-MM-dd").format(Calendar.getInstance.getTime)
      case "String" => random.nextString(10)
      case "Boolean" => random.nextBoolean().toString()
      case "Integer" => (1 + random.nextInt(9)).toString()
    }
  }
        
}
