package org.lnu.is.facade.converter.jobtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.resource.jobtype.JobTypeResource;

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
}
