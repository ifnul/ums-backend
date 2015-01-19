package org.lnu.is.dao.builder.paper.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.papertype.PaperType;
import org.lnu.is.domain.paperusage.PaperUsage;

public class PaperTypeQueryBuilderTest {

	private PaperTypeQueryBuilder unit = new PaperTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		PaperType context = new PaperType();
		
		String expectedQuery = "SELECT e FROM PaperType e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbrname";
		String name = "fdsfds";
		PaperUsage paperUsage = new PaperUsage();

		PaperType context = new PaperType();
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setPaperUsage(paperUsage);

		String expectedQuery = "SELECT e FROM PaperType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.paperUsage = :paperUsage ) AND e.status=:status ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
