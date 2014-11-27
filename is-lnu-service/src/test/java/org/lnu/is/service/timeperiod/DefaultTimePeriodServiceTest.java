package org.lnu.is.service.timeperiod;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.timeperiod.TimePeriodDao;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultTimePeriodServiceTest {
	
	@Mock
	private TimePeriodDao defaultDao;
	
	@Mock
	private ParametersExtractor<TimePeriod> parametersExtractor;
	
	@InjectMocks
	private DefaultTimePeriodService unit;
	
	@Test
	public void testGetSpecialties() throws Exception {
		// Given
		PagedSearch<TimePeriod> pagedSearch = new PagedSearch<>();
		
		TimePeriod timePeriod = new TimePeriod();
		Integer offset = 0;
		Integer limit = 100;
		long count = 200;
		List<TimePeriod> entities = Arrays.asList(timePeriod);
		PagedResult<TimePeriod> expected = new PagedResult<TimePeriod>(offset, limit, count, entities);
		
		// When
		when(defaultDao.getEntities(Matchers.<PagedSearch<TimePeriod>>any())).thenReturn(expected);
		PagedResult<TimePeriod> actual = unit.getTimePeriods(pagedSearch);

		// Then
		verify(defaultDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}	
}
