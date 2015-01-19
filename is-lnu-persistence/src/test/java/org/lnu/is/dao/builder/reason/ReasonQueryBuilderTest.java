package org.lnu.is.dao.builder.reason;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.reason.Reason;

public class ReasonQueryBuilderTest {

	private ReasonQueryBuilder unit = new ReasonQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Reason context = new Reason();
		
		String expectedQuery = "SELECT e FROM Reason e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "Diablo";
		String name = "fdsfds";
		
		Reason context = new Reason();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM Reason e WHERE e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
