package org.lnu.is.dao.builder.specoffer.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecofferSubject;

public class SpecOfferSubjectQueryBuilderTest {
	
	private SpecOfferSubjectQueryBuilder unit = new SpecOfferSubjectQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Boolean alternative = false;
		SpecofferSubject context = new SpecofferSubject();
		context.setAlternative(alternative);

		String expected = "SELECT s FROM SpecOfferSubject s WHERE s.alternative = :alternative ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
