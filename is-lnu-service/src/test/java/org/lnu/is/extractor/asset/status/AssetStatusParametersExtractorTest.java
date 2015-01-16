package org.lnu.is.extractor.asset.status;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetStatus;

public class AssetStatusParametersExtractorTest {

	private AssetStatusParametersExtractor unit = new AssetStatusParametersExtractor();
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "name1";
		AssetStatus entity = new AssetStatus();
		entity.setName(name);
		
		Map<String, Object> expected = Collections.<String, Object>singletonMap("name", name);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		AssetStatus entity = new AssetStatus();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
