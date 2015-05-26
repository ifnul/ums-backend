package org.lnu.is.dao.builder.person.pension;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.pension.PersonPension;

/**
 * Person Pension Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("personPensionQueryBuilder")
public class PersonPensionQueryBuilder extends AbstractQueryBuilder<PersonPension> {
	
	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String CONTACTTYPE_CONDITION = "e.contactType = :addressType ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonPension e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonPension context, final BaseQueryBuilder builder) {
		return builder	
				.where()
				.openBracket()
					.addAndCondition(PERSON_CONDITION, context.getPerson())
					.addAndCondition(CONTACTTYPE_CONDITION, context.getPensionType())
					.addAndCondition(BEGDATE_CONDITION, context.getBegDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}
}
