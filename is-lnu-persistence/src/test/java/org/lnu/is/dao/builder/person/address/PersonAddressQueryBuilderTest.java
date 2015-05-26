package org.lnu.is.dao.builder.person.address;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.address.PersonAddress;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PersonAddressQueryBuilderTest {

	private PersonAddressQueryBuilder unit = new PersonAddressQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Person person = new Person();
		AddressType addressType = new AddressType();
		AdminUnit adminUnit = new AdminUnit();
		StreetType streetType = new StreetType();
		Date begDate = new Date();
		Date endDate = new Date();
		
		PersonAddress context = new PersonAddress();
		context.setPerson(person);
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setStreetType(streetType);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		String expectedQuery = "SELECT e FROM PersonAddress e WHERE ( e.person = :person AND e.addressType = :addressType AND e.adminUnit = :adminUnit AND e.streetType =:streetType AND e.begDate <= :begDate AND e.endDate >= :endDate ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonAddress> pagedSearch = new MultiplePagedSearch<>();
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
		
		Person person = new Person();
		AddressType addressType = new AddressType();
		AdminUnit adminUnit = new AdminUnit();
		StreetType streetType = new StreetType();
		Date begDate = new Date();
		Date endDate = new Date();
		
		PersonAddress context = new PersonAddress();
		context.setPerson(person);
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setStreetType(streetType);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		String expectedQuery = "SELECT e FROM PersonAddress e WHERE ( e.person = :person AND e.addressType = :addressType AND e.adminUnit = :adminUnit AND e.streetType =:streetType AND e.begDate <= :begDate AND e.endDate >= :endDate ) ";
		MultiplePagedSearch<PersonAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuild() throws Exception {
		// Given
		PersonAddress context = new PersonAddress();
		
		String expectedQuery = "SELECT e FROM PersonAddress e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonAddress> pagedSearch = new MultiplePagedSearch<>();
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
		
		PersonAddress context = new PersonAddress();
		
		String expectedQuery = "SELECT e FROM PersonAddress e WHERE e.status=:status ";
		MultiplePagedSearch<PersonAddress> pagedSearch = new MultiplePagedSearch<>();
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
		PersonAddress context = new PersonAddress();
		
		String expectedQuery = "SELECT e FROM PersonAddress e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonAddress> pagedSearch = new MultiplePagedSearch<>();
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
		
		PersonAddress context = new PersonAddress();
		
		String expectedQuery = "SELECT e FROM PersonAddress e ";
		MultiplePagedSearch<PersonAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
