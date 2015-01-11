package org.lnu.is.converter.family.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.familytype.FamilyType;
import org.lnu.is.resource.familytype.FamilyTypeResource;

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
}
