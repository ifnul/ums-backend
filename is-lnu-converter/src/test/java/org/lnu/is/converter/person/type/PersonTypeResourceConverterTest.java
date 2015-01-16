package org.lnu.is.converter.person.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.PersonType;
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

}
