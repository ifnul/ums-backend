package org.lnu.is.converter.jobtype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.job.type.JobType;
import org.lnu.is.resource.job.type.JobTypeResource;

public class JobTypeResourceConverterTest {

	private JobTypeResourceConverter unit = new JobTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "LieToMe";
		String abbrName = "LTM";

		JobType expected = new JobType();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		JobTypeResource source = new JobTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);

		// When
		JobType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		JobTypeResource source = new JobTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<JobTypeResource> sources = Arrays.asList(source); 
		
		JobType expected = new JobType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<JobType> expecteds = Arrays.asList(expected);
		
		// Where
		List<JobType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
