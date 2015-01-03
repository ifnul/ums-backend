package org.lnu.is.converter.duty.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.duty.DutyTypeConverter;
import org.lnu.is.domain.dutytype.DutyType;
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
}
