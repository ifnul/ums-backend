package org.lnu.is.converter.enrolment.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.enrolment.type.EnrolmentTypeResourceConverter;
import org.lnu.is.domain.enrolment.EnrolmentType;
import org.lnu.is.resource.enrolment.type.EnrolmentTypeResource;

public class EnrolmentTypeResourceConverterTest {

	private EnrolmentTypeResourceConverter unit = new EnrolmentTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "1234";
		EnrolmentTypeResource source = new EnrolmentTypeResource();
		source.setName(name);

		EnrolmentType expected = new EnrolmentType();
		expected.setName(name);

		// When
		EnrolmentType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		EnrolmentTypeResource source = new EnrolmentTypeResource();
		source.setId(id);
		source.setName(name);
		
		List<EnrolmentTypeResource> sources = Arrays.asList(source); 
		
		EnrolmentType expected = new EnrolmentType();
		expected.setId(id);
		expected.setName(name);
		
		List<EnrolmentType> expecteds = Arrays.asList(expected);
		
		// Where
		List<EnrolmentType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
