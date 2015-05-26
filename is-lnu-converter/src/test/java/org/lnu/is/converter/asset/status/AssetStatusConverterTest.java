package org.lnu.is.converter.asset.status;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.asset.status.AssetStatus;
import org.lnu.is.resource.asset.status.AssetStatusResource;

public class AssetStatusConverterTest {

	private AssetStatusConverter unit = new AssetStatusConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		AssetStatus source = new AssetStatus();
		source.setName(name);
		source.setId(id);
		
		AssetStatusResource expected = new AssetStatusResource();
		expected.setId(id);
		expected.setName(name);
		
		// When
		AssetStatusResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		AssetStatus source = new AssetStatus();
		source.setId(id);
		source.setName(name);
		
		List<AssetStatus> sources = Arrays.asList(source); 
		
		AssetStatusResource expected = new AssetStatusResource();
		expected.setId(id);
		expected.setName(name);
		
		List<AssetStatusResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<AssetStatusResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
