package org.lnu.is.integration.config

import scala.Enumeration

object OrderByType extends Enumeration {
	type OrderByType = Value
    val ASC = Value("ASC")
    val DESC = Value("DESC")
}