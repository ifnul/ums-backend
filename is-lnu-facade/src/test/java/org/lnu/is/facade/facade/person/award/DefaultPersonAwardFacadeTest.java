package org.lnu.is.facade.facade.person.award;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.person.award.PersonAwardResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.person.award.PersonAwardService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonAwardFacadeTest {

	@Mock
	private PersonAwardService service;

	@Mock
	private Converter<PersonAwardResource, PersonAward> insertConverter;

	@Mock
	private Converter<PersonAwardResource, PersonAward> updateConverter;
	
	@Mock
	private Converter<PersonAwardResource, PersonAward> resourceConverter;

	@Mock
	private Converter<PersonAward, PersonAwardResource> entityConverter;
	
	@Mock
	private Converter<PagedRequest<PersonAwardResource>, PagedSearch<PersonAward>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@InjectMocks
	private DefaultPersonAwardFacade unit;
	
	@Test
	public void testCreatePersonAward() throws Exception {
		// Given
    	PersonAwardResource expected = new PersonAwardResource();

		PersonAward personAward = new PersonAward();
		
		// When
		when(resourceConverter.convert(any(PersonAwardResource.class))).thenReturn(personAward);
		when(entityConverter.convert(any(PersonAward.class))).thenReturn(expected);
		
		PersonAwardResource actual = unit.createEntity(expected);

		// Then
		verify(resourceConverter).convert(expected, new PersonAward());
		verify(service).createAward(personAward);
		verify(insertConverter).convert(expected, personAward);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUpdatePersonAward() throws Exception {
		// Given
		Long id = 1L;
    	
    	PersonAwardResource expected = new PersonAwardResource();
    	expected.setId(id);

		PersonAward personAward = new PersonAward();
		personAward.setId(id);
		
		// When
		when(service.getAward(anyLong())).thenReturn(personAward);
		
		unit.updateEntity(id, expected);

		// Then
		verify(service).getAward(id);
		verify(resourceConverter).convert(expected, personAward);
		verify(service).updateAward(personAward);
		verify(updateConverter).convert(expected, personAward);
	}

	@Test
	public void testGetPersonAward() throws Exception {
		// Given
		Long id = 1L;
    	
    	PersonAwardResource expected = new PersonAwardResource();
    	expected.setId(id);

		PersonAward personAward = new PersonAward();
		personAward.setId(id);

		// When
		when(service.getAward(anyLong())).thenReturn(personAward);
		when(entityConverter.convert(any(PersonAward.class))).thenReturn(expected);
		PersonAwardResource actual = unit.getEntity(id);

		// Then
		verify(service).getAward(id);
		verify(entityConverter).convert(personAward);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveSpecoffer() throws Exception {
		// Given
		Long id = 1L;
		
		PersonAward personAward = new PersonAward();
		personAward.setId(id);
		
		// When
		when(service.getAward(anyLong())).thenReturn(personAward);
		unit.removeEntity(id);

		// Then
		verify(service).getAward(id);
		verify(service).removeAward(personAward);
	}
	
	@Test
	public void testGetPersonAwards() throws Exception {
		// Given
		Long personId = 2L;
		PersonAwardResource resource = new PersonAwardResource();
		resource.setPersonId(personId);
		PagedRequest<PersonAwardResource> pagedRequest = new PagedRequest<PersonAwardResource>(resource, 10, 10);
		List<PersonAwardResource> funnyResources = Collections.singletonList(new PersonAwardResource());
		PagedResultResource<PersonAwardResource> expectedFunnies = new PagedResultResource<>(MessageFormat.format("/persons/{0}/awards", personId));
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<PersonAward> pagedSearch = new PagedSearch<PersonAward>(offset, limit, Collections.<String, Object> emptyMap(), PersonAward.class);
		List<PersonAward> entities = Arrays.asList(new PersonAward());
		PagedResult<PersonAward> pagedResult = new PagedResult<PersonAward>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<PersonAwardResource>>any())).thenReturn(pagedSearch);
		when(service.getAwards(Matchers.<PagedSearch<PersonAward>> any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(anyListOf(PersonAward.class))).thenReturn(funnyResources);

		PagedResultResource<PersonAwardResource> actualFunnies = unit.getEntities(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getAwards(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}

}
