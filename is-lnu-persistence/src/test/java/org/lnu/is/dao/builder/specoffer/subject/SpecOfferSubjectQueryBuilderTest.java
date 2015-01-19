package org.lnu.is.dao.builder.specoffer.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferSubject;

public class SpecOfferSubjectQueryBuilderTest {
	
	private SpecOfferSubjectQueryBuilder unit = new SpecOfferSubjectQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Boolean alternative = false;
		SpecofferSubject context = new SpecofferSubject();
		context.setAlternative(alternative);

		String expected = "SELECT e FROM SpecofferSubject e WHERE ( e.alternative = :alternative ) AND e.status=:status ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithAllParameters() throws Exception {
		// Given
		SpecOffer specOffer = new SpecOffer();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		Boolean isMajor = false;
		Double mark = 2.4;
		Boolean alternative = false;
		
		SpecofferSubject context = new SpecofferSubject();
		context.setAlternative(alternative);
		context.setSpecOffer(specOffer);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setIsMajor(isMajor);
		context.setMark(mark);
		
		String expected = "SELECT e FROM SpecofferSubject e WHERE ( e.specOffer = :specOffer OR e.enrolmentSubject = :enrolmentSubject OR e.isMajor = :isMajor OR e.alternative = :alternative ) AND e.status=:status ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
