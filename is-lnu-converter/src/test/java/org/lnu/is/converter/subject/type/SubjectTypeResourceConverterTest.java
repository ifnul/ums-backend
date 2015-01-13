package org.lnu.is.converter.subject.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.resource.subject.type.SubjectTypeResource;

public class SubjectTypeResourceConverterTest {

	private SubjectTypeResourceConverter unit = new SubjectTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		SubjectType expected = new SubjectType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		SubjectTypeResource source = new SubjectTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		SubjectType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

}
