package org.lnu.is.converter.subject.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.resource.subject.type.SubjectTypeResource;

public class SubjectTypeResourceConverterTest {

	private SubjectTypeResourceConverter unit = new SubjectTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		SubjectType expected = new SubjectType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		SubjectTypeResource source = new SubjectTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		SubjectType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		SubjectTypeResource source = new SubjectTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<SubjectTypeResource> sources = Arrays.asList(source); 
		
		SubjectType expected = new SubjectType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<SubjectType> expecteds = Arrays.asList(expected);
		
		// Where
		List<SubjectType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}

}
