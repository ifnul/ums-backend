package org.lnu.is.converter.course.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.coursetype.CourseType;
import org.lnu.is.resource.course.type.CourseTypeResource;

public class CourseTypeConverterTest {

	private CourseTypeConverter unit = new CourseTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		CourseType source = new CourseType();
		source.setName(name);
		source.setAbbrName(abbrName);

		CourseTypeResource expected = new CourseTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		CourseTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		CourseType source = new CourseType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<CourseType> sources = Arrays.asList(source); 
		
		CourseTypeResource expected = new CourseTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<CourseTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<CourseTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
