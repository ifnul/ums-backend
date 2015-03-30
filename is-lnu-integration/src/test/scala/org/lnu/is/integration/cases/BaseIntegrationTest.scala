package org.lnu.is.integration.cases

import io.gatling.core.Predef.{checkBuilder2Check, exec, findCheckBuilder2ValidatorCheckBuilder, stringToExpression, validatorCheckBuilder2CheckBuilder, value2Expression, value2Success}
import io.gatling.http.Predef.{http, jsonPath, status}
import io.gatling.http.request.builder.HttpRequestBuilder
import io.gatling.http.request.builder.HttpRequestBuilder.toActionBuilder
import org.lnu.is.integration.cases.OrderByType.OrderByType
import scala.collection.immutable.Map
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.request.RawFileBody
import io.gatling.http.Predef.bodyString

/**
 * Created by orestkyrylchuk on 2/15/15.
 */
abstract class BaseIntegrationTest {

  val username = "admin"
  val password = "nimda"

  def toInt(s: String):Int = {
  try {
    s.toInt
  } catch {
    
    case e:Exception => {print("Error"); 0}
  }
}
  
  def buildAllTestCase(data: List[Map[String,Any]], global: Map[String,Boolean]):ChainBuilder  = {
	  var result = exec()
	  for (item <- data){
	    val url=item("url").toString
	    val title=item("title").toString
	    if (item("checkFieldsExistence").asInstanceOf[Boolean] && global("checkFieldsExistence"))
	    {
	       result=result.exec(buildTestCaseToCheckFieldsExistence(url,title,item("filds").asInstanceOf[List[String]])) 
	    }
	    if (item("checkOrderAndFilter").asInstanceOf[Boolean] && global("checkOrderAndFilter")){
	      result=result.exec(buildAllTestCaseFilterAndOrder(item))
	    }
	    if (item("checkData").asInstanceOf[Boolean] && global("checkData")){
	      result=result.exec(buildTestCaseToChackData(item))
	    }
	  }
	  return result; 
  }
  
  def buildTestCaseToCheckFieldsExistence(url: String, title: String, fields: List[String]) = {
    buildTestCase(url, title, buildHttpRequestWithFieldsExistenceCheck(
        http(title)
          .get(url + "/${resourceId}")
          .basicAuth(username, password)
          .check(status.is(200)), fields
      ))
  }

  def buildTestCase(url: String, title: String, httpRequest: HttpRequestBuilder) = {
    exec(http("Multiple " + title)
      .get(url)
      .basicAuth(username, password)
      .check(status.is(200))
      .check(jsonPath("$.count").find.saveAs("count"))
      .check(jsonPath("$.limit").find.saveAs("limit"))
      .check(jsonPath("$.offset").find.saveAs("offset"))
      .check(jsonPath("$.resources[*]").ofType[Map[String, Any]].findAll.saveAs("resources")))
    .exec(session => {
      /*print("start\n")
      print(session.attributes.filter({case (name, extension) => name == "offset"})("offset"))
      print("end\n")
      print(session.attributes("offset"))
      print("end\n")*/
      
      val offset = toInt(session.attributes("offset").toString)
      val limit = toInt(session.attributes("limit").toString)
      val count = toInt(session.attributes("count").toString)

      // First occurrence -> Situation, when offset == 0 and needs to proceed.
      val result = offset + limit < count || offset <= count

      session.set("result", result)
    })
    .asLongAs(session => session("result").as[Boolean]) {
      exec(
        exec(http("Multiple Paged Request for: " + url)
          .get(url + "?offset=${offset}")
          .basicAuth(username, password)
          .check(status.is(200))
          .check(jsonPath("$.count").find.saveAs("count"))
          .check(jsonPath("$.limit").find.saveAs("limit"))
          .check(jsonPath("$.offset").find.saveAs("offset"))
          .check(jsonPath("$.resources[*]").ofType[Map[String, Any]].findAll.saveAs("resources"))))
      .foreach("${resources}", "resource") {
        exec( session => {
          val resource = session("resource").as[Map[String, Any]]
          val resourceId = resource("id")

          session.set("resourceId", resourceId)
        })
        .exec(httpRequest)
      }
      .exec(session => {
         val offset = toInt(session.attributes("offset").toString)
         val limit = toInt(session.attributes("limit").toString)
         val count = toInt(session.attributes("count").toString)

        // Can be a situation, when offset == 0 and offset + count will be > count
        // That's why we need to add additional check -> offset != null
        val result = offset + limit < count || (offset <= count && offset != 0)

        session
          .set("offset", offset + limit)
          .set("result", result)
      })
    }
  }
  
  def buildHttpRequestWithFieldsExistenceCheck(builder: HttpRequestBuilder, fields: List[String]): HttpRequestBuilder = fields match {
    case List() => builder
    case field::tail => buildHttpRequestWithFieldsExistenceCheck(builder.check(jsonPath("$." + field).find.exists), tail)
  }
  
  def buildAllTestCaseFilterAndOrder(data: Map[String,Any]):ChainBuilder = {
    var result = exec()
    val filterEmpty = Map[String,Any]()
    val orderEmpty = Map[String,OrderByType]()
    val url = data("url").toString()
    val title = data("title").toString()
	val filter = data("filter").asInstanceOf[Map[String, Any]]
        	  
    val order = data("order").asInstanceOf[Map[String,OrderByType]]
    result = result.exec(buildTestCaseFilterAndOrder(url, "Get " + title, filterEmpty, orderEmpty))
    result = result.exec(buildTestCaseFilterAndOrder(url, "Filter "+ title, filter, orderEmpty))
    result = result.exec(buildTestCaseFilterAndOrder(url, "Order " + title, filterEmpty, order))
    result = result.exec(buildTestCaseFilterAndOrder(url, "Filter And Order " + title, filter, order))
    for (filt<-filter){
      result = result.exec(buildTestCaseFilterAndOrder(url, "Filter One " + title, Map(filt), orderEmpty))
    }
    for (ord<-order){
      result = result.exec(buildTestCaseFilterAndOrder(url, "Order One " + title, filterEmpty, Map(ord)))
    }
    return result; 
  }
  
  def buildTestCaseFilterAndOrder(url: String, title: String, filter: Map[String, Any], order: Map[String,OrderByType]) = {
    val x = collection.mutable.Map(filter.toSeq:_*)
    if ((order.fold(""){(z,x)=>z+x.toString()+","}).toString()!="") {
    	x("orderBy")=(order.foldLeft(""){(z,x)=>z+x._1+"-"+x._2+","}).toString().dropRight(1)
    }
    val p = x.toMap
     exec(http(title)
        .get(url)
        .queryParamMap(p)
        .basicAuth(username, password)
        .check(status.is(200)))
  }
  
  def buildTestCaseToChackData(data: Map[String,Any]) = {
    val title = data("title").toString()
    val url = data("url").toString()
    val dataPath = data("pathData").toString()
    val response = RawFileBody(dataPath)
    exec(http("Check Data " + title)
      .get(url)
      .basicAuth(username, password)
      .check(bodyString.is(response))
      )
  }
}