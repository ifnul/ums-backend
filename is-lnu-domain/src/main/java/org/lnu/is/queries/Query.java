package org.lnu.is.queries;

import java.util.Collections;
import java.util.Map;

/**
 * Class, that contains all required queries.
 * @author ivanursul
 *
 * @param <E> Entity.
 */
public final class Query<E> {
	
	private Class<E> clazz;
    private final String query;
    private Map<String, Object> parameters;

    /**
     *  Constructor, which takes two parameters: name and query.
     * @param clazz clazz
     * @param query query
     */
    public Query(final Class<E> clazz, final String query) {
        this.clazz = clazz;
    	this.query = query;
		this.parameters = Collections.emptyMap();
    }

    /**
     * Constructor for three arguments.
     * @param clazz clazz
     * @param query query
     * @param parameters parameters
     */
    public Query(final Class<E> clazz, final String query, final Map<String, Object> parameters) {
		super();
		this.clazz = clazz;
		this.query = query;
		this.parameters = parameters;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(final Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	public void setClazz(final Class<E> clazz) {
		this.clazz = clazz;
	}

	public String getQuery() {
        return query;
    }

	public Class<E> getClazz() {
		return clazz;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((query == null) ? 0 : query.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Query<?> other = (Query<?>) obj;
		if (query == null) {
			if (other.query != null) {
				return false;
			}
		} else if (!query.equals(other.query)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Queries [clazz=" + clazz + ", query=" + query + "]";
	}
    
}

