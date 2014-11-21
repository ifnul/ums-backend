package org.lnu.is.dao.builder.jobtype;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Component;

/**
 * 
 * @author kushnir
 *
 */

@Component("jobTypeQueryBuilder")
public class JobTypeQueryBuilder implements QueryBuilder<JobType> {

	private static final String QUERY_NAME = "JobTypeQueryBuilder";
	private static final String QUERY = "SELECT g FROM JobType g %s";

	private static final String NAME_CONDITION = "g.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "g.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public Queries build(final JobType context) {

		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return new Queries(QUERY_NAME, query);
	}

}
