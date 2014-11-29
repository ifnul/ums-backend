package org.lnu.is.extractor.enrolment;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.enrolment.Enrolment;

public class EnrolmentParametersExtractorTest {


	private EnrolmentParametersExtractor unit = new EnrolmentParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String docNum = "1213344";

		Enrolment entity = new Enrolment();
		entity.setDocNum(docNum);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("docNum", docNum);

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}

