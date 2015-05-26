package org.lnu.is.extractor.degree;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.degree.Degree;
import org.lnu.is.domain.degree.type.DegreeType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Degree Parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("degreeParametersExtractor")
public class DegreeParametersExtractor extends AbstractParametersExtractor<Degree> {

	@Resource(name = "degreeTypeDao")
	private Dao<DegreeType, Long> degreeTypeDao;
	
	@Resource(name = "personDao")
	private Dao<Person, Long> personDao;
	
	@Override
	protected Map<String, Object> getParameters(final Degree entity, final Map<String, Object> parameters) {

		addParameter(entity.getDegreeType(), degreeTypeDao, "degreeType", parameters);
		addParameter(entity.getPerson(), personDao, "person", parameters);
		
		return parameters;
	}

}
