package org.lnu.is.extractor.family.type;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.familytype.FamilyType;

public class FamilyTypeParametersExtractorTest {
	
	private FamilyTypeParametersExtractor unit = new FamilyTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		FamilyType entity = new FamilyType();
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
		FamilyType entity = new FamilyType();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
