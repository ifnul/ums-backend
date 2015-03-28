package org.lnu.is.integration.cases.orderbyandfilter

import org.lnu.is.integration.cases.BaseOrderByAndFilterIntegrationTest

/**
 * @author OlehZanevych
 */

object OrderByAndFilterIntegrationTest extends BaseOrderByAndFilterIntegrationTest {

  val methods = Array(
      ("Multiple Get Address Type With Order By and Filter", "/addresstypes", Array("abbrName" -> "abbr name", "name" -> "name")),
      ("Multiple Get Adminunit Type With Order By and Filter", "/adminunits/types", Array("abbrName" -> "abbr name", "name" -> "name"))
  )

  val testCase = buildTestCase(methods)
  
}