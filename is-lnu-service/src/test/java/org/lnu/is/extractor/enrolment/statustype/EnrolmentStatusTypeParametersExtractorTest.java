package org.lnu.is.extractor.enrolment.statustype;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.enrolment.EnrolmentStatusType;

public class EnrolmentStatusTypeParametersExtractorTest {

	private EnrolmentStatusTypeParametersExtractor unit = new EnrolmentStatusTypeParametersExtractor();
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "anem1";
		String description = "description";

		EnrolmentStatusType entity = new EnrolmentStatusType();
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setDescription(description);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		expected.put("description", description);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		EnrolmentStatusType entity = new EnrolmentStatusType();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
