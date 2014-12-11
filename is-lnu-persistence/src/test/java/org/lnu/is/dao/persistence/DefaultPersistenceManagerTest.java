package org.lnu.is.dao.persistence;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.exception.EntityNotFoundException;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.PagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Query;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersistenceManagerTest {

	@Mock
	private TypedQuery<Department> typedQuery;

	@Mock
	private TypedQuery<Long> typedLongQuery;
	
	@Mock
    private EntityManager entityManager;
	
	@InjectMocks
	private DefaultPersistenceManager<Department, Long> unit;
	
	@Test
	public void testCreate() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbrName";
		
		Department expected = new Department();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		// When
		Department actual = unit.create(expected);

		// Then
		verify(entityManager).persist(expected);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFindById() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		
		Class<Department> clazz = Department.class;
		Department expected = new Department();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);

		// When
		when(entityManager.find(Matchers.<Class<Department>>any(), anyLong())).thenReturn(expected);
		Department actual = unit.findById(clazz, id);

		// Then
		verify(entityManager).find(clazz, id);
		assertEquals(expected, actual);
	}

	@Test(expected = EntityNotFoundException.class)
	public void testFindByIdWithDeletedStatus() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		
		Class<Department> clazz = Department.class;
		Department expected = new Department();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setStatus(RowStatus.DELETED);
		
		// When
		when(entityManager.find(Matchers.<Class<Department>>any(), anyLong())).thenReturn(expected);
		unit.findById(clazz, id);
	}

	@Test(expected = EntityNotFoundException.class)
	public void testFindByIdWithEmptyEntity() throws Exception {
		// Given
		Long id = 1L;
		Class<Department> clazz = Department.class;

		// When
		when(entityManager.find(Matchers.<Class<Department>>any(), anyLong())).thenReturn(null);
		unit.findById(clazz, id);
	}
	
	@Test
	public void testUpdate() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		
		Department expected = new Department();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		// When
		when(entityManager.merge(any(Department.class))).thenReturn(expected);
		Department actual = unit.update(expected);

		// Then
		verify(entityManager).merge(expected);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemove() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		
		Department entity = new Department();
		entity.setId(id);
		entity.setAbbrName(abbrName);
		entity.setName(name);
		
		// When
		unit.remove(entity);
		entity.setActual(0);
		entity.setStatus(RowStatus.DELETED);
		
		// Then
		verify(entityManager).merge(entity);
	}
	
	@Test
	public void testSearch() throws Exception {
		// Given
		String querySql = "SELECT d FROM Department d";
		Query<Department> query = new Query<Department>(Department.class, querySql);
		Integer offset = 0;
		Integer limit = 20;
		Map<String, Object> parameters = Collections.emptyMap();
		Class<Department> clazz = Department.class;
		PagedQuerySearch<Department> request = new PagedQuerySearch<Department>(query, offset, limit, parameters, clazz);
		
		long count = 100L;
		Department entity1 = new Department();
		List<Department> entities = Arrays.asList(entity1);
		PagedResult<Department> expected = new PagedResult<Department>(request.getOffset(), request.getLimit(), count , entities);
		
		// When
		when(typedQuery.getResultList()).thenReturn(entities);
		when(typedLongQuery.getSingleResult()).thenReturn(count);

		when(entityManager.createQuery("SELECT d FROM Department d", Department.class)).thenReturn(typedQuery);
		when(entityManager.createQuery("SELECT COUNT(*) FROM Department a WHERE a IN(SELECT d FROM Department d) ", Long.class)).thenReturn(typedLongQuery);
		
		PagedResult<Department> actual = unit.search(request);

		// Then
		verify(typedQuery, times(0)).setParameter(anyString(), any());
		verify(typedLongQuery, times(0)).setParameter(anyString(), any());
		
		verify(typedQuery).getResultList();
		verify(typedLongQuery).getSingleResult();
		verify(typedQuery).setFirstResult(offset);
		verify(typedQuery).setMaxResults(limit);
		assertEquals(expected, actual);
	}

	@Test
	public void testSearchWithParameters() throws Exception {
		// Given
		String querySql = "SELECT d FROM Department d";
		Query<Department> query = new Query<Department>(Department.class, querySql);
		Integer offset = 0;
		Integer limit = 20;
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter1", new Object());
		parameters.put("parameter2", new Object());
		
		Class<Department> clazz = Department.class;
		PagedQuerySearch<Department> request = new PagedQuerySearch<Department>(query, offset, limit, parameters, clazz);
		
		long count = 100L;
		Department entity1 = new Department();
		List<Department> entities = Arrays.asList(entity1);
		PagedResult<Department> expected = new PagedResult<Department>(request.getOffset(), request.getLimit(), count , entities);
		
		// When
		when(typedQuery.getResultList()).thenReturn(entities);
		when(typedLongQuery.getSingleResult()).thenReturn(count);
		
		when(entityManager.createQuery("SELECT d FROM Department d", Department.class)).thenReturn(typedQuery);
		when(entityManager.createQuery("SELECT COUNT(*) FROM Department a WHERE a IN(SELECT d FROM Department d) ", Long.class)).thenReturn(typedLongQuery);
		
		PagedResult<Department> actual = unit.search(request);
		
		// Then
		verify(typedQuery, times(2)).setParameter(anyString(), any());
		verify(typedLongQuery, times(2)).setParameter(anyString(), any());
		
		verify(typedQuery).getResultList();
		verify(typedLongQuery).getSingleResult();
		verify(typedQuery).setFirstResult(offset);
		verify(typedQuery).setMaxResults(limit);
		assertEquals(expected, actual);
	}
}