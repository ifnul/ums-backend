package org.lnu.is.converter.asset.state;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetState;
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
}
