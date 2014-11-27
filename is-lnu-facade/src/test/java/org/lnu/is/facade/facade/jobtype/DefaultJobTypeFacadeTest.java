package org.lnu.is.facade.facade.jobtype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.jobtype.JobTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.jobtype.JobTypeService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobTypeFacadeTest {

	@Mock
	private Converter<JobType, JobTypeResource> entityConverter;

	@Mock
	private Converter<JobTypeResource, JobType> resourceConverter;

	@Mock
	private Converter<PagedRequest<JobTypeResource>, PagedSearch<JobType>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@Mock
	private JobTypeService service;

	@InjectMocks
	private DefaultJobTypeFacade unit;

	@Test
	public void testGetJobTypes() throws Exception {
		// Given
		int offset = 10;
		int limit = 10;
		int count = 10;

		JobTypeResource resource = new JobTypeResource();
		PagedRequest<JobTypeResource> pagedRequest = new PagedRequest<JobTypeResource>(resource, offset, limit);

		PagedResultResource<JobTypeResource> expected = new PagedResultResource<JobTypeResource>("/jobtypes");
		List<JobTypeResource> resources = Collections.singletonList(new JobTypeResource());
		expected.setResources(resources);

		PagedSearch<JobType> pagedSearch = new PagedSearch<JobType>(offset, limit, Collections.<String, Object> emptyMap(), JobType.class);

		List<JobType> entities = Collections.singletonList(new JobType());
		PagedResult<JobType> pagedResult = new PagedResult<JobType>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<JobTypeResource>> any())).thenReturn(pagedSearch);
		when(service.getJobTypes(Matchers.<PagedSearch<JobType>> any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(Matchers.anyListOf(JobType.class))).thenReturn(resources);

		PagedResultResource<JobTypeResource> actual = unit.getEntities(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getJobTypes(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expected);
		assertEquals(expected, actual);
	}

}
