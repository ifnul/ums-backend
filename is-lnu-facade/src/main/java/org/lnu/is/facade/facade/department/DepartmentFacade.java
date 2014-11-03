package org.lnu.is.facade.facade.department;

import org.lnu.is.facade.resource.department.DepartmentResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Interface, that declares all operations with deparment
 * at facade level.
 * @author ivanursul
 *
 */
public interface DepartmentFacade {

	/**
	 * Method for creating new Department.
	 * @param departmentResource resource
	 * @return department with generated identifier.
	 */
	DepartmentResource createDepartment(DepartmentResource departmentResource);

	/**
	 * Method for updating department.
	 * @param id identifier.
	 * @param departmentResource department resource.
	 */
	void updateDepartment(Long id, DepartmentResource departmentResource);

	/**
	 * Method for getting ready department.
	 * @param id identifier.
	 * @return Department.
	 */
	DepartmentResource getDepartment(Long id);

	/**
	 * Method for removing department.
	 * @param id identifier.
	 */
	void removeDepartment(Long id);

	/**
	 * Method for getting paged result for departments.
	 * @param pagedRequest request.
	 * @return paged result.
	 */
	PagedResultResource<DepartmentResource> getSpecialties(PagedRequest pagedRequest);
}
