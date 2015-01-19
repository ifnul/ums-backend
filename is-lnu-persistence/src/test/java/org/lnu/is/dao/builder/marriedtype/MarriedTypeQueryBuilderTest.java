package org.lnu.is.dao.builder.marriedtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.marriedtype.MarriedType;

public class MarriedTypeQueryBuilderTest {
	
	private MarriedTypeQueryBuilder unit = new MarriedTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		MarriedType context = new MarriedType();
		
		String expectedQuery = "SELECT e FROM MarriedType e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "Diablo";
		String name = "fsdfdsfds";
		
		MarriedType context = new MarriedType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM MarriedType e WHERE ( m.name LIKE CONCAT('%',:name,'%') OR m.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
