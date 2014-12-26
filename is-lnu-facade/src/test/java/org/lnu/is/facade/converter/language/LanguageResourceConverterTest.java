package org.lnu.is.facade.converter.language;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.language.Language;
import org.lnu.is.resource.language.LanguageResource;

public class LanguageResourceConverterTest {

	private LanguageResourceConverter unit = new LanguageResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		Language expected = new Language();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		LanguageResource source = new LanguageResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		
		// When
		Language actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
