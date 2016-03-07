package org.lnu.is.extractor.department.name;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.name.DepartmentName;
import org.lnu.is.domain.language.language;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Department Name parameters parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("departmentNameParametersExtractor")
public class DepartmentNameParametersExtractor extends AbstractParametersExtractor<DepartmentName> {

	@Resource(name = "departmentDao")
	private Dao<Department, Department, Long> departmentDao;

	@Resource(name = "languageDao")
	private Dao<language, language, Long> languageDao;
	
	@Override
	protected Map<String, Object> getParameters(final DepartmentName entity, final Map<String, Object> parameters) {
		addParameter(entity.getDepartment(), departmentDao, "department", parameters);
		addParameter(entity.getLanguage(), languageDao, "language", parameters);
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
