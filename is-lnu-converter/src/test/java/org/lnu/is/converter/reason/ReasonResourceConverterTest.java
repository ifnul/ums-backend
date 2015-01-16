package org.lnu.is.converter.reason;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.resource.reason.ReasonResource;

public class ReasonResourceConverterTest {

	private ReasonResourceConverter unit = new ReasonResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "LieToMe";
		String abbrName = "LTM";

		Reason expected = new Reason();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		ReasonResource source = new ReasonResource();
		source.setAbbrName(abbrName);
		source.setName(name);

		// When
		Reason actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
