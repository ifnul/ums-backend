package org.lnu.is.converter.asset.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.asset.type.AssetTypeResourceConverter;
import org.lnu.is.domain.asset.type.AssetType;
import org.lnu.is.resource.asset.type.AssetTypeResource;

public class AssetTypeResourceConverterTest {

	private AssetTypeResourceConverter unit = new AssetTypeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrname";
		AssetType expected = new AssetType();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		AssetTypeResource source = new AssetTypeResource();
		source.setAbbrName(abbrName);
		source.setId(id);
		source.setName(name);
		
		// When
		AssetType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
