package org.lnu.is.dao.builder.subject.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.subject.SubjectType;

public class SubjectTypeQueryBuilderTest {

	private SubjectTypeQueryBuilder unit = new SubjectTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		SubjectType context = new SubjectType();
		
		String expectedQuery = "SELECT e FROM SubjectType e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "Diablo";
		String name = "fdsd";
		
		SubjectType context = new SubjectType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM SubjectType e WHERE e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
