package org.lnu.is.converter.enrolment.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.benefit.EnrolmentBenefit;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.resource.enrolment.benefit.EnrolmentBenefitResource;

public class EnrolmentBenefitResourceConverterTest {

	private EnrolmentBenefitResourceConverter unit = new EnrolmentBenefitResourceConverter();
	
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

		EnrolmentBenefit expected = new EnrolmentBenefit();
		expected.setEnrolment(enrolment);
		expected.setBenefit(benefit);
		expected.setPersonPaper(personpaper);

		EnrolmentBenefitResource source = new EnrolmentBenefitResource();
		source.setBenefitId(benefitId);
		source.setEnrolmentId(enrolmentId);
		source.setPersonPaperId(personpaperId);
		
		// When
		EnrolmentBenefit actual = unit.convert(source);

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
		
		EnrolmentBenefit expected = new EnrolmentBenefit();
		expected.setEnrolment(enrolment);
		expected.setBenefit(benefit);
		expected.setPersonPaper(personpaper);
		List<EnrolmentBenefit> expecteds = Arrays.asList(expected);
		
		EnrolmentBenefitResource source = new EnrolmentBenefitResource();
		source.setBenefitId(benefitId);
		source.setEnrolmentId(enrolmentId);
		source.setPersonPaperId(personpaperId);
		List<EnrolmentBenefitResource> sources = Arrays.asList(source);
		
		// When
		List<EnrolmentBenefit> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		EnrolmentBenefit expected = new EnrolmentBenefit();
		EnrolmentBenefitResource source = new EnrolmentBenefitResource();
		
		// When
		EnrolmentBenefit actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
