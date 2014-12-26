package org.lnu.is.facade.converter.eduformtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.resource.eduformtype.EduFormTypeResource;

public class EduFormTypeConverterTest {

	private EduFormTypeConverter unit = new EduFormTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		EduFormType source = new EduFormType();
		source.setName(name);

		EduFormTypeResource expected = new EduFormTypeResource();
		expected.setName(name);
		
		// When
		EduFormTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}

