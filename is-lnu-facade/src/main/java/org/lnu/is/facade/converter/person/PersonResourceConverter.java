package org.lnu.is.facade.converter.person;

import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.persontype.PersonType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.person.PersonResource;

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
		target.setCitizenCountryId(source.getCitizenCountryId());
		target.setDocNum(source.getDocNum());
		target.setDocSeries(source.getDocSeries());
		target.setEndDate(source.getEndDate());
		target.setFatherName(source.getFatherName());
		target.setFirstName(source.getFirstName());
		target.setId(source.getId());
		target.setIdentifier(source.getIdentifier());
		target.setIsHostel(source.getIsHostel());
		target.setIsMilitary(source.getIsMilitary());
		target.setName(source.getName());
		target.setPhoto(source.getPhoto());
		target.setResident(source.getResident());
		target.setSurname(source.getSurname());
		
		if(source.getPersonTypeId() != null) {
			PersonType personType = new PersonType();
			personType.setId(source.getPersonTypeId());
			
			target.setPersonType(personType);
		}
		
		if(source.getGenderTypeId() != null) {
			GenderType genderType = new GenderType();
			genderType.setId(source.getGenderTypeId());
			
			target.setGenderType(genderType);
		}
		
		if(source.getMarriedTypeId() != null) {
			MarriedType marriedType = new MarriedType();
			marriedType.setId(source.getMarriedTypeId());
			
			target.setMarriedType(marriedType);
		}
		
		if(source.getParentId() != null) {
			Person parent = new Person();
			parent.setId(source.getParentId());
			
			target.setParent(parent);
		}
		
		return target;
	}

	@Override
	public Person convert(final PersonResource source) {
		return convert(source, new Person());
	}

}
