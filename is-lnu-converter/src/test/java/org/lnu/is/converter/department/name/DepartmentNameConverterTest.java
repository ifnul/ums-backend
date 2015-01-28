package org.lnu.is.converter.department.name;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.name.DepartmentName;
import org.lnu.is.domain.language.Language;
import org.lnu.is.resource.department.name.DepartmentNameResource;

public class DepartmentNameConverterTest {

	private DepartmentNameConverter unit = new DepartmentNameConverter();
	
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

		DepartmentName source = new DepartmentName();
		source.setId(id);
		source.setDepartment(department);
		source.setLanguage(language);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		DepartmentNameResource expected = new DepartmentNameResource();
		expected.setId(id);
		expected.setDepartmentId(departmentId);
		expected.setLanguageId(languageId);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		// When
		DepartmentNameResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		DepartmentName source = new DepartmentName();
		DepartmentNameResource expected = new DepartmentNameResource();
		
		// When
		DepartmentNameResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
