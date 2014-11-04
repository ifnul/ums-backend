package org.lnu.is.dao.extractor.department;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.department.DepartmentDao;
import org.lnu.is.dao.extractor.ParametersExtractor;
import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Component;

/**
 * Parameters extractor for department.
 * @author ivanursul
 *
 */
@Component("departmentParametersExtractor")
public class DepartmentParametersExtractor implements ParametersExtractor<Department> {

	@Resource(name = "departmentDao")
	private DepartmentDao departmentDao;
	
/*	@Resource(name = "departmentTypeDao")
	private DepartmentTypeDao departmentTypeDao;*/
	
	@Override
	public Map<String, Object> getParameters(final PagedSearch<Department> pagedSearch) {
		
		Department entity = pagedSearch.getEntity();
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parent", getParent(entity));
		//parameters.put("departmentType", getDepartmentType(entity));

		parameters.put("begDate", entity.getBegDate());
		parameters.put("endDate", entity.getEndDate());

		parameters.put("abbrName", entity.getAbbrName());
		parameters.put("email", entity.getEmail());
		parameters.put("manager", entity.getManager());
		parameters.put("name", entity.getName());
		//parameters.put("orderId", entity.getOrderId());
		parameters.put("phone", entity.getPhone());
		
		return parameters;
	}

	/**
	 * Method for getting Parent.
	 * @param entity Department entity.
	 * @return Department
	 */
	private Department getParent(final Department entity) {
		Department department = entity.getParent() != null ? departmentDao.findById(entity.getParent().getId()) : null;
		return department;
	}

/*	*//**
	 * Method for getting department Type.
	 * @param entity
	 * @return DepartmentType.
	 *//*
	private DepartmentType getDepartmentType(final Department entity) {
		DepartmentType departmentType = entity.getDepartmentType() != null ? departmentTypeDao.findById(entity.getDepartmentType().getId()) : null;
		return departmentType;
	}
*/
}
