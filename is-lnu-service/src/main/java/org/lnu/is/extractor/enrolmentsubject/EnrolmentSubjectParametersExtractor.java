package org.lnu.is.extractor.enrolmentsubject;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.enrolmentsubject.EnrolmentSubjectDao;
import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Component;

/**
 * Enrolment Subject parameters extractor.
 * @author ivanursul
 *
 */
@Component("enrolmentSubjectParametersExtractor")
public class EnrolmentSubjectParametersExtractor implements ParametersExtractor<EnrolmentSubject> {

	@Resource(name = "enrolmentSubjectDao")
	private EnrolmentSubjectDao enrolmentSubjectDao;
	
	@Override
	public Map<String, Object> getParameters(final PagedSearch<EnrolmentSubject> pagedSearch) {
		EnrolmentSubject entity = pagedSearch.getEntity();
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		if (entity.getParent() != null) {
			EnrolmentSubject parent = enrolmentSubjectDao.findById(entity.getParent().getId());
			parameters.put("parent", parent);
		}
		
		if (entity.getAbbrName() != null) {
			parameters.put("abbrName", entity.getAbbrName());
		}
		
		if (entity.getName() != null) {
			parameters.put("name", entity.getName());
		}
		
		if (entity.getIsTesting() != null) {
			parameters.put("isTesting", entity.getIsTesting());
		}
		
		return parameters;
	}

}
