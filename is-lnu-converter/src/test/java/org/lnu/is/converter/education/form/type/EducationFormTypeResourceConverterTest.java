package org.lnu.is.converter.education.form.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.education.form.type.EducationFormTypeResourceConverter;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.resource.education.form.type.EducationFormTypeResource;

public class EducationFormTypeResourceConverterTest {

	private EducationFormTypeResourceConverter unit = new EducationFormTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "EducationN";

		EducationFormType expected = new EducationFormType();
		expected.setName(name);

		EducationFormTypeResource source = new EducationFormTypeResource();
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
		
		EducationFormTypeResource source = new EducationFormTypeResource();
		source.setId(id);
				source.setName(name);
		
		List<EducationFormTypeResource> sources = Arrays.asList(source); 
		
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
