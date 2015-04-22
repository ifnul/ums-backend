package org.lnu.is.converter.enrolment.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.enrolment.type.EnrolmentType;
import org.lnu.is.resource.enrolment.type.EnrolmentTypeResource;

public class EnrolmentTypeResourceConverterTest {

	private EnrolmentTypeResourceConverter unit = new EnrolmentTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "1234";
		String abbrName = "abbrName";
		EnrolmentTypeResource source = new EnrolmentTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		EnrolmentType expected = new EnrolmentType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		EnrolmentType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithRelation() throws Exception {
		// Given
		String name = "1234";
		String abbrName = "abbrName";
		Long parentId = 1L;
		EnrolmentType parent = new EnrolmentType();
		parent.setId(parentId);
		EnrolmentTypeResource source = new EnrolmentTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setParentId(parentId);

		EnrolmentType expected = new EnrolmentType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setParent(parent);
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
		String abbrName = "abbrName";
		
		EnrolmentTypeResource source = new EnrolmentTypeResource();
		source.setId(id);
		source.setName(name);
		source.setAbbrName(abbrName);
		
		List<EnrolmentTypeResource> sources = Arrays.asList(source); 
		
		EnrolmentType expected = new EnrolmentType();
		expected.setId(id);
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		List<EnrolmentType> expecteds = Arrays.asList(expected);
		
		// Where
		List<EnrolmentType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
