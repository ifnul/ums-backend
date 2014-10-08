package org.lnu.is.dao.dao;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferDaoTest {

	@Mock
	private PersistenceManager<SpecOffer, Long> persistenceManager;
	
	@InjectMocks
	private DefaultSpecOfferDao unit;
	
	@Test
	public void testGetSpecOffers() throws Exception {
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<SpecOffer> pagedSearch = new PagedSearch<SpecOffer>(offset, limit, Queries.FIND_SPECOFFERS, Collections.<String, Object> emptyMap(), SpecOffer.class);

		SpecOffer entity1 = new SpecOffer();
		List<SpecOffer> entities = Arrays.asList(entity1);
		PagedResult<SpecOffer> expected = new PagedResult<SpecOffer>(offset, limit, count, entities);
		
		// When
		when(persistenceManager.search(Matchers.<PagedSearch<SpecOffer>>any())).thenReturn(expected);
		PagedResult<SpecOffer> actual = unit.getSpecOffers(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}
}
