package org.lnu.is.converter.wave.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		WaveType source = new WaveType();
		source.setId(id);
		source.setName(name);
		
		List<WaveType> sources = Arrays.asList(source); 
		
		WaveTypeResource expected = new WaveTypeResource();
		expected.setId(id);
		expected.setName(name);
		
		List<WaveTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<WaveTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}