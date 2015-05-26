package org.lnu.is.web.rest.processor.resolver.limit;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

import org.lnu.is.annotations.Limit;

/**
 * Interface, that declares method for getting offset from parameters.
 * @author ivanursul
 *
 */
public interface LimitParameterResolver {

	/**
	 * Method for getting Offset from parameter.
	 * @param annotation
	 * @param field
	 * @param httpRequest
	 * @return Integer value.
	 */
	Integer getLimit(Limit annotation, final Field field, final HttpServletRequest httpRequest);
	
}
