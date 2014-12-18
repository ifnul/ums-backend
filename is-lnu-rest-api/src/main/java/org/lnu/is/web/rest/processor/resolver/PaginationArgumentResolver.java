package org.lnu.is.web.rest.processor.resolver;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;

import org.lnu.is.web.rest.annotation.Limit;
import org.lnu.is.web.rest.annotation.Offset;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Component for convenient work with paged parameters.
 * @author ivanursul
 *
 */
public class PaginationArgumentResolver implements HandlerMethodArgumentResolver {
	 
	@Override
	public boolean supportsParameter(final MethodParameter parameter) {
		return parameter.getParameterAnnotation(Limit.class) != null || parameter.getParameterAnnotation(Offset.class) != null;
	}

	@Override
	public Object resolveArgument(final MethodParameter param,
			final ModelAndViewContainer mavContainer, final NativeWebRequest request,
			final WebDataBinderFactory binderFactory) throws Exception {
        Annotation[] paramAnns = param.getParameterAnnotations();
        
        Class<?> paramType = param.getParameterType();
 
        for (Annotation paramAnnotation : paramAnns) {
            if (Limit.class.isInstance(paramAnnotation)) {
            	
            	Limit reqAttr = (Limit) paramAnnotation;
                HttpServletRequest httprequest = (HttpServletRequest) request.getNativeRequest();
                String result = httprequest.getParameter(reqAttr.value());
 
                if (result == null) {
                    result = reqAttr.defaultValue();
                }
                
                if (result == null && reqAttr.required()) {
                    raiseMissingParameterException(reqAttr.value(), paramType);
                }
                
                return Integer.valueOf(result);
            }
            if (Offset.class.isInstance(paramAnnotation)) {
            	
            	Offset reqAttr = (Offset) paramAnnotation;
            	HttpServletRequest httprequest = (HttpServletRequest) request.getNativeRequest();
            	String result = httprequest.getParameter(reqAttr.value());
            	
            	if (result == null) {
            		result = reqAttr.defaultValue();
            	}
            	
            	if (result == null && reqAttr.required()) {
            		raiseMissingParameterException(reqAttr.value(), paramType);
            	}
            	
            	return Integer.valueOf(result);
            }
        }
 
        return WebArgumentResolver.UNRESOLVED;
	}

	/**
	 * Method for raising exception.
	 * @param paramName
	 * @param paramType
	 * @throws Exception exception.
	 */
    protected void raiseMissingParameterException(final String paramName, final Class<?> paramType) throws Exception {
        throw new IllegalStateException("Missing parameter '" + paramName + "' of type [" + paramType.getName() + "]");
    }


}
