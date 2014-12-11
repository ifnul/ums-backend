package org.lnu.is.extractor.asset.type;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetType;

public class AssetTypeParametersExtractorTest {

	private AssetTypeParametersExtractor unit = new AssetTypeParametersExtractor();
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";
		AssetType entity = new AssetType();
		entity.setAbbrName(abbrName);
		entity.setName(name);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
