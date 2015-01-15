package org.lnu.is.extractor.jobtype;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.jobtype.JobType;

public class JobTypeParametersExtractorTest {
	private JobTypeParametersExtractor unit = new JobTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "LieToMe";
		String abbrName = "LTM";
		
		JobType entity = new JobType();
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
		JobType entity = new JobType();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
