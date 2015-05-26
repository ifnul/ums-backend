package org.lnu.is.dao.builder;

import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.springframework.beans.factory.annotation.Value;

/**
 * Abstract query builder.
 * The reason I created this query builder is that
 * I need to have place, where I will add default constaints
 * for <b>ALL</b> query builders, such as
 * status = 'ACTIVE'.
 * What you should know when you will extend this abstract class:
 * 1) Make alias for your query builder with 'e' word.
 * SELECT e FROM Entity e
 * 
 * @author ivanursul
 *
 * @param <E> entity.
 */
public abstract class AbstractQueryBuilder<E> implements QueryBuilder<E> {
	private static final String STATUS_CONDITION = "e.status=:status ";
	private static final String GROUP_CONDITION = "e.crtUserGroup IN (:userGroups) ";

	@Value("${active.filtering}")
	private Boolean active;

	@Value("${security.filtering}")
	private Boolean security;
	
	/**
	 * Method for getting base query.
	 * @return base query.
	 */
	protected abstract String getBaseQuery();
	
	/**
	 * Method, that builds and adds all required constaints.
	 * This methods add additional constraint for statuses.
	 * @param context context
	 * @param builder builder
	 * @return BaseQueryBuilder instance.
	 */
	protected abstract BaseQueryBuilder build(final E context, BaseQueryBuilder builder);

	@Override
	public String build(final MultiplePagedSearch<E> pagedSearch) {
		BaseQueryBuilder builder = build(pagedSearch.getEntity(), BaseQueryBuilder.getInstance(getBaseQuery()));
		
		if (active) {
			builder.addAndCondition(STATUS_CONDITION, RowStatus.ACTIVE);
		}
		
		if (security) {
			builder.addAndCondition(GROUP_CONDITION);
		}
		
		builder.orderBy(pagedSearch.getOrders());
		
		return builder.build();
	}

	public void setActive(final Boolean active) {
		this.active = active;
	}

	public void setSecurity(final Boolean security) {
		this.security = security;
	}
	
}
