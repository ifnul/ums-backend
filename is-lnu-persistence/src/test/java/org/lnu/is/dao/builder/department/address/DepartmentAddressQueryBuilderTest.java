package org.lnu.is.dao.builder.department.address;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.DepartmentAddress;
import org.lnu.is.domain.streettype.StreetType;

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
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		DepartmentAddress context = new DepartmentAddress();
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		DepartmentAddress context = new DepartmentAddress();
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
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
		
		// When
		String actualQuery = unit.build(context);
		
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
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE ( e.department = :department OR e.addressType = :addressType OR e.adminUnit = :adminUnit OR e.streetType = :streetType OR e.zipCode LIKE CONCAT('%',:zipCode,'%') OR e.street LIKE CONCAT('%',:street,'%') OR e.house LIKE CONCAT('%',:house,'%') OR e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
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
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE ( e.department = :department OR e.addressType = :addressType OR e.adminUnit = :adminUnit OR e.streetType = :streetType OR e.zipCode LIKE CONCAT('%',:zipCode,'%') OR e.street LIKE CONCAT('%',:street,'%') OR e.house LIKE CONCAT('%',:house,'%') OR e.apartment LIKE CONCAT('%',:apartment,'%') ) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
