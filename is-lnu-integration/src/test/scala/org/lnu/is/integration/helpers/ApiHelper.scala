package org.lnu.is.integration.helpers

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.Predef.value2Expression
import io.gatling.http.Predef.ELFileBody
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status
import io.gatling.http.request.builder.HttpRequestBuilder

class ApiHelper(val api: String, val title: String) {
  
  def create(username: String, password: String, url: String): HttpRequestBuilder =
    http("Post " + title)
      .post(url)
      .basicAuth(username, password)
      .body(ELFileBody("data/" + api + "/post.json"))
      .asJSON

  def update(username: String, password: String, url: String): HttpRequestBuilder =
    http("Update " + title)
      .put(url)
      .basicAuth(username, password)
      .body(ELFileBody("data/" + api + "/put.json"))
      .asJSON

  def delete(username: String, password: String, url: String): HttpRequestBuilder =
    http("Delete " + title)
      .delete(url)
      .basicAuth(username, password)

  def get(username: String, password: String, url: String): HttpRequestBuilder =
    http("Get " + title)
      .get(url)
      .basicAuth(username, password)

}