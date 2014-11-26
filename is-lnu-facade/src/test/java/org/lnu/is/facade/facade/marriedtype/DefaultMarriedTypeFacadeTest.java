package org.lnu.is.facade.facade.marriedtype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.marriedtype.MarriedTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.marriedtype.MarriedTypeService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultMarriedTypeFacadeTest {

	@Mock
	private Converter<MarriedType, MarriedTypeResource> entityConverter;

	@Mock
	private Converter<MarriedTypeResource, MarriedType> resourceConverter;

	@Mock
	private Converter<PagedRequest<MarriedTypeResource>, PagedSearch<MarriedType>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@Mock
	private MarriedTypeService service;

	@InjectMocks
	private DefaultMarriedTypeFacade unit;
	
	@Test
	public void testGetMarriedTypes() {
		// Given
		int offset = 10;
		int limit = 10;
		int count = 10;

		MarriedTypeResource resource = new MarriedTypeResource();
		PagedRequest<MarriedTypeResource> pagedRequest = new PagedRequest<MarriedTypeResource>(resource, offset, limit);

		PagedResultResource<MarriedTypeResource> expected = new PagedResultResource<MarriedTypeResource>("/marriedtypes");
		List<MarriedTypeResource> resources = Collections.singletonList(new MarriedTypeResource());
		expected.setResources(resources);

		PagedSearch<MarriedType> pagedSearch = new PagedSearch<MarriedType>(offset, limit, Collections.<String, Object> emptyMap(), MarriedType.class);

		List<MarriedType> entities = Collections.singletonList(new MarriedType());
		PagedResult<MarriedType> pagedResult = new PagedResult<MarriedType>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<MarriedTypeResource>> any())).thenReturn(pagedSearch);
		when(service.getMarriedTypes(Matchers.<PagedSearch<MarriedType>> any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(Matchers.anyListOf(MarriedType.class))).thenReturn(resources);

		PagedResultResource<MarriedTypeResource> actual = unit.getMarriedTypes(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getMarriedTypes(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expected);
		assertEquals(expected, actual);
	}

}
