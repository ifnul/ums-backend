package org.lnu.is.converter.enrolment.subject;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.resource.enrolment.subject.EnrolmentSubjectResource;

public class EnrolmentSubjectConverterTest {

	private EnrolmentSubjectConverter unit = new EnrolmentSubjectConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		Integer isTesting = 1;
		Long parentId = 1L;
		EnrolmentSubject parent = new EnrolmentSubject();
		parent.setId(parentId);
		
		EnrolmentSubjectResource expected = new EnrolmentSubjectResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setIsTesting(isTesting);
		expected.setParentId(parentId);

		EnrolmentSubject source = new EnrolmentSubject();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setIsTesting(isTesting);
		source.setParent(parent);
		
		// When
		EnrolmentSubjectResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		Integer isTesting = 1;
		
		EnrolmentSubjectResource expected = new EnrolmentSubjectResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setIsTesting(isTesting);
		
		EnrolmentSubject source = new EnrolmentSubject();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setIsTesting(isTesting);
		
		// When
		EnrolmentSubjectResource actual = unit.convert(source);
		
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
		
		EnrolmentSubjectResource expected = new EnrolmentSubjectResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setIsTesting(isTesting);
		expected.setParentId(parentId);

		EnrolmentSubject source = new EnrolmentSubject();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setIsTesting(isTesting);
		source.setParent(parent);
		
		String abbrName1 = "abbr name1";
		String name1 = "name1";
		Integer isTesting1 = 0;
		
		EnrolmentSubjectResource expected1 = new EnrolmentSubjectResource();
		expected1.setAbbrName(abbrName1);
		expected1.setName(name1);
		expected1.setIsTesting(isTesting1);
		
		EnrolmentSubject source1 = new EnrolmentSubject();
		source1.setAbbrName(abbrName1);
		source1.setName(name1);
		source1.setIsTesting(isTesting1);
		
		List<EnrolmentSubject> sources = Arrays.asList(source,source1);
		
		List<EnrolmentSubjectResource> expecteds =Arrays.asList(expected,expected1);
		// When
		List<EnrolmentSubjectResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
