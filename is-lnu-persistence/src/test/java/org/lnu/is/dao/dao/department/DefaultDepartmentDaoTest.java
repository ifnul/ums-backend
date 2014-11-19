package org.lnu.is.dao.dao.department;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDepartmentDaoTest {

	@Mock
	private PersistenceManager<Department, Long> persistenceManager;
	
	@Mock
	private QueryBuilder<Department> queryBuilder;
	
	@InjectMocks
	private DefaultDepartmentDao unit;
	
	@Test
	public void testSave() throws Exception {
		// Given
		String abbrName = "abbrName";
		Department entity = new Department();
		entity.setAbbrName(abbrName);

		// When
		unit.save(entity);

		// Then
		verify(persistenceManager).create(entity);
	}
	
	@Test
	public void testUpdate() throws Exception {
		// Given
		Department entity = new Department();
		
		// When
		unit.update(entity);

		// Then
		verify(persistenceManager).update(entity);
	}
	
	@Test
	public void testDelete() throws Exception {
		// Given
		Department entity = new Department();

		// When
		unit.delete(entity);

		// Then
		verify(persistenceManager).remove(entity);
	}
	
	@Test
	public void testFindById() throws Exception {
		// Given
		Long id = 1L;
		Department expected = new Department();
		
		// When
		when(persistenceManager.findById(Matchers.<Class<Department>>any(), anyLong())).thenReturn(expected);
		Department actual = unit.findById(id);

		// Then
		verify(persistenceManager).findById(Department.class, id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetDepartments() throws Exception {
		// Given
		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<Department> pagedSearch = new PagedSearch<Department>(offset, limit, Queries.FIND_SPECIALTIES, Collections.<String, Object> emptyMap(), Department.class);

		Department entity1 = new Department();
		List<Department> entities = Arrays.asList(entity1);
		PagedResult<Department> expected = new PagedResult<Department>(offset, limit, count, entities);
		
		// When
		when(persistenceManager.search(Matchers.<PagedSearch<Department>>any())).thenReturn(expected);
		PagedResult<Department> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}
}
