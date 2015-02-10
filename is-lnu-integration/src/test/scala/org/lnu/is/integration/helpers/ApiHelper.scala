package org.lnu.is.integration.helpers

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.value2Expression
import io.gatling.http.Predef.ELFileBody
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status
import io.gatling.http.request.builder.HttpRequestBuilder

class ApiHelper(val apiTitle: String) {

  def create(username: String, password: String, url: String, bodyLocation: String): HttpRequestBuilder =
    http("Post " + apiTitle)
      .post(url)
      .basicAuth(username, password)
      .body(ELFileBody(bodyLocation))
      .asJSON

  def update(username: String, password: String, url: String, bodyLocation: String): HttpRequestBuilder =
    http("Update " + apiTitle)
      .put(url)
      .basicAuth(username, password)
      .body(ELFileBody(bodyLocation))
      .asJSON

  def delete(username: String, password: String, url: String): HttpRequestBuilder =
    http("Delete " + apiTitle)
      .delete(url)
      .basicAuth(username, password)

  def get(username: String, password: String, url: String): HttpRequestBuilder =
    http("Get " + apiTitle)
      .get(url)
      .basicAuth(username, password)

}