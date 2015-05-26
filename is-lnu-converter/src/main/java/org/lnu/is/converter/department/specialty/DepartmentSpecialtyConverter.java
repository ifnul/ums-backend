package org.lnu.is.converter.department.specialty;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.specialty.DepartmentSpecialty;
import org.lnu.is.resource.department.specialty.DepartmentSpecialtyResource;

/**
 * Department Specialty Converter.
 * @author ivanursul
 *
 */
@Converter("departmentSpecialtyConverter")
public class DepartmentSpecialtyConverter extends AbstractConverter<DepartmentSpecialty, DepartmentSpecialtyResource> {

	@Override
	public DepartmentSpecialtyResource convert(final DepartmentSpecialty source, final DepartmentSpecialtyResource target) {
		
		if (source.getDepartment() != null) {
			target.setDepartmentId(source.getDepartment().getId());
		}
		
		if (source.getSpecialty() != null) {
			target.setSpecialtyId(source.getSpecialty().getId());
		}
		
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public DepartmentSpecialtyResource convert(final DepartmentSpecialty source) {
		return convert(source, new DepartmentSpecialtyResource());
	}

}
