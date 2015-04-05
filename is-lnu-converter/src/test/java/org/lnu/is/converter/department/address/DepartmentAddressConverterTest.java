package org.lnu.is.converter.department.address;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.address.DepartmentAddress;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.resource.department.address.DepartmentAddressResource;

public class DepartmentAddressConverterTest {

	private DepartmentAddressConverter unit = new DepartmentAddressConverter();

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

		Long id = 9L;
		String zipCode = "zip Code";
		String street = "street ";
		String house = "house";
		String apartment = "1L";

		DepartmentAddressResource expected = new DepartmentAddressResource();
		expected.setDepartmentId(departmentId);
		expected.setAddressTypeId(addressTypeId);
		expected.setAdminUnitId(adminUnitId);
		expected.setStreetTypeId(streetTypeId);
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setHouse(house);
		expected.setApartment(apartment);
		expected.setId(id);
		
		DepartmentAddress source = new DepartmentAddress();
		source.setId(id);
		source.setDepartment(department);
		source.setAddressType(addressType);
		source.setAdminUnit(adminUnit);
		source.setStreetType(streetType);
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setHouse(house);
		source.setApartment(apartment);
		
		// When
		DepartmentAddressResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		DepartmentAddressResource expected = new DepartmentAddressResource();
		DepartmentAddress source = new DepartmentAddress();
		
		// When
		DepartmentAddressResource actual = unit.convert(source);
		
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

		Long id = 9L;
		String zipCode = "zip Code";
		String street = "street ";
		String house = "house";
		String apartment = "1L";

		DepartmentAddressResource expected = new DepartmentAddressResource();
		expected.setDepartmentId(departmentId);
		expected.setAddressTypeId(addressTypeId);
		expected.setAdminUnitId(adminUnitId);
		expected.setStreetTypeId(streetTypeId);
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setHouse(house);
		expected.setApartment(apartment);
		expected.setId(id);
		
		DepartmentAddress source = new DepartmentAddress();
		source.setId(id);
		source.setDepartment(department);
		source.setAddressType(addressType);
		source.setAdminUnit(adminUnit);
		source.setStreetType(streetType);
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setHouse(house);
		source.setApartment(apartment);
		
		DepartmentAddressResource expected1 = new DepartmentAddressResource();
		DepartmentAddress source1 = new DepartmentAddress();
		
		List<DepartmentAddress> sources = Arrays.asList(source,source1);
		
		List<DepartmentAddressResource> expecteds = Arrays.asList(expected,expected1);
		// When
		List<DepartmentAddressResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
