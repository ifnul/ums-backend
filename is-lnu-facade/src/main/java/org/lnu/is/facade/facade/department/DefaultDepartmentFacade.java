package org.lnu.is.facade.facade.department;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.department.Department;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.department.DepartmentResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.department.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default implemenntation of facade for Deparment.
 * @author ivanursul
 *
 */
@Facade("departmentFacade")
public class DefaultDepartmentFacade implements DepartmentFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultDepartmentFacade.class);
	
	@Resource(name = "departmentService")
	private DepartmentService departmentService;

	@Resource(name = "insertConverter")
	private Converter<DepartmentResource, Department> insertConverter;

	@Resource(name = "updateConverter")
	private Converter<DepartmentResource, Department> updateConverter;
	
	@Resource(name = "departmentResourceConverter")
	private Converter<DepartmentResource, Department> departmentResourceConverter;

	@Resource(name = "departmentConverter")
	private Converter<Department, DepartmentResource> departmentConverter;
	
	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<DepartmentResource>, PagedSearch<Department>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@Override
	public DepartmentResource createDepartment(final DepartmentResource departmentResource) {
		Department department = new Department();
		
		departmentResourceConverter.convert(departmentResource, department);
		insertConverter.convert(departmentResource, department);
		departmentService.createDepartment(department);
		
		return departmentConverter.convert(department);
	}

	@Override
	public void updateDepartment(final Long id, final DepartmentResource departmentResource) {
		Department department = departmentService.getDepartment(id);
		
		departmentResourceConverter.convert(departmentResource, department);
		updateConverter.convert(departmentResource, department);
		departmentService.updateDepartment(department);
	}

	@Override
	public DepartmentResource getDepartment(final Long id) {
		Department department = departmentService.getDepartment(id);
		return departmentConverter.convert(department);
	}

	@Override
	public void removeDepartment(final Long id) {
		Department department = departmentService.getDepartment(id);
		departmentService.removeDepartment(department);
	}

	@Override
	public PagedResultResource<DepartmentResource> getDepartments(final PagedRequest<DepartmentResource> pagedRequest) {
		LOG.info("Get departments by paged request: {}", pagedRequest);

		PagedSearch<Department> pagedSearch = pagedRequestConverter.convert(pagedRequest);
		pagedSearch.setEntity(departmentResourceConverter.convert(pagedRequest.getResource()));

		PagedResult<Department> pagedResult = departmentService.getDepartments(pagedSearch);

		List<DepartmentResource> resources = departmentConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<DepartmentResource> pagedResultResource = new PagedResultResource<>("/departments");
		pagedResultResource.setEntities(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}
	
}
