package org.lnu.is.converter.subject.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.resource.subject.type.SubjectTypeResource;

public class SubjectTypeConverterTest {

	private SubjectTypeConverter unit = new SubjectTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		
		SubjectType source = new SubjectType();
		source.setName(name);
		source.setAbbrName(abbrName);

		SubjectTypeResource expected = new SubjectTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		SubjectTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
