package org.lnu.is.converter.family.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.familytype.FamilyType;
import org.lnu.is.resource.familytype.FamilyTypeResource;

public class FamilyTypeResourceConverterTest {

	private FamilyTypeResourceConverter unit = new FamilyTypeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		
		FamilyTypeResource source = new FamilyTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setId(id);

		FamilyType expected = new FamilyType();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		// When
		FamilyType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		FamilyTypeResource source = new FamilyTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<FamilyTypeResource> sources = Arrays.asList(source); 
		
		FamilyType expected = new FamilyType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<FamilyType> expecteds = Arrays.asList(expected);
		
		// Where
		List<FamilyType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
