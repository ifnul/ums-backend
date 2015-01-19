package org.lnu.is.dao.builder;

import org.lnu.is.domain.Model;

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

	/**
	 * Method for getting base query.
	 * @return base query.
	 */
	protected abstract String getBaseQuery();
	
	/**
	 * Method, that builds and adds all required constaints.
	 * @param context
	 * @param builder
	 * @return BaseQueryBuilder instance.
	 */
	protected abstract BaseQueryBuilder build(final E context, BaseQueryBuilder builder);

	@Override
	public String build(final E context) {
		BaseQueryBuilder builder = BaseQueryBuilder.getInstance(getBaseQuery());
		BaseQueryBuilder finalBuilder = build(context, builder);
		
		return finalBuilder.build();
	}
	
}
