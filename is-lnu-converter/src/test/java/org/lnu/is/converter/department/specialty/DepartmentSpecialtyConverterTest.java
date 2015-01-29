package org.lnu.is.converter.department.specialty;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.specialty.DepartmentSpecialty;
import org.lnu.is.domain.language.Language;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.resource.department.specialty.DepartmentSpecialtyResource;

public class DepartmentSpecialtyConverterTest {

	private DepartmentSpecialtyConverter unit = new DepartmentSpecialtyConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		Long departmentId = 2L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long languageId = 2L;
		Language language = new Language();
		language.setId(languageId);

		Long specialtyId = 3L;
		Specialty specialty = new Specialty();
		specialty.setId(specialtyId);

		DepartmentSpecialty source = new DepartmentSpecialty();
		source.setId(id);
		source.setDepartment(department);
		source.setSpecialty(specialty);
		
		DepartmentSpecialtyResource expected = new DepartmentSpecialtyResource();
		expected.setId(id);
		expected.setDepartmentId(departmentId);
		expected.setSpecialtyId(specialtyId);
		
		// When
		DepartmentSpecialtyResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		DepartmentSpecialty source = new DepartmentSpecialty();
		DepartmentSpecialtyResource expected = new DepartmentSpecialtyResource();
		
		// When
		DepartmentSpecialtyResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
