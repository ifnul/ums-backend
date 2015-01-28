package org.lnu.is.converter.honor.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.honorstype.HonorType;
import org.lnu.is.resource.honor.type.HonorTypeResource;

public class HonorTypeResourceConverterTest {

	private HonorTypeResourceConverter unit = new HonorTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		HonorType expected = new HonorType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		HonorTypeResource source = new HonorTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		HonorType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		HonorTypeResource source = new HonorTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<HonorTypeResource> sources = Arrays.asList(source); 
		
		HonorType expected = new HonorType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<HonorType> expecteds = Arrays.asList(expected);
		
		// Where
		List<HonorType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
