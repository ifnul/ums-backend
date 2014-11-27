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
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferServiceTest {

	@Mock
	private SpecOfferDao defaultDao;
	
	@Mock
	private ParametersExtractor<SpecOffer> parametersExtractor;
	
	@InjectMocks
	private DefaultSpecOfferService unit;
	
	@Test
	public void testCreateSpecOffer() throws Exception {
		// Given
		SpecOffer specOffer = new SpecOffer();

		// When
		unit.createSpecOffer(specOffer);
		
		// Then
		verify(defaultDao).save(specOffer);
	}
	
	@Test
	public void testUpdateSpecOffer() throws Exception {
		// Given
		SpecOffer specOffer = new SpecOffer();

		// When
		unit.updateSpecOffer(specOffer);

		// Then
		verify(defaultDao).update(specOffer);
	}
	
	@Test
	public void testGetSpecOffer() throws Exception {
		// Given
		Long id = 1L;

		SpecOffer expected = new SpecOffer();
		expected.setId(id);
		
		// When
		when(defaultDao.findById(anyLong())).thenReturn(expected);
		
		SpecOffer actual = unit.getSpecOffer(id);

		// Then
		verify(defaultDao).findById(id);
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
		verify(defaultDao).delete(specOffer);
	}
	
	@Test
	public void testGetSpecOffers() throws Exception {
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<SpecOffer> pagedSearch = new PagedSearch<SpecOffer>(offset, limit, Collections.<String, Object> emptyMap(), SpecOffer.class);

		SpecOffer entity1 = new SpecOffer();
		List<SpecOffer> entities = Arrays.asList(entity1);
		PagedResult<SpecOffer> expected = new PagedResult<SpecOffer>(offset, limit, count, entities);
		
		// When
		when(defaultDao.getEntities(Matchers.<PagedSearch<SpecOffer>>any())).thenReturn(expected);
		
		PagedResult<SpecOffer> actual = unit.getSpecOffers(pagedSearch);

		// Then
		verify(defaultDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}
}
