package org.lnu.is.facade.converter.marriedtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.resource.marriedtype.MarriedTypeResource;

public class MarriedTypeResourceConverterTest {
	
	private MarriedTypeResourceConverter unit = new MarriedTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr";

		MarriedType expected = new MarriedType();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		MarriedTypeResource source = new MarriedTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);

		// When
		MarriedType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

}
