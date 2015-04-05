package org.lnu.is.converter.sallary.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.salary.type.SallaryType;
import org.lnu.is.resource.sallary.type.SallaryTypeResource;

public class SallaryTypeConverterTest {

	private SallaryTypeConverter unit = new SallaryTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		
		SallaryType source = new SallaryType();
		source.setName(name);
		source.setAbbrName(abbrName);

		SallaryTypeResource expected = new SallaryTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		SallaryTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		SallaryType source = new SallaryType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<SallaryType> sources = Arrays.asList(source); 
		
		SallaryTypeResource expected = new SallaryTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<SallaryTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<SallaryTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
