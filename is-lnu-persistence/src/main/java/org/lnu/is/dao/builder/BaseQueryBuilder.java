package org.lnu.is.dao.builder;

import org.lnu.is.pagination.OrderBy;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * Base Query Builder.
 *
 * @author ivanursul
 */
public class BaseQueryBuilder {
    private static final String WHERE = "WHERE ";
    private static final String OPEN_BRACKET = "( ";
    private static final String CLOSE_BRACKET = ") ";
    private static final String OR = "OR ";
    private static final String AND = "AND ";
    private static final List<String> WHERE_SINGLETON = Collections.singletonList(WHERE);
    private static final List<String> WHERE_OPENBRAKCETSINGLETON = Collections.singletonList(WHERE + OPEN_BRACKET);

    private String query;
    private List<String> conditions;

    /**
     * Base Constructor.
     *
     * @param query      query
     * @param conditions conditions
     */
    public BaseQueryBuilder(final String query, final List<String> conditions) {
        super();
        this.query = query;
        this.conditions = conditions;
    }

    /**
     * Method for getting conditions.
     *
     * @return conditions.
     */
    public List<String> getConditions() {
        return conditions;
    }


    /**
     * Method for building Base Query Builder.
     *
     * @param query query
     * @return Base Query Builder instnace.
     */
    public static BaseQueryBuilder getInstance(final String query) {
        return new BaseQueryBuilder(query, new ArrayList<String>());
    }

    /**
     * Method for adding condition with parameter.
     *
     * @param condition condition
     * @param parameter parameter
     * @return Base query builder instance.
     */
    public BaseQueryBuilder addOrCondition(final String condition, final Object parameter) {

        if (parameter != null) {
            or();
            getConditions().add(condition);
        }

        return this;
    }

    /**
     * Method for adding and conditions.
     *
     * @param condition condition
     * @param parameter parameter
     * @return this.
     */
    public BaseQueryBuilder addAndCondition(final String condition, final Object parameter) {

        if (parameter != null) {
            and();
            addCondition(condition);
        }

        return this;
    }

    /**
     * Method for adding condition withous placeholder.
     *
     * @param condition condition
     * @return Base Query Builder.
     */
    public BaseQueryBuilder addCondition(final String condition) {
        getConditions().add(condition);
        return this;
    }

    /**
     * Method for adding and conditions.
     *
     * @param condition condition
     * @param parameter parameter
     * @return this.
     */
    public BaseQueryBuilder addAndCondition(final String condition, final List<?> parameter) {

        if (parameter != null && !parameter.isEmpty()) {
            and();
            getConditions().add(condition);
        }

        return this;
    }

    /**
     * Method for adding multi params.
     *
     * @param func   fund
     * @param values values.
     * @return BaseQueryBuilder.
     */
    public BaseQueryBuilder addAndConditionForLoop(final Function<Object, String> func, final List<?> values) {
        StringBuilder builder = new StringBuilder(" (");
        List<Object> parameters = new ArrayList<>();

        if (values != null) {
            for (Object value : values) {

                if (!parameters.isEmpty()) {
                    builder.append("OR ");
                }

                builder.append(func.apply(value));
                parameters.add(value);
            }
            builder.append(") ");

            addAndCondition(builder.toString());
        }
        return this;
    }

    /**
     * Method for adding and conditions.
     *
     * @param condition condition
     * @return this.
     */
    public BaseQueryBuilder addAndCondition(final String condition) {
        and();
        getConditions().add(condition);

        return this;
    }

    /**
     * Checks if query builder contains conditions.
     *
     * @return boolean value
     */
    private boolean hasConditions() {
        boolean result = WHERE_SINGLETON.equals(getConditions())
                || WHERE_OPENBRAKCETSINGLETON.equals(getConditions());
        return result;
    }

    /**
     * Add open bracket.
     *
     * @return this
     */
    public BaseQueryBuilder openBracket() {

        if (hasConditions()) {
            getConditions().set(0, WHERE + OPEN_BRACKET);
        } else {
            getConditions().add(OPEN_BRACKET);
        }

        return this;
    }

    /**
     * Add closed bracket.
     *
     * @return this.
     */
    public BaseQueryBuilder closeBracket() {

        if (hasConditions()) {
            getConditions().set(0, WHERE);
        } else {
            getConditions().add(CLOSE_BRACKET);
        }

        return this;
    }

    /**
     * Where condition.
     *
     * @return Base Query builder.
     */
    public BaseQueryBuilder where() {
        getConditions().add(WHERE);
        return this;
    }

    /**
     * Or special word.
     *
     * @return Base Query Builder.
     */
    public BaseQueryBuilder or() {

        if (!hasConditions()) {
            getConditions().add(OR);
        }

        return this;
    }

    /**
     * Add and keyword.
     *
     * @return this
     */
    public BaseQueryBuilder and() {

        if (!hasConditions()) {
            getConditions().add(AND);
        }

        return this;
    }

    /**
     * Method for setting order by.
     *
     * @param orders orders
     * @return base query builder.
     */
    public BaseQueryBuilder orderBy(final List<OrderBy> orders) {

        if (orders != null && !orders.isEmpty()) {
            String orderBy = getOrderBy(orders);
            addCondition(orderBy);
        }

        return this;
    }

    /**
     * Internal method for getting order by.
     *
     * @param orders orders
     * @return order by string.
     */
    private String getOrderBy(final List<OrderBy> orders) {
        StringBuilder builder = new StringBuilder("ORDER BY ");

        for (int i = 0; i < orders.size(); i++) {

            OrderBy orderBy = orders.get(i);
            StringBuilder singleOrderBy = new StringBuilder(MessageFormat.format("e.{0} {1}", orderBy.getFieldName(), orderBy.getType().name()));

            // Check whether it is not the last element in the list
            if (i != orders.size() - 1) {
                singleOrderBy.append(", ");
            }

            builder.append(singleOrderBy);
        }

        return builder.toString();
    }

    /**
     * Method for building final query.
     *
     * @return Final Query
     */
    public String getFinalQuery() {
        return String.format(query, prepareConditions(conditions));
    }

    /**
     * Method for preparing conditions.
     *
     * @param conditions conditions
     * @return Prepared conditions.
     */
    private String prepareConditions(final List<String> conditions) {
        StringBuilder sb = new StringBuilder();

        prepareUnusedConditions(conditions);

        if (!hasConditions()) {
            for (String condition : conditions) {
                sb.append(condition);
            }
        }

        return sb.toString();
    }

    /**
     * Method for preparing conditions.
     *
     * @param conds conds
     */
    private void prepareUnusedConditions(final List<String> conds) {
        // If there is where() method and no parameters and at the end we have orderBy();
        if (conds.contains(WHERE)) {
            Integer ind = conds.indexOf(WHERE);
            if (ind + 1 < conds.size() && conds.get(ind + 1) == AND) {
                conds.remove(ind + 1);
            }
            if (conds.size() == 2 && conds.get(1).contains("ORDER BY")) {
                conds.remove(WHERE);
            }
        }

    }

    /**
     * Final method for builder - build query.
     *
     * @return ready query.
     */
    public String build() {
        return getFinalQuery();
    }


}
