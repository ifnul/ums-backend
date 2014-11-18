package org.lnu.is.service.specoffertype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.specoffertype.SpecOfferTypeDao;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferTypeServiceTest {
	
	@Mock
	private SpecOfferTypeDao enrolmentSubjectDao;
	
	@Mock
	private ParametersExtractor<SpecOfferType> parametersExtractor;
	
	@InjectMocks
	private DefaultSpecOfferTypeService unit;
	
	@Test
	public void testGetSpecOfferTypes() throws Exception {
		// Given
		PagedSearch<SpecOfferType> pagedSearch = new PagedSearch<>();

		Integer offset = 0;
		Integer limit = 20;
		long count = 100;
		List<SpecOfferType> entities = Collections.<SpecOfferType>emptyList();
		PagedResult<SpecOfferType> expected = new PagedResult<SpecOfferType>(offset, limit, count, entities);
		
		// When
		when(enrolmentSubjectDao.getEntities(Matchers.<PagedSearch<SpecOfferType>>any())).thenReturn(expected);
		PagedResult<SpecOfferType> actual = unit.getSpecOfferTypes(pagedSearch);

		// Then
		verify(enrolmentSubjectDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}
}
