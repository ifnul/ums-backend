package org.lnu.is.converter.person.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.resource.person.type.PersonTypeResource;

public class PersonTypeConverterTest {

	private PersonTypeConverter unit = new PersonTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		PersonType source = new PersonType();
		source.setName(name);
		source.setAbbrName(abbrName);

		PersonTypeResource expected = new PersonTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		PersonTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		PersonType source = new PersonType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<PersonType> sources = Arrays.asList(source); 
		
		PersonTypeResource expected = new PersonTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<PersonTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<PersonTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
