package org.is.lnu.edbo.manager;

/**
 * Class - manager for getting Web Service Client.
 * @author ivanursul
 *
 * @param <WEBSERVICE> WEBSERVICE class.
 */
public interface ServiceManager<WEBSERVICE> {

	/**
	 * Method for getting web service client.
	 * @return web service client.
	 */
	WEBSERVICE getWebServiceClient();
	
}
