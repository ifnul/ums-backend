package org.lnu.is.integration.cases

import java.util.UUID
import java.util.Calendar

import java.text.SimpleDateFormat

import scala.util.Random

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.value2Expression
import io.gatling.http.Predef.http
import io.gatling.http.Predef.jsonPath
import io.gatling.http.Predef.status
import io.gatling.core.structure.ChainBuilder

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
      result = result.exec(checkStatusValue(title, method._2, 200))
      val titleWithOrderBy = title + " With Order By"
      val urlWithOrderBy = method._2 + "?orderBy=" + (method._3 ++ method._4.map{str => str._1}).map{str => str + "-asc"}.mkString(",")
      result = result.exec(checkStatusValue(titleWithOrderBy, urlWithOrderBy, 200))
      val titleWithFilter = title + " With Filter By Non Key Fields"
      val urlWithFilter = method._2 + "?" + method._4.map{str => str._1 + "=" + getRandomValue(str._2)}.mkString("&")
      result = result.exec(checkStatusValue(titleWithFilter, urlWithFilter, 200))
      method._3.foreach{key => {
        val titleWithFilterByKey = title + " With Filter By " + key
        val urlWithFilterByKey = method._2 + "?" + key + "=9223372036854775807"
        result = result.exec(checkStatusValue(titleWithFilterByKey, urlWithFilterByKey, 404))
      }}
    }}
    return result
  }
  
  def checkStatusValue(title: String, url: String, statusValue: Int) =
    http(title)
        .get(url)
        .basicAuth(username, password)
        .check(status.is(statusValue))
        
  def getRandomValue(valueType: String): String = {
    val random = new Random() 
    return valueType match {
      case "Boolean" => random.nextBoolean().toString()
      case "Date" => new SimpleDateFormat("YYYY-MM-dd").format(Calendar.getInstance.getTime)
      case "Double" => (random.nextDouble() + 3.0).toString()
      case "Long" => (random.nextInt(1000000) + 1).toString()
      case "Integer" => (random.nextInt(9) + 1).toString()
      case "String" => UUID.randomUUID().toString()
    }
  }
        
}
