package org.lnu.is.converter.department.contact;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.contact.DepartmentContact;
import org.lnu.is.resource.department.contact.DepartmentContactResource;

public class DepartmentContactConverterTest {

	private DepartmentContactConverter unit = new DepartmentContactConverter();
	
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
		
		DepartmentContact source = new DepartmentContact();
		source.setDepartment(department);
		source.setContactType(contactType);
		source.setId(id);
		source.setValue(value);
		
		DepartmentContactResource expected = new DepartmentContactResource();
		expected.setDepartmentId(departmentId);
		expected.setContactTypeId(contactTypeId);
		expected.setId(id);
		expected.setValue(value);
		
		// When
		DepartmentContactResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		DepartmentContact source = new DepartmentContact();
		DepartmentContactResource expected = new DepartmentContactResource();
		
		// When
		DepartmentContactResource actual = unit.convert(source);
		
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
		
		DepartmentContact source = new DepartmentContact();
		source.setDepartment(department);
		source.setContactType(contactType);
		source.setId(id);
		source.setValue(value);
		
		DepartmentContactResource expected = new DepartmentContactResource();
		expected.setDepartmentId(departmentId);
		expected.setContactTypeId(contactTypeId);
		expected.setId(id);
		expected.setValue(value);
		
		DepartmentContact source1 = new DepartmentContact();
		DepartmentContactResource expected1 = new DepartmentContactResource();
		
		List<DepartmentContact> sources = Arrays.asList(source,source1);
		
		List<DepartmentContactResource> expecteds = Arrays.asList(expected,expected1);
		// When
		List<DepartmentContactResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
