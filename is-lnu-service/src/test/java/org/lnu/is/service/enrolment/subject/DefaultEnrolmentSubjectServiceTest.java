package org.lnu.is.service.enrolment.subject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.enrolment.subject.EnrolmentSubjectDao;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.extractor.ParametersExtractor;
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
	
	@Mock
	private ParametersExtractor<EnrolmentSubject> parametersExtractor;
	
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
		when(enrolmentSubjectDao.getEntities(Matchers.<PagedSearch<EnrolmentSubject>>any())).thenReturn(expected);
		PagedResult<EnrolmentSubject> actual = unit.getEnrolmentSubjects(pagedSearch);

		// Then
		verify(enrolmentSubjectDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}
}
