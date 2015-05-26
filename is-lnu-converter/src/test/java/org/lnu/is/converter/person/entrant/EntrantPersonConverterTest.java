package org.lnu.is.converter.person.entrant;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.person.Person;

import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.DPersonAddRet;

public class EntrantPersonConverterTest {

	private EntrantPersonConverter unit = new EntrantPersonConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		int idPerson = 1;
		String personCodeU = "GUID";
		Person person = new Person();
		ArrayOfDPersonAddRet source = new ArrayOfDPersonAddRet();
		DPersonAddRet dPersonAddRet = new DPersonAddRet();
		dPersonAddRet.setIdPerson(idPerson);
		dPersonAddRet.setPersonCodeU(personCodeU);
		
		List<DPersonAddRet> dPersonsAddRet = Arrays.asList(dPersonAddRet );
		source.setdPersonAddRet(dPersonsAddRet);
		
		// When
		unit.convert(source, person);

		// Then
		assertEquals(Long.valueOf(idPerson), person.getUid());
		assertEquals(personCodeU, person.getUtid());
	}
}
