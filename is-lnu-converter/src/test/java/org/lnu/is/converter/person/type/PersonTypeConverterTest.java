package org.lnu.is.converter.person.type;

import static org.junit.Assert.assertEquals;

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
}