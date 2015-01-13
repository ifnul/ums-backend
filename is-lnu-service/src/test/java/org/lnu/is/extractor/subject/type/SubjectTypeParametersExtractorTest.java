package org.lnu.is.extractor.subject.type;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.subject.SubjectType;


public class SubjectTypeParametersExtractorTest {

	private SubjectTypeParametersExtractor unit = new SubjectTypeParametersExtractor();
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "Extract Me All";
		String abbrName = "EML";

		SubjectType entity = new SubjectType();
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
