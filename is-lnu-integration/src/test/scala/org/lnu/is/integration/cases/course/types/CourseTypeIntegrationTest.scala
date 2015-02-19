package org.lnu.is.integration.cases.course.types

import org.lnu.is.integration.cases.BaseIntegrationTest


object CourseTypeIntegrationTest extends BaseIntegrationTest {

  val title = "Course Types Get Paged Result"
  val url = "/courses/types"

  val testCase = buildTestCaseToCheckFieldsExistence(url, title, List("id", "name", "abbrName", "uri"))

}