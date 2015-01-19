package org.lnu.is.dao.builder.employee.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.employee.EmployeeType;

public class EmployeeTypeQueryBuilderTest {

	private EmployeeTypeQueryBuilder unit = new EmployeeTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		EmployeeType context = new EmployeeType();
		
		String expectedQuery = "SELECT e FROM EmployeeType e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "AN";
		String name = "fdsfds";

		EmployeeType context = new EmployeeType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM EmployeeType e WHERE e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
