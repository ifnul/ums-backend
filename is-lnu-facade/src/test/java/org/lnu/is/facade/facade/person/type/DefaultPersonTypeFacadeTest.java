package org.lnu.is.facade.facade.person.type;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.person.types.DefaultPersonTypeFacade;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.person.PersonResource;
import org.lnu.is.facade.resource.person.type.PersonTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.person.type.PersonTypeService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonTypeFacadeTest {
	
	@Mock
	private Converter<PersonResource, PersonType> insertConverter;

	@Mock
	private Converter<PersonResource, PersonType> updateConverter;
	
	@Mock
	private Converter<PersonResource, PersonType> resourceConverter;
	
	@Mock
	private Converter<PersonType, PersonResource> entityConverter;
	
	@Mock
	private PersonTypeService service;

	@Mock
	private Converter<PagedRequest<PersonTypeResource>, PagedSearch<PersonType>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@InjectMocks
	private DefaultPersonTypeFacade unit;
	
	@Test
	public void testGetPersonTypes() throws Exception {
		// Given
		PagedRequest<PersonTypeResource> pagedRequest = new PagedRequest<PersonTypeResource>(new PersonTypeResource(), 10, 10);
		List<PersonResource> funnyResources = Collections.singletonList(new PersonResource());
		PagedResultResource<PersonResource> expectedFunnies = new PagedResultResource<>("/persons/types");
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<PersonType> pagedSearch = new PagedSearch<PersonType>(offset, limit, Collections.<String, Object> emptyMap(), PersonType.class);
		List<PersonType> entities = Arrays.asList(new PersonType());
		PagedResult<PersonType> pagedResult = new PagedResult<PersonType>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<PersonTypeResource>>any())).thenReturn(pagedSearch);
		when(service.getPersonTypes(Matchers.<PagedSearch<PersonType>> any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(anyListOf(PersonType.class))).thenReturn(funnyResources);

		PagedResultResource<PersonTypeResource> actual = unit.getEntities(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getPersonTypes(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actual);
	}
}
