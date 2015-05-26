package org.lnu.is.converter.employee.status;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.employee.status.EmployeeStatus;
import org.lnu.is.resource.employee.status.EmployeeStatusResource;

/**
 * Employee Status Resource Converter.
 * 
 * @author ivanursul
 *
 */
@Converter("employeeStatusResourceConverter")
public class EmployeeStatusResourceConverter extends AbstractConverter<EmployeeStatusResource, EmployeeStatus> {

	@Override
	public EmployeeStatus convert(final EmployeeStatusResource source, final EmployeeStatus target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public EmployeeStatus convert(final EmployeeStatusResource source) {
		return convert(source, new EmployeeStatus());
	}
}
