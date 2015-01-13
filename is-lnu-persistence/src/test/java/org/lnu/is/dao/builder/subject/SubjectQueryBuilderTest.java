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
		Long subjectTypeId = 1L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		String name = "name";
		Subject context = new Subject();
		context.setName(name);
		context.setSubjectType(subjectType);

		String expectedQuery = "SELECT r FROM Subject r WHERE r.name LIKE CONCAT('%',:name,'%') OR r.subjectType = :subjectType ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
