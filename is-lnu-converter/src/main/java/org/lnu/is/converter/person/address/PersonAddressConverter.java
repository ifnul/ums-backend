package org.lnu.is.converter.person.address;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.resource.person.address.PersonAddressResource;

/**
 * Person Address converter.
 * @author ivanursul
 *
 */
@Converter("personAddressConverter")
public class PersonAddressConverter extends AbstractConverter<PersonAddress, PersonAddressResource> {

	@Override
	public PersonAddressResource convert(final PersonAddress source, final PersonAddressResource target) {
		
		if (source.getAddressType() != null) {
			target.setAddressTypeId(source.getAddressType().getId());
		}
		
		if (source.getAdminUnit() != null) {
			target.setAdminUnitId(source.getAdminUnit().getId());
		}
		
		if (source.getAsset() != null) {
			target.setAssetId(source.getAsset().getId());
		}
		
		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}
		
		if (source.getStreetType() != null) {
			target.setStreetTypeId(source.getStreetType().getId());
		}
		
		target.setZipCode(source.getZipCode());
		target.setStreet(source.getStreet());
		target.setApartment(source.getApartment());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		target.setHouse(source.getHouse());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public PersonAddressResource convert(final PersonAddress source) {
		return convert(source, new PersonAddressResource());
	}

}
