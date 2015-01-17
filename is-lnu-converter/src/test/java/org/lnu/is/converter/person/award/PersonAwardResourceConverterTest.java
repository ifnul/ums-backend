package org.lnu.is.converter.person.award;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.domain.publicactivity.PublicActivityAward;
import org.lnu.is.resource.person.award.PersonAwardResource;

public class PersonAwardResourceConverterTest {

	private PersonAwardResourceConverter unit = new PersonAwardResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		Double bonus = 2.0;
		
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long personPaperId = 3L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Long publicActivityAwardId = 4L;
		PublicActivityAward publicActivityAward = new PublicActivityAward();
		publicActivityAward.setId(publicActivityAwardId);;

		PersonAward expected = new PersonAward();
		expected.setBonus(bonus);
		expected.setId(id);
		expected.setPerson(person);
		expected.setPersonPaper(personPaper);
		expected.setPublicActivityAward(publicActivityAward);

		PersonAwardResource source = new PersonAwardResource();
		source.setId(id);
		source.setPersonId(personId);
		source.setPersonPaperId(personPaperId);
		source.setPublicActivityAwardId(publicActivityAwardId);
		source.setBonus(bonus);
		
		// When
		PersonAward actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
