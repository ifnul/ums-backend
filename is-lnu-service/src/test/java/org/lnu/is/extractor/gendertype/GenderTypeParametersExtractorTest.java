package org.lnu.is.extractor.gendertype;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.gendertype.GenderType;

public class GenderTypeParametersExtractorTest {

	private GenderTypeParametersExtractor unit = new GenderTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		GenderType entity = new GenderType();
		String name = "first blood";
		String abbrName = "fb";

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
}
