package org.lnu.is.converter.department.name;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.name.DepartmentName;
import org.lnu.is.domain.language.Language;
import org.lnu.is.resource.department.name.DepartmentNameResource;

public class DepartmentNameResourceConverterTest {

	private DepartmentNameResourceConverter unit = new DepartmentNameResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String abbrName = "abbr name";
		String name = "fgsdfds";
		Long departmentId = 2L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long languageId = 2L;
		Language language = new Language();
		language.setId(languageId);

		DepartmentName expected = new DepartmentName();
		expected.setId(id);
		expected.setDepartment(department);
		expected.setLanguage(language);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		DepartmentNameResource source = new DepartmentNameResource();
		source.setId(id);
		source.setDepartmentId(departmentId);
		source.setLanguageId(languageId);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		// When
		DepartmentName actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		DepartmentName expected = new DepartmentName();
		DepartmentNameResource source = new DepartmentNameResource();

		// When
		DepartmentName actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
