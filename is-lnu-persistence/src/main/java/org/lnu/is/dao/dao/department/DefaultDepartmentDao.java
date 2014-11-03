package org.lnu.is.dao.dao.department;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.department.Department;
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

}
