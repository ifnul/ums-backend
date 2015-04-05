package org.lnu.is.converter.person;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.resource.person.PersonResource;

/**
 * Person resource converter.
 * @author ivanursul
 *
 */
@Converter("personResourceConverter")
public class PersonResourceConverter extends AbstractConverter<PersonResource, Person> {

	@Override
	public Person convert(final PersonResource source, final Person target) {
		
		target.setBegDate(source.getBegDate());
		target.setBirthPlace(source.getBirthPlace());
		target.setDocNum(source.getDocNum());
		target.setDocSeries(source.getDocSeries());
		target.setEndDate(source.getEndDate());
		target.setFatherName(source.getFatherName());
		target.setFirstName(source.getFirstName());
		target.setIdentifier(source.getIdentifier());
		target.setIsHostel(source.getIsHostel());
		target.setIsMilitary(source.getIsMilitary());
		target.setName(source.getName());
		target.setPhoto(source.getPhoto());
		target.setResident(source.getResident());
		target.setSurname(source.getSurname());
		
		if (source.getPersonTypeId() != null) {
			PersonType personType = new PersonType();
			personType.setId(source.getPersonTypeId());
			
			target.setPersonType(personType);
		}
		
		if (source.getGenderTypeId() != null) {
			GenderType genderType = new GenderType();
			genderType.setId(source.getGenderTypeId());
			
			target.setGenderType(genderType);
		}
		
		if (source.getMarriedTypeId() != null) {
			MarriedType marriedType = new MarriedType();
			marriedType.setId(source.getMarriedTypeId());
			
			target.setMarriedType(marriedType);
		}
		
		if (source.getParentId() != null) {
			Person parent = new Person();
			parent.setId(source.getParentId());
			
			target.setParent(parent);
		}
		
		if (source.getCitizenCountryId() != null) {
			AdminUnit citizenCountry = new AdminUnit();
			citizenCountry.setId(source.getCitizenCountryId());
			
			target.setCitizenCountry(citizenCountry);
		}
		
		return target;
	}

	@Override
	public Person convert(final PersonResource source) {
		return convert(source, new Person());
	}

}
