package org.lnu.is.service.department;

import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Interface, that declares all operations at service layer 
 * with department.
 * @author ivanursul
 *
 */
public interface DepartmentService {

	/**
	 * Method for creating department.
	 * @param department deartment.
	 */
	void createDepartment(Department department);

	/**
	 * Method for getting department.
	 * @param id identifier
	 * @return Department entity.
	 */
	Department getDepartment(Long id);

	/**
	 * Method for updating department.
	 * @param department department.
	 */
	void updateDepartment(Department department);

	/**
	 * Method for removing department.
	 * @param department department.
	 */
	void removeDepartment(Department department);

	/**
	 * Method for getting paged result.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<Department> getDepartments(PagedSearch<Department> pagedSearch);

}
