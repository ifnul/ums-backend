package org.lnu.is.extractor.timeperiod.type;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.timeperiod.TimePeriodType;

public class TimePeriodTypeParametersExtractorTest {
	
	private TimePeriodTypeParametersExtractor unit = new TimePeriodTypeParametersExtractor();
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		
		TimePeriodType entity = new TimePeriodType();
		entity.setName(name);
		entity.setAbbrName(abbrName);

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
		TimePeriodType entity = new TimePeriodType();
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
