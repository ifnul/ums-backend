package org.lnu.is.dao.dao.enrolmentstatustype;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.enrolmentstatustype.EnrolmentStatusType;
import org.springframework.stereotype.Repository;

/**
 * Persistence for EnrolmentStatusType dao layer.
 * @author OlehZanevych
 */
@Repository("enrolmentStatusTypeDao")
public class DefaultEnrolmentStatusTypeDao extends AbstractDao<EnrolmentStatusType, Long> implements EnrolmentStatusTypeDao {

	@Override
	public Class<EnrolmentStatusType> getEntityClass() {
		return EnrolmentStatusType.class;
	}

	@Override
	@Resource(name = "enrolmentStatusTypeQueryBuilder") 
	public void setQueryBuilder(final QueryBuilder<EnrolmentStatusType> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}