package org.lnu.is.converter.adminunit.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
import org.lnu.is.resource.adminunit.type.AdminUnitTypeResource;

public class AdminUnitTypeResourceConverterTest {

	private AdminUnitTypeResourceConverter unit = new AdminUnitTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AdminUnitN";
		String abbrName = "AN";

		AdminUnitType expected = new AdminUnitType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		AdminUnitTypeResource source = new AdminUnitTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		AdminUnitType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		AdminUnitTypeResource source = new AdminUnitTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<AdminUnitTypeResource> sources = Arrays.asList(source); 
		
		AdminUnitType expected = new AdminUnitType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<AdminUnitType> expecteds = Arrays.asList(expected);
		
		// Where
		List<AdminUnitType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
