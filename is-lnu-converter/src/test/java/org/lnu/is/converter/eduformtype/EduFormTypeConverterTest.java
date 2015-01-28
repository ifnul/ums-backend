package org.lnu.is.converter.eduformtype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.eduformtype.EduFormTypeConverter;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.resource.eduformtype.EduFormTypeResource;

public class EduFormTypeConverterTest {

	private EduFormTypeConverter unit = new EduFormTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		EduFormType source = new EduFormType();
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
		
		EduFormType source = new EduFormType();
		source.setId(id);
		source.setName(name);
		
		List<EduFormType> sources = Arrays.asList(source); 
		
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

