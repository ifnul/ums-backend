package org.lnu.is.facade.converter.jobtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
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

}
