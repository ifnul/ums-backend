package org.lnu.is.converter.department.type;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.resource.department.type.DepartmentTypeResource;


/**
 * Department Type Converter.
 * @author ivanursul
 *
 */
@ResourceConverter("departmentTypeConverter")
public class DepartmentTypeConverter extends AbstractConverter<DepartmentType, DepartmentTypeResource> {

	@Override
	public DepartmentTypeResource convert(final DepartmentType source, final DepartmentTypeResource target) {
		
		target.setId(source.getId());
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public DepartmentTypeResource convert(final DepartmentType source) {
		return convert(source, new DepartmentTypeResource());
	}

}
