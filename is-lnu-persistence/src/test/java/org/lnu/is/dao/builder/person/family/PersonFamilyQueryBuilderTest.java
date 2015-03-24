package org.lnu.is.dao.builder.person.family;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.familytype.FamilyType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.family.PersonFamily;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PersonFamilyQueryBuilderTest {

	private PersonFamilyQueryBuilder unit = new PersonFamilyQueryBuilder();

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
		PersonFamily context = new PersonFamily();

		String expectedQuery = "SELECT e FROM PersonFamily e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonFamily> pagedSearch = new MultiplePagedSearch<>();
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

		PersonFamily context = new PersonFamily();

		String expectedQuery = "SELECT e FROM PersonFamily e WHERE e.status=:status ";
		MultiplePagedSearch<PersonFamily> pagedSearch = new MultiplePagedSearch<>();
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

		PersonFamily context = new PersonFamily();

		String expectedQuery = "SELECT e FROM PersonFamily e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonFamily> pagedSearch = new MultiplePagedSearch<>();
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

		PersonFamily context = new PersonFamily();

		String expectedQuery = "SELECT e FROM PersonFamily e ";
		MultiplePagedSearch<PersonFamily> pagedSearch = new MultiplePagedSearch<>();
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
		FamilyType addressType = new FamilyType();
		String value = "fasd";

		PersonFamily context = new PersonFamily();
		context.setPerson(person);
		context.setFamilyType(addressType);
		context.setName(value);

		String expectedQuery = "SELECT e FROM PersonFamily e WHERE ( e.person = :person AND e.familyType = :familyType AND e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonFamily> pagedSearch = new MultiplePagedSearch<>();
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
		FamilyType addressType = new FamilyType();
		String value = "fasd";

		PersonFamily context = new PersonFamily();
		context.setPerson(person);
		
		context.setFamilyType(addressType);
		context.setName(value);

		String expectedQuery = "SELECT e FROM PersonFamily e WHERE ( e.person = :person AND e.familyType = :familyType AND e.name LIKE CONCAT('%',:name,'%') ) ";
		MultiplePagedSearch<PersonFamily> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
