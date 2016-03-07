package org.lnu.is.converter.language;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.language.language;
import org.lnu.is.resource.language.LanguageResource;

public class LanguageResourceConverterTest {

	private LanguageResourceConverter unit = new LanguageResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		language expected = new language();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		LanguageResource source = new LanguageResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		
		// When
		language actual = unit.convert(source);

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
		
		language expected = new language();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<language> expecteds = Arrays.asList(expected);
		
		// Where
		List<language> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
