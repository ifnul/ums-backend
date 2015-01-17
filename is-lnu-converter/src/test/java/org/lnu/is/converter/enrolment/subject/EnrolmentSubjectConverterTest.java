package org.lnu.is.converter.enrolment.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
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
}
