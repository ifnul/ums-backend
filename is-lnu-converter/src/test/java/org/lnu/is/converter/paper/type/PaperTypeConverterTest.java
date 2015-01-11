package org.lnu.is.converter.paper.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.papertype.PaperType;
import org.lnu.is.domain.paperusage.PaperUsage;
import org.lnu.is.resource.paper.type.PaperTypeResource;

public class PaperTypeConverterTest {

	private PaperTypeConverter unit = new PaperTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		Long paperUsageId = 2L;
		PaperUsage paperUsage = new PaperUsage();
		paperUsage.setId(paperUsageId);
		
		PaperType source = new PaperType();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setPaperUsage(paperUsage);

		PaperTypeResource expected = new PaperTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setPaperUsageId(paperUsageId);
		
		// When
		PaperTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
