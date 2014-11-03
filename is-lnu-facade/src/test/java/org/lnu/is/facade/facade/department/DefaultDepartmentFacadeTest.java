package org.lnu.is.facade.facade.department;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.department.Department;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.department.DepartmentResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.department.DepartmentService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDepartmentFacadeTest {
	
	@Mock
	private DepartmentService departmentService;

	@Mock
	private Converter<DepartmentResource, Department> insertConverter;

	@Mock
	private Converter<DepartmentResource, Department> updateConverter;
	
	@Mock
	private Converter<DepartmentResource, Department> departmentResourceConverter;

	@Mock
	private Converter<Department, DepartmentResource> departmentConverter;
	
	@Mock
	private Converter<PagedRequest, PagedSearch<Department>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@InjectMocks
	private DefaultDepartmentFacade unit;
	
	@Test
	public void testTest() throws Exception {
		// Given

		// When

		// Then
		assertEquals(true, true);
	}
}
