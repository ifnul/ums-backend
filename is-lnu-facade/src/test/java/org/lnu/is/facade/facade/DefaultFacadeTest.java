package org.lnu.is.facade.facade;

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
import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.person.PersonResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.DefaultService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultFacadeTest {
	@Mock
	protected Converter<PersonResource, Person> insertConverter;

	@Mock
	protected Converter<PersonResource, Person> updateConverter;

	@Mock
	protected Converter<PersonResource, Person> resourceConverter;

	@Mock
	protected Converter<Person, PersonResource> entityConverter;

	@Mock
	protected DefaultService<Person, Long, DefaultDao<Person, Long>> service;

	@Mock
	protected Converter<PagedRequest<PersonResource>, PagedSearch<Person>> pagedRequestConverter;

	@Mock
	protected Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@InjectMocks
	private DefaultFacade<Person, PersonResource, DefaultService<Person, Long, DefaultDao<Person, Long>>, Long> unit;

	@Test
	public void testCreateEntity() throws Exception {
		// Given
		String name = "LightMan";
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
		when(resourceConverter.convert(any(PersonResource.class))).thenReturn(person);
		when(entityConverter.convert(any(Person.class))).thenReturn(expected);

		PersonResource actual = unit.createResource(expected);

		// Then
		verify(resourceConverter).convert(expected);
		verify(service).createEntity(person);
		verify(insertConverter).convert(expected, person);

		assertEquals(expected, actual);
	}

	@Test
	public void testUpdateEntity() throws Exception {
		// Given
		Long id = 1L;
		String name = "LightMan";
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
		when(service.getEntity(anyLong())).thenReturn(person);

		unit.updateResource(id, expected);

		// Then
		verify(service).getEntity(id);
		verify(resourceConverter).convert(expected, person);
		verify(service).updateEntity(person);
		verify(updateConverter).convert(expected, person);
	}

	@Test
	public void testGetEntity() throws Exception {
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
		when(service.getEntity(anyLong())).thenReturn(person);
		when(entityConverter.convert(any(Person.class))).thenReturn(expected);
		PersonResource actual = unit.getResource(id);

		// Then
		verify(service).getEntity(id);
		verify(entityConverter).convert(person);
		assertEquals(expected, actual);
	}

	@Test
	public void testRemoveEntity() throws Exception {
		// Given
		Long id = 1L;

		Person person = new Person();
		person.setId(id);

		// When
		when(service.getEntity(anyLong())).thenReturn(person);
		unit.removeResource(id);

		// Then
		verify(service).getEntity(id);
		verify(service).removeEntity(person);
	}

	@Test
	public void testGetEntities() throws Exception {
		// Given
		PagedRequest<PersonResource> pagedRequest = new PagedRequest<PersonResource>(new PersonResource(), 10, 10);
		List<PersonResource> resources = Collections.singletonList(new PersonResource());
		PagedResultResource<PersonResource> expectedPagedResultResource = new PagedResultResource<>(pagedRequest.getResource().getRootUri());
		expectedPagedResultResource.setResources(resources);

		int offset = 8;
		int limit = 3;
		int count = 100;

		PagedSearch<Person> pagedSearch = new PagedSearch<Person>(offset, limit, Collections.<String, Object> emptyMap(), Person.class);
		List<Person> entities = Arrays.asList(new Person());
		PagedResult<Person> pagedResult = new PagedResult<Person>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<PersonResource>> any())).thenReturn(pagedSearch);
		when(service.getEntities(Matchers.<PagedSearch<Person>> any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(anyListOf(Person.class))).thenReturn(resources);

		PagedResultResource<PersonResource> actualFunnies = unit.getResources(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getEntities(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedPagedResultResource);

		assertEquals(expectedPagedResultResource, actualFunnies);
	}

}
