package org.lnu.is.extractor.department;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.department.DepartmentDao;
import org.lnu.is.dao.dao.departmenttype.DepartmentTypeDao;
import org.lnu.is.dao.dao.order.OrderDao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Department Paramters extractor.
 * @author ivanursul
 *
 */
@Component("departmentParametersExtractor")
public class DepartmentParametersExtractor extends AbstractParametersExtractor<Department> {

	@Resource(name = "departmentDao")
	private DepartmentDao departmentDao;
	
	@Resource(name = "departmentTypeDao")
	private DepartmentTypeDao departmentTypeDao;
	
	@Resource(name = "orderDao")
	private OrderDao orderDao;
	
	@Override
	public Map<String, Object> getParameters(final Department entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
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
