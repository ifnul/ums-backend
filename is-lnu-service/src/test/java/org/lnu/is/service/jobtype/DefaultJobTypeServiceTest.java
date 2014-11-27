package org.lnu.is.service.jobtype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.jobtype.JobTypeDao;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobTypeServiceTest {

	@Mock
	private JobTypeDao defaultDao;

	@Mock
	private ParametersExtractor<JobType> parametersExtractor;

	@InjectMocks
	private DefaultJobTypeService unit;

	@Test
	public void testGetJobTypes() throws Exception {
		// Given
		int offset = 10;
		int limit = 10;
		int count = 100;
		
		PagedSearch<JobType> pagedSearch = new PagedSearch<>();

		List<JobType> entities = Collections.<JobType> emptyList();
		
		PagedResult<JobType> expected = new PagedResult<JobType>(offset, limit, count, entities);

		// When
		when(defaultDao.getEntities(Matchers.<PagedSearch<JobType>> any())).thenReturn(expected);
		PagedResult<JobType> actual = unit.getJobTypes(pagedSearch);

		// Then
		verify(defaultDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}
}
