package org.lnu.is.facade.converter.department.type;

import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.department.type.DepartmentTypeResource;

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
