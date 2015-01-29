package org.lnu.is.dao.builder.degree;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.degree.Degree;

/**
 * Degree Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("degreeQueryBuilder")
public class DegreeQueryBuilder extends AbstractQueryBuilder<Degree> {
	private static final String PERSON_CONDITION = "e.person=:person ";
	private static final String DEGREE_CONDITION = "e.degreeType=:degreeType ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Degree e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Degree context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(PERSON_CONDITION, context.getPerson())
					.addOrCondition(DEGREE_CONDITION, context.getDegreeType())
				.closeBracket();
	}

}
