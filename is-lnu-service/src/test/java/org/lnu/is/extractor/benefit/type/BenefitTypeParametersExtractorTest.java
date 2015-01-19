package org.lnu.is.extractor.benefit.type;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.domain.common.RowStatus;

public class BenefitTypeParametersExtractorTest {

	private BenefitTypeParametersExtractor unit = new BenefitTypeParametersExtractor();
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "name1";
		Integer priority = 5;
		
		BenefitType entity = new BenefitType();
		entity.setName(name);
		entity.setPriority(priority);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("priority", priority);
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		BenefitType entity = new BenefitType();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
