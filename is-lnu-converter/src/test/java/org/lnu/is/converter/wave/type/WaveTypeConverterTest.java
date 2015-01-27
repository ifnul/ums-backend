package org.lnu.is.converter.wave.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.resource.wave.type.WaveTypeResource;

public class WaveTypeConverterTest {

	private WaveTypeConverter unit = new WaveTypeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		
		WaveType source = new WaveType();
		source.setName(name);

		WaveTypeResource expected = new WaveTypeResource();
		expected.setName(name);
		
		// When
		WaveTypeResource actual = unit.convert(source);
	
		// Then
		assertEquals(expected, actual);
	}
}