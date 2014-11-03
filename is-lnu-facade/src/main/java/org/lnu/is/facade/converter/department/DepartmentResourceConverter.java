package org.lnu.is.facade.converter.department;

import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.departmenttype.DepartmentType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.department.DepartmentResource;

/**
 * Converter, that converts from DepartmentResource to Department.
 * @author ivanursul
 *
 */
@Converter("departmentResourceConverter")
public class DepartmentResourceConverter extends AbstractConverter<DepartmentResource	, Department> {

	@Override
	public Department convert(final DepartmentResource source, final Department target) {
		
		DepartmentType departmentType = new DepartmentType();
		departmentType.setId(source.getDepartmentTypeId());

		Department parent = new Department();
		parent.setId(source.getParentId());

		target.setAbbrName(source.getAbbrName());
		target.setBegDate(source.getBegDate());
		target.setDepartmentType(departmentType);
		target.setEmail(source.getEmail());
		target.setEndDate(source.getEndDate());
		target.setManager(source.getManager());
		target.setName(source.getName());
		target.setNote(source.getNote());
		target.setOrderId(source.getOrderId());
		target.setParent(parent);
		target.setPhone(source.getPhone());
		
		return target;
	}

	@Override
	public Department convert(final DepartmentResource source) {
		return convert(source, new Department());
	}

}
