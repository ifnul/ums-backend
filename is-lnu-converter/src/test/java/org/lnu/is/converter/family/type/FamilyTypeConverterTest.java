package org.lnu.is.converter.family.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.family.type.FamilyType;
import org.lnu.is.resource.family.type.FamilyTypeResource;

public class FamilyTypeConverterTest {

	private FamilyTypeConverter unit = new FamilyTypeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		
		FamilyType source = new FamilyType();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setId(id);

		FamilyTypeResource expected = new FamilyTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setId(id);
		
		// When
		FamilyTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		FamilyType source = new FamilyType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<FamilyType> sources = Arrays.asList(source); 
		
		FamilyTypeResource expected = new FamilyTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<FamilyTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<FamilyTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
