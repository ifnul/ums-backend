package org.lnu.is.converter.department.contact;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.contact.type.ContactType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.contact.DepartmentContact;
import org.lnu.is.resource.department.contact.DepartmentContactResource;

/**
 * Department Address Resource Converter.
 * @author ivanursul
 *
 */
@Converter("departmentContactResourceConverter")
public class DepartmentContactResourceConverter extends AbstractConverter<DepartmentContactResource, DepartmentContact> {

	@Override
	public DepartmentContact convert(final DepartmentContactResource source, final DepartmentContact target) {
		
		if (source.getDepartmentId() != null) {
			Department department = new Department();
			department.setId(source.getDepartmentId());
			target.setDepartment(department);
		}
		
		if (source.getContactTypeId() != null) {
			ContactType contactType = new ContactType();
			contactType.setId(source.getContactTypeId());
			target.setContactType(contactType);
		}
		
		target.setValue(source.getValue());
		
		return target;
	}

	@Override
	public DepartmentContact convert(final DepartmentContactResource source) {
		return convert(source, new DepartmentContact());
	}


}
