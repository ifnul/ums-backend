package org.lnu.is.dao.builder.department.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.DepartmentType;

public class DepartmentTypeQueryBuilderTest {

	private DepartmentTypeQueryBuilder unit = new DepartmentTypeQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}
	

	@Test
	public void testBuild() throws Exception {
		// Given
		DepartmentType context = new DepartmentType();
		
		String expected = "SELECT e FROM DepartmentType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		DepartmentType context = new DepartmentType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expected = "SELECT e FROM DepartmentType e WHERE ( d.name LIKE CONCAT('%',:name,'%') OR d.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
