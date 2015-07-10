package org.lnu.is.dao.builder.person;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.multysearch.person.PersonList;
import org.lnu.is.pagination.MultiplePagedSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

		String expectedQuery = "SELECT e FROM Person e WHERE (  (LOWER(e.name) LIKE LOWER('%name1%') OR LOWER(e.name) LIKE LOWER('%name2%') ) ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
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

		String expectedQuery = "SELECT e FROM Person e WHERE (  (LOWER(e.name) LIKE LOWER('%name1%') OR LOWER(e.name) LIKE LOWER('%name2%') ) ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
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

		String expectedQuery = "SELECT e FROM Person e WHERE (  (LOWER(e.name) LIKE LOWER('%name1%') OR LOWER(e.name) LIKE LOWER('%name2%') ) AND  (LOWER(e.firstName) LIKE LOWER('%firtName1%') OR LOWER(e.firstName) LIKE LOWER('%firtName2%') OR LOWER(e.firstName) LIKE LOWER('%firtName3%') OR LOWER(e.firstName) LIKE LOWER('%firtName4%') ) AND  (LOWER(e.surname) LIKE LOWER('%surname1%') OR LOWER(e.surname) LIKE LOWER('%surname2%') OR LOWER(e.surname) LIKE LOWER('%surname3%') ) ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonList> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);

		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithPlaceholderWithDocnums() throws Exception {
		// Given
		List docnumes = new ArrayList();
		docnumes.add(1432432L);

		PersonList context = new PersonList();
		context.setDocNums(docnumes);

		String expectedQuery = "SELECT e FROM Person e WHERE (  (LOWER(e.docNum) LIKE LOWER('%1432432%') ) ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonList> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);

		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithPlaceholderWithInvalidDocNum() throws Exception {
		// Given
		List docnumes = new ArrayList();
		docnumes.add("$fsdf32");

		PersonList context = new PersonList();
		context.setDocNums(docnumes);

		String expectedQuery = "SELECT e FROM Person e WHERE (  (LOWER(e.docNum) LIKE LOWER('%$fsdf32%') ) ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
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
