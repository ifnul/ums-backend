package org.lnu.is.converter.department.contact;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.contact.DepartmentContact;
import org.lnu.is.resource.department.contact.DepartmentContactResource;

/**
 * Department Contact Converter.
 * @author ivanursul
 *
 */
@Converter("departmentContactConverter")
public class DepartmentContactConverter extends AbstractConverter<DepartmentContact, DepartmentContactResource> {

	@Override
	public DepartmentContactResource convert(final DepartmentContact source, final DepartmentContactResource target) {
		
		if (source.getDepartment() != null) {
			target.setDepartmentId(source.getDepartment().getId());
		}
		
		if (source.getContactType() != null) {
			target.setContactTypeId(source.getContactType().getId());
		}
		
		target.setId(source.getId());
		target.setValue(source.getValue());
		
		return target;
	}

	@Override
	public DepartmentContactResource convert(final DepartmentContact source) {
		return convert(source, new DepartmentContactResource());
	}

}
