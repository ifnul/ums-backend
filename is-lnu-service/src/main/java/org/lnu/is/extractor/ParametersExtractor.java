package org.lnu.is.extractor;

import java.util.Map;

import org.lnu.is.pagination.PagedSearch;

/**
 * Interface, that is used to retrieve all parameters from special pagedSearch.
 * @author ivanursul
 *
 * @param <T> entity.
 */
public interface ParametersExtractor<T> {

	/**
	 * method for getting parameters from pagedSearch.
	 * @param pagedSearch
	 * @return ready parameters.
	 */
	Map<String, Object> getParameters(PagedSearch<T> pagedSearch);

}
