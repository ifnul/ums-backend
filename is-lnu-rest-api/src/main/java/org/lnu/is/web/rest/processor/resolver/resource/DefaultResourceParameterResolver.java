package org.lnu.is.web.rest.processor.resolver.resource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;
import org.apache.commons.lang.math.NumberUtils;
import org.lnu.is.web.rest.constant.Constants;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
			enhanceParameters(resource, parameters);
			BeanUtils.populate(resource, parameters);
		} catch (Exception e) {
			throw new IllegalArgumentException("Some problems with resolving parameters for filtering. Please, contact dev team for fixing this issue");
		}
		return resource;
	}

	// TODO: Expose to separate class.

	/**
	 * Method for exhansing parameters.If field is collection -> then parameter will
	 * be transformed into list.
	 * @param resource resource.
	 * @param parameters parameters.
	 * @throws IllegalAccessException illegal argument exception.
	 */
	private void enhanceParameters(final Object resource, final Map<String, Object> parameters) throws IllegalAccessException {
		Field[] fields = resource.getClass().getDeclaredFields();

		for (Field field : fields) {
			field.setAccessible(true);

			if (Collection.class.isAssignableFrom(field.getType())) {
				String name = field.getName();
				Object parameterValue = parameters.get(name);

				if (parameterValue != null && !Collection.class.isAssignableFrom(parameterValue.getClass())) {
					List<Object> value = Arrays.asList(parameterValue);
					boolean isDigits = value.stream().anyMatch(e -> NumberUtils.isNumber(e.toString()));
					value = isDigits ? value.stream().map(e -> Long.valueOf(e.toString())).collect(Collectors.toList()) : value;

					parameters.put(name, value);
				}
			}

		}
	}

}
