package org.lnu.is.converter.enrolment.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.benefit.EnrolmentBenefit;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.resource.enrolment.benefit.EnrolmentBenefitResource;

public class EnrolmentBenefitConverterTest {

	private EnrolmentBenefitConverter unit = new EnrolmentBenefitConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long enrolmentId = 1L;
		Enrolment enrolment = new Enrolment();
		enrolment.setId(enrolmentId);
		
		Long benefitId = 2L;
		Benefit benefit = new Benefit();
		benefit.setId(benefitId);
		
		Long personpaperId = 3L;
		PersonPaper personpaper = new PersonPaper();
		personpaper.setId(personpaperId);

		EnrolmentBenefit source = new EnrolmentBenefit();
		source.setEnrolment(enrolment);
		source.setBenefit(benefit);
		source.setPersonPaper(personpaper);

		EnrolmentBenefitResource expected = new EnrolmentBenefitResource();
		expected.setBenefitId(benefitId);
		expected.setEnrolmentId(enrolmentId);
		expected.setPersonPaperId(personpaperId);
		
		// When
		EnrolmentBenefitResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long enrolmentId = 1L;
		Enrolment enrolment = new Enrolment();
		enrolment.setId(enrolmentId);
		
		Long benefitId = 2L;
		Benefit benefit = new Benefit();
		benefit.setId(benefitId);
		
		Long personpaperId = 3L;
		PersonPaper personpaper = new PersonPaper();
		personpaper.setId(personpaperId);
		
		EnrolmentBenefit source = new EnrolmentBenefit();
		source.setEnrolment(enrolment);
		source.setBenefit(benefit);
		source.setPersonPaper(personpaper);
		List<EnrolmentBenefit> sources = Arrays.asList(source);
		
		EnrolmentBenefitResource expected = new EnrolmentBenefitResource();
		expected.setBenefitId(benefitId);
		expected.setEnrolmentId(enrolmentId);
		expected.setPersonPaperId(personpaperId);
		List<EnrolmentBenefitResource> expecteds = Arrays.asList(expected);
		
		// When
		List<EnrolmentBenefitResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		EnrolmentBenefit source = new EnrolmentBenefit();
		EnrolmentBenefitResource expected = new EnrolmentBenefitResource();
		
		// When
		EnrolmentBenefitResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
