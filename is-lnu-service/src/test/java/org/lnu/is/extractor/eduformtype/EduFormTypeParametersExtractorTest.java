package org.lnu.is.extractor.eduformtype;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.eduformtype.EduFormType;

public class EduFormTypeParametersExtractorTest {
	
	private EduFormTypeParametersExtractor unit = new EduFormTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "AddressN";

		EduFormType entity = new EduFormType();
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
		EduFormType entity = new EduFormType();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
