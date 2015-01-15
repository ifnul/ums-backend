package org.lnu.is.extractor.timeperiod;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.timeperiod.TimePeriod;

public class TimePeriodParametersExtractorTest {

	private TimePeriodParametersExtractor unit = new TimePeriodParametersExtractor();
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "Extract Me All";

		TimePeriod entity = new TimePeriod();
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
		TimePeriod entity = new TimePeriod();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
