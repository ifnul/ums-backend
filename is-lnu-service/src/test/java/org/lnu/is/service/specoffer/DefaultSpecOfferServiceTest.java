package org.lnu.is.service.specoffer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.specoffer.SpecOfferDao;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferServiceTest {

	@Mock
	private SpecOfferDao specOfferDao;
	
	@InjectMocks
	private DefaultSpecOfferService unit;
	
	@Test
	public void testCreateSpecOffer() throws Exception {
		// Given
		SpecOffer specOffer = new SpecOffer();

		// When
		unit.createSpecOffer(specOffer);
		
		// Then
		verify(specOfferDao).save(specOffer);
	}
	
	@Test
	public void testUpdateSpecOffer() throws Exception {
		// Given
		SpecOffer specOffer = new SpecOffer();

		// When
		unit.updateSpecOffer(specOffer);

		// Then
		verify(specOfferDao).update(specOffer);
	}
	
	@Test
	public void testGetSpecOffer() throws Exception {
		// Given
		Long id = 1L;

		SpecOffer expected = new SpecOffer();
		expected.setId(id);
		
		// When
		when(specOfferDao.findById(anyLong())).thenReturn(expected);
		
		SpecOffer actual = unit.getSpecOffer(id);

		// Then
		verify(specOfferDao).findById(id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveSpecOffer() throws Exception {
		// Given
		Long id = 1L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(id);

		// When
		unit.removeSpecOffer(specOffer);

		// Then
		verify(specOfferDao).delete(specOffer);
	}
	
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
		when(specOfferDao.getSpecOffers(Matchers.<PagedSearch<SpecOffer>>any())).thenReturn(expected);
		
		PagedResult<SpecOffer> actual = unit.getSpecOffers(pagedSearch);

		// Then
		verify(specOfferDao).getSpecOffers(pagedSearch);
		assertEquals(expected, actual);
	}
}
