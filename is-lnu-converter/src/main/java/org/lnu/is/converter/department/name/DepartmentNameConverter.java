package org.lnu.is.converter.department.name;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.name.DepartmentName;
import org.lnu.is.resource.department.name.DepartmentNameResource;

/**
 * Department Name Converter.
 * @author ivanursul
 *
 */
@Converter("departmentNameConverter")
public class DepartmentNameConverter extends AbstractConverter<DepartmentName, DepartmentNameResource> {

	@Override
	public DepartmentNameResource convert(final DepartmentName source, final DepartmentNameResource target) {
		
		if (source.getDepartment() != null) {
			target.setDepartmentId(source.getDepartment().getId());
		}
		
		if (source.getLanguage() != null) {
			target.setLanguageId(source.getLanguage().getId());
		}
		
		target.setId(source.getId());
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public DepartmentNameResource convert(final DepartmentName source) {
		return convert(source, new DepartmentNameResource());
	}

}
