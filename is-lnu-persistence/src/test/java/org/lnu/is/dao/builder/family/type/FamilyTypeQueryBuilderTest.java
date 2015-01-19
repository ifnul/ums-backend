package org.lnu.is.dao.builder.family.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.familytype.FamilyType;

public class FamilyTypeQueryBuilderTest {

	private FamilyTypeQueryBuilder unit = new FamilyTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		FamilyType context = new FamilyType();
		
		String expectedQuery = "SELECT e FROM FamilyType e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "AN";
		String name = "fsdfsdfdsfsd";

		FamilyType context = new FamilyType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM FamilyType e WHERE e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
