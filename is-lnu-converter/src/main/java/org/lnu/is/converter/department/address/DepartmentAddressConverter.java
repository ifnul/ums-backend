package org.lnu.is.converter.department.address;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.DepartmentAddress;
import org.lnu.is.resource.department.address.DepartmentAddressResource;

/**
 * Department Address Converter.
 * @author ivanursul
 *
 */
@Converter("departmentAddressConverter")
public class DepartmentAddressConverter extends AbstractConverter<DepartmentAddress, DepartmentAddressResource> {

	@Override
	public DepartmentAddressResource convert(final DepartmentAddress source, final DepartmentAddressResource target) {
		
		if (source.getDepartment() != null) {
			target.setDepartmentId(source.getDepartment().getId());
		}
		
		if (source.getAddressType() != null) {
			target.setAddressTypeId(source.getAddressType().getId());
		}
		
		if (source.getAdminUnit() != null) {
			target.setAdminUnitId(source.getAdminUnit().getId());
		}
		
		if (source.getStreetType() != null) {
			target.setStreetTypeId(source.getStreetType().getId());
		}
		
		target.setId(source.getId());
		target.setZipCode(source.getZipCode());
		target.setStreet(source.getStreet());
		target.setHouse(source.getHouse());
		target.setApartment(source.getApartment());
		
		return target;
	}

	@Override
	public DepartmentAddressResource convert(final DepartmentAddress source) {
		return convert(source, new DepartmentAddressResource());
	}

}
