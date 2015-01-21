package org.lnu.is.dao.builder;

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
		BaseQueryBuilder builder = BaseQueryBuilder.getInstance(getBaseQuery());
		
		BaseQueryBuilder finalBuilder = build(context, builder)
				.addAndCondition(STATUS_CONDITION, RowStatus.ACTIVE);
		
		return finalBuilder.build();
	}
	
}
