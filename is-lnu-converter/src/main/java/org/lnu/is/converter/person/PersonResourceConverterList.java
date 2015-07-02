package org.lnu.is.converter.person;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.multysearch.person.PersonList;
import org.lnu.is.resource.person.PersonResourceList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Person converter.
 * @author illay, ivanursul
 *
 */
@Converter("personListResourceConverter")
public class PersonResourceConverterList extends AbstractConverter<PersonResourceList, PersonList> {

	@Override
	public PersonList convert(final PersonResourceList source, final PersonList target) {

		target.setId(source.getId());
		target.setBegDate(source.getBegDate());
		target.setBirthPlaces(source.getBirthPlace());
		target.setDocNums(source.getDocNum());
		target.setDocSeries(source.getDocSeries());
		target.setEndDate(source.getEndDate());

		target.setFatherNames(source.getFatherName());
		target.setFirstNames(source.getFirstName());
		target.setIdentifiers(source.getIdentifier());
		target.setIsHostel(source.getIsHostel());
		target.setIsMilitary(source.getIsMilitary());
		target.setNames(source.getName());
		target.setPhotos(source.getPhoto());
		target.setResident(source.getResident());
		target.setSurnames(source.getSurname());
		target.setNote(source.getNote());

		// Multi search fields
		if (source.getPersonTypeId() != null) {
			List<PersonType> personTypes = source.getPersonTypeId().stream()
					.map(id -> new PersonType(id))
					.collect(Collectors.toList());
			target.setPersonTypes(personTypes);
		}

		if (source.getParentId() != null) {
			List<Person> parents = source.getParentId().stream()
					.map(id -> new Person(id))
					.collect(Collectors.toList());
			target.setParents(parents);
		}

		if (source.getMarriedTypeId() != null) {
			List<MarriedType> marriedTypes = source.getMarriedTypeId().stream()
					.map(id -> new MarriedType(id))
					.collect(Collectors.toList());
			target.setMarriedTypes(marriedTypes);
		}

		if (source.getCitizenCountryId() != null) {
			List<AdminUnit> adminUnits = source.getCitizenCountryId().stream()
					.map(id -> new AdminUnit(id))
					.collect(Collectors.toList());
			target.setCitizenCountries(adminUnits);
		}

		if (source.getGenderTypeId() != null) {
			List<GenderType> genderTypes = source.getGenderTypeId().stream()
					.map(id -> new GenderType(id))
					.collect(Collectors.toList());
			target.setGenderTypes(genderTypes);
		}

		return target;
	}

	@Override
	public PersonList convert(final PersonResourceList source) {
		return convert(source, new PersonList());
	}
}
