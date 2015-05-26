package org.lnu.is.converter.reason;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		Reason source = new Reason();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<Reason> sources = Arrays.asList(source); 
		
		ReasonResource expected = new ReasonResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<ReasonResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<ReasonResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
