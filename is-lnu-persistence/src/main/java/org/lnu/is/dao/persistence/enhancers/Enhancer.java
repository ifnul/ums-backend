package org.lnu.is.dao.persistence.enhancers;

/**
 * Interface, that describes chain of responsibility item links.
 * The main purpose of that is to handle basic operations:
 * create, update, delete, get.
 * Such Chain Of Responsibility will give ability to 
 * enhance security issues on the way.
 * @author ivanursul
 *
 * @param <T> resource.
 */
public interface Enhancer<T> {
	
	/**
	 * Method, that enhance entities.
	 * @param resource resource
	 */
	void enhance(T resource);
	
}
