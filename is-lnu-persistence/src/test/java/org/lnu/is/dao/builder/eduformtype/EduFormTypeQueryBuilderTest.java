package org.lnu.is.dao.builder.eduformtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.queries.Queries;

public class EduFormTypeQueryBuilderTest {

	private EduFormTypeQueryBuilder unit = new EduFormTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String name = "name";
		EduFormType context = new EduFormType();
		context.setName(name);

		String expectedQuery = "SELECT e FROM EduFormType e WHERE e.name LIKE CONCAT('%',:name,'%') ";
		
		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
