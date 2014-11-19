package org.lnu.is.dao.dao.enrolment.subject;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
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
	@Resource(name = "enrolmentSubjectQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<EnrolmentSubject> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
