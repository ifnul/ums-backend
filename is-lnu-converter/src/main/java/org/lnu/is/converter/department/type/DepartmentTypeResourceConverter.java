package org.lnu.is.converter.department.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.type.DepartmentType;
import org.lnu.is.resource.department.type.DepartmentTypeResource;

/**
 * Department Type Resource Converter.
 * @author ivanursul
 *
 */
@Converter("departmentTypeResourceConverter")
public class DepartmentTypeResourceConverter extends AbstractConverter<DepartmentTypeResource, DepartmentType> {

	@Override
	public DepartmentType convert(final DepartmentTypeResource source, final DepartmentType target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public DepartmentType convert(final DepartmentTypeResource source) {
		return convert(source, new DepartmentType());
	}

}
