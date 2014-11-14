package org.lnu.is.dao.dao.department;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
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

	@Override
	@Resource(name = "departmentQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<Department> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
