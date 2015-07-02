package org.lnu.is.dao.builder.person;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.multysearch.person.PersonList;
import org.lnu.is.pagination.MultiplePagedSearch;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

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
	public void testBuildWithPlaceholder() throws Exception {
		// Given
		PersonList context = new PersonList();
		context.setNames(Arrays.asList("name1", "name2"));

		String expectedQuery = "SELECT e FROM Person e WHERE (  (e.name LIKE '%name1%' OR e.name LIKE '%name2%' ) ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonList> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);

		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithPlaceholderWithAnotherFields() throws Exception {
		// Given
		PersonList context = new PersonList();
		context.setNames(Arrays.asList("name1", "name2"));

		String expectedQuery = "SELECT e FROM Person e WHERE (  (e.name LIKE '%name1%' OR e.name LIKE '%name2%' ) ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonList> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);

		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithPlaceholderWithAllMultiFields() throws Exception {
		// Given
		PersonList context = new PersonList();
		context.setNames(Arrays.asList("name1", "name2"));
		context.setFirstNames(Arrays.asList("firtName1", "firtName2", "firtName3", "firtName4"));
		context.setSurnames(Arrays.asList("surname1", "surname2", "surname3" ));

		String expectedQuery = "SELECT e FROM Person e WHERE (  (e.name LIKE '%name1%' OR e.name LIKE '%name2%' ) AND  (e.firstName LIKE '%firtName1%' OR e.firstName LIKE '%firtName2%' OR e.firstName LIKE '%firtName3%' OR e.firstName LIKE '%firtName4%' ) AND  (e.surname LIKE '%surname1%' OR e.surname LIKE '%surname2%' OR e.surname LIKE '%surname3%' ) ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
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

}
