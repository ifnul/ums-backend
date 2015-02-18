package org.lnu.is.dao.builder.markscale;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.markscale.Markscale;

/**
 * Markscale Query Builder.
 * @author OlehZanevych
 *
 */
@QBuilder("markscaleQueryBuilder")
public class MarkscaleQueryBuilder extends AbstractQueryBuilder<Markscale> {

	private static final String MARKSCALETYPE_CONDITION = "e.markscaleType = :markscaleType ";
	private static final String ABBRNAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String MARKMIN_CONDITION = "e.markMin = :markMin ";
	private static final String MARKMAX_CONDITION = "e.markMax = :markMax ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Markscale e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Markscale context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(MARKSCALETYPE_CONDITION, context.getMarkscaleType())
				.addOrCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(MARKMIN_CONDITION, context.getMarkMin())
				.addOrCondition(MARKMAX_CONDITION, context.getMarkMax())
				.closeBracket();
	}

}
