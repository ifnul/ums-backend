package org.lnu.is.converter.specoffer.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.resource.specoffer.subject.SpecOfferSubjectResource;

public class SpecOfferSubjectConverterTest {

	private SpecOfferSubjectConverter unit = new SpecOfferSubjectConverter();
	
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
		
		SpecofferSubject source = new SpecofferSubject();
		source.setAlternative(alternative);
		source.setId(id);
		source.setIsMajor(isMajor);
		source.setMark(mark);
		source.setSpecOffer(specOffer);
		source.setEnrolmentSubject(enrolmentSubject);
		
		SpecOfferSubjectResource expected = new SpecOfferSubjectResource();
		expected.setAlternative(alternative);
		expected.setId(id);
		expected.setIsMajor(isMajor);
		expected.setMark(mark);
		expected.setSpecOfferId(specOfferId);
		expected.setEnrolmentSubjectId(enrolmentSubjectId);
		
		// When
		SpecOfferSubjectResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
