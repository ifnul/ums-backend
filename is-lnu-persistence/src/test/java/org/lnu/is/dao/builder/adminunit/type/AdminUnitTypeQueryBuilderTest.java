package org.lnu.is.dao.builder.adminunit.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.adminunit.type.AdminUnitType;

public class AdminUnitTypeQueryBuilderTest {

	private AdminUnitTypeQueryBuilder unit = new AdminUnitTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "abb rname";
		String name = "name";
		
		AdminUnitType context = new AdminUnitType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expected = "SELECT a FROM AdminUnitType a WHERE a.name LIKE CONCAT('%',:name,'%') OR a.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
