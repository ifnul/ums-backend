package org.lnu.is.dao.builder.person;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.multysearch.person.PersonList;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PersonQueryBuilderTest {

	private PersonQueryBuilder unit = new PersonQueryBuilder();
	
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
		PersonList context = new PersonList();
		
		String expectedQuery = "SELECT e FROM Person e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonList> pagedSearch = new MultiplePagedSearch<>();
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
		PersonList context = new PersonList();
		
		String expectedQuery = "SELECT e FROM Person e WHERE e.status=:status ";
		MultiplePagedSearch<PersonList> pagedSearch = new MultiplePagedSearch<>();
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
		PersonList context = new PersonList();
		
		String expectedQuery = "SELECT e FROM Person e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonList> pagedSearch = new MultiplePagedSearch<>();
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
		
		PersonList context = new PersonList();
		
		String expectedQuery = "SELECT e FROM Person e ";
		MultiplePagedSearch<PersonList> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	/*
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		PersonType personType = new PersonType();
		String surname = "fdsfd";
		String docNum = "fsdfds";
		MarriedType marriedType = new MarriedType();

		Person context = new Person();
		context.setName(name);
		context.setPersonTypes(personType);
		context.setMarriedTypes(marriedType);
		context.setSurname(surname);
		context.setDocNum(docNum);

		String expectedQuery = "SELECT e FROM Person e WHERE ( e.personType = :personType AND e.marriedType = :marriedType AND e.name LIKE CONCAT('%',:name,'%') AND e.surname LIKE CONCAT('%',:surname,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Person> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "name";
		PersonType personType = new PersonType();
		String surname = "fdsfd";
		String docNum = "fsdfds";
		MarriedType marriedType = new MarriedType();
		
		Person context = new Person();
		context.setName(name);
		context.setPersonTypes(personType);
		context.setMarriedTypes(marriedType);
		context.setSurname(surname);
		context.setDocNum(docNum);
		
		String expectedQuery = "SELECT e FROM Person e WHERE ( e.personType = :personType AND e.marriedType = :marriedType AND e.name LIKE CONCAT('%',:name,'%') AND e.surname LIKE CONCAT('%',:surname,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') ) ";
		MultiplePagedSearch<Person> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}*/
}
