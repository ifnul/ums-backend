package org.lnu.is.facade.facade.person;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.person.PersonResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.lnu.is.service.person.PersonService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonFacadeTest {

	@Mock
	private Converter<PersonResource, Person> insertConverter;

	@Mock
	private Converter<PersonResource, Person> updateConverter;
	
	@Mock
	private Converter<PersonResource, Person> personResourceConverter;
	
	@Mock
	private Converter<Person, PersonResource> personConverter;
	
	@Mock
	private PersonService personService;

	@Mock
	private Converter<PagedRequest<PersonResource>, PagedSearch<Person>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@InjectMocks
	private DefaultPersonFacade unit;
	
	@Test
	public void testCreatePerson() throws Exception {
		// Given
    	String name = "fsd person";
    	Long personTypeId = 25L;
    	
    	PersonResource expected = new PersonResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setName(name);
		expected.setPersonTypeId(personTypeId);

		PersonType personType = new PersonType();

		Person person = new Person();
    	person.setBegDate(new Date());
    	person.setEndDate(new Date());
		person.setName(name);
		person.setPersonType(personType);
		
		// When
		when(personResourceConverter.convert(any(PersonResource.class))).thenReturn(person);
		when(personConverter.convert(any(Person.class))).thenReturn(expected);
		
		PersonResource actual = unit.createPerson(expected);

		// Then
		verify(personResourceConverter).convert(expected);
		verify(personService).createPerson(person);
		verify(insertConverter).convert(expected, person);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUpdatePerson() throws Exception {
		// Given
		Long id = 1L;
    	String name = "fsd person";
    	Long personTypeId = 25L;
    	
    	PersonResource expected = new PersonResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setName(name);
		expected.setPersonTypeId(personTypeId);

		PersonType personType = new PersonType();

		Person person = new Person();
    	person.setBegDate(new Date());
    	person.setEndDate(new Date());
		person.setName(name);
		person.setPersonType(personType);
		
		// When
		when(personService.getPerson(anyLong())).thenReturn(person);
		
		unit.updatePerson(id, expected);

		// Then
		verify(personService).getPerson(id);
		verify(personResourceConverter).convert(expected, person);
		verify(personService).updatePerson(person);
		verify(updateConverter).convert(expected, person);
	}
	
	@Test
	public void testGetPerson() throws Exception {
		// Given
		Long id = 1L;
    	String name = "fsd person";
    	Long personTypeId = 25L;
    	
    	PersonResource expected = new PersonResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setName(name);
		expected.setPersonTypeId(personTypeId);

		PersonType personType = new PersonType();

		Person person = new Person();
    	person.setBegDate(new Date());
    	person.setEndDate(new Date());
		person.setName(name);
		person.setPersonType(personType);

		// When
		when(personService.getPerson(anyLong())).thenReturn(person);
		when(personConverter.convert(any(Person.class))).thenReturn(expected);
		PersonResource actual = unit.getPerson(id);

		// Then
		verify(personService).getPerson(id);
		verify(personConverter).convert(person);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveSpecoffer() throws Exception {
		// Given
		Long id = 1L;
		
		Person person = new Person();
		person.setId(id);
		
		// When
		when(personService.getPerson(anyLong())).thenReturn(person);
		unit.removePerson(id);

		// Then
		verify(personService).getPerson(id);
		verify(personService).removePerson(person);
	}
	
	@Test
	public void testGetPersons() throws Exception {
		// Given
		PagedRequest<PersonResource> pagedRequest = new PagedRequest<PersonResource>(new PersonResource(), 10, 10);
		List<PersonResource> funnyResources = Collections.singletonList(new PersonResource());
		PagedResultResource<PersonResource> expectedFunnies = new PagedResultResource<>("/persons");
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		String query = "query";
		String queryName = "queryName";
		
		PagedSearch<Person> pagedSearch = new PagedSearch<Person>(offset, limit, new Queries(queryName, query), Collections.<String, Object> emptyMap(), Person.class);
		List<Person> entities = Arrays.asList(new Person());
		PagedResult<Person> pagedResult = new PagedResult<Person>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<PersonResource>>any())).thenReturn(pagedSearch);
		when(personService.getPersons(Matchers.<PagedSearch<Person>> any())).thenReturn(pagedResult);
		when(personConverter.convertAll(anyListOf(Person.class))).thenReturn(funnyResources);

		PagedResultResource<PersonResource> actualFunnies = unit.getPersons(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(personService).getPersons(pagedSearch);
		verify(personConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}

}
