package org.lnu.is.converter.person.address;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.resource.person.address.PersonAddressResource;

/**
 * Person Address Resource converter.
 * @author ivanursul
 *
 */
@ResourceConverter("personAddressResourceConverter")
public class PersonAddressResourceConverter extends AbstractConverter<PersonAddressResource, PersonAddress> {

	@Override
	public PersonAddress convert(final PersonAddressResource source, final PersonAddress target) {

		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			
			target.setPerson(person);
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
		
		if (source.getAssetId() != null) {
			Asset asset = new Asset();
			asset.setId(source.getAssetId());
			
			target.setAsset(asset);
		}
		
		target.setZipCode(source.getZipCode());
		target.setHouse(source.getHouse());
		target.setStreet(source.getStreet());
		target.setApartment(source.getApartment());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		return target;
	}

	@Override
	public PersonAddress convert(final PersonAddressResource source) {
		return convert(source, new PersonAddress());
	}

}
