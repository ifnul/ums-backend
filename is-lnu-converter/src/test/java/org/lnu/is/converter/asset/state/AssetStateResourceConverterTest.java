package org.lnu.is.converter.asset.state;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.asset.state.AssetState;
import org.lnu.is.resource.asset.state.AssetStateResource;

public class AssetStateResourceConverterTest {

	private AssetStateResourceConverter unit = new AssetStateResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		AssetState expected = new AssetState();
		expected.setName(name);
		
		AssetStateResource source = new AssetStateResource();
		source.setId(id);
		source.setName(name);
		
		// When
		AssetState actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		AssetStateResource source = new AssetStateResource();
		source.setId(id);
		source.setName(name);
		
		List<AssetStateResource> sources = Arrays.asList(source); 
		
		AssetState expected = new AssetState();
		expected.setId(id);
		expected.setName(name);
		
		List<AssetState> expecteds = Arrays.asList(expected);
		
		// Where
		List<AssetState> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
