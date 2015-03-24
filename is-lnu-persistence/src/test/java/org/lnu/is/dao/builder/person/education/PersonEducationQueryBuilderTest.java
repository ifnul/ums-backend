package org.lnu.is.dao.builder.person.education;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.educationtype.EducationType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.education.PersonEducation;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PersonEducationQueryBuilderTest {

	private PersonEducationQueryBuilder unit = new PersonEducationQueryBuilder();

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
		PersonEducation context = new PersonEducation();

		String expectedQuery = "SELECT e FROM PersonEducation e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonEducation> pagedSearch = new MultiplePagedSearch<>();
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

		PersonEducation context = new PersonEducation();

		String expectedQuery = "SELECT e FROM PersonEducation e WHERE e.status=:status ";
		MultiplePagedSearch<PersonEducation> pagedSearch = new MultiplePagedSearch<>();
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

		PersonEducation context = new PersonEducation();

		String expectedQuery = "SELECT e FROM PersonEducation e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonEducation> pagedSearch = new MultiplePagedSearch<>();
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

		PersonEducation context = new PersonEducation();

		String expectedQuery = "SELECT e FROM PersonEducation e ";
		MultiplePagedSearch<PersonEducation> pagedSearch = new MultiplePagedSearch<>();
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
		EducationType addressType = new EducationType();
		PersonPaper personPaper = new PersonPaper();
		Date begDate = new Date();
		Date endDate = new Date();

		PersonEducation context = new PersonEducation();
		context.setPerson(person);
		context.setEducationType(addressType);
		context.setPersonPaper(personPaper);
		context.setBegDate(begDate);
		context.setEndDate(endDate);

		String expectedQuery = "SELECT e FROM PersonEducation e WHERE ( e.person = :person AND e.educationType = :educationType AND e.person = :person AND e.begDate <= :begDate AND e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonEducation> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParametersAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);

		Person person = new Person();
		EducationType addressType = new EducationType();
		PersonPaper personPaper = new PersonPaper();
		Date begDate = new Date();
		Date endDate = new Date();

		PersonEducation context = new PersonEducation();
		context.setPerson(person);
		context.setEducationType(addressType);
		context.setPersonPaper(personPaper);
		context.setBegDate(begDate);
		context.setEndDate(endDate);

		String expectedQuery = "SELECT e FROM PersonEducation e WHERE ( e.person = :person AND e.educationType = :educationType AND e.person = :person AND e.begDate <= :begDate AND e.endDate >= :endDate) ";
		MultiplePagedSearch<PersonEducation> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
