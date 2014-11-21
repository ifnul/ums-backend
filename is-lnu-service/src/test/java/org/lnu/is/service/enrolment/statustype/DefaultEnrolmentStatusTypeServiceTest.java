package org.lnu.is.service.enrolment.statustype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.enrolment.statustype.EnrolmentStatusTypeDao;
import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEnrolmentStatusTypeServiceTest {
	
	@Mock
	private EnrolmentStatusTypeDao enrolmentStatusTypeDao;
	
	@InjectMocks
	private DefaultEnrolmentStatusTypeService unit;
	
	@Test
	public void testCreateEnrolmentStatusType() throws Exception {
		
		// Given
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();

		// When
		unit.createEnrolmentStatusType(enrolmentStatusType);
		
		// Then
		verify(enrolmentStatusTypeDao).save(enrolmentStatusType);
	}
	
	@Test
	public void testUpdateEnrolmentStatusType() throws Exception {
		
		// Given
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();

		// When
		unit.updateEnrolmentStatusType(enrolmentStatusType);

		// Then
		verify(enrolmentStatusTypeDao).update(enrolmentStatusType);
	}
	
	@Test
	public void testGetEnrolmentStatusType() throws Exception {
		
		// Given
		Long id = 1L;

		EnrolmentStatusType expected = new EnrolmentStatusType();
		expected.setId(id);
		
		// When
		when(enrolmentStatusTypeDao.findById(anyLong())).thenReturn(expected);
		
		EnrolmentStatusType actual = unit.getEnrolmentStatusType(id);

		// Then
		verify(enrolmentStatusTypeDao).findById(id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveEnrolmentStatusType() throws Exception {
		
		// Given
		Long id = 1L;
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();
		enrolmentStatusType.setId(id);

		// When
		unit.removeEnrolmentStatusType(enrolmentStatusType);

		// Then
		verify(enrolmentStatusTypeDao).delete(enrolmentStatusType);
	}
	
	@Test
	public void testGetEnrolmentStatusTypes() throws Exception {
		
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		String query = "query";
		String queryName = "queryName";
		
		PagedSearch<EnrolmentStatusType> pagedSearch = new PagedSearch<EnrolmentStatusType>(offset, limit, new Queries(queryName, query), Collections.<String, Object> emptyMap(), EnrolmentStatusType.class);

		EnrolmentStatusType entity1 = new EnrolmentStatusType();
		List<EnrolmentStatusType> entities = Arrays.asList(entity1);
		PagedResult<EnrolmentStatusType> expected = new PagedResult<EnrolmentStatusType>(offset, limit, count, entities);
		
		// When
		when(enrolmentStatusTypeDao.getEntities(Matchers.<PagedSearch<EnrolmentStatusType>>any())).thenReturn(expected);
		
		PagedResult<EnrolmentStatusType> actual = unit.getEnrolmentStatusTypes(pagedSearch);

		// Then
		verify(enrolmentStatusTypeDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}

}