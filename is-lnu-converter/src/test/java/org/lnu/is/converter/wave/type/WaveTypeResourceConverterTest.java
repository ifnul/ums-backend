package org.lnu.is.converter.wave.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.resource.wave.type.WaveTypeResource;

public class WaveTypeResourceConverterTest {
	private WaveTypeResourceConverter unit = new WaveTypeResourceConverter();
	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";

		WaveType expected = new WaveType();
		expected.setName(name);

		WaveTypeResource source = new WaveTypeResource();
		source.setName(name);

		// When
		WaveType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
