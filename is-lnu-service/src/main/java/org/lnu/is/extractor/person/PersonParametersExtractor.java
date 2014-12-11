package org.lnu.is.extractor.person;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personParametersExtractor")
public class PersonParametersExtractor extends AbstractParametersExtractor<Person> {

	@Resource(name = "personTypeDao")
	private Dao<PersonType, Long> personTypeDao;
	
	@Resource(name = "genderTypeDao")
	private Dao<GenderType, Long> genderTypeDao;

	@Resource(name = "marriedTypeDao")
	private Dao<MarriedType, Long> marrieTypeDao;

	@Resource(name = "personDao")
	private Dao<Person, Long> personDao;
	
	@Override
	public Map<String, Object> getParameters(final Person entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getPersonType(), personTypeDao, "personType", parameters);
		addParameter(entity.getGenderType(), genderTypeDao, "genderType", parameters);
		addParameter(entity.getMarriedType(), marrieTypeDao, "marriedType", parameters);
		addParameter(entity.getParent(), personDao, "parent", parameters);

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getFirstName(), "firstName", parameters);
		addParameter(entity.getFatherName(), "fatherName", parameters);
		addParameter(entity.getSurname(), "surname", parameters);
		addParameter(entity.getPhoto(), "photo", parameters);
		addParameter(entity.getDocSeries(), "docSeries", parameters);
		addParameter(entity.getDocNum(), "docNum", parameters);
		addParameter(entity.getIdentifier(), "identifier", parameters);
		addParameter(entity.getResident(), "resident", parameters);
		addParameter(entity.getBirthPlace(), "birthPlace", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		addParameter(entity.getIsMilitary(), "isMilitary", parameters);
		addParameter(entity.getIsHostel(), "isHostel", parameters);
		
		return parameters;
	}

}
