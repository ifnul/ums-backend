package org.lnu.is.queries;
/**
 * Class, that contains all required queries.
 * @author ivanursul
 */
public final class Queries {
	
	private static final String FIND_PICTURES_QUERY_NAME = "Pictures.findPictures";
	private static final String FIND_PICTURES_QUERY = "SELECT p FROM Picture p";

	public static final Queries FIND_PICTURES = new Queries(FIND_PICTURES_QUERY_NAME, FIND_PICTURES_QUERY);

    private final String queryName;
    private final String query;

    /**
     * Constructor, which takes two parameters: name and query.
     * @date Sep 28, 2014
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
