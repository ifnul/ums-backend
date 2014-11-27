package org.lnu.is.service.eduformtype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.eduformtype.EduFormTypeDao;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEduFormTypeServiceTest {

	@Mock
	private EduFormTypeDao defaultDao;
	
	@Mock
	private ParametersExtractor<EduFormType> parametersExtractor;
	
	@InjectMocks
	private DefaultEduFormTypeService unit;
	
	@Test
	public void testGetEduFormTypes() throws Exception {
		// Given
		PagedSearch<EduFormType> pagedSearch = new PagedSearch<>();

		Integer offset = 0;
		Integer limit = 20;
		long count = 100;
		List<EduFormType> entities = Collections.<EduFormType>emptyList();
		PagedResult<EduFormType> expected = new PagedResult<EduFormType>(offset, limit, count, entities);
		
		// When
		when(defaultDao.getEntities(Matchers.<PagedSearch<EduFormType>>any())).thenReturn(expected);
		PagedResult<EduFormType> actual = unit.getEduFormTypes(pagedSearch);

		// Then
		verify(defaultDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}
}
