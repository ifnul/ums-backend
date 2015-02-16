package org.lnu.is.converter.enrolmentforeign.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.enrolmentforeign.type.EnrolmentForeignType;
import org.lnu.is.resource.enrolmentforeign.type.EnrolmentForeignTypeResource;

public class EnrolmentForeignTypeResourceConverterTest {

	private EnrolmentForeignTypeResourceConverter unit = new EnrolmentForeignTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "EnrolmentForeignN";
		String abbrName = "AN";

		EnrolmentForeignType expected = new EnrolmentForeignType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		EnrolmentForeignTypeResource source = new EnrolmentForeignTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		EnrolmentForeignType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		EnrolmentForeignTypeResource source = new EnrolmentForeignTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<EnrolmentForeignTypeResource> sources = Arrays.asList(source); 
		
		EnrolmentForeignType expected = new EnrolmentForeignType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<EnrolmentForeignType> expecteds = Arrays.asList(expected);
		
		// Where
		List<EnrolmentForeignType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
