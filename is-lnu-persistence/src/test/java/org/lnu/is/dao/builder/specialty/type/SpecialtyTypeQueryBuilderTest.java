package org.lnu.is.dao.builder.specialty.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;

public class SpecialtyTypeQueryBuilderTest {

	private SpecialtyTypeQueryBuilder unit = new SpecialtyTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		SpecialtyType context = new SpecialtyType();
		
		String expected = "SELECT e FROM SpecialtyType e WHERE e.status=:status ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "fdsfds";
		
		SpecialtyType context = new SpecialtyType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expected = "SELECT e FROM SpecialtyType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
