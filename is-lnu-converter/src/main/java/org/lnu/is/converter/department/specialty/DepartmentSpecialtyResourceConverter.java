package org.lnu.is.converter.department.specialty;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.specialty.DepartmentSpecialty;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.resource.department.specialty.DepartmentSpecialtyResource;

/**
 * Department Address Resource Converter.
 * @author ivanursul
 *
 */
@Converter("departmentSpecialtyResourceConverter")
public class DepartmentSpecialtyResourceConverter extends AbstractConverter<DepartmentSpecialtyResource, DepartmentSpecialty> {

	@Override
	public DepartmentSpecialty convert(final DepartmentSpecialtyResource source, final DepartmentSpecialty target) {
		
		if (source.getDepartmentId() != null) {
			Department department = new Department();
			department.setId(source.getDepartmentId());
			target.setDepartment(department);
		}
		
		if (source.getSpecialtyId() != null) {
			Specialty specialty = new Specialty();
			specialty.setId(source.getSpecialtyId());
			target.setSpecialty(specialty);
		}
		
		return target;
	}

	@Override
	public DepartmentSpecialty convert(final DepartmentSpecialtyResource source) {
		return convert(source, new DepartmentSpecialty());
	}


}
