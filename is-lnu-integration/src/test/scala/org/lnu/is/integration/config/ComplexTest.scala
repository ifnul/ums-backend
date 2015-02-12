package org.lnu.is.integration.config

import io.gatling.http.request.builder.HttpRequestBuilder
import io.gatling.core.structure.ChainBuilder

trait ComplexTest {

	protected def after():ChainBuilder
  protected def before():ChainBuilder
  protected def init():ChainBuilder
}