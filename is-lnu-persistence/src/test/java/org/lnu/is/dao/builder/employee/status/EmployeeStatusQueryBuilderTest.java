package org.lnu.is.dao.builder.employee.status;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.employee.EmployeeStatus;

public class EmployeeStatusQueryBuilderTest {

	private EmployeeStatusQueryBuilder unit = new EmployeeStatusQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		EmployeeStatus context = new EmployeeStatus();
		
		String expectedQuery = "SELECT e FROM EmployeeStatus e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithPaameters() throws Exception {
		// Given
		String abbrName = "AN";
		String name = "fdsfds";

		EmployeeStatus context = new EmployeeStatus();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM EmployeeStatus e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
