package org.lnu.is.dao.builder.adminunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.adminunit.AdminUnit;

public class AdminUnitQueryBuilderTest {

	private AdminUnitQueryBuilder unit = new AdminUnitQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		AdminUnit context = new AdminUnit();

		String expected = "SELECT a FROM AdminUnit a ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
