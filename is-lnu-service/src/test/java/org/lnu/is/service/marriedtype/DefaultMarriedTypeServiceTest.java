package org.lnu.is.service.marriedtype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.marriedtype.MarriedTypeDao;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultMarriedTypeServiceTest {
	
	@Mock
	private MarriedTypeDao marriedTypeDao;

	@Mock
	private ParametersExtractor<MarriedType> parametersExtractor;
	
	@InjectMocks
	private DefaultMarriedTypeService unit;
	
	@Test
	public void testGetMarriedTypes() throws Exception {
		// Given
		int offset = 10;
		int limit = 38;
		int count = 99;

		PagedSearch<MarriedType> pagedSearch = new PagedSearch<>();

		List<MarriedType> entities = Collections.<MarriedType> emptyList();

		PagedResult<MarriedType> expected = new PagedResult<MarriedType>(
				offset, limit, count, entities);

		// When
		when(marriedTypeDao.getEntities(Matchers.<PagedSearch<MarriedType>> any())).thenReturn(expected);
		PagedResult<MarriedType> actual = unit.getMarriedTypes(pagedSearch);

		// Then
		verify(marriedTypeDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}

}
