package org.lnu.is.extractor.asset.type;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetType;
import org.lnu.is.domain.common.RowStatus;

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
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		AssetType entity = new AssetType();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
