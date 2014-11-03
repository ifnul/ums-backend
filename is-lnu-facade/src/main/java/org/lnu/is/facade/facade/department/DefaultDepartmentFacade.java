package org.lnu.is.facade.facade.department;

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
	
	//@Resource(name = "departmentResourceConverter")
	private Converter<DepartmentResource, Department> departmentResourceConverter;

	//@Resource(name = "departmentConverter")
	private Converter<Department, DepartmentResource> departmentConverter;
	
	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest, PagedSearch<Department>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
}
