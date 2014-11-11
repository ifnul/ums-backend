package org.lnu.is.service.enrolmentsubject;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.enrolmentsubject.EnrolmentSubjectDao;
import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * 
 * @author ivanursul
 *
 */
@Service("enrolmentSubjectService")
public class DefaultEnrolmentSubjectService implements EnrolmentSubjectService {

	@Resource(name = "enrolmentSubjectDao")
	private EnrolmentSubjectDao enrolmentSubjectDao;
	
	@Override
	public PagedResult<EnrolmentSubject> getEnrolmentSubjects(final PagedSearch<EnrolmentSubject> pagedSearch) {
		return enrolmentSubjectDao.getEnrolmentSubjects(pagedSearch);
	}

}
