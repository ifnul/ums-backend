package org.lnu.is.dao.builder.publicactivity.award;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityAward;

public class PublicActivityAwardQueryBuilderTest {

	private PublicActivityAwardQueryBuilder unit = new PublicActivityAwardQueryBuilder();
	
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
		PublicActivityAward context = new PublicActivityAward();
		
		String expectedQuery = "SELECT e FROM PublicActivityAward e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityCOnstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		PublicActivityAward context = new PublicActivityAward();
		
		String expectedQuery = "SELECT e FROM PublicActivityAward e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusCosntraint() throws Exception {
		// Given
		unit.setActive(false);
		
		PublicActivityAward context = new PublicActivityAward();
		
		String expectedQuery = "SELECT e FROM PublicActivityAward e WHERE e.crtUserGroup IN (:userGroups) ";
		
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
		
		PublicActivityAward context = new PublicActivityAward();
		
		String expectedQuery = "SELECT e FROM PublicActivityAward e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		PublicActivity publicActivity = new PublicActivity();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		String awardName = "awatd name";
		Date begDate = new Date();
		Date endDate = new Date();
		
		PublicActivityAward context = new PublicActivityAward();
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		context.setAwardName(awardName);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setPublicActivity(publicActivity);

		String expectedQuery = "SELECT e FROM PublicActivityAward e WHERE ( e.publicActivity=:publicActivity OR e.enrolmentSubject=:enrolmentSubject OR e.awardName LIKE CONCAT('%',:awardName,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		PublicActivity publicActivity = new PublicActivity();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		String awardName = "awatd name";
		Date begDate = new Date();
		Date endDate = new Date();
		
		PublicActivityAward context = new PublicActivityAward();
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		context.setAwardName(awardName);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setPublicActivity(publicActivity);

		
		String expectedQuery = "SELECT e FROM PublicActivityAward e WHERE ( e.publicActivity=:publicActivity OR e.enrolmentSubject=:enrolmentSubject OR e.awardName LIKE CONCAT('%',:awardName,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
