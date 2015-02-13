package org.lnu.is.dao.builder.person.family;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.family.PersonFamily;

/**
 * Person Family Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("personFamilyQueryBuilder")
public class PersonFamilyQueryBuilder extends AbstractQueryBuilder<PersonFamily> {
	
	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String FAMILYTYPE_CONDITION = "e.familyType = :familyType ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonFamily e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonFamily context, final BaseQueryBuilder builder) {
		return builder	
				.where()
				.openBracket()
					.addOrCondition(PERSON_CONDITION, context.getPerson())
					.addOrCondition(FAMILYTYPE_CONDITION, context.getFamilyType())
					.addOrCondition(NAME_CONDITION, context.getName())
				.closeBracket();
	}

}
