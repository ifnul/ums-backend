package org.lnu.is.converter.subject.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.resource.subject.type.SubjectTypeResource;

public class SubjectTypeConverterTest {

	private SubjectTypeConverter unit = new SubjectTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		
		SubjectType source = new SubjectType();
		source.setName(name);
		source.setAbbrName(abbrName);

		SubjectTypeResource expected = new SubjectTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		SubjectTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		SubjectType source = new SubjectType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<SubjectType> sources = Arrays.asList(source); 
		
		SubjectTypeResource expected = new SubjectTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<SubjectTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<SubjectTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
