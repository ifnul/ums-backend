package org.lnu.is.dao.builder.markscale.exchange;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.markscale.exchange.MarkscaleExchange;

/**
 * Markscale exchange Query Builder.
 * @author OlehZanevych
 *
 */
@QBuilder("markscaleExchangeQueryBuilder")
public class MarkscaleExchangeQueryBuilder extends AbstractQueryBuilder<MarkscaleExchange> {

	private static final String MARKSCALE_CONDITION = "e.markscale = :markscale ";
	private static final String MARKSCALEVALUE_CONDITION = "e.markscaleValue = :markscaleValue ";
	private static final String MARKSCALEEXCHANGE_CONDITION = "e.markscaleExchange = :markscaleExchange ";
	private static final String MARKSCALEEXCHANGEVALUE_CONDITION = "e.markscaleExchangeValue = :markscaleExchangeValue ";
	private static final String MARKMIN_CONDITION = "e.markMin = :markMin ";
	private static final String MARKMAX_CONDITION = "e.markMax = :markMax ";
	private static final String MARKEXCHANGE_CONDITION = "e.markExchange = :markExchange ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM MarkscaleExchange e %s";
	}

	@Override
	protected BaseQueryBuilder build(final MarkscaleExchange context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(MARKSCALE_CONDITION, context.getMarkscale())
					.addAndCondition(MARKSCALEVALUE_CONDITION, context.getMarkscaleValue())
					.addAndCondition(MARKSCALEEXCHANGE_CONDITION, context.getMarkscaleExchange())
					.addAndCondition(MARKSCALEEXCHANGEVALUE_CONDITION, context.getMarkscaleExchangeValue())
					.addAndCondition(MARKMIN_CONDITION, context.getMarkMin())
					.addAndCondition(MARKMAX_CONDITION, context.getMarkMax())
					.addAndCondition(MARKEXCHANGE_CONDITION, context.getMarkExchange())
				.closeBracket();
	}

}
