package org.lnu.is.dao.builder.markscale.value;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.markscale.value.MarkscaleValue;

/**
 * Markscale value Query Builder.
 * @author OlehZanevych
 *
 */
@QBuilder("markscaleValueQueryBuilder")
public class MarkscaleValueQueryBuilder extends AbstractQueryBuilder<MarkscaleValue> {

	private static final String MARKSCALE_CONDITION = "e.markscale = :markscale ";
	private static final String STRVALUE_CONDITION = "e.strValue LIKE CONCAT('%',:strValue,'%') ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM MarkscaleValue e %s";
	}

	@Override
	protected BaseQueryBuilder build(final MarkscaleValue context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(MARKSCALE_CONDITION, context.getMarkscale())
				.addOrCondition(STRVALUE_CONDITION, context.getStrValue())
				.closeBracket();
	}

}
