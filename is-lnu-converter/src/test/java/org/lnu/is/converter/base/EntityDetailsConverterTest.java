package org.lnu.is.converter.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.Person;
import org.lnu.is.resource.person.PersonResource;

public class EntityDetailsConverterTest {

	private EntityDetailsConverter<Person, PersonResource> unit = new EntityDetailsConverter<>();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String utid = "utid";
		String note = "note";
		
		Person source = new Person();
		source.setNote(note);
		source.setUtid(utid);
		
		PersonResource target = new PersonResource();

		PersonResource expected = new PersonResource();
		expected.setNote(note);
		expected.setUtid(utid);
		
		// When
		unit.convert(source, target);

		// Then
		assertEquals(expected, target);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testConvertWithOneArgument() throws Exception {
		unit.convert(null);
	}
}
