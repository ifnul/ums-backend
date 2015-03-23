package org.lnu.is.web.rest.processor.resolver.offset;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

import org.lnu.is.annotations.Offset;

/**
 * Interface, that declares method for getting offset from parameters.
 * @author ivanursul
 *
 */
public interface OffsetParameterResolver {

	/**
	 * Method for getting Offset from parameter.
	 * @param annotation
	 * @param field
	 * @param httpRequest
	 * @return Integer value.
	 */
	Integer getOffset(Offset annotation, final Field field, final HttpServletRequest httpRequest);
	
}
