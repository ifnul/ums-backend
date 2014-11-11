package org.lnu.is.facade.facade.timeperiod;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.timeperiod.DefaultTimePeriodFacade;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.TimePeriodResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.lnu.is.service.timeperiod.TimePeriodService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultTimePeriodFacadeTest {

	@Mock
	private TimePeriodService timePeriodService;

	@Mock
	private Converter<TimePeriod, TimePeriodResource> timePeriodConverter;
	
	@Mock
	private Converter<PagedRequest<TimePeriodResource>, PagedSearch<TimePeriod>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@InjectMocks
	private DefaultTimePeriodFacade unit;

	@Test
	public void testGetTimePeriods() throws Exception {
		// Given
		PagedRequest<TimePeriodResource> pagedRequest = new PagedRequest<TimePeriodResource>(new TimePeriodResource(), 10, 10);
		List<TimePeriodResource> funnyResources = Collections.singletonList(new TimePeriodResource());
		PagedResultResource<TimePeriodResource> expected = new PagedResultResource<>("/timeperiods");
		expected.setEntities(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<TimePeriod> pagedSearch = new PagedSearch<TimePeriod>(offset, limit, Queries.FIND_SPECOFFERS, Collections.<String, Object> emptyMap(), TimePeriod.class);
		List<TimePeriod> entities = Arrays.asList(new TimePeriod());
		PagedResult<TimePeriod> pagedResult = new PagedResult<TimePeriod>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<TimePeriodResource>>any())).thenReturn(pagedSearch);
		when(timePeriodService.getTimePeriods(Matchers.<PagedSearch<TimePeriod>> any())).thenReturn(pagedResult);
		when(timePeriodConverter.convertAll(anyListOf(TimePeriod.class))).thenReturn(funnyResources);

		PagedResultResource<TimePeriodResource> actual = unit.getTimePeriods(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(timePeriodService).getTimePeriods(pagedSearch);
		verify(timePeriodConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expected);

		assertEquals(expected, actual);
	}
}
