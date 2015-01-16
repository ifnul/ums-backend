package org.lnu.is.converter.asset.status;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetStatus;
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
}
