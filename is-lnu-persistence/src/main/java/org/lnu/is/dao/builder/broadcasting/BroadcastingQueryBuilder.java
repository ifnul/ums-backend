package org.lnu.is.dao.builder.broadcasting;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.broadcasting.BroadcastingMessage;

/**
 * Benefit Type query builder.
 * @author ivanursul
 *
 */
@QBuilder("broadcastingQueryBuilder")
public class BroadcastingQueryBuilder extends AbstractQueryBuilder<BroadcastingMessage> {
	private static final String TOPIC_CONDITION = "e.topic LIKE CONCAT('%',:topic,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM BroadcastingMessage e %s";
	}

	@Override
	protected BaseQueryBuilder build(final BroadcastingMessage context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(TOPIC_CONDITION, context.getTopic())
				.closeBracket();
	}

}
