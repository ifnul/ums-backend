package org.lnu.is.facade.resource;

/**
 * Abstract class, that all resources need to implement.
 * @author ivanursul
 *
 */
public abstract class ApiResource {

	/**
	 * Method for getting unique uri for all resources.
	 * @return uri of string representation.
	 */
	public abstract String getUri();
	
}
