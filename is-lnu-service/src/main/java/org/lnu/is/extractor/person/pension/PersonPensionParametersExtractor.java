package org.lnu.is.extractor.person.pension;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.pension.type.PensionType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.pension.PersonPension;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Pension Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personPensionParametersExtractor")
public class PersonPensionParametersExtractor extends AbstractParametersExtractor<PersonPension> {

	@Resource(name = "personDao")
	private Dao<Person, Person, Long> personDao;
	
	@Resource(name = "pensionTypeDao")
	private Dao<PensionType, PensionType, Long> pensionTypeDao;
	
	@Override
	protected Map<String, Object> getParameters(final PersonPension entity, final Map<String, Object> parameters) {
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getPensionType(), pensionTypeDao, "pensionType", parameters);
		
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
