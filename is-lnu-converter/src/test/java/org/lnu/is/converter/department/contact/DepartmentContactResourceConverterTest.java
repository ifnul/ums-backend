package org.lnu.is.converter.department.contact;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.contact.type.ContactType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.contact.DepartmentContact;
import org.lnu.is.resource.department.contact.DepartmentContactResource;

public class DepartmentContactResourceConverterTest {

	private DepartmentContactResourceConverter unit = new DepartmentContactResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String value = "sfas";
		Long departmentId = 2L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long contactTypeId = 3L;
		ContactType contactType = new ContactType();
		contactType.setId(contactTypeId);
		
		DepartmentContact expected = new DepartmentContact();
		expected.setDepartment(department);
		expected.setContactType(contactType);
		expected.setValue(value);
		
		DepartmentContactResource source = new DepartmentContactResource();
		source.setDepartmentId(departmentId);
		source.setContactTypeId(contactTypeId);
		source.setId(id);
		source.setValue(value);
		
		// When
		DepartmentContact actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		DepartmentContact expected = new DepartmentContact();
		DepartmentContactResource source = new DepartmentContactResource();

		// When
		DepartmentContact actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1L;
		String value = "sfas";
		Long departmentId = 2L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long contactTypeId = 3L;
		ContactType contactType = new ContactType();
		contactType.setId(contactTypeId);
		
		DepartmentContact expected = new DepartmentContact();
		expected.setDepartment(department);
		expected.setContactType(contactType);
		expected.setValue(value);
		
		DepartmentContactResource source = new DepartmentContactResource();
		source.setDepartmentId(departmentId);
		source.setContactTypeId(contactTypeId);
		source.setId(id);
		source.setValue(value);
		
		DepartmentContact expected1 = new DepartmentContact();
		DepartmentContactResource source1 = new DepartmentContactResource();

		List<DepartmentContactResource> sources = Arrays.asList(source,source1);
		
		List<DepartmentContact> expecteds = Arrays.asList(expected,expected1);
		// When
		List<DepartmentContact> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
