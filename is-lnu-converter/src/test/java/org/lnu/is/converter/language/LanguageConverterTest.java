package org.lnu.is.converter.language;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.language.LanguageConverter;
import org.lnu.is.domain.language.Language;
import org.lnu.is.resource.language.LanguageResource;

public class LanguageConverterTest {

	private LanguageConverter unit = new LanguageConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbr name";
		Language source = new Language();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setId(id);

		LanguageResource expected = new LanguageResource();
		expected.setAbbrName(abbrName);
		expected.setId(id);
		expected.setName(name);
		
		// When
		LanguageResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
