package org.lnu.is.service.department;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.department.DepartmentDao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default implentation of Department Service.
 * @author ivanursul
 *
 */
@Service("departmentService")
public class DefaultDepartmentService implements DepartmentService {

	@Resource(name = "departmentDao")
	private DepartmentDao departmentDao;

	@Override
	public void createDepartment(final Department department) {
		departmentDao.save(department);
	}

	@Override
	public Department getDepartment(final Long id) {
		return departmentDao.findById(id);
	}

	@Override
	public void updateDepartment(final Department department) {
		departmentDao.update(department);
	}

	@Override
	public void removeDepartment(final Department department) {
		departmentDao.delete(department);
	}

	@Override
	public PagedResult<Department> getDepartments(final PagedSearch<Department> pagedSearch) {
		return departmentDao.getDepartments(pagedSearch);
	}
}
