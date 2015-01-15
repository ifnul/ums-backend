package org.lnu.is.dao.builder.benefit.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.benefit.BenefitType;

public class BenefitTypeQueryBuilderTest {

	private BenefitTypeQueryBuilder unit = new BenefitTypeQueryBuilder();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		BenefitType context = new BenefitType();
		
		String expected = "SELECT b FROM BenefitType b ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
