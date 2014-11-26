package org.lnu.is.facade.facade.enrolment.statustype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.enrolment.statustype.EnrolmentStatusTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.enrolment.statustype.EnrolmentStatusTypeService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEnrolmentStatusTypeFacadeTest {
	@InjectMocks
	private DefaultEnrolmentStatusTypeFacade unit;

	@Mock
	private Converter<PagedRequest<EnrolmentStatusTypeResource>, PagedSearch<EnrolmentStatusType>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@Mock
	private EnrolmentStatusTypeService enrolmentStatusTypeService;

	@Mock
	private Converter<EnrolmentStatusType, EnrolmentStatusTypeResource> enrolmentStatusTypeConverter;
	
	@Mock
	private Converter<EnrolmentStatusTypeResource, EnrolmentStatusType> enrolmentStatusTypeResourceConverter;
	
	@Test
	public void testGetStatusTypes() throws Exception {
		// Given
		EnrolmentStatusTypeResource resource = new EnrolmentStatusTypeResource();
		PagedRequest<EnrolmentStatusTypeResource> pagedRequest = new PagedRequest<EnrolmentStatusTypeResource>(resource, 10, 10);
		List<EnrolmentStatusTypeResource> someResources = Collections.singletonList(new EnrolmentStatusTypeResource());
		PagedResultResource<EnrolmentStatusTypeResource> expectedResources = new PagedResultResource<>("/enrolments/statustypes");
		expectedResources.setResources(someResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<EnrolmentStatusType> pagedSearch = new PagedSearch<EnrolmentStatusType>(offset, limit, Collections.<String, Object> emptyMap(), EnrolmentStatusType.class);
		List<EnrolmentStatusType> entities = Arrays.asList(new EnrolmentStatusType());
		PagedResult<EnrolmentStatusType> pagedResult = new PagedResult<EnrolmentStatusType>(offset, limit, count, entities);
		
		//When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<EnrolmentStatusTypeResource>>any())).thenReturn(pagedSearch);
		when(enrolmentStatusTypeService.getEnrolmentStatusTypes(Matchers.<PagedSearch<EnrolmentStatusType>> any())).thenReturn(pagedResult);
		when(enrolmentStatusTypeConverter.convertAll(anyListOf(EnrolmentStatusType.class))).thenReturn(someResources);

		PagedResultResource<EnrolmentStatusTypeResource> actualResources = unit.getEnrolmentStatusTypes(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(enrolmentStatusTypeService).getEnrolmentStatusTypes(pagedSearch);
		verify(enrolmentStatusTypeConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedResources);

		assertEquals(expectedResources, actualResources);
	}
	

}
