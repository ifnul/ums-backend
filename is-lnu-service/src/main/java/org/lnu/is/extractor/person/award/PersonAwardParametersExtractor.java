package org.lnu.is.extractor.person.award;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.award.PersonAward;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Award PArameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personAwardParametersExtractor")
public class PersonAwardParametersExtractor extends AbstractParametersExtractor<PersonAward> {

	@Resource(name = "personDao")
	private Dao<Person, Person, Long> personDao;
	
	@Resource(name = "personPaperDao")
	private Dao<PersonPaper, PersonPaper, Long> personPaperDao;
	
	@Override
	public Map<String, Object> getParameters(final PersonAward entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getPersonPaper(), personPaperDao, "personPaper", parameters);
		
		return parameters;
	}

}
