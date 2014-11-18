package org.lnu.is.dao.dao.specoffertype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferTypeDaoTest {

	@Mock
	private PersistenceManager<SpecOfferType, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<SpecOfferType> queryBuilder;
	
	@InjectMocks
	private DefaultSpecOfferTypeDao unit;
	
	@Test
	public void testGetSpecOfferTypes() throws Exception {
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<SpecOfferType> pagedSearch = new PagedSearch<SpecOfferType>(offset, limit, Queries.FIND_SPECOFFER_TYPES, Collections.<String, Object> emptyMap(), SpecOfferType.class);

		SpecOfferType entity1 = new SpecOfferType();
		List<SpecOfferType> entities = Arrays.asList(entity1);
		PagedResult<SpecOfferType> expected = new PagedResult<SpecOfferType>(offset, limit, count, entities);
		
		// When
		when(persistenceManager.search(Matchers.<PagedSearch<SpecOfferType>>any())).thenReturn(expected);
		PagedResult<SpecOfferType> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}
}
