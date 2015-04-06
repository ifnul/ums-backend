package org.lnu.is.dao.builder.enrolment.enrolment.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.enrolment.subject.EnrolmentEnrolmentSubject;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;
import org.lnu.is.pagination.MultiplePagedSearch;

public class EnrolmentEnrolmentQueryBuilderTest {

    private EnrolmentEnrolmentSubjectQueryBuilder unit = new EnrolmentEnrolmentSubjectQueryBuilder();
	
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
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE e.status=:status ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Enrolment enrolment = new Enrolment();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
		Double mark = 1d;
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		context.setEnrolment(enrolment);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setPersonEnrolmentSubject(personEnrolmentSubject);
		context.setMark(mark);
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE ( e.entolment = :enrolmrnt AND e.enrolmentSubject = :enrolmentSubject AND e.mark = :mark AND e.personEnrolmentSubject = :personEnrolmentSubject ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Enrolment enrolment = new Enrolment();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
		Double mark = 1d;
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		context.setEnrolment(enrolment);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setPersonEnrolmentSubject(personEnrolmentSubject);
		context.setMark(mark);
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE ( e.entolment = :enrolmrnt AND e.enrolmentSubject = :enrolmentSubject AND e.mark = :mark AND e.personEnrolmentSubject = :personEnrolmentSubject ) ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
