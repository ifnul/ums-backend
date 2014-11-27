package org.lnu.is.facade.facade.specoffer.subject;

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
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.subject.SpecOfferSubjectResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.specoffer.subject.SpecOfferSubjectService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferSubjectFacadeTest {

	@Mock
	protected Converter<SpecOfferSubjectResource, SpecofferSubject> insertConverter;
	
	@Mock
	protected Converter<SpecOfferSubjectResource, SpecofferSubject> updateConverter;
	
	@Mock
	protected Converter<PagedRequest<SpecOfferSubjectResource>, PagedSearch<SpecofferSubject>> pagedRequestConverter;

	@Mock
	protected Converter<PagedResult<SpecofferSubject>, PagedResultResource<SpecOfferSubjectResource>> pagedResultConverter;

	@Mock
	private Converter<SpecOfferSubjectResource, SpecofferSubject> resourceConverter;
	
	@Mock
	private Converter<SpecofferSubject, SpecOfferSubjectResource> entityConverter;
	
	@Mock
	private SpecOfferSubjectService service;
	
	@InjectMocks
	private DefaultSpecOfferSubjectFacade unit;
	
	@Test
	public void testCreateSpecOfferSubjectPaper() throws Exception {
		// Given
    	SpecOfferSubjectResource expected = new SpecOfferSubjectResource();

		SpecofferSubject personPaper = new SpecofferSubject();
		
		// When
		when(resourceConverter.convert(any(SpecOfferSubjectResource.class))).thenReturn(personPaper);
		when(entityConverter.convert(any(SpecofferSubject.class))).thenReturn(expected);
		
		SpecOfferSubjectResource actual = unit.createEntity(expected);

		// Then
		verify(resourceConverter).convert(expected, personPaper);
		verify(service).createSubject(personPaper);
		verify(insertConverter).convert(expected, personPaper);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUpdateSpecOfferSubject() throws Exception {
		// Given
		Long id = 1L;
    	
    	SpecOfferSubjectResource expected = new SpecOfferSubjectResource();
    	expected.setId(id);

    	SpecofferSubject personPaper = new SpecofferSubject();
		personPaper.setId(id);
		
		// When
		when(service.getSubject(anyLong())).thenReturn(personPaper);
		
		unit.updateEntity(id, expected);

		// Then
		verify(service).getSubject(id);
		verify(resourceConverter).convert(expected, personPaper);
		verify(service).updateSubject(personPaper);
		verify(updateConverter).convert(expected, personPaper);
	}

	@Test
	public void testGetSpecOfferSubject() throws Exception {
		// Given
		Long id = 1L;
    	
    	SpecOfferSubjectResource expected = new SpecOfferSubjectResource();
    	expected.setId(id);

    	SpecofferSubject personPaper = new SpecofferSubject();
		personPaper.setId(id);

		// When
		when(service.getSubject(anyLong())).thenReturn(personPaper);
		when(entityConverter.convert(any(SpecofferSubject.class))).thenReturn(expected);
		SpecOfferSubjectResource actual = unit.getEntity(id);

		// Then
		verify(service).getSubject(id);
		verify(entityConverter).convert(personPaper);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveSpecoffer() throws Exception {
		// Given
		Long id = 1L;
		
		SpecofferSubject personPaper = new SpecofferSubject();
		personPaper.setId(id);
		
		// When
		when(service.getSubject(anyLong())).thenReturn(personPaper);
		unit.removeEntity(id);

		// Then
		verify(service).getSubject(id);
		verify(service).removeSubject(personPaper);
	}
	
	@Test
	public void testGetSpecOfferSubjects() throws Exception {
		// Given
		Long specOfferId = 2L;
		SpecOfferSubjectResource resource = new SpecOfferSubjectResource();
		resource.setSpecOfferId(specOfferId);
		PagedRequest<SpecOfferSubjectResource> pagedRequest = new PagedRequest<SpecOfferSubjectResource>(resource, 10, 10);
		List<SpecOfferSubjectResource> funnyResources = Collections.singletonList(new SpecOfferSubjectResource());
		PagedResultResource<SpecOfferSubjectResource> expectedFunnies = new PagedResultResource<>(MessageFormat.format("/specoffers/{0}/subjects", specOfferId));
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<SpecofferSubject> pagedSearch = new PagedSearch<SpecofferSubject>(offset, limit, Collections.<String, Object> emptyMap(), SpecofferSubject.class);
		List<SpecofferSubject> entities = Arrays.asList(new SpecofferSubject());
		PagedResult<SpecofferSubject> pagedResult = new PagedResult<SpecofferSubject>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<SpecOfferSubjectResource>>any())).thenReturn(pagedSearch);
		when(service.getSubjects(Matchers.<PagedSearch<SpecofferSubject>>any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(anyListOf(SpecofferSubject.class))).thenReturn(funnyResources);

		PagedResultResource<SpecOfferSubjectResource> actualFunnies = unit.getEntities(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getSubjects(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}

}
