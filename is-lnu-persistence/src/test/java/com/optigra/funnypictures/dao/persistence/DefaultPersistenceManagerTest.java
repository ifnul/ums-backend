package com.optigra.funnypictures.dao.persistence;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.optigra.funnypictures.dao.persistence.DefaultPersistenceManager;
import com.optigra.funnypictures.model.Picture;
import com.optigra.funnypictures.pagination.PagedResult;
import com.optigra.funnypictures.pagination.PagedSearch;
import com.optigra.funnypictures.queries.Queries;
import com.optigra.funnypictures.queries.Query;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersistenceManagerTest {

    private static final String COUNT_QUERY = "SELECT COUNT(*) FROM %s a WHERE a IN(%s) ";
	
    @Captor
    private ArgumentCaptor<Picture> userCaptor;
    
	@Mock
    private EntityManager entityManager;
	
	@InjectMocks
	private DefaultPersistenceManager<Picture, Long> unit;

	@Mock
	private TypedQuery<Picture> typedQuery;

	@Mock
	private TypedQuery<Long> longTypedQuery;

	@Test
	public void testCreate() throws Exception {
		// Given
		Picture expected = new Picture();

		// When
		unit.create(expected);

		// Then
		verify(entityManager).persist(userCaptor.capture());
		assertEquals(expected, userCaptor.getValue());
	}
	
	@Test
	public void testFindById() throws Exception {
		// Given
		Long id = 1L;
		Picture expected = new Picture();

		// When
		when(entityManager.find(Matchers.<Class<Picture>>any(), anyLong())).thenReturn(expected);
		Picture actual = unit.findById(Picture.class, id);

		// Then
		verify(entityManager).find(Picture.class, id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUpdate() throws Exception {
		// Given
		Picture expected = new Picture();
		
		// When
		when(entityManager.merge(any())).thenReturn(expected);
		Picture actual = unit.update(expected);

		// Then 
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemove() throws Exception {
		// Given
		Picture user = new Picture();

		// When
		unit.remove(user);

		// Then
		verify(entityManager).remove(userCaptor.capture());
		assertEquals(user, userCaptor.getValue());
	}
	
	@Test
	public void testExecuteQuerySingleResult() throws Exception {
		Map<String, Object> parameters = Collections.<String, Object>emptyMap();
		// Given
		String querySql = "SELECT * FROM USER";
		Query<Picture> query = new Query<Picture>(Picture.class, querySql, parameters );

		Picture expected = new Picture();
		// When
		when(entityManager.createQuery(anyString(), Matchers.<Class<Picture>>any())).thenReturn(typedQuery);
		when(typedQuery.getSingleResult()).thenReturn(expected);
		Picture actual = unit.executeSingleResultQuery(query);

		// Then
		verify(entityManager).createQuery(querySql, Picture.class);
		verify(typedQuery).getSingleResult();
		assertEquals(expected, actual);
	}

	@Test
	public void testExecuteQuery() throws Exception {
		Map<String, Object> parameters = Collections.<String, Object>emptyMap();
		// Given
		String querySql = "SELECT * FROM USER";
		Query<Picture> query = new Query<Picture>(Picture.class, querySql, parameters );
		
		List<Picture> expected = Collections.emptyList();
		// When
		when(entityManager.createQuery(anyString(), Matchers.<Class<Picture>>any())).thenReturn(typedQuery);
		when(typedQuery.getResultList()).thenReturn(expected);
		List<Picture> actual = unit.executeMultipleResultQuery(query);
		
		// Then
		verify(entityManager).createQuery(querySql, Picture.class);
		verify(typedQuery).getResultList();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSearch() throws Exception {
		// Given
		int start = 0;
		int offset = 20;
		Long count = 100L;
		Map<String, Object> parameters = Collections.emptyMap();
		Queries query = Queries.FIND_PICTURES;
		Class<Picture> clazz = Picture.class;
		
		PagedSearch<Picture> searchRequest = new PagedSearch<Picture>(start, offset, query, parameters, clazz);
		String jpQuery = String.format(COUNT_QUERY, clazz.getSimpleName(), query.getQuery());
		
		// When
		when(entityManager.createQuery(anyString(), Matchers.<Class<Picture>>any())).thenReturn(typedQuery);
		when(entityManager.createQuery(jpQuery, Long.class)).thenReturn(longTypedQuery);
		when(longTypedQuery.getSingleResult()).thenReturn(count);
		
		List<Picture> entities = Collections.emptyList();
		PagedResult<Picture> expected = new PagedResult<Picture>(start, offset, count, entities );
		
		PagedResult<Picture> actual = unit.search(searchRequest);

		// Then 
		verify(typedQuery).setFirstResult(start);
		verify(typedQuery).setMaxResults(offset);
		assertEquals(expected, actual);
	}
}
