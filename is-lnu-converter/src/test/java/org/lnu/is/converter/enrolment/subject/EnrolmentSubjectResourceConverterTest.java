package org.lnu.is.converter.enrolment.subject;

import static org.junit.Assert.assertEquals;

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
}
