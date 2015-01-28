package org.lnu.is.converter.reason;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		ReasonResource source = new ReasonResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<ReasonResource> sources = Arrays.asList(source); 
		
		Reason expected = new Reason();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<Reason> expecteds = Arrays.asList(expected);
		
		// Where
		List<Reason> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
