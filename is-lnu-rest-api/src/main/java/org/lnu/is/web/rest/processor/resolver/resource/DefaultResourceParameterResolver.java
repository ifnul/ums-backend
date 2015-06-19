package org.lnu.is.web.rest.processor.resolver.resource;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;
import org.lnu.is.web.rest.constant.Constants;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;

/**
 * Default implementation of ResourceParameterResolver.
 * @author ivanursul
 *
 */
@Component("resourceParameterResolver")
public class DefaultResourceParameterResolver implements ResourceParameterResolver {

	/**
	 * Method for initializing required staff for commons-beanutils classes.
	 */
	@PostConstruct
	public void init() {
		DateTimeConverter dtConverter = new DateConverter();
		dtConverter.setPattern(Constants.DEFAULT_DATEFORMAT);
		ConvertUtils.register(dtConverter, Date.class);		
	}
	
	@Override
	public Object getResource(final MethodParameter parameter, final Map<String, Object> parameters) {
		Object resource = null;
		try {
			Type genericParameterType = parameter.getGenericParameterType();
	        ParameterizedType parameterizedType = (ParameterizedType) genericParameterType;
	        Class<?> clz = (Class<?>) parameterizedType.getActualTypeArguments()[0];
			resource = clz.newInstance();
			BeanUtils.populate(resource, parameters);
		} catch (Exception e) {
			throw new IllegalArgumentException("Some problems with resolving parameters for filtering. Please, contact dev team for fixing this issue");
		}
		return resource;
	}

}
