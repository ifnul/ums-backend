package org.lnu.is.converter.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.subject.Subject;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.resource.subject.SubjectResource;

public class SubjectConverterTest {

	private SubjectConverter unit = new SubjectConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";

		Long subjectTypeId = 1L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		
		Subject source = new Subject();
		source.setName(name);
		source.setSubjectType(subjectType);

		SubjectResource expected = new SubjectResource();
		expected.setName(name);
		expected.setSubjectTypeId(subjectTypeId);
		
		// When
		SubjectResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
