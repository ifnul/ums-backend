package org.lnu.is.integration.cases

import scala.Enumeration

object OrderByType extends Enumeration {
	type OrderByType = Value
    val ASC = Value("ASC")
    val DESC = Value("DESC")
}