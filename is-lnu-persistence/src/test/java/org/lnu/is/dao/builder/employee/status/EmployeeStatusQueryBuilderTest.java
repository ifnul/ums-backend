package org.lnu.is.dao.builder.employee.status;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.employee.EmployeeStatus;

public class EmployeeStatusQueryBuilderTest {

	private EmployeeStatusQueryBuilder unit = new EmployeeStatusQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "AN";

		EmployeeStatus context = new EmployeeStatus();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT a FROM EmployeeStatus a WHERE a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
