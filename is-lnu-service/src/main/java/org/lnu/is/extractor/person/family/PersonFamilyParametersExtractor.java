package org.lnu.is.extractor.person.family;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.family.type.FamilyType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.family.PersonFamily;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Family Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personFamilyParametersExtractor")
public class PersonFamilyParametersExtractor extends AbstractParametersExtractor<PersonFamily> {

	@Resource(name = "personDao")
	private Dao<Person, Long> personDao;
	
	@Resource(name = "familyTypeDao")
	private Dao<FamilyType, Long> familyTypeDao;
	
	@Override
	protected Map<String, Object> getParameters(final PersonFamily entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getFamilyType(), familyTypeDao, "familyType", parameters);

		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
