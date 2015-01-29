package org.lnu.is.dao.builder.specoffer.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferSubject;

public class SpecOfferSubjectQueryBuilderTest {
	
	private SpecOfferSubjectQueryBuilder unit = new SpecOfferSubjectQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

	@Test
	public void testBuild() throws Exception {
		// Given
		Boolean alternative = false;
		SpecOfferSubject context = new SpecOfferSubject();
		context.setAlternative(alternative);

		String expected = "SELECT e FROM SpecofferSubject e WHERE ( e.alternative = :alternative ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		Boolean alternative = false;
		SpecOfferSubject context = new SpecOfferSubject();
		context.setAlternative(alternative);
		
		String expected = "SELECT e FROM SpecofferSubject e WHERE ( e.alternative = :alternative ) AND e.status=:status ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		Boolean alternative = false;
		SpecOfferSubject context = new SpecOfferSubject();
		context.setAlternative(alternative);
		
		String expected = "SELECT e FROM SpecofferSubject e WHERE ( e.alternative = :alternative ) AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Boolean alternative = false;
		SpecOfferSubject context = new SpecOfferSubject();
		context.setAlternative(alternative);
		
		String expected = "SELECT e FROM SpecofferSubject e WHERE ( e.alternative = :alternative ) ";
		
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
		
		SpecOfferSubject context = new SpecOfferSubject();
		context.setAlternative(alternative);
		context.setSpecOffer(specOffer);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setIsMajor(isMajor);
		context.setMark(mark);
		
		String expected = "SELECT e FROM SpecofferSubject e WHERE ( e.specOffer = :specOffer OR e.enrolmentSubject = :enrolmentSubject OR e.isMajor = :isMajor OR e.alternative = :alternative ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithAllParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		SpecOffer specOffer = new SpecOffer();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		Boolean isMajor = false;
		Double mark = 2.4;
		Boolean alternative = false;
		
		SpecOfferSubject context = new SpecOfferSubject();
		context.setAlternative(alternative);
		context.setSpecOffer(specOffer);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setIsMajor(isMajor);
		context.setMark(mark);
		
		String expected = "SELECT e FROM SpecofferSubject e WHERE ( e.specOffer = :specOffer OR e.enrolmentSubject = :enrolmentSubject OR e.isMajor = :isMajor OR e.alternative = :alternative ) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
