package org.lnu.is.converter.adminunit.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
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
}
