package org.lnu.is.dao.dao.jobtype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.pagination.PagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobTypeDaoTest {

	@Mock
	private PersistenceManager<JobType, Long> persistenceManager;

	@Mock
	private QueryBuilder<JobType> queryBuilder;

	@InjectMocks
	private DefaultJobTypeDao unit;

	@Test
	public void testGetJobTypes() throws Exception {
		// Given
		int offset = 10;
		int limit = 10;
		int count = 100;

		String queryCommand = "query";

		Queries<JobType> query = new Queries<JobType>(JobType.class, queryCommand);

		PagedQuerySearch<JobType> pagedSearch = new PagedQuerySearch<JobType>(query, offset, limit, Collections.<String, Object> emptyMap(), JobType.class);

		JobType entity = new JobType();
		List<JobType> entities = Arrays.asList(entity);
		PagedResult<JobType> expected = new PagedResult<JobType>(offset, limit, count, entities);

		// When
		when(queryBuilder.build(any(JobType.class))).thenReturn(queryCommand);
		when(persistenceManager.search(Matchers.<PagedQuerySearch<JobType>> any())).thenReturn(expected);
		PagedResult<JobType> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}

}
