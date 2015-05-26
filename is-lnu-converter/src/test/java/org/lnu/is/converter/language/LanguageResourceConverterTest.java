package org.lnu.is.converter.language;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		LanguageResource source = new LanguageResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<LanguageResource> sources = Arrays.asList(source); 
		
		Language expected = new Language();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<Language> expecteds = Arrays.asList(expected);
		
		// Where
		List<Language> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
