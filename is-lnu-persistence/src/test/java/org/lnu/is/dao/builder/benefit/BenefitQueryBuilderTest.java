package org.lnu.is.dao.builder.benefit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;

public class BenefitQueryBuilderTest {

	private BenefitQueryBuilder unit = new BenefitQueryBuilder();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Benefit context = new Benefit();
		
		String expected = "SELECT b FROM Benefit b ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
