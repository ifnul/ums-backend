package org.lnu.is.dao.dao.department;

import org.lnu.is.dao.Dao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Interface, that describes Department Dao layer.
 * @author ivanursul
 *
 */
public interface DepartmentDao extends Dao<Department, Long> {

	/**
	 * Method for getting departments.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<Department> getDepartments(PagedSearch<Department> pagedSearch);

}
