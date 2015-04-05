package org.lnu.is.converter.enrolmentforeign.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.enrolment.foreign.type.EnrolmentForeignTypeConverter;
import org.lnu.is.domain.enrolment.foreign.type.EnrolmentForeignType;
import org.lnu.is.resource.enrolmentforeign.type.EnrolmentForeignTypeResource;

public class EnrolmentForeignTypeConverterTest {

	private EnrolmentForeignTypeConverter unit = new EnrolmentForeignTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "EnrolmentForeignN";
		String abbrName = "AN";

		EnrolmentForeignType source = new EnrolmentForeignType();
		source.setName(name);
		source.setAbbrName(abbrName);

		EnrolmentForeignTypeResource expected = new EnrolmentForeignTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		EnrolmentForeignTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		EnrolmentForeignType source = new EnrolmentForeignType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<EnrolmentForeignType> sources = Arrays.asList(source); 
		
		EnrolmentForeignTypeResource expected = new EnrolmentForeignTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<EnrolmentForeignTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<EnrolmentForeignTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
