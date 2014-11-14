package org.lnu.is.dao.builder.department;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.queries.Queries;

public class DepartmentQueryBuilderTest {

	private DepartmentQueryBuilder unit = new DepartmentQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String name = "name";
		Department context = new Department();
		context.setName(name);

		String expectedQuery = "SELECT d FROM Department d WHERE d.name LIKE CONCAT('%',:name,'%') ";
		
		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
