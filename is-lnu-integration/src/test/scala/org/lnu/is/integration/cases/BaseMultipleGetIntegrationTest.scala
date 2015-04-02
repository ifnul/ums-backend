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
  
  def buildTestCase(methods: Array[(String, String, Array[_ <: String], Array[_ <: (String, String)])]): ChainBuilder = {
    var result = exec()
    methods.foreach{method => {
      val title = "Multiple Get " + method._1
      result = result.exec(checkUrl(title, method._2))
      val titleWithOrderBy = title + " With Order By"
      val urlWithOrderBy = method._2 + "?orderBy=" + (method._3 ++ method._4.map{str => str._1}).map{str => str + "-asc"}.mkString(",")
      result = result.exec(checkUrl(titleWithOrderBy, urlWithOrderBy))
      val titleWithFilter = title + " With Filter"
      val urlWithFilter = method._2 + "?" + method._4.map{str => str._1 + "=" + getRandomValue(str._2)}.mkString("&")
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
      case "Boolean" => random.nextBoolean().toString()
      case "Date" => new SimpleDateFormat("YYYY-MM-dd").format(Calendar.getInstance.getTime)
      case "Double" => (random.nextDouble() + 3.0).toString()
      case "Long" => (random.nextInt(1000000) + 1).toString()
      case "Integer" => (random.nextInt(9) + 1).toString()
      case "String" => random.nextString(10)
    }
  }
        
}
