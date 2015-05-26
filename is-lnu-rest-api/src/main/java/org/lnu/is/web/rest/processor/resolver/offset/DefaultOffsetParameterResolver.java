package org.lnu.is.web.rest.processor.resolver.offset;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

import org.lnu.is.annotations.Offset;
import org.springframework.stereotype.Component;

/**
 * Default Offset Parameter Resolver.
 * @author ivanursul
 *
 */
@Component("offsetParameterResolver")
public class DefaultOffsetParameterResolver implements OffsetParameterResolver {

	@Override
	public Integer getOffset(final Offset offsetAnnotation, final Field field, final HttpServletRequest httpRequest) {
		Offset annotation = offsetAnnotation;
		if (annotation == null) {
			annotation = field.getAnnotation(Offset.class);
		}
		
		String value = httpRequest.getParameter(annotation.value());
		
		if (value == null) {
			value = annotation.defaultValue();
		}
		
		if (value == null && annotation.required()) {
			throw new IllegalStateException("Missing parameter '" + annotation.value() + "' of type [" + field.getDeclaringClass().getName() + "]");
		}
		
		return Integer.valueOf(value);
	}

}
