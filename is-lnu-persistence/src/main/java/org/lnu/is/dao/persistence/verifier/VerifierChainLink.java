package org.lnu.is.dao.persistence.verifier;

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
public interface VerifierChainLink<T> {
	
	/**
	 * Method for verifying all valid cases of entity.
	 * @param resource resource.
	 */
	void verify(T resource);
	
}
