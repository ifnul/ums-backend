package org.lnu.is.converter.department.type;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.resource.department.type.DepartmentTypeResource;

/**
 * Department Type Resource Converter.
 * @author ivanursul
 *
 */
@ResourceConverter("departmentTypeResourceConverter")
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
