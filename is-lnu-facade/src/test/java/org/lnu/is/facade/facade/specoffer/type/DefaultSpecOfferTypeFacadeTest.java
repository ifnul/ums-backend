package org.lnu.is.facade.facade.specoffer.type;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.specoffer.type.DefaultSpecOfferTypeFacade;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.type.SpecOfferTypeResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.lnu.is.service.specoffer.type.SpecOfferTypeService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferTypeFacadeTest {

	@InjectMocks
	private DefaultSpecOfferTypeFacade unit;

	@Mock
	private Converter<PagedRequest<SpecOfferTypeResource>, PagedSearch<SpecOfferType>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@Mock
	private SpecOfferTypeService specOfferTypeService;

	@Mock
	private Converter<SpecOfferType, SpecOfferTypeResource> specOfferTypeConverter;

	@Mock
	private Converter<SpecOfferTypeResource, SpecOfferType> specOfferTypeResourceConverter;
	
	@Test
	public void testGetSpecialties() throws Exception {
		// Given
		SpecOfferTypeResource resource = new SpecOfferTypeResource();
		PagedRequest<SpecOfferTypeResource> pagedRequest = new PagedRequest<SpecOfferTypeResource>(resource, 10, 10);
		List<SpecOfferTypeResource> funnyResources = Collections.singletonList(new SpecOfferTypeResource());
		PagedResultResource<SpecOfferTypeResource> expectedFunnies = new PagedResultResource<>("/specoffers/types");
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<SpecOfferType> pagedSearch = new PagedSearch<SpecOfferType>(offset, limit, Queries.FIND_SPECOFFERS, Collections.<String, Object> emptyMap(), SpecOfferType.class);
		List<SpecOfferType> entities = Arrays.asList(new SpecOfferType());
		PagedResult<SpecOfferType> pagedResult = new PagedResult<SpecOfferType>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<SpecOfferTypeResource>>any())).thenReturn(pagedSearch);
		when(specOfferTypeService.getSpecOfferTypes(Matchers.<PagedSearch<SpecOfferType>> any())).thenReturn(pagedResult);
		when(specOfferTypeConverter.convertAll(anyListOf(SpecOfferType.class))).thenReturn(funnyResources);

		PagedResultResource<SpecOfferTypeResource> actualFunnies = unit.getSpecOfferTypes(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(specOfferTypeService).getSpecOfferTypes(pagedSearch);
		verify(specOfferTypeConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}
}
