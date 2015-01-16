package org.lnu.is.extractor.enrolment.type;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.enrolment.EnrolmentType;

//TODO : Add empty entity test case
public class EnrolmentTypeParametersExtractorTest {

	private EnrolmentTypeParametersExtractor unit = new EnrolmentTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "AddressN";

		EnrolmentType entity = new EnrolmentType();
		entity.setName(name);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
