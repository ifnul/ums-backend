package org.lnu.is.converter.employee.type;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.employee.EmployeeType;
import org.lnu.is.resource.employee.type.EmployeeTypeResource;

/**
 * Employee Type Converter.
 * 
 * @author ivanursul
 * 
 */
@ResourceConverter("employeeTypeConverter")
public class EmployeeTypeConverter extends AbstractConverter<EmployeeType, EmployeeTypeResource> {

	@Override
	public EmployeeTypeResource convert(final EmployeeType source, final EmployeeTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public EmployeeTypeResource convert(final EmployeeType source) {
		return convert(source, new EmployeeTypeResource());
	}

}
