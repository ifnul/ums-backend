package com.optigra.funnypictures.queries;

import java.util.Map;

public class Query<T> {

    private Class<T> entityClass;

    private String query;

    private Map<String, Object> parameters;

    public Query(final Class<T> entityClass, final String query, final Map<String, Object> parameters) {
        super();
        this.entityClass = entityClass;
        this.query = query;
        this.parameters = parameters;
    }

    public Class<T> getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(final Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(final String query) {
        this.query = query;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(final Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((entityClass == null) ? 0 : entityClass.hashCode());
        result = prime * result + ((parameters == null) ? 0 : parameters.hashCode());
        result = prime * result + ((query == null) ? 0 : query.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Query<?> other = (Query<?>) obj;
        if (entityClass == null) {
            if (other.entityClass != null)
                return false;
        } else if (!entityClass.equals(other.entityClass))
            return false;
        if (parameters == null) {
            if (other.parameters != null)
                return false;
        } else if (!parameters.equals(other.parameters))
            return false;
        if (query == null) {
            if (other.query != null)
                return false;
        } else if (!query.equals(other.query))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Query [entityClass=" + entityClass + ", query=" + query + ", parameters=" + parameters + "]";
    }
}
