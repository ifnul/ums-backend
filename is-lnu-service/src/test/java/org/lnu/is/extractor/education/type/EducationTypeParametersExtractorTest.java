package org.lnu.is.extractor.education.type;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.educationtype.EducationType;

public class EducationTypeParametersExtractorTest {
	
	private EducationTypeParametersExtractor unit = new EducationTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		EducationType entity = new EducationType();
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
		EducationType entity = new EducationType();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
