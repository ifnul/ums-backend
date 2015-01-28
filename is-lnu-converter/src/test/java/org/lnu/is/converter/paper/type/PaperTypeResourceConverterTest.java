package org.lnu.is.converter.paper.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.papertype.PaperType;
import org.lnu.is.domain.paperusage.PaperUsage;
import org.lnu.is.resource.paper.type.PaperTypeResource;

public class PaperTypeResourceConverterTest {

	private PaperTypeResourceConverter unit = new PaperTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		Long paperUsageId = 2L;
		PaperUsage paperUsage = new PaperUsage();
		paperUsage.setId(paperUsageId);
		
		PaperType expected = new PaperType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setPaperUsage(paperUsage);

		PaperTypeResource source = new PaperTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setPaperUsageId(paperUsageId);

		// When
		PaperType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		
		PaperType expected = new PaperType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		PaperTypeResource source = new PaperTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		
		// When
		PaperType actual = unit.convert(source);
		
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
		
		PaperType expected = new PaperType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setPaperUsage(paperUsage);

		PaperTypeResource source = new PaperTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setPaperUsageId(paperUsageId);

		List<PaperTypeResource> sources = Arrays.asList(source);
		
		List<PaperType> expecteds = Arrays.asList(expected);
		// When
		List<PaperType> actuals = unit.convertAll(sources);

		// Then
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testConvertAllWithNoRelations() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		
		PaperType expected = new PaperType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		PaperTypeResource source = new PaperTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		
		List<PaperTypeResource> sources = Arrays.asList(source);
		
		List<PaperType> expecteds = Arrays.asList(expected);
		// When
		List<PaperType> actuals = unit.convertAll(sources);

		// Then
		assertEquals(expecteds, actuals);
	}

}
