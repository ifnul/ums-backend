package org.lnu.is.converter.department.name;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.name.DepartmentName;
import org.lnu.is.domain.language.Language;
import org.lnu.is.resource.department.name.DepartmentNameResource;

/**
 * Department Address Resource Converter.
 * @author ivanursul
 *
 */
@Converter("departmentNameResourceConverter")
public class DepartmentNameResourceConverter extends AbstractConverter<DepartmentNameResource, DepartmentName> {

	@Override
	public DepartmentName convert(final DepartmentNameResource source, final DepartmentName target) {
		
		if (source.getDepartmentId() != null) {
			Department department = new Department();
			department.setId(source.getDepartmentId());
			target.setDepartment(department);
		}
		
		if (source.getLanguageId() != null) {
			Language language = new Language();
			language.setId(source.getLanguageId());
			target.setLanguage(language);
		}
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public DepartmentName convert(final DepartmentNameResource source) {
		return convert(source, new DepartmentName());
	}


}
