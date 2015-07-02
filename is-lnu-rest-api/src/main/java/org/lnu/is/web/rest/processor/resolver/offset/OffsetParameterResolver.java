package org.lnu.is.web.rest.processor.resolver.offset;

import org.lnu.is.annotations.Offset;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

/**
 * Interface, that declares method for getting offset from parameters.
 * @author ivanursul
 *
 */
public interface OffsetParameterResolver {

	/**
	 * Method for getting Offset from parameter.
	 * @param annotation annotation.
	 * @param field field.
	 * @param httpRequest http request.
	 * @return Integer value.
	 */
	Integer getOffset(Offset annotation, final Field field, final HttpServletRequest httpRequest);
	
}
