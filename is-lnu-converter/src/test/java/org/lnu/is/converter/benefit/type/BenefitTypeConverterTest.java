package org.lnu.is.converter.benefit.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.benefit.type.BenefitTypeConverter;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.resource.benefit.type.BenefitTypeResource;

public class BenefitTypeConverterTest {

	private BenefitTypeConverter unit = new BenefitTypeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Integer priority = 1;
		String name = "name";
		BenefitType source = new BenefitType();
		source.setName(name);
		source.setPriority(priority);

		BenefitTypeResource expected = new BenefitTypeResource();
		expected.setName(name);
		expected.setPriority(priority);
		
		// When
		BenefitTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
