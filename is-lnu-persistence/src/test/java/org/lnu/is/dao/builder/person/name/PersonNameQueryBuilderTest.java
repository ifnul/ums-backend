package org.lnu.is.dao.builder.person.name;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.language.language;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.name.PersonName;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PersonNameQueryBuilderTest {

	private PersonNameQueryBuilder unit = new PersonNameQueryBuilder();
	
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
		PersonName context = new PersonName();

		String expected = "SELECT e FROM PersonName e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonName> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		PersonName context = new PersonName();
		
		String expected = "SELECT e FROM PersonName e WHERE e.status=:status ";
		MultiplePagedSearch<PersonName> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		PersonName context = new PersonName();
		
		String expected = "SELECT e FROM PersonName e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonName> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		PersonName context = new PersonName();
		
		String expected = "SELECT e FROM PersonName e ";
		MultiplePagedSearch<PersonName> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Person person = new Person();
		language language = new language();
		String name = "fdsfds";
		String firstName = "fdsfds";
		String fatherName = "rewrtewt";
		String surname = "cvdfgfdh";
		
		PersonName context = new PersonName();
		context.setPerson(person);
		context.setLanguage(language);
		context.setName(name);
		context.setFirstName(firstName);
		context.setFatherName(fatherName);
		context.setSurname(surname);
		
		String expected = "SELECT e FROM PersonName e WHERE ( e.person = :person AND .language = :language AND e.name LIKE CONCAT('%',:name,'%') AND e.firstName LIKE CONCAT('%',:name,'%') AND e.fatherName LIKE CONCAT('%',:fatherName,'%') AND e.surname LIKE CONCAT('%',:surname,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonName> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Person person = new Person();
		language language = new language();
		String name = "fdsfds";
		String firstName = "fdsfds";
		String fatherName = "rewrtewt";
		String surname = "cvdfgfdh";
		
		PersonName context = new PersonName();
		context.setPerson(person);
		context.setLanguage(language);
		context.setName(name);
		context.setFirstName(firstName);
		context.setFatherName(fatherName);
		context.setSurname(surname);
		
		String expected = "SELECT e FROM PersonName e WHERE ( e.person = :person AND .language = :language AND e.name LIKE CONCAT('%',:name,'%') AND e.firstName LIKE CONCAT('%',:name,'%') AND e.fatherName LIKE CONCAT('%',:fatherName,'%') AND e.surname LIKE CONCAT('%',:surname,'%') ) ";
		MultiplePagedSearch<PersonName> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
