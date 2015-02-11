package org.lnu.is.dao.builder.person.enrolmentsubject;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;

/**
 * Person Enrolment Subject Query Builder.
 * 
 * @author kushnir
 *
 */
@QBuilder("personEnrolmentSubjectQueryBuilder")
public class PersonEnrolmentSubjectQueryBuilder extends AbstractQueryBuilder<PersonEnrolmentSubject> {

	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String PERSONPAPER_CONDITION = "e.personPaper = :personPaper ";
	private static final String ENROLMENTSUBJECT_CONDITION = "e.enrolmentSubject = :enrolmentSubject ";
	private static final String MARK_CONDITION = "e.mark = :mark ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonEnrolmentSubject e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonEnrolmentSubject context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(PERSON_CONDITION, context.getPerson())
				.addOrCondition(PERSONPAPER_CONDITION, context.getPersonPaper())
				.addOrCondition(ENROLMENTSUBJECT_CONDITION, context.getEnrolmentSubject())
				.addOrCondition(MARK_CONDITION, context.getMark())
				.closeBracket();
	}

}
