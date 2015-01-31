package org.lnu.is.dao.builder;

import javax.annotation.Resource;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.common.RowStatus;

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
 * @param <E>
 */
public abstract class AbstractQueryBuilder<E extends Model> implements QueryBuilder<E> {
	private static final String STATUS_CONDITION = "e.status=:status ";
	private static final String GROUP_CONDITION = "e.crtUserGroup IN (:userGroups) ";

	//TODO: Change to @Value annotation and remove bean from context.
	@Resource(name = "activeFiltering")
	private Boolean active;
	
	@Resource(name = "securityFiltering")
	private Boolean security;
	
	/**
	 * Method for getting base query.
	 * @return base query.
	 */
	protected abstract String getBaseQuery();
	
	/**
	 * Method, that builds and adds all required constaints.
	 * This methods add additional constraint for statuses.
	 * @param context
	 * @param builder
	 * @return BaseQueryBuilder instance.
	 */
	protected abstract BaseQueryBuilder build(final E context, BaseQueryBuilder builder);

	@Override
	public String build(final E context) {
		BaseQueryBuilder builder = build(context, BaseQueryBuilder.getInstance(getBaseQuery()));
		
		if (active) {
			builder.addAndCondition(STATUS_CONDITION, RowStatus.ACTIVE);
		}
		
		if (security) {
			builder.addAndCondition(GROUP_CONDITION);
		}
		
		return builder.build();
	}

	public void setActive(final Boolean active) {
		this.active = active;
	}

	public void setSecurity(final Boolean security) {
		this.security = security;
	}
	
}
