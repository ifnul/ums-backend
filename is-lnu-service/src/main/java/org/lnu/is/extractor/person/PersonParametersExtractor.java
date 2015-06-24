package org.lnu.is.extractor.person;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.lnu.is.multysearch.person.PersonList;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Person Parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personParametersExtractor")
public class PersonParametersExtractor extends AbstractParametersExtractor<PersonList> {

	@Resource(name = "personTypeDao")
	private Dao<PersonType, PersonType, Long> personTypeDao;
	
	@Resource(name = "genderTypeDao")
	private Dao<GenderType, GenderType, Long> genderTypeDao;

	@Resource(name = "marriedTypeDao")
	private Dao<MarriedType, MarriedType, Long> marrieTypeDao;

	@Resource(name = "personDao")
	private Dao<Person, Person, Long> personDao;

	@Resource(name = "adminUnitDao")
	private Dao<AdminUnit, AdminUnit, Long> adminUnitDao;

	@Override
	public Map<String, Object> getParameters(final PersonList entity, final Map<String, Object> parameters) {

		addParameter(entity.getParent(), personDao, "parent", parameters);
		addParameter(entity.getPersonType(), personTypeDao, "personType", parameters);
		addParameter(entity.getGenderType(), genderTypeDao, "genderType", parameters);
		addParameter(entity.getMarriedType(), marrieTypeDao, "marridType", parameters);
		addParameter(entity.getCitizenCountry(), adminUnitDao, "citizenCountry", parameters);

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getFirstName(), "firstName", parameters);
		addParameter(entity.getFatherName(), "fatherName", parameters);
		addParameter(entity.getSurname(), "surname", parameters);
		addParameter(entity.getPhoto(), "photo", parameters);
		addParameter(entity.getDocNum(), "docNum", parameters);
		addParameter(entity.getIdentifier(), "identifier", parameters);
		addParameter(entity.getBirthPlace(), "birthPlace", parameters);

		addParameter(entity.getPersonTypes(), personTypeDao, "personTypes", parameters);
		addParameter(entity.getGenderTypes(), genderTypeDao, "genderTypes", parameters);
		addParameter(entity.getMarriedTypes(), marrieTypeDao, "marriedTypes", parameters);
		addParameter(entity.getParents(), personDao, "parents", parameters);
		addParameter(entity.getCitizenCountries(), adminUnitDao, "citizenCountries", parameters);

/*
		addParameter(entity.getNames(), "names", parameters);
		addParameter(entity.getFirstNames(), "firstNames", parameters);
		addParameter(entity.getFatherNames(), "fatherNames", parameters);
		addParameter(entity.getSurnames(), "surnames", parameters);
		addParameter(entity.getPhotos(), "photos", parameters);
		addParameter(entity.getDocSeries(), "docSeries", parameters);
		addParameter(entity.getDocNums(), "docNums", parameters);
		addParameter(entity.getIdentifiers(), "identifiers", parameters);
		addParameter(entity.getBirthPlace(), "birthPlaces", parameters);
*/

		addParameter(entity.getResident(), "resident", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		addParameter(entity.getIsMilitary(), "isMilitary", parameters);
		addParameter(entity.getIsHostel(), "isHostel", parameters);
		
		return parameters;
	}

}
