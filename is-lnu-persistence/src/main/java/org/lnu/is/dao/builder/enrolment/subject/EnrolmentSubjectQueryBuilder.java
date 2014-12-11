package org.lnu.is.dao.builder.enrolment.subject;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.enrolment.EnrolmentSubject;

/**
 * Enrolment Subject Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("enrolmentSubjectQueryBuilder")
public class EnrolmentSubjectQueryBuilder implements QueryBuilder<EnrolmentSubject> {

	private static final String QUERY = "SELECT e FROM EnrolmentSubject e %s";

	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String ABBRNAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ISTESTING_CONDITION = "e.isTesting = :isTesting ";
	
	
	@Override
	public String build(final EnrolmentSubject context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ISTESTING_CONDITION, context.getIsTesting())
				.build();
		
		return query;
	}

}
