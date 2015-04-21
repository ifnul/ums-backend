package org.lnu.is.converter.mark.scale.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.mark.scale.type.MarkScaleTypeConverter;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.resource.mark.scale.type.MarkScaleTypeResource;

public class MarkScaleTypeConverterTest {

	private MarkScaleTypeConverter unit = new MarkScaleTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "MarkScaleN";
		String abbrName = "AN";

		MarkScaleType source = new MarkScaleType();
		source.setName(name);
		source.setAbbrName(abbrName);

		MarkScaleTypeResource expected = new MarkScaleTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		MarkScaleTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		MarkScaleType source = new MarkScaleType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<MarkScaleType> sources = Arrays.asList(source); 
		
		MarkScaleTypeResource expected = new MarkScaleTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<MarkScaleTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<MarkScaleTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
