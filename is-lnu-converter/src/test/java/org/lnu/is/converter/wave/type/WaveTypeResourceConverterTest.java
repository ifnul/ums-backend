package org.lnu.is.converter.wave.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		WaveTypeResource source = new WaveTypeResource();
		source.setId(id);
		source.setName(name);
		
		List<WaveTypeResource> sources = Arrays.asList(source); 
		
		WaveType expected = new WaveType();
		expected.setId(id);
		expected.setName(name);
		
		List<WaveType> expecteds = Arrays.asList(expected);
		
		// Where
		List<WaveType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
