package org.lnu.is.converter.employee.status;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.employee.EmployeeStatus;
import org.lnu.is.resource.employee.status.EmployeeStatusResource;

/**
 * Employee Type Converter.
 * 
 * @author ivanursul
 * 
 */
@Converter("employeeStatusConverter")
public class EmployeeStatusConverter extends AbstractConverter<EmployeeStatus, EmployeeStatusResource> {

	@Override
	public EmployeeStatusResource convert(final EmployeeStatus source, final EmployeeStatusResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public EmployeeStatusResource convert(final EmployeeStatus source) {
		return convert(source, new EmployeeStatusResource());
	}

}
