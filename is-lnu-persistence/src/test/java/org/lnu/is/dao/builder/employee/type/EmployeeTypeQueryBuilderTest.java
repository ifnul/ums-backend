package org.lnu.is.dao.builder.employee.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.employee.EmployeeType;

public class EmployeeTypeQueryBuilderTest {

	private EmployeeTypeQueryBuilder unit = new EmployeeTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "AN";

		EmployeeType context = new EmployeeType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT a FROM EmployeeType a WHERE a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
