package org.lnu.is.converter.subject;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.subject.Subject;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.resource.subject.SubjectResource;

public class SubjectResourceConverterTest {

	private SubjectResourceConverter unit = new SubjectResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";

		Long subjectTypeId = 1L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		
		Subject expected = new Subject();
		expected.setName(name);
		expected.setSubjectType(subjectType);
		
		SubjectResource source = new SubjectResource();
		source.setName(name);
		source.setSubjectTypeId(subjectTypeId);

		// When
		Subject actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String name = "first blood";
		
		Subject expected = new Subject();
		expected.setName(name);
		
		SubjectResource source = new SubjectResource();
		source.setName(name);
		
		// When
		Subject actual = unit.convert(source);
		
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
		
		Subject expected = new Subject();
		expected.setName(name);
		expected.setSubjectType(subjectType);
		
		SubjectResource source = new SubjectResource();
		source.setName(name);
		source.setSubjectTypeId(subjectTypeId);

		Subject expected1 = new Subject();
		expected1.setName(name1);
		
		SubjectResource source1 = new SubjectResource();
		source1.setName(name1);
		
		List<SubjectResource> sources = Arrays.asList(source,source1);
		
		List<Subject> expecteds = Arrays.asList(expected,expected1);
		
		// When
		List<Subject> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}

}
