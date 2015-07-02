package org.lnu.is.web.rest.processor.resolver.limit;

import org.lnu.is.annotations.Limit;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

/**
 * Interface, that declares method for getting offset from parameters.
 * @author ivanursul
 *
 */
public interface LimitParameterResolver {

	/**
	 * Method for getting Offset from parameter.
	 * @param annotation annotation.
	 * @param field field.
	 * @param httpRequest httpRequest.
	 * @return Integer value.
	 */
	Integer getLimit(Limit annotation, final Field field, final HttpServletRequest httpRequest);
	
}
