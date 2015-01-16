package org.lnu.is.converter.asset.state;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetState;
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
}
