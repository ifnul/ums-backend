package org.lnu.is.dao.dao;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.person.entrant.PersonEntrant;
import org.lnu.is.pagination.MultiplePagedQuerySearch;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Query;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultViewDaoTest {
	
	@Mock
	private PersistenceManager<PersonEntrant, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<PersonEntrant> queryBuilder;
	
	@InjectMocks
	private DefaultViewDao<PersonEntrant, Long> unit;

	@Before
	public void setup() {
		unit.setEntityClass(PersonEntrant.class);
	}
	
	@Test
	public void testFindById() throws Exception {
		// Given
		Long id = 1L;
		
		PersonEntrant expected = new PersonEntrant();
		expected.setId(id);
		
		String querySql = String.format("SELECT e FROM %s WHERE e.id=:id ", PersonEntrant.class.getSimpleName());
		Map<String, Object> parameters = Collections.<String, Object>singletonMap("id", id);
		
		Query<PersonEntrant> query = new Query<PersonEntrant>(PersonEntrant.class, querySql, parameters);

		// When
		when(persistenceManager.getSingleResult(Matchers.<Query<PersonEntrant>>any())).thenReturn(expected);
		PersonEntrant actual = unit.getEntityById(id);

		// Then
		verify(persistenceManager).getSingleResult(query);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSave() throws Exception {
		// Given
		Long id = 1L;
		
		PersonEntrant entity = new PersonEntrant();
		entity.setId(id);
		
		// When
		unit.save(entity);
		
		// Then
		verify(persistenceManager).create(entity);
	}
	
	@Test
	public void testUpdate() throws Exception {
		// Given
		Long id = 1L;
		
		PersonEntrant entity = new PersonEntrant();
		entity.setId(id);
		
		// When
		unit.update(entity);
		
		// Then
		verify(persistenceManager).update(entity);
	}
	
	@Test
	public void testDelete() throws Exception {
		// Given
		Long id = 1L;
		
		PersonEntrant entity = new PersonEntrant();
		entity.setId(id);
		
		// When
		unit.delete(entity);

		// Then
		verify(persistenceManager).remove(entity);
	}
	
	@Test
	public void testGetEntities() throws Exception {
		// Given
		Integer offset = 0;
		Integer limit = 20;
		Map<String, Object> parameters = Collections.emptyMap();
		Class<PersonEntrant> clazz = PersonEntrant.class;
		PersonEntrant entity1 = new PersonEntrant();
		
		MultiplePagedSearch<PersonEntrant> pagedSearch = new MultiplePagedSearch<PersonEntrant>(offset, limit, parameters, clazz);
		pagedSearch.setEntity(entity1);
		long count = 100;
		List<PersonEntrant> entities = Arrays.asList(entity1);
		PagedResult<PersonEntrant> expected = new PagedResult<PersonEntrant>(offset, limit, count, entities);
		
		String querySql = "query Sql";
		Query<PersonEntrant> queries = new Query<PersonEntrant>(PersonEntrant.class, querySql);
		MultiplePagedQuerySearch<PersonEntrant> pagedQuerySearch = new MultiplePagedQuerySearch<PersonEntrant>(queries, pagedSearch.getOffset(), 
				pagedSearch.getLimit(), pagedSearch.getParameters(), PersonEntrant.class);
		
		// When
		when(queryBuilder.build(Matchers.<MultiplePagedSearch<PersonEntrant>>any())).thenReturn(querySql);
		when(persistenceManager.search(Matchers.<MultiplePagedQuerySearch<PersonEntrant>>any())).thenReturn(expected);
		PagedResult<PersonEntrant> actual = unit.getEntities(pagedSearch);

		// Then
		verify(queryBuilder).build(pagedSearch);
		verify(persistenceManager).search(pagedQuerySearch);
		assertEquals(expected, actual);
	}
}
