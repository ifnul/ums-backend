package org.lnu.is.converter.mark.scale.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.mark.scale.type.MarkScaleTypeResourceConverter;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.resource.mark.scale.type.MarkScaleTypeResource;

public class MarkScaleTypeResourceConverterTest {

	private MarkScaleTypeResourceConverter unit = new MarkScaleTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "MarkScaleN";
		String abbrName = "AN";

		MarkScaleType expected = new MarkScaleType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		MarkScaleTypeResource source = new MarkScaleTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		MarkScaleType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		MarkScaleTypeResource source = new MarkScaleTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<MarkScaleTypeResource> sources = Arrays.asList(source); 
		
		MarkScaleType expected = new MarkScaleType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<MarkScaleType> expecteds = Arrays.asList(expected);
		
		// Where
		List<MarkScaleType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
