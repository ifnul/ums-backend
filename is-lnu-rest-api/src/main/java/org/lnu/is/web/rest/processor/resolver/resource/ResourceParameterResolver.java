package org.lnu.is.web.rest.processor.resolver.resource;

import org.springframework.core.MethodParameter;

import java.util.Map;

/**
 * Interface, that declares method for getting resource for filtering.
 * @author ivanursul
 *
 */
public interface ResourceParameterResolver {

	/**
	 * Method, that returns ready instance of object.
	 * @param parameter parameter.
	 * @param parameters parameters.
	 * @return instance of resource for filtering.
	 */
	Object getResource(final MethodParameter parameter, final Map<String, Object> parameters);
	
}
