package org.lnu.is.converter.department.specialty;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.specialty.DepartmentSpecialty;
import org.lnu.is.domain.language.language;
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
		language language = new language();
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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1L;
		Long departmentId = 2L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long languageId = 2L;
		language language = new language();
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
		
		DepartmentSpecialty source1 = new DepartmentSpecialty();
		DepartmentSpecialtyResource expected1 = new DepartmentSpecialtyResource();
		
		List<DepartmentSpecialty> sources = Arrays.asList(source,source1);
		
		List<DepartmentSpecialtyResource> expecteds = Arrays.asList(expected, expected1);
		
		// When
		List<DepartmentSpecialtyResource> actual = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actual);
	}
}
