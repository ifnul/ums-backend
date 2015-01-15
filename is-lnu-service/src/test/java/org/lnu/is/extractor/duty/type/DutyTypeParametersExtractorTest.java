package org.lnu.is.extractor.duty.type;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.dutytype.DutyType;

public class DutyTypeParametersExtractorTest {
	
	private DutyTypeParametersExtractor unit = new DutyTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "DutyN";
		String abbrName = "AN";

		DutyType entity = new DutyType();
		entity.setName(name);
		entity.setAbbrName(abbrName);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrName", abbrName);

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		DutyType entity = new DutyType();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
