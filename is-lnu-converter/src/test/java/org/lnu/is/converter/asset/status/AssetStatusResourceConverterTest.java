package org.lnu.is.converter.asset.status;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.asset.status.AssetStatus;
import org.lnu.is.resource.asset.status.AssetStatusResource;

public class AssetStatusResourceConverterTest {

	private AssetStatusResourceConverter unit = new AssetStatusResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		AssetStatus expected = new AssetStatus();
		expected.setName(name);
		
		AssetStatusResource source = new AssetStatusResource();
		source.setId(id);
		source.setName(name);
		
		// When
		AssetStatus actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		AssetStatusResource source = new AssetStatusResource();
		source.setId(id);
		source.setName(name);
		
		List<AssetStatusResource> sources = Arrays.asList(source); 
		
		AssetStatus expected = new AssetStatus();
		expected.setId(id);
		expected.setName(name);
		
		List<AssetStatus> expecteds = Arrays.asList(expected);
		
		// Where
		List<AssetStatus> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
