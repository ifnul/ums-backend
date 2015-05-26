package org.lnu.is.converter.paper.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.paper.type.PaperType;
import org.lnu.is.domain.paper.usage.PaperUsage;
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

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		
		PaperType source = new PaperType();
		source.setName(name);
		source.setAbbrName(abbrName);
		
		PaperTypeResource expected = new PaperTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		PaperTypeResource actual = unit.convert(source);
		
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
		
		PaperType source = new PaperType();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setPaperUsage(paperUsage);

		PaperTypeResource expected = new PaperTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setPaperUsageId(paperUsageId);
		
		List<PaperType> sources = Arrays.asList(source);
		
		List<PaperTypeResource> expecteds = Arrays.asList(expected);
 		
		// When
		List<PaperTypeResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testConvertAllWithNoRelations() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		
		PaperType source = new PaperType();
		source.setName(name);
		source.setAbbrName(abbrName);
		
		PaperTypeResource expected = new PaperTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		List<PaperType> sources = Arrays.asList(source);
		
		List<PaperTypeResource> expecteds = Arrays.asList(expected);
		
		// When
		List<PaperTypeResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
