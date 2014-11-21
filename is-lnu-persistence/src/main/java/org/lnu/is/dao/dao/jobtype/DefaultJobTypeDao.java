package org.lnu.is.dao.dao.jobtype;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.jobtype.JobType;
import org.springframework.stereotype.Component;

/**
 * 
 * @author kushnir
 *
 */

@Component("jobTypeDao")
public class DefaultJobTypeDao extends AbstractDao<JobType, Long> implements JobTypeDao {

	@Override
	@Resource(name = "jobTypeQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<JobType> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

	@Override
	public Class<JobType> getEntityClass() {
		return JobType.class;
	}

}
