package org.lnu.is.integration.cases

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.exec
import io.gatling.core.Predef.value2Expression
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status
import io.gatling.core.structure.ChainBuilder

/**
 * @author OlehZanevych
 */

abstract class BaseOrderByAndFilterIntegrationTest {
  
  val username = "admin"
  val password = "nimda"
  
  def buildTestCase(methods: Array[(String, String, Array[(String, String)])]): ChainBuilder = {
    var result = exec()
    methods.foreach{method => {
      val url = method._2 + "?orderBy=" + method._3.map{str => str._1 + "-asc"}.mkString(",") + method._3.map{str => str._1 + "=" + str._2}.mkString("&", "&", "")
      result = result.exec(checkUrl(method._1, url))
    }}
    return result
    
  }
  
  def checkUrl(title: String, url: String) =
    http(title)
        .get(url)
        .basicAuth(username, password)
        .check(status.is(200))
        
}
