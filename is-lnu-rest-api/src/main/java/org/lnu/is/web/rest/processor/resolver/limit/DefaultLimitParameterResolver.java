package org.lnu.is.web.rest.processor.resolver.limit;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

import org.lnu.is.annotations.Limit;
import org.springframework.stereotype.Component;

/**
 * Default Limit Parameter Resolver.
 * @author ivanursul
 *
 */
@Component("limitParameterResolver")
public class DefaultLimitParameterResolver implements LimitParameterResolver {

	@Override
	public Integer getLimit(final Limit limitAnnotation, final Field field, final HttpServletRequest httpRequest) {
		Limit annotation = limitAnnotation;
		if (annotation == null) {
			annotation = field.getAnnotation(Limit.class);
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
