package org.lnu.is.service.person.paper;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.person.paper.PersonPaperDao;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonPaperServiceTest {

	@Mock
	private PersonPaperDao personPaperDao;
	
	@Mock
	private ParametersExtractor<PersonPaper> parametersExtractor;
	
	@InjectMocks
	private DefaultPersonPaperService unit;

	@Test
	public void testCreatePersonPaper() throws Exception {
		// Given
		PersonPaper expected = new PersonPaper();

		// When
		unit.createPersonPaper(expected);

		// Then
		verify(personPaperDao).save(expected);
	}
	
	@Test
	public void testUpdatePersonPaper() throws Exception {
		// Given
		PersonPaper personPaperPaper = new PersonPaper();

		// When
		unit.updatePersonPaper(personPaperPaper);

		// Then
		verify(personPaperDao).update(personPaperPaper);
	}
	
	@Test
	public void testGetPersonPaper() throws Exception {
		// Given
		Long id = 1L;
		PersonPaper expected = new PersonPaper();
		expected.setId(id);

		// When
		when(personPaperDao.findById(anyLong())).thenReturn(expected);
		PersonPaper actual = unit.getPersonPaper(id);

		// Then
		verify(personPaperDao).findById(id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemovePersonPaper() throws Exception {
		// Given
		PersonPaper personPaper = new PersonPaper();

		// When
		unit.removePersonPaper(personPaper);

		// Then
		verify(personPaperDao).delete(personPaper);
	}
	
	@Test
	public void testGetPersonPapers() throws Exception {
		// Given
		PagedSearch<PersonPaper> pagedSearch = new PagedSearch<>();
		
		PersonPaper personPaper = new PersonPaper();
		Integer offset = 0;
		Integer limit = 100;
		long count = 200;
		List<PersonPaper> entities = Arrays.asList(personPaper);
		PagedResult<PersonPaper> expected = new PagedResult<PersonPaper>(offset, limit, count, entities);
		
		// When
		when(personPaperDao.getEntities(Matchers.<PagedSearch<PersonPaper>>any())).thenReturn(expected);
		PagedResult<PersonPaper> actual = unit.getPersonPapers(pagedSearch);

		// Then
		verify(personPaperDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}
}
