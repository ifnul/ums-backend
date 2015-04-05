package org.lnu.is.converter.duty.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.duty.type.DutyTypeResourceConverter;
import org.lnu.is.domain.duty.type.DutyType;
import org.lnu.is.resource.duty.type.DutyTypeResource;

public class DutyTypeResourceConverterTest {

	private DutyTypeResourceConverter unit = new DutyTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "DutyN";
		String abbrName = "AN";

		DutyType expected = new DutyType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		DutyTypeResource source = new DutyTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		DutyType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		DutyTypeResource source = new DutyTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<DutyTypeResource> sources = Arrays.asList(source); 
		
		DutyType expected = new DutyType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<DutyType> expecteds = Arrays.asList(expected);
		
		// Where
		List<DutyType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
