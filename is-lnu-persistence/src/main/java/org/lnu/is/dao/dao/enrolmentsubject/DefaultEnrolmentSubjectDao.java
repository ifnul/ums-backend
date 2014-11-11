package org.lnu.is.dao.dao.enrolmentsubject;

import java.util.Collections;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Repository;

/**
 * Default implemntation of Enrolment Subject Dao.
 * @author ivanursul
 *
 */
@Repository("enrolmentSubjectDao")
public class DefaultEnrolmentSubjectDao extends AbstractDao<EnrolmentSubject, Long> implements EnrolmentSubjectDao {

	@Override
	public Class<EnrolmentSubject> getEntityClass() {
		return EnrolmentSubject.class;
	}

	@Override
	public PagedResult<EnrolmentSubject> getEnrolmentSubjects(final PagedSearch<EnrolmentSubject> pagedSearch) {
		
		Queries query = Queries.FIND_ENROLMENT_SUBJECTS;

		pagedSearch.setClazz(getEntityClass());
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(query);
		
		return search(pagedSearch);
	}

}
