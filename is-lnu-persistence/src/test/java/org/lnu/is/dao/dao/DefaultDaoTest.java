package org.lnu.is.dao.dao;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
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
import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.MultiplePagedQuerySearch;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Query;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDaoTest {

	@Mock
	private PersistenceManager<Department, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<Department> queryBuilder;
	
	@InjectMocks
	private DefaultDao<Department, Long> unit;

	@Before
	public void setup() {
		unit.setEntityClass(Department.class);
	}
	
	@Test
	public void testFindById() throws Exception {
		// Given
		Long id = 1L;
		String abbrName = "abbr name";
		String name = "name";
		
		Department expected = new Department();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		// When
		when(persistenceManager.findById(Matchers.<Class<Department>>any(), anyLong())).thenReturn(expected);
		Department actual = unit.getEntityById(id);

		// Then
		verify(persistenceManager).findById(Department.class, id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSave() throws Exception {
		// Given
		Long id = 1L;
		String abbrName = "abbr name";
		String name = "name";
		
		Department entity = new Department();
		entity.setId(id);
		entity.setAbbrName(abbrName);
		entity.setName(name);
		
		// When
		unit.save(entity);
		
		// Then
		verify(persistenceManager).create(entity);
	}
	
	@Test
	public void testUpdate() throws Exception {
		// Given
		Long id = 1L;
		String abbrName = "abbr name";
		String name = "name";
		
		Department entity = new Department();
		entity.setId(id);
		entity.setAbbrName(abbrName);
		entity.setName(name);
		
		// When
		unit.update(entity);
		
		// Then
		verify(persistenceManager).update(entity);
	}
	
	@Test
	public void testDelete() throws Exception {
		// Given
		Long id = 1L;
		String abbrName = "abbr name";
		String name = "name";
		
		Department entity = new Department();
		entity.setId(id);
		entity.setAbbrName(abbrName);
		entity.setName(name);
		
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
		Class<Department> clazz = Department.class;
		Department entity1 = new Department();
		
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<Department>(offset, limit, parameters, clazz);
		pagedSearch.setEntity(entity1);
		long count = 100;
		List<Department> entities = Arrays.asList(entity1);
		PagedResult<Department> expected = new PagedResult<Department>(offset, limit, count, entities);
		
		String querySql = "query Sql";
		Query<Department> queries = new Query<Department>(Department.class, querySql);
		MultiplePagedQuerySearch<Department> pagedQuerySearch = new MultiplePagedQuerySearch<Department>(queries, pagedSearch.getOffset(), 
				pagedSearch.getLimit(), pagedSearch.getParameters(), Department.class);
		
		// When
		when(queryBuilder.build(Matchers.<MultiplePagedSearch<Department>>any())).thenReturn(querySql);
		when(persistenceManager.search(Matchers.<MultiplePagedQuerySearch<Department>>any())).thenReturn(expected);
		PagedResult<Department> actual = unit.getEntities(pagedSearch);

		// Then
		verify(queryBuilder).build(pagedSearch);
		verify(persistenceManager).search(pagedQuerySearch);
		assertEquals(expected, actual);
	}
}
