package org.lnu.is.converter.department.specialty;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.specialty.DepartmentSpecialty;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.resource.department.specialty.DepartmentSpecialtyResource;

public class DepartmentSpecialtyResourceConverterTest {

	private DepartmentSpecialtyResourceConverter unit = new DepartmentSpecialtyResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		Long departmentId = 2L;
		
		Long specialtyId = 3L;
		Specialty specialty = new Specialty();
		specialty.setId(specialtyId);
		
		Department department = new Department();
		department.setId(departmentId);
		
		DepartmentSpecialty expected = new DepartmentSpecialty();
		expected.setId(id);
		expected.setDepartment(department);
		expected.setSpecialty(specialty);
		
		DepartmentSpecialtyResource source = new DepartmentSpecialtyResource();
		source.setId(id);
		source.setDepartmentId(departmentId);
		source.setSpecialtyId(specialtyId);
		
		// When
		DepartmentSpecialty actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		DepartmentSpecialty expected = new DepartmentSpecialty();
		DepartmentSpecialtyResource source = new DepartmentSpecialtyResource();

		// When
		DepartmentSpecialty actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1L;
		Long departmentId = 2L;
		
		Long specialtyId = 3L;
		Specialty specialty = new Specialty();
		specialty.setId(specialtyId);
		
		Department department = new Department();
		department.setId(departmentId);
		
		DepartmentSpecialty expected = new DepartmentSpecialty();
		expected.setId(id);
		expected.setDepartment(department);
		expected.setSpecialty(specialty);
		
		DepartmentSpecialtyResource source = new DepartmentSpecialtyResource();
		source.setId(id);
		source.setDepartmentId(departmentId);
		source.setSpecialtyId(specialtyId);
		
		
		DepartmentSpecialty expected1 = new DepartmentSpecialty();
		DepartmentSpecialtyResource source1 = new DepartmentSpecialtyResource();
		
		List<DepartmentSpecialtyResource> sources = Arrays.asList(source,source1);
		
		List<DepartmentSpecialty> expecteds = Arrays.asList(expected, expected1);
		
		// When
		List<DepartmentSpecialty> actual = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actual);
	}
}
