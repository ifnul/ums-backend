package org.lnu.is.dao.dao.enrolmentsubject;

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
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEnrolmentSubjectDaoTest {

	@Mock
	private PersistenceManager<EnrolmentSubject, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<EnrolmentSubject> queryBuilder;
	
	@InjectMocks
	private DefaultEnrolmentSubjectDao unit;
	
	@Test
	public void testGetEnrolmentSubjects() throws Exception {
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<EnrolmentSubject> pagedSearch = new PagedSearch<EnrolmentSubject>(offset, limit, Queries.FIND_PERSONS, Collections.<String, Object> emptyMap(), EnrolmentSubject.class);

		EnrolmentSubject entity1 = new EnrolmentSubject();
		List<EnrolmentSubject> entities = Arrays.asList(entity1);
		PagedResult<EnrolmentSubject> expected = new PagedResult<EnrolmentSubject>(offset, limit, count, entities);
		
		// When
		when(persistenceManager.search(Matchers.<PagedSearch<EnrolmentSubject>>any())).thenReturn(expected);
		PagedResult<EnrolmentSubject> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}
}
