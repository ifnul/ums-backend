package org.lnu.is.extractor;

import java.util.Map;

/**
 * Interface, that is used to retrieve all parameters from special pagedSearch.
 * @author ivanursul
 *
 * @param <T> entity.
 */
public interface ParametersExtractor<T> {

	/**
	 * method for getting parameters from pagedSearch.
	 * @param entity entity.
	 * @return parameters.
	 */
	Map<String, Object> getParameters(T entity);

}
