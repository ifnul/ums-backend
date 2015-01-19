package org.lnu.is.extractor.enrolment.type;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.enrolment.EnrolmentType;

public class EnrolmentTypeParametersExtractorTest {

	private EnrolmentTypeParametersExtractor unit = new EnrolmentTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "AddressN";
		String abbrname = "fsdfds";
		
		EnrolmentType entity = new EnrolmentType();
		entity.setName(name);
		entity.setAbbrname(abbrname);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrname", abbrname);
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithNoRelations() throws Exception {
		// Given
		EnrolmentType entity = new EnrolmentType();

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
