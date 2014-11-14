package org.lnu.is.service.department;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.department.DepartmentDao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDepartmentServiceTest {

	@Mock
	private DepartmentDao departmentDao;
	
	@Mock
	private ParametersExtractor<Department> parametersExtractor;
	
	@InjectMocks
	private DefaultDepartmentService unit;
	

	@Test
	public void testCreateDepartment() throws Exception {
		// Given
		Department expected = new Department();

		// When
		unit.createDepartment(expected);

		// Then
		verify(departmentDao).save(expected);
	}
	
	@Test
	public void testUpdateDepartment() throws Exception {
		// Given
		Department department = new Department();

		// When
		unit.updateDepartment(department);

		// Then
		verify(departmentDao).update(department);
	}
	
	@Test
	public void testGetDepartment() throws Exception {
		// Given
		Long id = 1L;
		Department expected = new Department();
		expected.setId(id);

		// When
		when(departmentDao.findById(anyLong())).thenReturn(expected);
		Department actual = unit.getDepartment(id);

		// Then
		verify(departmentDao).findById(id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveDepartment() throws Exception {
		// Given
		Department department = new Department();

		// When
		unit.removeDepartment(department);

		// Then
		verify(departmentDao).delete(department);
	}
	
	@Test
	public void testGetDepartments() throws Exception {
		// Given
		PagedSearch<Department> pagedSearch = new PagedSearch<>();
		
		Department department = new Department();
		Integer offset = 0;
		Integer limit = 100;
		long count = 200;
		List<Department> entities = Arrays.asList(department);
		PagedResult<Department> expected = new PagedResult<Department>(offset, limit, count, entities);
		
		// When
		when(departmentDao.getEntities(Matchers.<PagedSearch<Department>>any())).thenReturn(expected);
		PagedResult<Department> actual = unit.getDepartments(pagedSearch);

		// Then
		verify(departmentDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}
}
