package org.lnu.is.dao.builder.subject.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.subject.SubjectType;

public class SubjectTypeQueryBuilderTest {

	private SubjectTypeQueryBuilder unit = new SubjectTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "Diablo";
		
		SubjectType context = new SubjectType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT r FROM SubjectType r WHERE r.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
