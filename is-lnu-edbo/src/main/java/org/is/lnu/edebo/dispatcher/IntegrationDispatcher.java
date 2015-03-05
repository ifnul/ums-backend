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

	/**
	 * Method for getting information http method.
	 * @return http method
	 */
	String getMethod();
}
