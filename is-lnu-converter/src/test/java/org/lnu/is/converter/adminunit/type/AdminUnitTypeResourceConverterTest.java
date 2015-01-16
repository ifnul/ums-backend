package org.lnu.is.converter.adminunit.type;

import static org.junit.Assert.assertEquals;

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
}
