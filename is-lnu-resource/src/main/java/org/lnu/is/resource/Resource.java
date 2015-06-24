package org.lnu.is.resource;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Resource.
 */
public abstract class Resource {

	/**
	 * Method, that is used for getting uri for list(multiple resources).
	 * @return root uri.
	 */
	@JsonIgnore
	public abstract String getRootUri();
}
