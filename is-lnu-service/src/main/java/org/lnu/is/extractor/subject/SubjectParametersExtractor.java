package org.lnu.is.extractor.subject;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.subject.Subject;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Subject Parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("subjectParametersExtractor")
public class SubjectParametersExtractor extends AbstractParametersExtractor<Subject> {

	@Resource(name = "subjectTypeDao")
	private Dao<SubjectType, SubjectType, Long> subjectTypeDao;
	
	@Override
	protected Map<String, Object> getParameters(final Subject entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getSubjectType(), subjectTypeDao, "subjectType", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
