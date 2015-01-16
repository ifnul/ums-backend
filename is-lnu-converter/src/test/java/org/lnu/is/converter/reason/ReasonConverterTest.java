package org.lnu.is.converter.reason;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.resource.reason.ReasonResource;

public class ReasonConverterTest {

	private ReasonConverter unit = new ReasonConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "Lightman";
		String abbrName = "Lman";

		Reason source = new Reason();
		source.setAbbrName(abbrName);
		source.setName(name);

		ReasonResource expected = new ReasonResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		// When
		ReasonResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

}
