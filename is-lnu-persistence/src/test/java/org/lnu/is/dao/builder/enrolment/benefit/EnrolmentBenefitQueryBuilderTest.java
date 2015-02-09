package org.lnu.is.dao.builder.enrolment.benefit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.benefit.EnrolmentBenefit;
import org.lnu.is.domain.person.PersonPaper;

public class EnrolmentBenefitQueryBuilderTest {

	private EnrolmentBenefitQueryBuilder unit = new EnrolmentBenefitQueryBuilder();
	
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
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}	
	
	@Test
	public void testBuildWithDisabledSecurityConstraitns() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}	
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}	
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}	

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Enrolment enrolment = new Enrolment();
		Benefit benefit = new Benefit();
		PersonPaper personpaper = new PersonPaper();
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		context.setEnrolment(enrolment);
		context.setBenefit(benefit);
		context.setPersonPaper(personpaper);

		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE ( e.enrolment = :enrolment OR e.benefit =:benefit OR e.personPaper =:personPaper ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}	
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Enrolment enrolment = new Enrolment();
		Benefit benefit = new Benefit();
		PersonPaper personpaper = new PersonPaper();
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		context.setEnrolment(enrolment);
		context.setBenefit(benefit);
		context.setPersonPaper(personpaper);
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE ( e.enrolment = :enrolment OR e.benefit =:benefit OR e.personPaper =:personPaper ) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}	
}