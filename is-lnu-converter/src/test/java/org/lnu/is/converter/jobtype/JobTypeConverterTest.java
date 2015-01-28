package org.lnu.is.converter.jobtype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.jobtype.JobTypeConverter;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.resource.jobtype.JobTypeResource;

public class JobTypeConverterTest {

	private JobTypeConverter unit = new JobTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "Lightman";
		String abbrName = "Lman";

		JobType source = new JobType();
		source.setAbbrName(abbrName);
		source.setName(name);

		JobTypeResource expected = new JobTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		// When
		JobTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		JobType source = new JobType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<JobType> sources = Arrays.asList(source); 
		
		JobTypeResource expected = new JobTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<JobTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<JobTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
