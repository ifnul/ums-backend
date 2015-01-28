package org.lnu.is.converter.department.address;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.address.DepartmentAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.resource.department.address.DepartmentAddressResource;

public class DepartmentAddressResourceConverterTest {

	private DepartmentAddressResourceConverter unit = new DepartmentAddressResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		Long departmentId = 1L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long addressTypeId = 2L;
		AddressType addressType = new AddressType();
		addressType.setId(addressTypeId);

		Long adminUnitId = 3L;
		AdminUnit adminUnit = new AdminUnit();
		adminUnit.setId(adminUnitId);

		Long streetTypeId = 4L;
		StreetType streetType = new StreetType();
		streetType.setId(streetTypeId);

		String zipCode = "zip Code";
		String street = "street ";
		String house = "house";
		String apartment = "1L";

		DepartmentAddressResource source = new DepartmentAddressResource();
		source.setDepartmentId(departmentId);
		source.setAddressTypeId(addressTypeId);
		source.setAdminUnitId(adminUnitId);
		source.setStreetTypeId(streetTypeId);
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setHouse(house);
		source.setApartment(apartment);
		
		DepartmentAddress expected = new DepartmentAddress();
		expected.setDepartment(department);
		expected.setAddressType(addressType);
		expected.setAdminUnit(adminUnit);
		expected.setStreetType(streetType);
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setHouse(house);
		expected.setApartment(apartment);
		
		// When
		DepartmentAddress actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		DepartmentAddressResource source = new DepartmentAddressResource();
		DepartmentAddress expected = new DepartmentAddress();
		
		// When
		DepartmentAddress actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long departmentId = 1L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long addressTypeId = 2L;
		AddressType addressType = new AddressType();
		addressType.setId(addressTypeId);

		Long adminUnitId = 3L;
		AdminUnit adminUnit = new AdminUnit();
		adminUnit.setId(adminUnitId);

		Long streetTypeId = 4L;
		StreetType streetType = new StreetType();
		streetType.setId(streetTypeId);

		String zipCode = "zip Code";
		String street = "street ";
		String house = "house";
		String apartment = "1L";

		DepartmentAddressResource source = new DepartmentAddressResource();
		source.setDepartmentId(departmentId);
		source.setAddressTypeId(addressTypeId);
		source.setAdminUnitId(adminUnitId);
		source.setStreetTypeId(streetTypeId);
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setHouse(house);
		source.setApartment(apartment);
		
		DepartmentAddress expected = new DepartmentAddress();
		expected.setDepartment(department);
		expected.setAddressType(addressType);
		expected.setAdminUnit(adminUnit);
		expected.setStreetType(streetType);
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setHouse(house);
		expected.setApartment(apartment);
		
		DepartmentAddressResource source1 = new DepartmentAddressResource();
		DepartmentAddress expected1 = new DepartmentAddress();
		
		List<DepartmentAddressResource> sources = Arrays.asList(source,source1);
		
		List<DepartmentAddress> expecteds = Arrays.asList(expected,expected1);
		// When
		List<DepartmentAddress> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
