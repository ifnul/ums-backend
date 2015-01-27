package org.lnu.is.converter.department.address;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.address.DepartmentAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.resource.department.address.DepartmentAddressResource;

/**
 * Department Address Resource Converter.
 * @author ivanursul
 *
 */
@Converter("departmentAddressResourceConverter")
public class DepartmentAddressResourceConverter extends AbstractConverter<DepartmentAddressResource, DepartmentAddress> {

	@Override
	public DepartmentAddress convert(final DepartmentAddressResource source, final DepartmentAddress target) {
		
		if (source.getDepartmentId() != null) {
			Department department = new Department();
			department.setId(source.getDepartmentId());
			target.setDepartment(department);
		}
		
		if (source.getAddressTypeId() != null) {
			AddressType addressType = new AddressType();
			addressType.setId(source.getAddressTypeId());
			target.setAddressType(addressType);
		}
		
		if (source.getAdminUnitId() != null) {
			AdminUnit adminUnit = new AdminUnit();
			adminUnit.setId(source.getAdminUnitId());
			target.setAdminUnit(adminUnit);
		}
		
		if (source.getStreetTypeId() != null) {
			StreetType streetType = new StreetType();
			streetType.setId(source.getStreetTypeId());
			target.setStreetType(streetType);
		}
		
		target.setZipCode(source.getZipCode());
		target.setStreet(source.getStreet());
		target.setHouse(source.getHouse());
		target.setApartment(source.getApartment());
		
		return target;
	}

	@Override
	public DepartmentAddress convert(final DepartmentAddressResource source) {
		return convert(source, new DepartmentAddress());
	}

}
