package org.lnu.is.dao.dao.gendertype;

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
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultGenderTypeTest {

	@Mock
	private PersistenceManager<GenderType, Long> persistenceManager;

	@Mock
	private QueryBuilder<GenderType> queryBuilder;

	@InjectMocks
	private DefaultGenderTypeDao unit;

	@Test
	public void testGetGenderTypes() throws Exception {
		// Given
		int offset = 10;
		int limit = 10;
		int count = 100;

		PagedSearch<GenderType> pagedSearch = new PagedSearch<GenderType>(offset, limit, Queries.FIND_GENDER_TYPES, Collections.<String, Object> emptyMap(),
				GenderType.class);

		GenderType entity = new GenderType();
		List<GenderType> entities = Arrays.asList(entity);
		PagedResult<GenderType> expected = new PagedResult<GenderType>(offset, limit, count, entities);

		// When
		when(persistenceManager.search(Matchers.<PagedSearch<GenderType>> any())).thenReturn(expected);
		PagedResult<GenderType> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}

}
