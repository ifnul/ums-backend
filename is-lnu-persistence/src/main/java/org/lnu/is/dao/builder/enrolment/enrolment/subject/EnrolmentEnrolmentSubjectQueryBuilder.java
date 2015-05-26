package org.lnu.is.dao.builder.enrolment.enrolment.subject;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.enrolment.enrolment.subject.EnrolmentEnrolmentSubject;
/**
 * Enrolment Enrolment Subject Query Builder.
 * @author illay
 *
 */
@QBuilder("enrolmentEnrolmentSubjectQueryBuilder")
public class EnrolmentEnrolmentSubjectQueryBuilder extends AbstractQueryBuilder<EnrolmentEnrolmentSubject> {

    private static final String ENROLMENT_CONDITION = "e.enrolment = :enrolment ";
    private static final String ENROLMENTSUBJECT_CONDITION = "e.enrolmentSubject = :enrolmentSubject ";
    private static final String PERSONENROLMENTSUBJECT_CONDITION = "e.personEnrolmentSubject = :personEnrolmentSubject ";
    private static final String MARK_CONDITION = "e.mark = :mark ";
    
    @Override
    protected String getBaseQuery() {
	return "SELECT e FROM EnrolmentEnrolmentSubject e %s";
    }

    @Override
    protected BaseQueryBuilder build(final EnrolmentEnrolmentSubject context,
	    final BaseQueryBuilder builder) {
	return builder
		.where()
		.openBracket()
			.addAndCondition(ENROLMENT_CONDITION, context.getEnrolment())
			.addAndCondition(ENROLMENTSUBJECT_CONDITION, context.getEnrolmentSubject())
			.addAndCondition(MARK_CONDITION, context.getMark())
			.addAndCondition(PERSONENROLMENTSUBJECT_CONDITION, context.getPersonEnrolmentSubject())
		.closeBracket();
    }

}
