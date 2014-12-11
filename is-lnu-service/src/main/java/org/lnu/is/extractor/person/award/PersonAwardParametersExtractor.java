package org.lnu.is.extractor.person.award;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Award PArameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personAwardParametersExtractor")
public class PersonAwardParametersExtractor extends AbstractParametersExtractor<PersonAward> {

	@Resource(name = "personDao")
	private Dao<Person, Long> personDao;
	
	@Resource(name = "personPaperDao")
	private Dao<PersonPaper, Long> personPaperDao;
	
	@Override
	public Map<String, Object> getParameters(final PersonAward entity) {
		Map<String, Object> parameters  = new HashMap<String, Object>();
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getPersonPaper(), personPaperDao, "personPaper", parameters);
		
		return parameters;
	}

}
