package org.is.lnu.edebo.dispatcher;

/**
 * Integration dispatcher.
 * @author ivanursul
 *
 * @param <RESOURCE> resource.
 */
public interface IntegrationDispatcher<RESOURCE> {

	/**
	 * Method for dispatching.
	 * @param resource
	 */
	void dispatch(RESOURCE resource);
	
}
