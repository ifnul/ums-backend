package org.lnu.is.service.department;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.department.DepartmentDao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.extractor.ParametersExtractor;
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
	private DepartmentDao defaultDao;
	
	@Resource(name = "departmentParametersExtractor")
	private ParametersExtractor<Department> parametersExtractor;
	
	@Override
	public void createDepartment(final Department department) {
		defaultDao.save(department);
	}

	@Override
	public Department getDepartment(final Long id) {
		return defaultDao.findById(id);
	}

	@Override
	public void updateDepartment(final Department department) {
		defaultDao.update(department);
	}

	@Override
	public void removeDepartment(final Department department) {
		defaultDao.delete(department);
	}

	@Override
	public PagedResult<Department> getDepartments(final PagedSearch<Department> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);
		
		return defaultDao.getEntities(pagedSearch);
	}
}
