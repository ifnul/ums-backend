package org.lnu.is.web.rest.processor.api;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Bean Factory Post Processor, that counts http methods.
 * @author ivanursul
 *
 */
@Component
public class WebServiceMethodCountBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	private static final Logger LOGGER =  LoggerFactory.getLogger(WebServiceMethodCountBeanFactoryPostProcessor.class);
	
	@Override
	public void postProcessBeanFactory(final ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		Map<RequestMethod, Integer> methodsCount = new HashMap<RequestMethod, Integer>();
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		
		for (String beanDefinitionName : beanDefinitionNames) {
			Class<?> type = beanFactory.getType(beanDefinitionName);
			RestController annotation = type.getAnnotation(RestController.class);
			
			if (annotation != null) {
				Method[] methods = type.getMethods();
				processControllerMethods(methods, methodsCount);
			}
			
		}
		
		Integer allMethodCount = 0;
		for (Entry<RequestMethod, Integer> methodCount : methodsCount.entrySet()) {
			LOGGER.info("Http Method - {} : {}", methodCount.getKey(), methodCount.getValue());
			allMethodCount += methodCount.getValue();
		}
		
		LOGGER.info("All methods count: {}", allMethodCount);
		
		beanFactory.registerSingleton("httpMethodsCount", allMethodCount);
		beanFactory.registerSingleton("httpMethods", methodsCount);
	}

	/**
	 * Method for counting methods in current controller.
	 * @param methods
	 * @param methodsCount
	 */
	private void processControllerMethods(final Method[] methods, final Map<RequestMethod, Integer> methodsCount) {
		
		for (Method method : methods) {
			RequestMapping annotation = method.getAnnotation(RequestMapping.class);
			
			if (annotation != null) {
				RequestMethod[] httpMethods = annotation.method();
				processRequestMethods(httpMethods, methodsCount); 
			}
		}
		
	}

	/**
	 * Method for calculating methods in single controller method.
	 * @param httpMethods
	 * @param methodsCount
	 */
	private void processRequestMethods(final RequestMethod[] httpMethods, final Map<RequestMethod, Integer> methodsCount) {
		
		for (RequestMethod requestMethod : httpMethods) {
			Integer methodCount = methodsCount.get(requestMethod);
			
			if (methodCount == null) {
				methodCount = 1;
			} else {
				methodCount++;
			}
			
			methodsCount.put(requestMethod, methodCount);
		}
		
	}

}
