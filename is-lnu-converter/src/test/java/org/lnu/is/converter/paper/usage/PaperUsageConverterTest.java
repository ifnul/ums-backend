package org.lnu.is.converter.paper.usage;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.paper.usage.PaperUsage;
import org.lnu.is.resource.paper.usage.PaperUsageResource;


public class PaperUsageConverterTest {

	private PaperUsageConverter unit = new PaperUsageConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		PaperUsage source = new PaperUsage();
		source.setName(name);
		source.setAbbrName(abbrName);
		
		PaperUsageResource expected = new PaperUsageResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		PaperUsageResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		Long paperUsageId = 2L;
		PaperUsage paperUsage = new PaperUsage();
		paperUsage.setId(paperUsageId);
		
		PaperUsage source = new PaperUsage();
		source.setName(name);
		source.setAbbrName(abbrName);
		
		PaperUsageResource expected = new PaperUsageResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		List<PaperUsage> sources = Arrays.asList(source);
		
		List<PaperUsageResource> expecteds = Arrays.asList(expected);
 		
		// When
		List<PaperUsageResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
