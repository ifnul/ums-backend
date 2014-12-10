package org.lnu.is.facade.converter.department.type;

import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.department.type.DepartmentTypeResource;


/**
 * Department Type Converter.
 * @author ivanursul
 *
 */
@Converter("departmentTypeConverter")
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
