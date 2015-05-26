package org.lnu.is.dao.builder.user.group;

import java.util.List;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;

/**
 * User Group View Query Builder This builder works with view.
 * @author ivanursul
 *
 */
@QBuilder("userGroupViewQueryBuilder")
public class UserGroupViewQueryBuilder extends AbstractQueryBuilder<List<Long>> {
	private static final String GROUP_CONDITION_CONDITION = "e.groupId IN (:groupIds)";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM UserGroupView e %s";
	}

	@Override
	protected BaseQueryBuilder build(final List<Long> context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(GROUP_CONDITION_CONDITION, context)
				.closeBracket();
	}
}
