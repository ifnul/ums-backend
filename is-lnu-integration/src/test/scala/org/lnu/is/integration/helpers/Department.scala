package org.lnu.is.integration.helpers

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.value2Expression
import io.gatling.http.Predef.ELFileBody
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status
import io.gatling.http.request.builder.HttpRequestBuilder

object Department {

    def createDepartment(username: String, password: String, bodyLocation: String): HttpRequestBuilder =
      http("Post Department")
        .post("/departments")
        .basicAuth(username, password)
        .body(ELFileBody(bodyLocation))
        .asJSON
    
    def updateDepartment(username: String, password: String, url: String, bodyLocation: String): HttpRequestBuilder =
      http("Update Department")
        .put(url)
        .basicAuth(username, password)
        .body(ELFileBody(bodyLocation))
        .asJSON
        .check(status.is(200))

    def deleteDepartment(username: String, password: String, url: String): HttpRequestBuilder =
      http("Delete Department")
        .delete(url)
        .basicAuth(username, password)
        
    def getDepartment(username: String, password: String, url: String): HttpRequestBuilder =
      http("Get Department")
        .get(url)
        .basicAuth(username, password)
  
}