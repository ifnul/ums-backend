package org.lnu.is.extractor.department;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.type.DepartmentType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Department Paramters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("departmentParametersExtractor")
public class DepartmentParametersExtractor extends AbstractParametersExtractor<Department> {

	@Resource(name = "departmentDao")
	private Dao<Department, Long> departmentDao;
	
	@Resource(name = "departmentTypeDao")
	private Dao<DepartmentType, Long> departmentTypeDao;
	
	@Resource(name = "orderDao")
	private Dao<Order, Long> orderDao;
	
	@Override
	public Map<String, Object> getParameters(final Department entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getParent(), departmentDao, "parent", parameters);
		addParameter(entity.getDepartmentType(), departmentTypeDao, "departmentType", parameters);
		addParameter(entity.getOrder(), orderDao, "order", parameters);
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getManager(), "manager", parameters);
		addParameter(entity.getPhone(), "phone", parameters);
		addParameter(entity.getEmail(), "email", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
