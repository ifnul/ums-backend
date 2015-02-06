package org.lnu.is.dao.builder.person.contact;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.contact.PersonContact;

/**
 * person Address Query Builder.
 * @author illay
 *
 */
@QBuilder("personContactQueryBuilder")
public class PersonContactQueryBuilder extends AbstractQueryBuilder<PersonContact> {
	
	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String CONTACTTYPE_CONDITION = "e.contactType = :addressType ";
	private static final String VALUE_CONDITION = "e.value LIKE CONCAT('%',:value,'%') ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonContact e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonContact context, final BaseQueryBuilder builder) {
		return builder	
				.where()
				.openBracket()
					.addOrCondition(PERSON_CONDITION, context.getPerson())
					.addOrCondition(CONTACTTYPE_CONDITION, context.getContactType())
					.addOrCondition(VALUE_CONDITION, context.getValue())
				.closeBracket();
	}

}
