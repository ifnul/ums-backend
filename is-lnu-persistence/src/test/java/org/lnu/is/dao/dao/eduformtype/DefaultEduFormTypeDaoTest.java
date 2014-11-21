package org.lnu.is.dao.dao.eduformtype;

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
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEduFormTypeDaoTest {

	@Mock
	private PersistenceManager<EduFormType, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<EduFormType> queryBuilder;
	
	@InjectMocks
	private DefaultEduFormTypeDao unit;
	
	@Test
	public void testGetEduFormTypes() throws Exception {
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		String query = "query";
		String queryName = "queryName";
		
		PagedSearch<EduFormType> pagedSearch = new PagedSearch<EduFormType>(offset, limit, new Queries(queryName, query), Collections.<String, Object> emptyMap(), EduFormType.class);
		EduFormType entity1 = new EduFormType();
		List<EduFormType> entities = Arrays.asList(entity1);
		PagedResult<EduFormType> expected = new PagedResult<EduFormType>(offset, limit, count, entities);
		
		// When
		when(persistenceManager.search(Matchers.<PagedSearch<EduFormType>>any())).thenReturn(expected);
		PagedResult<EduFormType> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}
}
