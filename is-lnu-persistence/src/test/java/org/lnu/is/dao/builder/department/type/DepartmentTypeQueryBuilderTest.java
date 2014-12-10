package org.lnu.is.dao.builder.department.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.department.DepartmentType;

public class DepartmentTypeQueryBuilderTest {

	private DepartmentTypeQueryBuilder unit = new DepartmentTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		DepartmentType context = new DepartmentType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expected = "SELECT d FROM DepartmentType d WHERE d.name LIKE CONCAT('%',:name,'%') OR d.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
