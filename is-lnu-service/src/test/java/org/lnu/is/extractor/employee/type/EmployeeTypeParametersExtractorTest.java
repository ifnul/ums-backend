package org.lnu.is.extractor.employee.type;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.employee.EmployeeType;

public class EmployeeTypeParametersExtractorTest {
	
	private EmployeeTypeParametersExtractor unit = new EmployeeTypeParametersExtractor();
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		EmployeeType entity = new EmployeeType();
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
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		EmployeeType entity = new EmployeeType();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
