package org.lnu.is.dao.builder.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.subject.Subject;
import org.lnu.is.domain.subject.SubjectType;

public class SubjectQueryBuilderTest {

	private SubjectQueryBuilder unit = new SubjectQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Subject context = new Subject();
		
		String expectedQuery = "SELECT e FROM Subject e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Long subjectTypeId = 1L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		String name = "name";
		Subject context = new Subject();
		context.setName(name);
		context.setSubjectType(subjectType);

		String expectedQuery = "SELECT e FROM Subject e WHERE e.name LIKE CONCAT('%',:name,'%') OR e.subjectType = :subjectType ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
