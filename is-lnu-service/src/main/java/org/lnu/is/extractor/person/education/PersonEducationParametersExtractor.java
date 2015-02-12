package org.lnu.is.extractor.person.education;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.educationtype.EducationType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.education.PersonEducation;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Education Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personEducationParametersExtractor")
public class PersonEducationParametersExtractor extends AbstractParametersExtractor<PersonEducation> {

	@Resource(name = "personDao")
	private Dao<Person, Long> personDao;
	
	@Resource(name = "educationTypeDao")
	private Dao<EducationType, Long> educationTypeDao;
	
	@Resource(name = "personPaperDao")
	private Dao<PersonPaper, Long> personPaperDao;
	
	@Override
	protected Map<String, Object> getParameters(final PersonEducation entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getEducationType(), educationTypeDao, "educationType", parameters);
		addParameter(entity.getPersonPaper(), personPaperDao, "personPaper", parameters);
		
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
