package org.lnu.is.dao.dao.timeperiod;

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
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.pagination.PagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultTimePeriodDaoTest {

	@Mock
	private PersistenceManager<TimePeriod, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<TimePeriod> queryBuilder;
	
	@InjectMocks
	private DefaultTimePeriodDao unit;
	
	@Test
	public void testGetTimePeriods() throws Exception {
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		String querySql = "query";
		Queries<TimePeriod> query = new Queries<TimePeriod>(TimePeriod.class, querySql);
		PagedQuerySearch<TimePeriod> pagedSearch = new PagedQuerySearch<TimePeriod>(query, 
				offset, limit, Collections.<String, Object> emptyMap(), TimePeriod.class);

		TimePeriod entity1 = new TimePeriod();
		List<TimePeriod> entities = Arrays.asList(entity1);
		PagedResult<TimePeriod> expected = new PagedResult<TimePeriod>(offset, limit, count, entities);
		
		// When
		when(queryBuilder.build(any(TimePeriod.class))).thenReturn(querySql);
		when(persistenceManager.search(Matchers.<PagedQuerySearch<TimePeriod>>any())).thenReturn(expected);
		PagedResult<TimePeriod> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}
}
