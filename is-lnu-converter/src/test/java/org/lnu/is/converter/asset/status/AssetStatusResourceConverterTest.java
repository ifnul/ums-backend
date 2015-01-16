package org.lnu.is.converter.asset.status;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetStatus;
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
}
