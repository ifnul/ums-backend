package org.lnu.is.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.PagedResult;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultServiceTest {

	@Mock
	protected DefaultDao<Department, Department, Long> defaultDao;
	
	@Mock
	protected ParametersExtractor<Department> parametersExtractor;
	
	@InjectMocks
	private DefaultService<Department, Department, Long, DefaultDao<Department, Department, Long>> unit;
	
	@Test
	public void testCreateEntity() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		Department entity = new Department();
		entity.setAbbrName(abbrName);
		entity.setName(name);

		// When
		unit.createEntity(entity);

		// Then
		verify(defaultDao).save(entity);
	}
	
	@Test
	public void testUpdateEntity() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		Department entity = new Department();
		entity.setAbbrName(abbrName);
		entity.setName(name);

		// When
		unit.updateEntity(entity);

		// Then
		verify(defaultDao).update(entity);
	}
	
	@Test
	public void testRemoveEntity() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		Department entity = new Department();
		entity.setAbbrName(abbrName);
		entity.setName(name);

		// When
		unit.removeEntity(entity);

		// Then
		verify(defaultDao).delete(entity);
	}
	
	@Test
	public void testgetEntity() throws Exception {
		// Given
		Long id = 1L;
		String abbrName = "abbr name";
		String name = "name";
		
		Department expected = new Department();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		
		// When
		when(defaultDao.getEntityById(anyLong())).thenReturn(expected);
		
		Department actual = unit.getEntity(id);
		
		// Then
		verify(defaultDao).getEntityById(id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetEntities() throws Exception {
		// Given
		Integer offset = 0;
		Integer limit = 20;
		Department entity1 = new Department();
		Map<String, Object> parameters = Collections.<String, Object>singletonMap("some key", "some value");
		Class<Department> clazz = Department.class;
		MultiplePagedSearch<Department> search = new MultiplePagedSearch<Department>(offset, limit, null, clazz);
		search.setEntity(entity1);

		long count = 100;
		List<Department> entities = Arrays.asList(entity1);
		PagedResult<Department> expected = new PagedResult<Department>(offset, limit, count, entities);
		
		// When
		when(parametersExtractor.getParameters(any(Department.class))).thenReturn(parameters);
		when(defaultDao.getEntities(Matchers.<MultiplePagedSearch<Department>>any())).thenReturn(expected);
		
		PagedResult<Department> actual = unit.getEntities(search);

		// Then
		verify(parametersExtractor).getParameters(entity1);
		verify(defaultDao).getEntities(search);
		assertEquals(expected, actual);
	}
}
