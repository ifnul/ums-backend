package org.lnu.is.dao.builder.street.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.streettype.StreetType;

public class StreetTypeQueryBuilderTest {

	private StreetTypeQueryBuilder unit = new StreetTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		StreetType context = new StreetType();
		
		String expectedQuery = "SELECT e FROM StreetType e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "fdsds";
		String abbrName = "Diablo";
		
		StreetType context = new StreetType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM StreetType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
