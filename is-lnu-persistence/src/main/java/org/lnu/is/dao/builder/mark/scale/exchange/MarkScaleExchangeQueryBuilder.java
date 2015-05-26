package org.lnu.is.dao.builder.mark.scale.exchange;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.mark.scale.exchange.MarkScaleExchange;

/**
 * MarkScale exchange Query Builder.
 * @author OlehZanevych
 *
 */
@QBuilder("markScaleExchangeQueryBuilder")
public class MarkScaleExchangeQueryBuilder extends AbstractQueryBuilder<MarkScaleExchange> {

	private static final String MARKSCALE_CONDITION = "e.markScale = :markScale ";
	private static final String MARKSCALEVALUE_CONDITION = "e.markScaleValue = :markScaleValue ";
	private static final String MARKSCALEEXCHANGE_CONDITION = "e.markScaleExchange = :markScaleExchange ";
	private static final String MARKSCALEEXCHANGEVALUE_CONDITION = "e.markScaleExchangeValue = :markScaleExchangeValue ";
	private static final String MARKMIN_CONDITION = "e.markMin = :markMin ";
	private static final String MARKMAX_CONDITION = "e.markMax = :markMax ";
	private static final String MARKEXCHANGE_CONDITION = "e.markExchange = :markExchange ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM MarkScaleExchange e %s";
	}

	@Override
	protected BaseQueryBuilder build(final MarkScaleExchange context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(MARKSCALE_CONDITION, context.getMarkScale())
					.addAndCondition(MARKSCALEVALUE_CONDITION, context.getMarkScaleValue())
					.addAndCondition(MARKSCALEEXCHANGE_CONDITION, context.getMarkScaleExchange())
					.addAndCondition(MARKSCALEEXCHANGEVALUE_CONDITION, context.getMarkScaleExchangeValue())
					.addAndCondition(MARKMIN_CONDITION, context.getMarkMin())
					.addAndCondition(MARKMAX_CONDITION, context.getMarkMax())
					.addAndCondition(MARKEXCHANGE_CONDITION, context.getMarkExchange())
				.closeBracket();
	}

}
