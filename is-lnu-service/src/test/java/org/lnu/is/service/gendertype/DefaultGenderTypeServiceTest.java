package org.lnu.is.service.gendertype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.gendertype.GenderTypeDao;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultGenderTypeServiceTest {

	@Mock
	private GenderTypeDao defaultDao;

	@Mock
	private ParametersExtractor<GenderType> parametersExtractor;

	@InjectMocks
	private DefaultGenderTypeService unit;

	@Test
	public void testGetGenderTypes() throws Exception {
		// Given
		PagedSearch<GenderType> pagedSearch = new PagedSearch<>();

		int offset = 10;
		int limit = 10;
		int count = 100;

		List<GenderType> entities = Collections.<GenderType> emptyList();
		PagedResult<GenderType> expected = new PagedResult<GenderType>(offset, limit, count, entities);

		// When
		when(defaultDao.getEntities(Matchers.<PagedSearch<GenderType>> any())).thenReturn(expected);
		PagedResult<GenderType> actual = unit.getGenderTypes(pagedSearch);

		// Then
		verify(defaultDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}
}
