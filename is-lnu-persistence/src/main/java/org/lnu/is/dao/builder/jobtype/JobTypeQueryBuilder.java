package org.lnu.is.dao.builder.jobtype;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.jobtype.JobType;

/**
 * 
 * @author kushnir
 *
 */

@QBuilder("jobTypeQueryBuilder")
public class JobTypeQueryBuilder extends AbstractQueryBuilder<JobType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM JobType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final JobType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName());
	}

}
