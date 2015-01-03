package org.lnu.is.converter.duty.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.duty.DutyTypeResourceConverter;
import org.lnu.is.domain.dutytype.DutyType;
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
}
