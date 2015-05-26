package org.lnu.is.converter.education.form.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.education.form.type.EducationFormTypeConverter;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.resource.education.form.type.EducationFormTypeResource;

public class EducationFormTypeConverterTest {

	private EducationFormTypeConverter unit = new EducationFormTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		EducationFormType source = new EducationFormType();
		source.setName(name);
		
		EducationFormTypeResource expected = new EducationFormTypeResource();
		expected.setName(name);
		
		// When
		EducationFormTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		EducationFormType source = new EducationFormType();
		source.setId(id);
		source.setName(name);
		
		List<EducationFormType> sources = Arrays.asList(source); 
		
		EducationFormTypeResource expected = new EducationFormTypeResource();
		expected.setId(id);
		expected.setName(name);
		
		List<EducationFormTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<EducationFormTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}

