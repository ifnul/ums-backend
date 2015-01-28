package org.lnu.is.converter.enrolment.subject;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.resource.enrolment.subject.EnrolmentSubjectResource;

public class EnrolmentSubjectResourceConverterTest {

	private EnrolmentSubjectResourceConverter unit = new EnrolmentSubjectResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		Integer isTesting = 1;
		Long parentId = 1L;
		EnrolmentSubject parent = new EnrolmentSubject();
		parent.setId(parentId);
		
		EnrolmentSubjectResource source = new EnrolmentSubjectResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setIsTesting(isTesting);
		source.setParentId(parentId);

		EnrolmentSubject expected = new EnrolmentSubject();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setIsTesting(isTesting);
		expected.setParent(parent);
		
		// When
		EnrolmentSubject actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		Integer isTesting = 1;
		EnrolmentSubjectResource source = new EnrolmentSubjectResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setIsTesting(isTesting);
		
		EnrolmentSubject expected = new EnrolmentSubject();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setIsTesting(isTesting);
		
		// When
		EnrolmentSubject actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		Integer isTesting = 1;
		Long parentId = 1L;
		EnrolmentSubject parent = new EnrolmentSubject();
		parent.setId(parentId);
		
		EnrolmentSubjectResource source = new EnrolmentSubjectResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setIsTesting(isTesting);
		source.setParentId(parentId);

		EnrolmentSubject expected = new EnrolmentSubject();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setIsTesting(isTesting);
		expected.setParent(parent);
		
		String abbrName1 = "abbr name1";
		String name1 = "name1";
		Integer isTesting1 = 0;
		EnrolmentSubjectResource source1 = new EnrolmentSubjectResource();
		source1.setAbbrName(abbrName1);
		source1.setName(name1);
		source1.setIsTesting(isTesting1);
		
		EnrolmentSubject expected1 = new EnrolmentSubject();
		expected1.setAbbrName(abbrName1);
		expected1.setName(name1);
		expected1.setIsTesting(isTesting1);
		
		List<EnrolmentSubjectResource> sources = Arrays.asList(source,source1);
		
		List<EnrolmentSubject> expecteds =Arrays.asList(expected,expected1);
		// When
		List<EnrolmentSubject> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
