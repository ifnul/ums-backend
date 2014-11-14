package org.lnu.is.extractor.enrolmentsubject;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.enrolmentsubject.EnrolmentSubjectDao;
import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Enrolment Subject parameters extractor.
 * @author ivanursul
 *
 */
@Component("enrolmentSubjectParametersExtractor")
public class EnrolmentSubjectParametersExtractor extends AbstractParametersExtractor<EnrolmentSubject> {

	@Resource(name = "enrolmentSubjectDao")
	private EnrolmentSubjectDao enrolmentSubjectDao;
	
	@Override
	public Map<String, Object> getParameters(final EnrolmentSubject entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getParent(), enrolmentSubjectDao, "parent", parameters);

		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getIsTesting(), "isTesting", parameters);
		
		return parameters;
	}

}
