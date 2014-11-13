package org.lnu.is.facade.facade.eduformtype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.eduformtype.DefaultEduFormTypeFacade;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.eduformtype.EduFormTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.lnu.is.service.eduformtype.EduFormTypeService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEduFormTypeFacadeTest {

	@InjectMocks
	private DefaultEduFormTypeFacade unit;

	@Mock
	private Converter<PagedRequest<EduFormTypeResource>, PagedSearch<EduFormType>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@Mock
	private EduFormTypeService eduFormTypeService;

	@Mock
	private Converter<EduFormType, EduFormTypeResource> eduFormTypeConverter;
	
	@Test
	public void testGetSpecialties() throws Exception {
		// Given
		EduFormTypeResource resource = new EduFormTypeResource();
		PagedRequest<EduFormTypeResource> pagedRequest = new PagedRequest<EduFormTypeResource>(resource, 10, 10);
		List<EduFormTypeResource> funnyResources = Collections.singletonList(new EduFormTypeResource());
		PagedResultResource<EduFormTypeResource> expectedFunnies = new PagedResultResource<>("/eduformtypes");
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<EduFormType> pagedSearch = new PagedSearch<EduFormType>(offset, limit, Queries.FIND_SPECOFFERS, Collections.<String, Object> emptyMap(), EduFormType.class);
		List<EduFormType> entities = Arrays.asList(new EduFormType());
		PagedResult<EduFormType> pagedResult = new PagedResult<EduFormType>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<EduFormTypeResource>>any())).thenReturn(pagedSearch);
		when(eduFormTypeService.getEduFormTypes(Matchers.<PagedSearch<EduFormType>> any())).thenReturn(pagedResult);
		when(eduFormTypeConverter.convertAll(anyListOf(EduFormType.class))).thenReturn(funnyResources);

		PagedResultResource<EduFormTypeResource> actualFunnies = unit.getEduFormTypes(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(eduFormTypeService).getEduFormTypes(pagedSearch);
		verify(eduFormTypeConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}
}
