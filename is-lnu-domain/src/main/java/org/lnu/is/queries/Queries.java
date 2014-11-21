package org.lnu.is.queries;
/**
 * Class, that contains all required queries.
 * @author ivanursul
 */
public final class Queries {
	
    private final String queryName;
    private final String query;

    /**
     * Constructor, which takes two parameters: name and query.
     * @author ivanursul
     * @param queryName the name of query which will be stored in Queries class.
     * @param query query, which will be stored  in Queries class.
     */
    public Queries(final String queryName, final String query) {
        this.queryName = queryName;
        this.query = query;
    }

    public String getQueryName() {
        return queryName;
    }

    public String getQuery() {
        return query;
    }
    
}

