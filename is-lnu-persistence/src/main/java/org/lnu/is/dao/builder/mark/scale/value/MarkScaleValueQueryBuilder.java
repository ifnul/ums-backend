package org.lnu.is.dao.builder.mark.scale.value;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;

/**
 * MarkScale value Query Builder.
 * @author OlehZanevych
 *
 */
@QBuilder("markScaleValueQueryBuilder")
public class MarkScaleValueQueryBuilder extends AbstractQueryBuilder<MarkScaleValue> {

	private static final String MARKSCALE_CONDITION = "e.markScale = :markScale ";
	private static final String STRVALUE_CONDITION = "e.strValue LIKE CONCAT('%',:strValue,'%') ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM MarkScaleValue e %s";
	}

	@Override
	protected BaseQueryBuilder build(final MarkScaleValue context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(MARKSCALE_CONDITION, context.getMarkScale())
					.addAndCondition(STRVALUE_CONDITION, context.getStrValue())
				.closeBracket();
	}

}
