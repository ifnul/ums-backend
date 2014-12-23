package org.lnu.is.web.rest.processor.resolver;

import javax.servlet.http.HttpServletRequest;

import org.lnu.is.facade.annotations.Limit;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Limit Annotation Handler Method argument resolver.
 * @author ivanursul
 *
 */
@Component("limitAnnotationHandlerMethodArgumentResolver")
public class LimitAnnotationHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

	@Override
	public boolean supportsParameter(final MethodParameter parameter) {
		return parameter.getParameterAnnotation(Limit.class) != null;
	}

	@Override
	public Object resolveArgument(final MethodParameter param,
			final ModelAndViewContainer mavContainer,
			final NativeWebRequest request,
			final WebDataBinderFactory binderFactory) throws Exception {

		Class<?> paramType = param.getParameterType();
		Limit annotation = param.getParameterAnnotation(Limit.class);
		Object result = WebArgumentResolver.UNRESOLVED;
		
		if (annotation != null) {
			HttpServletRequest httprequest = (HttpServletRequest) request.getNativeRequest();
			String value = httprequest.getParameter(annotation.value());

			if (value == null) {
				value = annotation.defaultValue();
			}

			if (value == null && annotation.required()) {
				raiseMissingParameterException(annotation.value(), paramType);
			}

			result = Integer.valueOf(value);
		}

		return result;
	}

	/**
	 * Method for raising exception.
	 * 
	 * @param paramName
	 * @param paramType
	 * @throws Exception
	 *             exception.
	 */
	protected void raiseMissingParameterException(final String paramName, final Class<?> paramType) throws Exception {
		throw new IllegalStateException("Missing parameter '" + paramName + "' of type [" + paramType.getName() + "]");
	}

}
