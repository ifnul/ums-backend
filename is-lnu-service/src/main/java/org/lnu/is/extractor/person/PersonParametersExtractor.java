package org.lnu.is.extractor.person;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
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
	
	@Override
	public Map<String, Object> getParameters(final PersonList entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getPersonTypes(), personTypeDao, "personTypes", parameters);
		addParameter(entity.getGenderTypes(), genderTypeDao, "genderTypes", parameters);
		addParameter(entity.getMarriedTypes(), marrieTypeDao, "marriedTypes", parameters);
		addParameter(entity.getParents(), personDao, "parents", parameters);

		addParameter(entity.getNames(), "names", parameters);
		addParameter(entity.getFirstNames(), "firstNames", parameters);
		addParameter(entity.getFatherNames(), "fatherNames", parameters);
		addParameter(entity.getSurnames(), "surnames", parameters);
		addParameter(entity.getPhotos(), "photos", parameters);
		addParameter(entity.getDocSeries(), "docSeries", parameters);
		addParameter(entity.getDocNums(), "docNums", parameters);
		addParameter(entity.getIdentifiers(), "identifiers", parameters);
		addParameter(entity.getBirthPlace(), "birthPlaces", parameters);

		addParameter(entity.getResident(), "resident", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		addParameter(entity.getIsMilitary(), "isMilitary", parameters);
		addParameter(entity.getIsHostel(), "isHostel", parameters);
		
		return parameters;
	}

}
