package org.lnu.is.converter.course.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.coursetype.CourseType;
import org.lnu.is.resource.course.type.CourseTypeResource;

public class CourseTypeResourceConverterTest {

	private CourseTypeResourceConverter unit = new CourseTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "CourseN";
		String abbrName = "AN";

		CourseType expected = new CourseType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		CourseTypeResource source = new CourseTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		CourseType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		CourseTypeResource source = new CourseTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<CourseTypeResource> sources = Arrays.asList(source); 
		
		CourseType expected = new CourseType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<CourseType> expecteds = Arrays.asList(expected);
		
		// Where
		List<CourseType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}

