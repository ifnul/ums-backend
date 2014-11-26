package org.lnu.is.queries;

/**
 * Class, that contains all required queries.
 * @author ivanursul
 *
 * @param <E> Entity.
 */
public final class Queries<E> {
	
	private Class<E> clazz;
    private final String query;

    /**
     *  Constructor, which takes two parameters: name and query.
     * @param clazz
     * @param query
     */
    public Queries(final Class<E> clazz, final String query) {
        this.clazz = clazz;
    	this.query = query;
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
		Queries<?> other = (Queries<?>) obj;
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

