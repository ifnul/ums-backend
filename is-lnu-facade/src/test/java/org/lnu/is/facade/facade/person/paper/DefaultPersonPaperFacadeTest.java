package org.lnu.is.facade.facade.person.paper;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.person.paper.PersonPaperResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.person.paper.PersonPaperService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonPaperFacadeTest {

	@Mock
	private PersonPaperService service;

	@Mock
	private Converter<PersonPaperResource, PersonPaper> insertConverter;

	@Mock
	private Converter<PersonPaperResource, PersonPaper> updateConverter;
	
	@Mock
	private Converter<PersonPaperResource, PersonPaper> resourceConverter;

	@Mock
	private Converter<PersonPaper, PersonPaperResource> entityConverter;
	
	@Mock
	private Converter<PagedRequest<PersonPaperResource>, PagedSearch<PersonPaper>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@InjectMocks
	private DefaultPersonPaperFacade unit;
	
	@Test
	public void testCreatePersonPaperPaper() throws Exception {
		// Given
    	PersonPaperResource expected = new PersonPaperResource();
    	expected.setDocDate(new Date());

		PersonPaper personPaper = new PersonPaper();
		
		// When
		when(resourceConverter.convert(any(PersonPaperResource.class))).thenReturn(personPaper);
		when(entityConverter.convert(any(PersonPaper.class))).thenReturn(expected);
		
		PersonPaperResource actual = unit.createPersonPaper(expected);

		// Then
		verify(resourceConverter).convert(expected);
		verify(service).createPersonPaper(personPaper);
		verify(insertConverter).convert(expected, personPaper);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUpdatePersonPaper() throws Exception {
		// Given
		Long id = 1L;
    	
    	PersonPaperResource expected = new PersonPaperResource();
    	expected.setId(id);
    	expected.setDocDate(new Date());

		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(id);
		
		// When
		when(service.getPersonPaper(anyLong())).thenReturn(personPaper);
		
		unit.updatePersonPaper(id, expected);

		// Then
		verify(service).getPersonPaper(id);
		verify(resourceConverter).convert(expected, personPaper);
		verify(service).updatePersonPaper(personPaper);
		verify(updateConverter).convert(expected, personPaper);
	}

	@Test
	public void testGetPersonPaper() throws Exception {
		// Given
		Long id = 1L;
    	
    	PersonPaperResource expected = new PersonPaperResource();
    	expected.setId(id);

		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(id);

		// When
		when(service.getPersonPaper(anyLong())).thenReturn(personPaper);
		when(entityConverter.convert(any(PersonPaper.class))).thenReturn(expected);
		PersonPaperResource actual = unit.getPersonPaper(id);

		// Then
		verify(service).getPersonPaper(id);
		verify(entityConverter).convert(personPaper);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveSpecoffer() throws Exception {
		// Given
		Long id = 1L;
		
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(id);
		
		// When
		when(service.getPersonPaper(anyLong())).thenReturn(personPaper);
		unit.removePersonPaper(id);

		// Then
		verify(service).getPersonPaper(id);
		verify(service).removePersonPaper(personPaper);
	}
	
	@Test
	public void testGetPersonPapers() throws Exception {
		// Given
		Long personId = 2L;
		PersonPaperResource resource = new PersonPaperResource();
		resource.setPersonId(personId);
		PagedRequest<PersonPaperResource> pagedRequest = new PagedRequest<PersonPaperResource>(resource, 10, 10);
		List<PersonPaperResource> funnyResources = Collections.singletonList(new PersonPaperResource());
		PagedResultResource<PersonPaperResource> expectedFunnies = new PagedResultResource<>(MessageFormat.format("/persons/{0}/papers", personId));
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<PersonPaper> pagedSearch = new PagedSearch<PersonPaper>(offset, limit, Collections.<String, Object> emptyMap(), PersonPaper.class);
		List<PersonPaper> entities = Arrays.asList(new PersonPaper());
		PagedResult<PersonPaper> pagedResult = new PagedResult<PersonPaper>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<PersonPaperResource>>any())).thenReturn(pagedSearch);
		when(service.getPersonPapers(Matchers.<PagedSearch<PersonPaper>> any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(anyListOf(PersonPaper.class))).thenReturn(funnyResources);

		PagedResultResource<PersonPaperResource> actualFunnies = unit.getPersonPapers(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getPersonPapers(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}

}
