package org.lnu.is.converter.eduformtype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.education.form.type.EduFormTypeResourceConverter;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.resource.eduformtype.EduFormTypeResource;

public class EduFormTypeResourceConverterTest {

	private EduFormTypeResourceConverter unit = new EduFormTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "EducationN";

		EducationFormType expected = new EducationFormType();
		expected.setName(name);

		EduFormTypeResource source = new EduFormTypeResource();
		source.setName(name);

		// When
		EducationFormType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		EduFormTypeResource source = new EduFormTypeResource();
		source.setId(id);
				source.setName(name);
		
		List<EduFormTypeResource> sources = Arrays.asList(source); 
		
		EducationFormType expected = new EducationFormType();
		expected.setId(id);
		expected.setName(name);
		
		List<EducationFormType> expecteds = Arrays.asList(expected);
		
		// Where
		List<EducationFormType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
