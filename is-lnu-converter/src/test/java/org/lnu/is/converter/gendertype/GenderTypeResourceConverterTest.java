package org.lnu.is.converter.gendertype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.gendertype.GenderTypeResourceConverter;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.resource.gendertype.GenderTypeResource;

public class GenderTypeResourceConverterTest {

	private GenderTypeResourceConverter unit = new GenderTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		GenderType expected = new GenderType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		GenderTypeResource source = new GenderTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		GenderType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		GenderTypeResource source = new GenderTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<GenderTypeResource> sources = Arrays.asList(source); 
		
		GenderType expected = new GenderType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<GenderType> expecteds = Arrays.asList(expected);
		
		// Where
		List<GenderType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
