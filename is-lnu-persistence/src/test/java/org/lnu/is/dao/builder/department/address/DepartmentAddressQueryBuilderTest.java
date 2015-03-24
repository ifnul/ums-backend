package org.lnu.is.dao.builder.department.address;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.address.DepartmentAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class DepartmentAddressQueryBuilderTest {

	private DepartmentAddressQueryBuilder unit = new DepartmentAddressQueryBuilder();
	
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
		DepartmentAddress context = new DepartmentAddress();

		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentAddress context = new DepartmentAddress();
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.status=:status ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentAddress context = new DepartmentAddress();
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentAddress context = new DepartmentAddress();
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Department department = new Department();
		AddressType addressType = new AddressType();
		AdminUnit adminUnit = new AdminUnit();
		StreetType streetType = new StreetType();
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "fsd";

		DepartmentAddress context = new DepartmentAddress();
		context.setDepartment(department);
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE ( e.department = :department AND e.addressType = :addressType AND e.adminUnit = :adminUnit AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
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
		
		Department department = new Department();
		AddressType addressType = new AddressType();
		AdminUnit adminUnit = new AdminUnit();
		StreetType streetType = new StreetType();
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "fsd";
		
		DepartmentAddress context = new DepartmentAddress();
		context.setDepartment(department);
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE ( e.department = :department AND e.addressType = :addressType AND e.adminUnit = :adminUnit AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
