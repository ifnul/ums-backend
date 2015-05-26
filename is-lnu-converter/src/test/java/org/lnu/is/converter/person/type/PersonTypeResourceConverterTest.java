package org.lnu.is.converter.person.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.resource.person.type.PersonTypeResource;

public class PersonTypeResourceConverterTest {

	private PersonTypeResourceConverter unit = new PersonTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		
		PersonType expected = new PersonType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		PersonTypeResource source = new PersonTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		PersonType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		PersonTypeResource source = new PersonTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<PersonTypeResource> sources = Arrays.asList(source); 
		
		PersonType expected = new PersonType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<PersonType> expecteds = Arrays.asList(expected);
		
		// Where
		List<PersonType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
