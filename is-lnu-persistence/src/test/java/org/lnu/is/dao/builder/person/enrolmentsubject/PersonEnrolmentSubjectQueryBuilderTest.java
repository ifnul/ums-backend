package org.lnu.is.dao.builder.person.enrolmentsubject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.dao.builder.person.enrolment.subject.PersonEnrolmentSubjectQueryBuilder;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PersonEnrolmentSubjectQueryBuilderTest {

	private PersonEnrolmentSubjectQueryBuilder unit = new PersonEnrolmentSubjectQueryBuilder();

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
		PersonEnrolmentSubject context = new PersonEnrolmentSubject();
		String expectedQuery = "SELECT e FROM PersonEnrolmentSubject e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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

		PersonEnrolmentSubject context = new PersonEnrolmentSubject();
		String expectedQuery = "SELECT e FROM PersonEnrolmentSubject e WHERE e.status=:status ";
		MultiplePagedSearch<PersonEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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

		PersonEnrolmentSubject context = new PersonEnrolmentSubject();
		String expectedQuery = "SELECT e FROM PersonEnrolmentSubject e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);

		PersonEnrolmentSubject context = new PersonEnrolmentSubject();
		String expectedQuery = "SELECT e FROM PersonEnrolmentSubject e ";
		MultiplePagedSearch<PersonEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Person person = new Person();
		PersonPaper personPaper = new PersonPaper();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		Double mark = 4.5;

		PersonEnrolmentSubject context = new PersonEnrolmentSubject();
		context.setPersonPaper(personPaper);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setPerson(person);
		context.setMark(mark);

		String expectedQuery = "SELECT e FROM PersonEnrolmentSubject e WHERE ( e.person = :person AND e.personPaper = :personPaper AND e.enrolmentSubject = :enrolmentSubject AND e.mark = :mark ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		Person person = new Person();
		PersonPaper personPaper = new PersonPaper();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		Double mark = 4.5;

		PersonEnrolmentSubject context = new PersonEnrolmentSubject();
		context.setPersonPaper(personPaper);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setPerson(person);
		context.setMark(mark);

		String expectedQuery = "SELECT e FROM PersonEnrolmentSubject e WHERE ( e.person = :person AND e.personPaper = :personPaper AND e.enrolmentSubject = :enrolmentSubject AND e.mark = :mark ) ";
		MultiplePagedSearch<PersonEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
