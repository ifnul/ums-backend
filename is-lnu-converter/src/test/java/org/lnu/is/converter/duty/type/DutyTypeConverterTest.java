package org.lnu.is.converter.duty.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.duty.type.DutyTypeConverter;
import org.lnu.is.domain.duty.type.DutyType;
import org.lnu.is.resource.duty.type.DutyTypeResource;

public class DutyTypeConverterTest {

	private DutyTypeConverter unit = new DutyTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "DutyN";
		String abbrName = "AN";

		DutyType source = new DutyType();
		source.setName(name);
		source.setAbbrName(abbrName);

		DutyTypeResource expected = new DutyTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		DutyTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		DutyType source = new DutyType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<DutyType> sources = Arrays.asList(source); 
		
		DutyTypeResource expected = new DutyTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<DutyTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<DutyTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
