package org.lnu.is.dao.builder.eduformtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.eduformtype.EduFormType;

public class EduFormTypeQueryBuilderTest {

	private EduFormTypeQueryBuilder unit = new EduFormTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		EduFormType context = new EduFormType();
		
		String expectedQuery = "SELECT e FROM EduFormType e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		EduFormType context = new EduFormType();
		context.setName(name);

		String expectedQuery = "SELECT e FROM EduFormType e WHERE e.name LIKE CONCAT('%',:name,'%') ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
