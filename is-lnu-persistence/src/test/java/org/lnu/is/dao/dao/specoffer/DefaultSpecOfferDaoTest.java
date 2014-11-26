package org.lnu.is.dao.dao.specoffer;

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
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.pagination.PagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferDaoTest {

	@Mock
	private PersistenceManager<SpecOffer, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<SpecOffer> queryBuilder;
	
	@InjectMocks
	private DefaultSpecOfferDao unit;
	
	@Test
	public void testGetSpecOffers() throws Exception {
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		String querySql = "query";
		Queries<SpecOffer> query = new Queries<SpecOffer>(SpecOffer.class, querySql);
		PagedQuerySearch<SpecOffer> pagedSearch = new PagedQuerySearch<SpecOffer>(query, offset, limit, Collections.<String, Object> emptyMap(),
				SpecOffer.class);

		SpecOffer entity1 = new SpecOffer();
		List<SpecOffer> entities = Arrays.asList(entity1);
		PagedResult<SpecOffer> expected = new PagedResult<SpecOffer>(offset, limit, count, entities);
		
		// When
		when(queryBuilder.build(any(SpecOffer.class))).thenReturn(querySql);
		when(persistenceManager.search(Matchers.<PagedQuerySearch<SpecOffer>>any())).thenReturn(expected);
		PagedResult<SpecOffer> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}
}
