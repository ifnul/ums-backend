package org.lnu.is.extractor.course.type;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.coursetype.CourseType;

public class CourseTypeParametersExtractorTest {
	
	private CourseTypeParametersExtractor unit = new CourseTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		CourseType entity = new CourseType();
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
