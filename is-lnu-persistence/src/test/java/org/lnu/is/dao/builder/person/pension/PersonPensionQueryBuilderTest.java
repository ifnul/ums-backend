package org.lnu.is.dao.builder.person.pension;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.pension.type.PensionType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.pension.PersonPension;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PersonPensionQueryBuilderTest {

	private PersonPensionQueryBuilder unit = new PersonPensionQueryBuilder();

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
		PersonPension context = new PersonPension();

		String expectedQuery = "SELECT e FROM PersonPension e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonPension> pagedSearch = new MultiplePagedSearch<>();
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

		PersonPension context = new PersonPension();

		String expectedQuery = "SELECT e FROM PersonPension e WHERE e.status=:status ";
		MultiplePagedSearch<PersonPension> pagedSearch = new MultiplePagedSearch<>();
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

		PersonPension context = new PersonPension();

		String expectedQuery = "SELECT e FROM PersonPension e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonPension> pagedSearch = new MultiplePagedSearch<>();
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

		PersonPension context = new PersonPension();

		String expectedQuery = "SELECT e FROM PersonPension e ";
		MultiplePagedSearch<PersonPension> pagedSearch = new MultiplePagedSearch<>();
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
		PensionType addressType = new PensionType();
		Date begDate = new Date();
		Date endDate = new Date();

		PersonPension context = new PersonPension();
		context.setPerson(person);
		context.setPensionType(addressType);
		context.setBegDate(begDate);
		context.setEndDate(endDate);

		String expectedQuery = "SELECT e FROM PersonPension e WHERE ( e.person = :person AND e.contactType = :addressType AND e.begDate <= :begDate AND e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonPension> pagedSearch = new MultiplePagedSearch<>();
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
		PensionType addressType = new PensionType();
		Date begDate = new Date();
		Date endDate = new Date();

		PersonPension context = new PersonPension();
		context.setPerson(person);
		context.setPensionType(addressType);
		context.setBegDate(begDate);
		context.setEndDate(endDate);

		String expectedQuery = "SELECT e FROM PersonPension e WHERE ( e.person = :person AND e.contactType = :addressType AND e.begDate <= :begDate AND e.endDate >= :endDate) ";
		MultiplePagedSearch<PersonPension> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
