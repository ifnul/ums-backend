package org.lnu.is.dao.dao.marriedtype;

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
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.pagination.PagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultMarriedTypeDaoTest {
	
	@Mock
	private PersistenceManager<MarriedType, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<MarriedType> queryBuilder;
	
	@InjectMocks
	private DefaultMarriedTypeDao unit;

	@Test
	public void testGetMarriedTypes() throws Exception {
		// Given
		int offset = 10;
		int limit = 10;
		int count = 100;

		String queryCommand = "query";

		Queries<MarriedType> query = new Queries<MarriedType>(MarriedType.class, queryCommand);

		PagedQuerySearch<MarriedType> pagedSearch = new PagedQuerySearch<MarriedType>(query, offset, limit, Collections.<String, Object> emptyMap(), MarriedType.class);

		MarriedType entity = new MarriedType();
		List<MarriedType> entities = Arrays.asList(entity);
		PagedResult<MarriedType> expected = new PagedResult<MarriedType>(offset, limit, count, entities);

		// When
		when(queryBuilder.build(any(MarriedType.class))).thenReturn(queryCommand);
		when(persistenceManager.search(Matchers.<PagedQuerySearch<MarriedType>> any())).thenReturn(expected);
		PagedResult<MarriedType> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}

}
