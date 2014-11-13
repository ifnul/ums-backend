package org.lnu.is.dao.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Base Query Builder.
 * @author ivanursul
 *
 */
public class BaseQueryBuilder {
	
	private static final String WHERE = "WHERE ";
	private static final String OR = "OR ";
	private static final List<String> WHERE_SINGLETON = Collections.singletonList(WHERE);
	
	private String query;
	private List<String> conditions;
	private List<Object> parameters;
	
	/**
	 * Base Constructor.
	 * @param query
	 * @param conditions
	 * @param parameters
	 */
	public BaseQueryBuilder(final String query, final List<String> conditions,
			final List<Object> parameters) {
		super();
		this.query = query;
		this.conditions = conditions;
		this.parameters = parameters;
	}

	public List<String> getConditions() {
		return conditions;
	}

	public List<Object> getParameters() {
		return parameters;
	}
	
	/**
	 * Method for building Base Query Builder.
	 * @param query
	 * @return Base Query Builder instnace.
	 */
	public static BaseQueryBuilder getInstance(final String query) {
		return new BaseQueryBuilder(query, new ArrayList<String>(), new ArrayList<Object>());
	}
	
	/**
	 * Method for adding condition with parameter.
	 * @param condition
	 * @param parameter
	 * @return Base query builder instance.
	 */
	public BaseQueryBuilder addOrCondition(final String condition, final Object parameter) {
		
		if (parameter != null) {
			or();
			getConditions().add(condition);
			getParameters().add(parameter);
		}
		
		return this;
	}
	
	/**
	 * Where condition.
	 * @return Base Query builder.
	 */
	public BaseQueryBuilder where() {
		getConditions().add(WHERE);
		return this;
	}
	
	/**
	 * Or special word.
	 * @return Base Query Builder.
	 */
	public BaseQueryBuilder or() {
		
		if (!WHERE_SINGLETON.equals(getConditions())) {
			getConditions().add(OR);
		}
		
		return this;
	}
	
	/**
	 * Method for building final query.
	 * @return Final Query
	 */
	public String getFinalQuery() {
		return String.format(query, prepareConditions(conditions));
	}
	
	/**
	 * Method for preparing conditions.
	 * @param conditions
	 * @return Prepared conditions.
	 */
	private String prepareConditions(final List<String> conditions) {
		StringBuilder sb = new StringBuilder();
		
		if (!WHERE_SINGLETON.equals(getConditions())) {
			for (String condition: conditions) {
				sb.append(condition);
			}
		}
		
		return sb.toString();
	}

	/**
	 * Final method for builder - build query.
	 * @return ready query.
	 */
	public String build() {
		return getFinalQuery();
	}
}
