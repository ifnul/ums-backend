package org.lnu.is.queries;
/**
 * Class, that contains all required queries.
 * @author ivanursul
 */
public final class Queries {
	
	private static final String FIND_SPECOFFERS_QUERY_NAME = "SpecOffers.findSpecOffers";
	private static final String FIND_SPECOFFERS_QUERY = "SELECT s FROM SpecOffer s";

	public static final Queries FIND_SPECOFFERS = new Queries(FIND_SPECOFFERS_QUERY_NAME, FIND_SPECOFFERS_QUERY);

    private final String queryName;
    private final String query;

    /**
     * Constructor, which takes two parameters: name and query.
     * @author ivanursul
     * @param queryName the name of query which will be stored in Queries class.
     * @param query query, which will be stored  in Queries class.
     */
    private Queries(final String queryName, final String query) {
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

