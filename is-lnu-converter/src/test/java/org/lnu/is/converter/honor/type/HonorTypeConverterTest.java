package org.lnu.is.converter.honor.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.honors.type.HonorType;
import org.lnu.is.resource.honor.type.HonorTypeResource;

public class HonorTypeConverterTest {

	private HonorTypeConverter unit = new HonorTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		HonorType source = new HonorType();
		source.setName(name);
		source.setAbbrName(abbrName);

		HonorTypeResource expected = new HonorTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		HonorTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		HonorType source = new HonorType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<HonorType> sources = Arrays.asList(source); 
		
		HonorTypeResource expected = new HonorTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<HonorTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<HonorTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
