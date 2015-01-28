package org.lnu.is.converter.specoffer.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferSubject;
import org.lnu.is.resource.specoffer.subject.SpecOfferSubjectResource;

public class SpecOfferSubjectResourceConverterTest {

	private SpecOfferSubjectResourceConverter unit = new SpecOfferSubjectResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Boolean alternative = false;
		Long id = 1L;
		Boolean isMajor = false;
		Double mark = 1.5;

		Long specOfferId = 2L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		
		Long enrolmentSubjectId = 3L;
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);
		
		SpecOfferSubject expected = new SpecOfferSubject();
		expected.setAlternative(alternative);
		expected.setIsMajor(isMajor);
		expected.setMark(mark);
		expected.setSpecOffer(specOffer);
		expected.setEnrolmentSubject(enrolmentSubject);
		
		SpecOfferSubjectResource source = new SpecOfferSubjectResource();
		source.setAlternative(alternative);
		source.setId(id);
		source.setIsMajor(isMajor);
		source.setMark(mark);
		source.setSpecOfferId(specOfferId);
		source.setEnrolmentSubjectId(enrolmentSubjectId);
		
		// When
		SpecOfferSubject actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Boolean alternative = false;
		Long id = 1L;
		Boolean isMajor = false;
		Double mark = 1.5;
		
		SpecOfferSubject expected = new SpecOfferSubject();
		expected.setAlternative(alternative);
		expected.setIsMajor(isMajor);
		expected.setMark(mark);
		
		SpecOfferSubjectResource source = new SpecOfferSubjectResource();
		source.setAlternative(alternative);
		source.setId(id);
		source.setIsMajor(isMajor);
		source.setMark(mark);
		
		// When
		SpecOfferSubject actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
