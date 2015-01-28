package org.lnu.is.converter.asset.state;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.asset.state.AssetState;
import org.lnu.is.resource.asset.state.AssetStateResource;

public class AssetStateConverterTest {

	private AssetStateConverter unit = new AssetStateConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		AssetState source = new AssetState();
		source.setName(name);
		source.setId(id);
		
		AssetStateResource expected = new AssetStateResource();
		expected.setId(id);
		expected.setName(name);
		
		// When
		AssetStateResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		AssetState source = new AssetState();
		source.setId(id);
		source.setName(name);
		
		List<AssetState> sources = Arrays.asList(source); 
		
		AssetStateResource expected = new AssetStateResource();
		expected.setId(id);
		expected.setName(name);
		
		List<AssetStateResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<AssetStateResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
