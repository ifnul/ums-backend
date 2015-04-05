package org.lnu.is.converter.education.form.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.education.form.type.EduFormTypeConverter;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.resource.eduformtype.EduFormTypeResource;

public class EducationFormTypeConverterTest {

	private EduFormTypeConverter unit = new EduFormTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		EducationFormType source = new EducationFormType();
		source.setName(name);
		
		EduFormTypeResource expected = new EduFormTypeResource();
		expected.setName(name);
		
		// When
		EduFormTypeResource actual = unit.convert(source);

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
		
		EduFormTypeResource expected = new EduFormTypeResource();
		expected.setId(id);
		expected.setName(name);
		
		List<EduFormTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<EduFormTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}

