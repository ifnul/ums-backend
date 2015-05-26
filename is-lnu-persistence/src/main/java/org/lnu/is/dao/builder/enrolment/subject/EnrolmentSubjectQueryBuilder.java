package org.lnu.is.dao.builder.enrolment.subject;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;

/**
 * Enrolment Subject Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("enrolmentSubjectQueryBuilder")
public class EnrolmentSubjectQueryBuilder extends AbstractQueryBuilder<EnrolmentSubject> {
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String ABBRNAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ISTESTING_CONDITION = "e.isTesting = :isTesting ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM EnrolmentSubject e %s";
	}


	@Override
	protected BaseQueryBuilder build(final EnrolmentSubject context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PARENT_CONDITION, context.getParent())
					.addAndCondition(ABBRNAME_CONDITION, context.getAbbrName())
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ISTESTING_CONDITION, context.getIsTesting())
				.closeBracket();
	}

}
