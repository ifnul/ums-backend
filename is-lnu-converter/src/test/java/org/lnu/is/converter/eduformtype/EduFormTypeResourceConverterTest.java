package org.lnu.is.converter.eduformtype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.resource.eduformtype.EduFormTypeResource;

public class EduFormTypeResourceConverterTest {

	private EduFormTypeResourceConverter unit = new EduFormTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "EducationN";

		EduFormType expected = new EduFormType();
		expected.setName(name);

		EduFormTypeResource source = new EduFormTypeResource();
		source.setName(name);

		// When
		EduFormType actual = unit.convert(source);

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
		
		EduFormType expected = new EduFormType();
		expected.setId(id);
		expected.setName(name);
		
		List<EduFormType> expecteds = Arrays.asList(expected);
		
		// Where
		List<EduFormType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
