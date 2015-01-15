package org.lnu.is.extractor.specialty.type;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;

/**
 * Specialty Type parameters extractor.
 * @author ivanursul
 *
 */
public class SpecialtyTypeParametersExtractorTest {

	private SpecialtyTypeParametersExtractor unit = new SpecialtyTypeParametersExtractor();
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		SpecialtyType entity = new SpecialtyType();
		entity.setAbbrName(abbrName);
		entity.setName(name);
		
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
		SpecialtyType entity = new SpecialtyType();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
