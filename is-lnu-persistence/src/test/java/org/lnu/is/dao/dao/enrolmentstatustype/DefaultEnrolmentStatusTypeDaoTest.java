package org.lnu.is.dao.dao.enrolmentstatustype;

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
import org.lnu.is.domain.enrolmentstatustype.EnrolmentStatusType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEnrolmentStatusTypeDaoTest {
	
	@Mock
	private PersistenceManager<EnrolmentStatusType, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<EnrolmentStatusType> queryBuilder;
	
	@InjectMocks
	private DefaultEnrolmentStatusTypeDao unit;
	
	@Test
	public void testGetEnrolmentStatusTypes() throws Exception {
		
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<EnrolmentStatusType> pagedSearch = new PagedSearch<EnrolmentStatusType>(offset, limit, Queries.FIND_SPECOFFERS, Collections.<String, Object> emptyMap(), EnrolmentStatusType.class);

		EnrolmentStatusType entity1 = new EnrolmentStatusType();
		List<EnrolmentStatusType> entities = Arrays.asList(entity1);
		PagedResult<EnrolmentStatusType> expected = new PagedResult<EnrolmentStatusType>(offset, limit, count, entities);
		
		// When
		when(persistenceManager.search(Matchers.<PagedSearch<EnrolmentStatusType>>any())).thenReturn(expected);
		PagedResult<EnrolmentStatusType> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}
	
}