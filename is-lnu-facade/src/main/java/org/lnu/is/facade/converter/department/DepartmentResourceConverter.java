package org.lnu.is.facade.converter.department;

import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.departmenttype.DepartmentType;
import org.lnu.is.domain.order.Order;
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

		Order order = new Order();
		order.setId(source.getOrderId());

		if (source.getBegDate() != null) {
			target.setBegDate(source.getBegDate());
		}
		
		if (source.getEndDate() != null) {
			target.setEndDate(source.getEndDate());
		}
		
		target.setAbbrName(source.getAbbrName());
		target.setDepartmentType(departmentType);
		target.setEmail(source.getEmail());
		target.setManager(source.getManager());
		target.setName(source.getName());
		target.setNote(source.getNote());
		target.setParent(parent);
		target.setPhone(source.getPhone());
		//target.setOrder(order);
		
		return target;
	}

	@Override
	public Department convert(final DepartmentResource source) {
		return convert(source, new Department());
	}

}
