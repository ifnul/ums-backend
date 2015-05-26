package org.lnu.is.converter.subject;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String name = "first blood";
		
		Subject source = new Subject();
		source.setName(name);

		SubjectResource expected = new SubjectResource();
		expected.setName(name);
		
		// When
		SubjectResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		String name = "first blood";
		String name1 = "first1 blood1";
		
		Long subjectTypeId = 1L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		
		Subject source = new Subject();
		source.setName(name);
		source.setSubjectType(subjectType);

		SubjectResource expected = new SubjectResource();
		expected.setName(name);
		expected.setSubjectTypeId(subjectTypeId);
			
		Subject source1 = new Subject();
		source1.setName(name1);

		SubjectResource expected1 = new SubjectResource();
		expected1.setName(name1);
		
		List<Subject> sources = Arrays.asList(source,source1);
		
		List<SubjectResource> expecteds = Arrays.asList(expected,expected1);
		
		// When
		List<SubjectResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
