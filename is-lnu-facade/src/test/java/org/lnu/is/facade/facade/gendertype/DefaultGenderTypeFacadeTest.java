package org.lnu.is.facade.facade.gendertype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.gendertype.GenderTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.lnu.is.service.gendertype.GenderTypeService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultGenderTypeFacadeTest {

	@InjectMocks
	private DefaultGenderTypeFacade unit;

	@Mock
	private Converter<PagedRequest<GenderTypeResource>, PagedSearch<GenderType>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@Mock
	private GenderTypeService genderTypeService;

	@Mock
	private Converter<GenderType, GenderTypeResource> genderTypeConverter;

	@Mock
	private Converter<GenderTypeResource, GenderType> genderTypeResourceConverter;

	@Test
	public void getGenderTypes() throws Exception {
		// Given
		GenderTypeResource resource = new GenderTypeResource();
		PagedRequest<GenderTypeResource> pagedRequest = new PagedRequest<GenderTypeResource>(resource, 10, 10);
		List<GenderTypeResource> myResources = Collections.singletonList(new GenderTypeResource());
		PagedResultResource<GenderTypeResource> expectedResources = new PagedResultResource<>("/gendertypes");
		expectedResources.setResources(myResources);

		int limit = 8;
		int offset = 3;
		int count = 100;

		PagedSearch<GenderType> pagedSearch = new PagedSearch<GenderType>(offset, limit, Queries.FIND_GENDER_TYPES, Collections.<String, Object> emptyMap(),
				GenderType.class);
		List<GenderType> entities = Arrays.asList(new GenderType());
		PagedResult<GenderType> pagedResult = new PagedResult<GenderType>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<GenderTypeResource>> any())).thenReturn(pagedSearch);
		when(genderTypeService.getGenderTypes(Matchers.<PagedSearch<GenderType>> any())).thenReturn(pagedResult);
		when(genderTypeConverter.convertAll(anyListOf(GenderType.class))).thenReturn(myResources);

		PagedResultResource<GenderTypeResource> actualResources = unit.getGenderTypes(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(genderTypeService).getGenderTypes(pagedSearch);
		verify(genderTypeConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedResources);

		assertEquals(expectedResources, actualResources);
	}

}
