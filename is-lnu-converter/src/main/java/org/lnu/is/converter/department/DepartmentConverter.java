package org.lnu.is.converter.department;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.Department;
import org.lnu.is.resource.department.DepartmentResource;

/**
 * Converter, that converts from Department to DepartmentResource.
 * @author ivanursul
 *
 */
@Converter("departmentConverter")
public class DepartmentConverter extends AbstractConverter<Department, DepartmentResource> {

	@Override
	public DepartmentResource convert(final Department source, final DepartmentResource target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		target.setId(source.getId());
		target.setManager(source.getManager());
		target.setName(source.getName());
		target.setNote(source.getNote());
		target.setIdentifir(source.getIdentifir());
		
		if (source.getOrder() != null) {
			target.setOrderId(source.getOrder().getId());
		}
		
		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}
		
		if (source.getDepartmentType() != null) {
			target.setDepartmentTypeId(source.getDepartmentType().getId());
		}
		
		return target;
	}

	@Override
	public DepartmentResource convert(final Department source) {
		return convert(source, new DepartmentResource());
	}

}
