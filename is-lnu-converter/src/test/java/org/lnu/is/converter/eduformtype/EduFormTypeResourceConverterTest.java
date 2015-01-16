package org.lnu.is.converter.eduformtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.resource.eduformtype.EduFormTypeResource;

public class EduFormTypeResourceConverterTest {

	private EduFormTypeResourceConverter unit = new EduFormTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "EducationN";

		EduFormType expected = new EduFormType();
		expected.setName(name);

		EduFormTypeResource source = new EduFormTypeResource();
		source.setName(name);

		// When
		EduFormType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
