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
 * @author illay
 *
 */
@Converter("personListResourceConverter")
public class PersonResourceConverterList extends AbstractConverter<PersonResourceList, PersonList> {

	@Override
	public PersonList convert(final PersonResourceList source, final PersonList target) {

		target.setId(source.getId());
		target.setBegDate(source.getBegDate());
		target.setBirthPlaces(source.getBirthPlaces());
		target.setDocNums(source.getDocNums());
		target.setDocSeries(source.getDocSeries());
		target.setEndDate(source.getEndDate());
		target.setFatherNames(source.getFatherNames());
		target.setFirstNames(source.getFirstNames());
		target.setIdentifiers(source.getIdentifiers());
		target.setIsHostel(source.getIsHostel());
		target.setIsMilitary(source.getIsMilitary());
		target.setNames(source.getNames());
		target.setPhotos(source.getPhotos());
		target.setResident(source.getResident());
		target.setSurnames(source.getSurnames());
		target.setNote(source.getNote());

		if (source.getPersonTypeIds() != null) {
			List<PersonType> personTypes = source.getPersonTypeIds().stream()
					.map(id -> new PersonType(id))
					.collect(Collectors.toList());
			target.setPersonTypes(personTypes);
		}

		if (source.getParentIds() != null) {
			List<Person> parents = source.getParentIds().stream()
					.map(id -> new Person(id))
					.collect(Collectors.toList());
			target.setParents(parents);
		}

		if (source.getMarriedTypeIds() != null) {
			List<MarriedType> marriedTypes = source.getMarriedTypeIds().stream()
					.map(id -> new MarriedType(id))
					.collect(Collectors.toList());
			target.setMarriedTypes(marriedTypes);
		}

		if (source.getCitizenCountryIds() != null) {
			List<AdminUnit> adminUnits = source.getCitizenCountryIds().stream()
					.map(id -> new AdminUnit(id))
					.collect(Collectors.toList());
			target.setCitizenCountries(adminUnits);
		}

		if (source.getGenderTypeIds() != null) {
			List<GenderType> genderTypes = source.getGenderTypeIds().stream()
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
