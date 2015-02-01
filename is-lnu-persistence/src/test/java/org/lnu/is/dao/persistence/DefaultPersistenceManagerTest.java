package org.lnu.is.dao.persistence;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
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

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.enhancers.Enhancer;
import org.lnu.is.dao.exception.EntityNotFoundException;
import org.lnu.is.dao.model.DaoMethod;
import org.lnu.is.dao.verifier.VerifierChainLink;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.user.User;
import org.lnu.is.pagination.MultiplePagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Query;
import org.lnu.is.security.exception.AccessDeniedException;
import org.lnu.is.security.service.SessionService;
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
	
	@Mock
	private SessionService sessionService;

    private Map<DaoMethod, VerifierChainLink<? super Object>> persistenceChains;

    private Map<DaoMethod, Enhancer<? super Object>> persistenceEnhancers;
	
	@InjectMocks
	private DefaultPersistenceManager<Department, Long> unit;

	@Mock
	private VerifierChainLink<? super Object> createVerifier;

	@Mock
	private VerifierChainLink<? super Object> singleGetVerifier;

	@Mock
	private VerifierChainLink<? super Object> multipleGetVerifier;

	@Mock
	private VerifierChainLink<? super Object> updateVerifier;

	@Mock
	private Enhancer<? super Object> createEnhancer;
	
	@Mock
	private Enhancer<? super Object> deleteEnhancer;
	
	@Before
	public void setup() {
		persistenceChains = new HashMap<DaoMethod, VerifierChainLink<? super Object>>();
		persistenceChains.put(DaoMethod.CREATE, createVerifier);
		persistenceChains.put(DaoMethod.SINGLE_GET, singleGetVerifier);
		persistenceChains.put(DaoMethod.MULTIPLE_GET, multipleGetVerifier);
		persistenceChains.put(DaoMethod.UPDATE, updateVerifier);
		
		persistenceEnhancers = new HashMap<>();
		persistenceEnhancers.put(DaoMethod.CREATE, createEnhancer);
		persistenceEnhancers.put(DaoMethod.DELETE, deleteEnhancer);
		
		unit.setPersistenceChains(persistenceChains);
		unit.setPersistenceEnhancers(persistenceEnhancers);
	}
	
	@Test
	public void testCreate() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbrName";
		
		String groupTitle = "group";
		String login = "login";
		User user = new User();
		user.setLogin(login);
		Group group = new Group();
		group.setTitle(groupTitle);

		Department expected = new Department();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setCrtUser(user.getLogin());
		expected.setCrtUserGroup(group.getTitle());
		
		// When
		when(sessionService.getUser()).thenReturn(user);
		when(sessionService.getDefaultGroup()).thenReturn(group);
		
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
		String group = "developers";
		
		Class<Department> clazz = Department.class;
		Department expected = new Department();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setCrtUserGroup(group);

		// When
		when(entityManager.find(Matchers.<Class<Department>>any(), anyLong())).thenReturn(expected);
		Department actual = unit.findById(clazz, id);

		// Then
		verify(singleGetVerifier).verify(expected);
		verify(entityManager).find(clazz, id);
		assertEquals(expected, actual);
	}
	
	@Test(expected = AccessDeniedException.class)
	public void testFindByIdWithAccessDeniedException() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		String group = "developers";
		
		Class<Department> clazz = Department.class;
		Department expected = new Department();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setCrtUserGroup(group);
		
		// When
		when(entityManager.find(Matchers.<Class<Department>>any(), anyLong())).thenReturn(expected);
		doThrow(AccessDeniedException.class).when(singleGetVerifier).verify(any());
		Department actual = unit.findById(clazz, id);
		
		// Then
		verify(singleGetVerifier).verify(expected);
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
		doThrow(EntityNotFoundException.class).when(singleGetVerifier).verify(any());
		unit.findById(clazz, id);
	}

	@Test(expected = EntityNotFoundException.class)
	public void testFindByIdWithEmptyEntity() throws Exception {
		// Given
		Long id = 1L;
		Class<Department> clazz = Department.class;

		// When
		when(entityManager.find(Matchers.<Class<Department>>any(), anyLong())).thenReturn(null);
		doThrow(EntityNotFoundException.class).when(singleGetVerifier).verify(any());
		unit.findById(clazz, id);
	}
	
	@Test
	public void testUpdate() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		String group = "developers";
		
		Department expected = new Department();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setCrtUserGroup(group);
		
		// When
		when(entityManager.merge(any(Department.class))).thenReturn(expected);
		Department actual = unit.update(expected);

		// Then
		verify(updateVerifier).verify(expected);
		verify(entityManager).merge(expected);
		assertEquals(expected, actual);
	}
	
	@Test(expected = AccessDeniedException.class)
	public void testUpdateWithAccessDenied() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		String group = "developers";
		
		Department expected = new Department();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setCrtUserGroup(group);
		
		// When
		when(entityManager.merge(any(Department.class))).thenReturn(expected);
		doThrow(AccessDeniedException.class).when(updateVerifier).verify(expected);
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
		String group = "developers";
		
		Department entity = new Department();
		entity.setId(id);
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setCrtUserGroup(group);
		
		// When
		unit.remove(entity);
		
		// Then
		verify(updateVerifier).verify(entity);
		entity.setActual(0);
		entity.setStatus(RowStatus.DELETED);
		verify(entityManager).merge(entity);
	}
	
	@Test(expected = AccessDeniedException.class)
	public void testRemoveWithAccessException() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		String group = "developers";
		
		Department entity = new Department();
		entity.setId(id);
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setCrtUserGroup(group);
		
		// When
		doThrow(AccessDeniedException.class).when(updateVerifier).verify(any());
		unit.remove(entity);
		
		// Then
		entity.setActual(0);
		entity.setStatus(RowStatus.DELETED);
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
		MultiplePagedQuerySearch<Department> request = new MultiplePagedQuerySearch<Department>(query, offset, limit, parameters, clazz);
		
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
		MultiplePagedQuerySearch<Department> request = new MultiplePagedQuerySearch<Department>(query, offset, limit, parameters, clazz);
		
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
	
	@Test
	public void testGetSingleResult() throws Exception {
		String querySql = "SELECT d FROM Department d WHERE d.abbrName = :abbrName";
		String abbrName = "abbr name";
		Map<String, Object> parameters = Collections.<String, Object>singletonMap("abbrName", abbrName);
		// Given
		Query<Department> query = new Query<Department>(Department.class, querySql, parameters);

		Department expected = new Department();
		
		// When
		when(entityManager.createQuery(anyString(), Matchers.<Class<Department>>any())).thenReturn(typedQuery);
		when(typedQuery.getSingleResult()).thenReturn(expected);
		Department actual = unit.getSingleResult(query);

		// Then
		verify(entityManager).createQuery(querySql, query.getClazz());
		verify(typedQuery).getSingleResult();
		verify(typedQuery).setParameter("abbrName", abbrName);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetMultipleResult() throws Exception {
		String querySql = "SELECT d FROM Department d WHERE d.abbrName = :abbrName";
		String abbrName = "abbr name";
		Map<String, Object> parameters = Collections.<String, Object>singletonMap("abbrName", abbrName);
		// Given
		Query<Department> query = new Query<Department>(Department.class, querySql, parameters);
		
		Department department = new Department();
		List<Department> expected = Arrays.asList(department);
		
		// When
		when(entityManager.createQuery(anyString(), Matchers.<Class<Department>>any())).thenReturn(typedQuery);
		when(typedQuery.getResultList()).thenReturn(expected);
		List<Department> actual = unit.getMultipleResult(query);
		
		// Then
		verify(entityManager).createQuery(querySql, query.getClazz());
		verify(typedQuery).getResultList();
		verify(typedQuery).setParameter("abbrName", abbrName);
		assertEquals(expected, actual);
	}
}
