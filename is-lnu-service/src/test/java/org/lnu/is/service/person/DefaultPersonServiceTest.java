package org.lnu.is.service.person;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.person.PersonDao;
import org.lnu.is.domain.person.Person;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonServiceTest {

	@Mock
	private PersonDao personDao;
	
	@InjectMocks
	private DefaultPersonService unit;

	@Test
	public void testCreatePerson() throws Exception {
		// Given
		Person expected = new Person();

		// When
		unit.createPerson(expected);

		// Then
		verify(personDao).save(expected);
	}
	
	@Test
	public void testUpdatePerson() throws Exception {
		// Given
		Person person = new Person();

		// When
		unit.updatePerson(person);

		// Then
		verify(personDao).update(person);
	}
	
	@Test
	public void testGetPerson() throws Exception {
		// Given
		Long id = 1L;
		Person expected = new Person();
		expected.setId(id);

		// When
		when(personDao.findById(anyLong())).thenReturn(expected);
		Person actual = unit.getPerson(id);

		// Then
		verify(personDao).findById(id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemovePerson() throws Exception {
		// Given
		Person person = new Person();

		// When
		unit.removePerson(person);

		// Then
		verify(personDao).delete(person);
	}
	
	@Test
	public void testGetPersons() throws Exception {
		// Given
		PagedSearch<Person> pagedSearch = new PagedSearch<>();
		
		Person person = new Person();
		Integer offset = 0;
		Integer limit = 100;
		long count = 200;
		List<Person> entities = Arrays.asList(person);
		PagedResult<Person> expected = new PagedResult<Person>(offset, limit, count, entities);
		
		// When
		when(personDao.getPersons(Matchers.<PagedSearch<Person>>any())).thenReturn(expected);
		PagedResult<Person> actual = unit.getPersons(pagedSearch);

		// Then
		verify(personDao).getPersons(pagedSearch);
		assertEquals(expected, actual);
	}
}
