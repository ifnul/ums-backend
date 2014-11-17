package org.lnu.is.service.persontype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.persontype.PersonTypeDao;
import org.lnu.is.domain.persontype.PersonType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonTypeServiceTest {
	
	@Mock
	private PersonTypeDao personTypeDao;
	
	@Mock
	private ParametersExtractor<PersonType> parametersExtractor;
	
	@InjectMocks
	private DefaultPersonTypeService unit;
	
	@Test
	public void testGetPersons() throws Exception {
		// Given
		PagedSearch<PersonType> pagedSearch = new PagedSearch<>();
		
		PersonType person = new PersonType();
		Integer offset = 0;
		Integer limit = 100;
		long count = 200;
		List<PersonType> entities = Arrays.asList(person);
		PagedResult<PersonType> expected = new PagedResult<PersonType>(offset, limit, count, entities);
		
		// When
		when(personTypeDao.getEntities(Matchers.<PagedSearch<PersonType>>any())).thenReturn(expected);
		PagedResult<PersonType> actual = unit.getPersonTypes(pagedSearch);

		// Then
		verify(personTypeDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}
}
