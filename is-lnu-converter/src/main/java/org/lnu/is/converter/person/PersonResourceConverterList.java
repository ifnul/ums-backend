package org.lnu.is.converter.person;

import java.util.ArrayList;
import java.util.List;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.multysearch.person.PersonList;
import org.lnu.is.multysearch.resource.person.PersonResourceList;

/**
 * Person converter.
 * @author illay
 *
 */
@Converter("personListResourceConverter")
public class PersonResourceConverterList extends AbstractConverter<PersonResourceList, PersonList> {

	@Override
	public PersonList convert(final PersonResourceList source, final PersonList target) {
		
		target.setBegDate(source.getBegDate());
		target.setBirthPlace(source.getBirthPlace());
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
		
		if (source.getPersonTypeId() != null) {
		    List<PersonType> personType = new ArrayList<PersonType>();
		    for (Long personTypeId : source.getPersonTypeId()) {
			PersonType type = new PersonType();
			type.setId(personTypeId);
			personType.add(type);
		    }
		    target.setPersonType(personType);
		}
		
		if (source.getGenderTypeId() != null) {
		    List<GenderType> genderTypeId = new ArrayList<GenderType>();
		    for (Long genderType : source.getGenderTypeId()) {
			GenderType type = new GenderType();
			type.setId(genderType);
			genderTypeId.add(type);
		    }
		    target.setGenderType(genderTypeId);
		}
		
		if (source.getMarriedTypeId() != null) {
		    List<MarriedType> marriedTypeId = new ArrayList<MarriedType>();
		    for (Long marriedType : source.getMarriedTypeId()) {
			MarriedType type = new MarriedType();
			type.setId(marriedType);
			marriedTypeId.add(type);
		    }
		    target.setMarriedType(marriedTypeId);
		}
		
		if (source.getParentId() != null) {
		    List<Person> personListId = new ArrayList<Person>();
		    for (Long personList : source.getParentId()) {
			Person person = new Person();
			person.setId(personList);
			personListId.add(person);
		    }
		    target.setParent(personListId);
		}	
		if (source.getCitizenCountryId() != null) {
		    List<AdminUnit> citizenCountryId = new ArrayList<AdminUnit>();
		    for (Long adminUnit : source.getCitizenCountryId()) {
			AdminUnit admin = new AdminUnit();
			admin.setId(adminUnit);
			citizenCountryId.add(admin);
		    }
		    target.setCitizenCountry(citizenCountryId);
		}
			
		
		return target;
	}

	@Override
	public PersonList convert(final PersonResourceList source) {
		return convert(source, new PersonList());
	}
}
