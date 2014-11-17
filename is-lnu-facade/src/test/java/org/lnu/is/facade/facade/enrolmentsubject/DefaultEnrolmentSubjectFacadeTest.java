package org.lnu.is.facade.facade.enrolmentsubject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.enrolmentsubject.EnrolmentSubjectResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.lnu.is.service.enrolmentsubject.EnrolmentSubjectService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEnrolmentSubjectFacadeTest {

	@InjectMocks
	private DefaultEnrolmentSubjectFacade unit;

	@Mock
	private Converter<PagedRequest<EnrolmentSubjectResource>, PagedSearch<EnrolmentSubject>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@Mock
	private EnrolmentSubjectService enrolmentSubjectService;

	@Mock
	private Converter<EnrolmentSubject, EnrolmentSubjectResource> enrolmentSubjectConverter;
	
	@Mock
	private Converter<EnrolmentSubjectResource, EnrolmentSubject> enrolmentSubjectResourceConverter;
	
	@Test
	public void testGetSpecialties() throws Exception {
		// Given
		EnrolmentSubjectResource resource = new EnrolmentSubjectResource();
		PagedRequest<EnrolmentSubjectResource> pagedRequest = new PagedRequest<EnrolmentSubjectResource>(resource, 10, 10);
		List<EnrolmentSubjectResource> funnyResources = Collections.singletonList(new EnrolmentSubjectResource());
		PagedResultResource<EnrolmentSubjectResource> expectedFunnies = new PagedResultResource<>("/enrolments/subjects");
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<EnrolmentSubject> pagedSearch = new PagedSearch<EnrolmentSubject>(offset, limit, Queries.FIND_SPECOFFERS, Collections.<String, Object> emptyMap(), EnrolmentSubject.class);
		List<EnrolmentSubject> entities = Arrays.asList(new EnrolmentSubject());
		PagedResult<EnrolmentSubject> pagedResult = new PagedResult<EnrolmentSubject>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<EnrolmentSubjectResource>>any())).thenReturn(pagedSearch);
		when(enrolmentSubjectService.getEnrolmentSubjects(Matchers.<PagedSearch<EnrolmentSubject>> any())).thenReturn(pagedResult);
		when(enrolmentSubjectConverter.convertAll(anyListOf(EnrolmentSubject.class))).thenReturn(funnyResources);

		PagedResultResource<EnrolmentSubjectResource> actualFunnies = unit.getEnrolmentSubjects(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(enrolmentSubjectService).getEnrolmentSubjects(pagedSearch);
		verify(enrolmentSubjectConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}
}
