package org.lnu.is.dao.builder.sallary.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.salarytype.SallaryType;

public class SallaryTypeQueryBuilderTest {

	private SallaryTypeQueryBuilder unit = new SallaryTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		SallaryType context = new SallaryType();
		
		String expectedQuery = "SELECT e FROM SallaryType e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "Diablo";
		String name = "fdfds";
		
		SallaryType context = new SallaryType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM SallaryType e WHERE e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
