package org.lnu.is.extractor.department.specialty;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.specialty.DepartmentSpecialty;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Department Specialty parameters parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("departmentSpecialtyParametersExtractor")
public class DepartmentSpecialtyParametersExtractor extends AbstractParametersExtractor<DepartmentSpecialty> {

	@Resource(name = "departmentDao")
	private Dao<Department, Department, Long> departmentDao;

	@Resource(name = "specialtyDao")
	private Dao<Specialty, Specialty, Long> specialtyDao;
	
	@Override
	protected Map<String, Object> getParameters(final DepartmentSpecialty entity, final Map<String, Object> parameters) {
		addParameter(entity.getDepartment(), departmentDao, "department", parameters);
		addParameter(entity.getSpecialty(), specialtyDao, "specialty", parameters);
		
		return parameters;
	}

}
