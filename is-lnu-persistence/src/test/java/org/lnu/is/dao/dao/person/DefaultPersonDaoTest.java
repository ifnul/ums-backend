package org.lnu.is.dao.dao.person;

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
import org.lnu.is.domain.person.Person;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonDaoTest {

	@Mock
	private PersistenceManager<Person, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<Person> queryBuilder;

	@InjectMocks
	private DefaultPersonDao unit;
	
	@Test
	public void testGetPersons() throws Exception {
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<Person> pagedSearch = new PagedSearch<Person>(offset, limit, Queries.FIND_PERSONS, Collections.<String, Object> emptyMap(), Person.class);

		Person entity1 = new Person();
		List<Person> entities = Arrays.asList(entity1);
		PagedResult<Person> expected = new PagedResult<Person>(offset, limit, count, entities);
		
		// When
		when(persistenceManager.search(Matchers.<PagedSearch<Person>>any())).thenReturn(expected);
		PagedResult<Person> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}
}
