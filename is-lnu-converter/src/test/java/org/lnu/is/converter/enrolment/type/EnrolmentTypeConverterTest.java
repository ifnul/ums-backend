package org.lnu.is.converter.enrolment.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.enrolment.type.EnrolmentTypeConverter;
import org.lnu.is.domain.enrolment.type.EnrolmentType;
import org.lnu.is.resource.enrolment.type.EnrolmentTypeResource;

public class EnrolmentTypeConverterTest {

	private EnrolmentTypeConverter unit = new EnrolmentTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "1234";
		EnrolmentType source = new EnrolmentType();
		source.setName(name);

		EnrolmentTypeResource expected = new EnrolmentTypeResource();
		expected.setName(name);

		// When
		EnrolmentTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		EnrolmentType source = new EnrolmentType();
		source.setId(id);
		source.setName(name);
		
		List<EnrolmentType> sources = Arrays.asList(source); 
		
		EnrolmentTypeResource expected = new EnrolmentTypeResource();
		expected.setId(id);		
		expected.setName(name);
		
		List<EnrolmentTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<EnrolmentTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
