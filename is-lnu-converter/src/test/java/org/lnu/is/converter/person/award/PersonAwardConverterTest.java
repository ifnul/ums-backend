package org.lnu.is.converter.person.award;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.domain.publicactivity.PublicActivityAward;
import org.lnu.is.resource.person.award.PersonAwardResource;

public class PersonAwardConverterTest {

	private PersonAwardConverter unit = new PersonAwardConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		Double bonus = 2.0;
		PersonAward source = new PersonAward();
		
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long personPaperId = 3L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Long publicActivityAwardId = 4L;
		PublicActivityAward publicActivityAward = new PublicActivityAward();
		publicActivityAward.setId(publicActivityAwardId);;

		source.setBonus(bonus);
		source.setId(id);
		source.setPerson(person);
		source.setPersonPaper(personPaper);
		source.setPublicActivityAward(publicActivityAward);

		PersonAwardResource expected = new PersonAwardResource();
		expected.setId(id);
		expected.setPersonId(personId);
		expected.setPersonPaperId(personPaperId);
		expected.setPublicActivityAwardId(publicActivityAwardId);
		expected.setBonus(bonus);
		
		// When
		PersonAwardResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Long id = 1L;
		Double bonus = 2.0;
		PersonAward source = new PersonAward();
		
		source.setBonus(bonus);
		source.setId(id);
		
		PersonAwardResource expected = new PersonAwardResource();
		expected.setId(id);
		expected.setBonus(bonus);
		
		// When
		PersonAwardResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
