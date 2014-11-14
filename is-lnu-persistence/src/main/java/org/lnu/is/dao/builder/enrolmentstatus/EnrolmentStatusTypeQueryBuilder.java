package org.lnu.is.dao.builder.enrolmentstatus;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.enrolmentstatustype.EnrolmentStatusType;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Component;
/**
 * Enrolment Status Type query builder.
 * @author OlehZanevych
 *
 */
@Component("enrolmentStatusTypeQueryBuilder")
public class EnrolmentStatusTypeQueryBuilder implements QueryBuilder<EnrolmentStatusType> {

	private static final String QUERY_NAME = "EnrolmentStatusTypeQueryBuilder";
	private static final String QUERY = "SELECT e FROM EnrolmentStatusType e %s";

	private static final String ABBRNAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String DESCRIPTION_CONDITION = "e.description LIKE CONCAT('%', :description,'%') ";
	
	
	@Override
	public Queries build(final EnrolmentStatusType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(DESCRIPTION_CONDITION, context.getDescription())
				.build();
		
		return new Queries(QUERY_NAME, query);
	}

}
