package org.lnu.is.extractor.person.award;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.domain.person.PersonPaper;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonAwardParametersExtractorTest {

	@Mock
	private Dao<Person, Long> personDao;
	
	@Mock
	private Dao<PersonPaper, Long> personPaperDao;
	
	@InjectMocks
	private PersonAwardParametersExtractor unit;
	
	@Test
	public void testname() throws Exception {
		// Given
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long personPaperId = 2L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		PersonAward entity = new PersonAward();
		entity.setPerson(person);
		entity.setPersonPaper(personPaper);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("personPaper", personPaper);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(personPaperDao.getEntityById(anyLong())).thenReturn(personPaper);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(personId);
		verify(personPaperDao).getEntityById(personPaperId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		PersonAward entity = new PersonAward();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
