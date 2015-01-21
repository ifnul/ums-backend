package org.lnu.is.dao.builder.employee.status;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.employee.EmployeeStatus;

public class EmployeeStatusQueryBuilderTest {

	private EmployeeStatusQueryBuilder unit = new EmployeeStatusQueryBuilder();
	
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
		EmployeeStatus context = new EmployeeStatus();
		
		String expectedQuery = "SELECT e FROM EmployeeStatus e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
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

		String expectedQuery = "SELECT e FROM EmployeeStatus e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
