package org.lnu.is.facade.facade.department;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.department.DepartmentResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.department.DepartmentService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDepartmentFacadeTest {
	
	@Mock
	private DepartmentService service;

	@Mock
	private Converter<DepartmentResource, Department> insertConverter;

	@Mock
	private Converter<DepartmentResource, Department> updateConverter;
	
	@Mock
	private Converter<DepartmentResource, Department> resourceConverter;

	@Mock
	private Converter<Department, DepartmentResource> entityConverter;
	
	@Mock
	private Converter<PagedRequest<DepartmentResource>, PagedSearch<Department>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@InjectMocks
	private DefaultDepartmentFacade unit;
	
	@Test
	public void testCreateDepartment() throws Exception {
		// Given
    	String name = "fsd department";
    	String abbrName = "fds";
    	String email = "email";
    	String manager = "manager";
    	String phone = "phone";
    	
    	DepartmentResource expected = new DepartmentResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setAbbrName(abbrName );
		expected.setName(name);
		expected.setEmail(email);
		expected.setManager(manager);
		expected.setPhone(phone);


		Department createdDepartment = new Department();
		
		DepartmentType departmentType = new DepartmentType();
		Department department = new Department();
    	department.setBegDate(new Date());
    	department.setEndDate(new Date());
		department.setAbbrName(abbrName);
		department.setName(name);
		department.setDepartmentType(departmentType);
		
		// When
		when(entityConverter.convert(any(Department.class))).thenReturn(expected);
		
		DepartmentResource actual = unit.createDepartment(expected);

		// Then
		verify(resourceConverter).convert(expected, createdDepartment);
		verify(service).createDepartment(createdDepartment);
		verify(insertConverter).convert(expected, createdDepartment);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUpdateDepartment() throws Exception {
		// Given
		Long id = 1L;
    	String name = "fsd department";
    	String abbrName = "fds";
    	String email = "email";
    	String manager = "manager";
    	String phone = "phone";
    	
    	DepartmentResource expected = new DepartmentResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setAbbrName(abbrName );
		expected.setName(name);
		expected.setEmail(email);
		expected.setManager(manager);
		expected.setPhone(phone);

		DepartmentType departmentType = new DepartmentType();

		Department department = new Department();
    	department.setBegDate(new Date());
    	department.setEndDate(new Date());
		department.setAbbrName(abbrName );
		department.setName(name);
		department.setDepartmentType(departmentType);
		
		// When
		when(service.getDepartment(anyLong())).thenReturn(department);
		
		unit.updateDepartment(id, expected);

		// Then
		verify(service).getDepartment(id);
		verify(resourceConverter).convert(expected, department);
		verify(service).updateDepartment(department);
		verify(updateConverter).convert(expected, department);
	}
	
	@Test
	public void testGetDepartment() throws Exception {
		// Given
		Long id = 1L;
    	String name = "fsd department";
    	String abbrName = "fds";
    	String email = "email";
    	String manager = "manager";
    	String phone = "phone";
    	
    	DepartmentResource expected = new DepartmentResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setAbbrName(abbrName );
		expected.setName(name);
		expected.setEmail(email);
		expected.setManager(manager);
		expected.setPhone(phone);

		DepartmentType departmentType = new DepartmentType();

		Department department = new Department();
    	department.setBegDate(new Date());
    	department.setEndDate(new Date());
		department.setAbbrName(abbrName );
		department.setName(name);
		department.setDepartmentType(departmentType);

		// When
		when(service.getDepartment(anyLong())).thenReturn(department);
		when(entityConverter.convert(any(Department.class))).thenReturn(expected);
		DepartmentResource actual = unit.getDepartment(id);

		// Then
		verify(service).getDepartment(id);
		verify(entityConverter).convert(department);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveSpecoffer() throws Exception {
		// Given
		Long id = 1L;
		
		Department department = new Department();
		department.setId(id);
		
		// When
		when(service.getDepartment(anyLong())).thenReturn(department);
		unit.removeDepartment(id);

		// Then
		verify(service).getDepartment(id);
		verify(service).removeDepartment(department);
	}
	
	@Test
	public void testGetSpecialties() throws Exception {
		// Given
		DepartmentResource resource = new DepartmentResource();
		PagedRequest<DepartmentResource> pagedRequest = new PagedRequest<DepartmentResource>(resource, 10, 10);
		List<DepartmentResource> funnyResources = Collections.singletonList(new DepartmentResource());
		PagedResultResource<DepartmentResource> expectedFunnies = new PagedResultResource<>("/departments");
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		
		PagedSearch<Department> pagedSearch = new PagedSearch<Department>(offset, limit, Collections.<String, Object> emptyMap(), Department.class);
		List<Department> entities = Arrays.asList(new Department());
		PagedResult<Department> pagedResult = new PagedResult<Department>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<DepartmentResource>>any())).thenReturn(pagedSearch);
		when(service.getDepartments(Matchers.<PagedSearch<Department>> any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(anyListOf(Department.class))).thenReturn(funnyResources);

		PagedResultResource<DepartmentResource> actualFunnies = unit.getDepartments(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getDepartments(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}
}
