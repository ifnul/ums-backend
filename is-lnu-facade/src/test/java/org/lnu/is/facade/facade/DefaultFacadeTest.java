package org.lnu.is.facade.facade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.converter.Converter;
import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.resource.person.PersonResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.service.DefaultService;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultFacadeTest {
	@Mock
	private Converter<PersonResource, Person> insertConverter;

	@Mock
	private Converter<PersonResource, Person> updateConverter;

	@Mock
	private Converter<PersonResource, Person> resourceConverter;

	@Mock
	private Converter<Person, PersonResource> entityConverter;

	@Mock
	private DefaultService<Person, Person, Long, DefaultDao<Person, Person, Long>> service;

	@Mock
	private Converter<PagedRequest<PersonResource>, MultiplePagedSearch<Person>> pagedRequestConverter;

	@Mock
	private Converter<Person, PersonResource> entityDetailsConverter;
	
	@Mock
	private Converter<PagedResult<Person>, PagedResultResource<PersonResource>> pagedResultConverter;

	private DefaultFacade<Person, PersonResource, Person, PersonResource, DefaultService<Person, Person, Long, DefaultDao<Person, Person, Long>>, Long> unit = new DefaultFacade<Person, PersonResource, Person, PersonResource, DefaultService<Person, Person, Long, DefaultDao<Person, Person, Long>>, Long>();
	
	@Before
	public void setup() {
		unit.setEntityConverter(entityConverter);
		unit.setEntityDetailsConverter(entityDetailsConverter);
		unit.setInsertConverter(insertConverter);
		unit.setPagedRequestConverter(pagedRequestConverter);
		unit.setPagedResultConverter(pagedResultConverter);
		unit.setResourceConverter(resourceConverter);
		unit.setService(service);
		unit.setUpdateConverter(updateConverter);
	}
	
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
		String group = "developers";

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
		person.setCrtUserGroup(group);

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
		verify(entityDetailsConverter).convert(person, expected);
		assertEquals(expected, actual);
	}

	@Test
	public void testRemoveEntity() throws Exception {
		// Given
		Long id = 1L;
		String group = "developers";

		Person person = new Person();
		person.setId(id);
		person.setCrtUserGroup(group);

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
		PagedRequest<PersonResource> pagedRequest = new PagedRequest<PersonResource>(new PersonResource(), 10, 10, Collections.<OrderBy>emptyList());
		List<PersonResource> resources = Collections.singletonList(new PersonResource());
		PagedResultResource<PersonResource> expectedPagedResultResource = new PagedResultResource<>(pagedRequest.getResource().getRootUri());
		expectedPagedResultResource.setResources(resources);

		int offset = 8;
		int limit = 3;
		int count = 100;

		MultiplePagedSearch<Person> pagedSearch = new MultiplePagedSearch<Person>(offset, limit, Collections.<String, Object> emptyMap(), Person.class);
		List<Person> entities = Arrays.asList(new Person());
		PagedResult<Person> pagedResult = new PagedResult<Person>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<PersonResource>> any())).thenReturn(pagedSearch);
		when(service.getEntities(Matchers.<MultiplePagedSearch<Person>> any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(anyListOf(Person.class))).thenReturn(resources);

		PagedResultResource<PersonResource> actualFunnies = unit.getResources(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getEntities(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedPagedResultResource);

		assertEquals(expectedPagedResultResource, actualFunnies);
	}
	
	@Test
	public void testEntityConverter() throws Exception {
		assertNotNull(unit.getEntityConverter());
	}
	
	@Test
	public void testEntityDetailsConverter() throws Exception {
		assertNotNull(unit.getEntityDetailsConverter());
	}
	
	@Test
	public void testInsertConverter() throws Exception {
		assertNotNull(unit.getInsertConverter());
	}
	
	@Test
	public void testPagedResultConverter() throws Exception {
		assertNotNull(unit.getPagedResultConverter());
	}
	
	@Test
	public void testResourceConverter() throws Exception {
		assertNotNull(unit.getResourceConverter());
	}
	
	@Test
	public void testService() throws Exception {
		assertNotNull(unit.getService());
	}
	
	@Test
	public void testPagedRequestConverter() throws Exception {
		assertNotNull(unit.getPagedRequestConverter());
	}

	@Test
	public void testPagedUpdateConverter() throws Exception {
		assertNotNull(unit.getUpdateConverter());
	}

}
