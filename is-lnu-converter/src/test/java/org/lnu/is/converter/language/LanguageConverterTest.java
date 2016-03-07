package org.lnu.is.converter.language;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.language.language;
import org.lnu.is.resource.language.LanguageResource;

public class LanguageConverterTest {

	private LanguageConverter unit = new LanguageConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbr name";
		language source = new language();
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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		language source = new language();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<language> sources = Arrays.asList(source);
		
		LanguageResource expected = new LanguageResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<LanguageResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<LanguageResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
