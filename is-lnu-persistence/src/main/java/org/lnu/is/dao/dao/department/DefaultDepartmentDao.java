package org.lnu.is.dao.dao.department;

import java.util.Collections;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Repository;

/**
 * Default implementation of Department Dao layer.
 * @author ivanursul
 *
 */
@Repository("departmentDao")
public class DefaultDepartmentDao extends AbstractDao<Department, Long> implements DepartmentDao {

	@Override
	public Class<Department> getEntityClass() {
		return Department.class;
	}

	@Override
	public PagedResult<Department> getDepartments(final PagedSearch<Department> pagedSearch) {
		
		pagedSearch.setClazz(getEntityClass());
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(Queries.FIND_DEPARTMENTS);
		
		return search(pagedSearch);
	}

}
