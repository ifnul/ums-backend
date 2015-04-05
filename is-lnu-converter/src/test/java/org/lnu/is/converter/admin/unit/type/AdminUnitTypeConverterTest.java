package org.lnu.is.converter.admin.unit.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.admin.unit.type.AdminUnitTypeConverter;
import org.lnu.is.domain.admin.unit.type.AdminUnitType;
import org.lnu.is.resource.adminunit.type.AdminUnitTypeResource;

public class AdminUnitTypeConverterTest {

	private AdminUnitTypeConverter unit = new AdminUnitTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AdminUnitN";
		String abbrName = "AN";

		AdminUnitType source = new AdminUnitType();
		source.setName(name);
		source.setAbbrName(abbrName);

		AdminUnitTypeResource expected = new AdminUnitTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		AdminUnitTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		AdminUnitType source = new AdminUnitType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<AdminUnitType> sources = Arrays.asList(source); 
		
		AdminUnitTypeResource expected = new AdminUnitTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<AdminUnitTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<AdminUnitTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
