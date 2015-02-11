package org.lnu.is.converter.sallary.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.salarytype.SallaryType;
import org.lnu.is.resource.sallary.type.SallaryTypeResource;

public class SallaryTypeResourceConverterTest {

	private SallaryTypeResourceConverter unit = new SallaryTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		SallaryType expected = new SallaryType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		SallaryTypeResource source = new SallaryTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		SallaryType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		SallaryTypeResource source = new SallaryTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<SallaryTypeResource> sources = Arrays.asList(source); 
		
		SallaryType expected = new SallaryType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<SallaryType> expecteds = Arrays.asList(expected);
		
		// Where
		List<SallaryType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}

}
