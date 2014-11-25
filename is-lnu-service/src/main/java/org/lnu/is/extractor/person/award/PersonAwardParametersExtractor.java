package org.lnu.is.extractor.person.award;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.person.PersonDao;
import org.lnu.is.dao.dao.person.paper.PersonPaperDao;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Person Award PArameters extractor.
 * @author ivanursul
 *
 */
@Component("personAwardParametersExtractor")
public class PersonAwardParametersExtractor extends AbstractParametersExtractor<PersonAward> {

	@Resource(name = "personDao")
	private PersonDao personDao;
	
	@Resource(name = "personPaperDao")
	private PersonPaperDao personPaperDao;
	
	@Override
	public Map<String, Object> getParameters(final PersonAward entity) {
		Map<String, Object> parameters  = new HashMap<String, Object>();
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getPersonPaper(), personPaperDao, "personPaper", parameters);
		
		return parameters;
	}

}
