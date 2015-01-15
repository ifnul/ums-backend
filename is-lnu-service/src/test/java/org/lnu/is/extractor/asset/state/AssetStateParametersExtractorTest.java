package org.lnu.is.extractor.asset.state;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetState;

public class AssetStateParametersExtractorTest {
	private AssetStateParametersExtractor unit = new AssetStateParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "AssetStateN";

		AssetState entity = new AssetState();
		entity.setName(name);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		AssetState entity = new AssetState();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
