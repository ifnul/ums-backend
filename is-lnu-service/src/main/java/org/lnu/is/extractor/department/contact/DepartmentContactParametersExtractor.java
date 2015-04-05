package org.lnu.is.extractor.department.contact;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.contact.type.ContactType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.contact.DepartmentContact;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Department Contact parameters parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("departmentContactParametersExtractor")
public class DepartmentContactParametersExtractor extends AbstractParametersExtractor<DepartmentContact> {

	@Resource(name = "departmentDao")
	private Dao<Department, Long> departmentDao;
	
	@Resource(name = "contactTypeDao")
	private Dao<ContactType, Long> contactTypeDao;
	
	@Override
	protected Map<String, Object> getParameters(final DepartmentContact entity, final Map<String, Object> parameters) {
		addParameter(entity.getDepartment(), departmentDao, "department", parameters);
		addParameter(entity.getContactType(), contactTypeDao, "contactType", parameters);
		addParameter(entity.getValue(), "value", parameters);
		
		return parameters;
	}

}
