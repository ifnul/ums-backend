package org.lnu.is.service.enrolmentsubject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.enrolmentsubject.EnrolmentSubjectDao;
import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEnrolmentSubjectServiceTest {

	@Mock
	private EnrolmentSubjectDao enrolmentSubjectDao;
	
	@InjectMocks
	private DefaultEnrolmentSubjectService unit;
	
	@Test
	public void testGetEnrolmentSubjects() throws Exception {
		// Given
		PagedSearch<EnrolmentSubject> pagedSearch = new PagedSearch<>();

		Integer offset = 0;
		Integer limit = 20;
		long count = 100;
		List<EnrolmentSubject> entities = Collections.<EnrolmentSubject>emptyList();
		PagedResult<EnrolmentSubject> expected = new PagedResult<EnrolmentSubject>(offset, limit, count, entities);
		
		// When
		when(enrolmentSubjectDao.getEnrolmentSubjects(Matchers.<PagedSearch<EnrolmentSubject>>any())).thenReturn(expected);
		PagedResult<EnrolmentSubject> actual = unit.getEnrolmentSubjects(pagedSearch);

		// Then
		verify(enrolmentSubjectDao).getEnrolmentSubjects(pagedSearch);
		assertEquals(expected, actual);
	}
}
