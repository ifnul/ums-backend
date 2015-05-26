package org.lnu.is.converter.paper.usage;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.paper.usage.PaperUsage;
import org.lnu.is.resource.paper.usage.PaperUsageResource;


public class PaperUsageResourceConverterTest {

	private PaperUsageResourceConverter unit = new PaperUsageResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		PaperUsage expected = new PaperUsage();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		PaperUsageResource source = new PaperUsageResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		
		// When
		PaperUsage actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

		
	@Test
	public void testConvertAll() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		PaperUsage expected = new PaperUsage();
		expected.setName(name);
		expected.setAbbrName(abbrName);
	
		PaperUsageResource source = new PaperUsageResource();
		source.setName(name);
		source.setAbbrName(abbrName);
	
		List<PaperUsageResource> sources = Arrays.asList(source);
		
		List<PaperUsage> expecteds = Arrays.asList(expected);
		// When
		List<PaperUsage> actuals = unit.convertAll(sources);

		// Then
		assertEquals(expecteds, actuals);
	}

}
