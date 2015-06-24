package org.lnu.is.web.rest.controller;


import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.web.rest.processor.resolver.PagedRequestHandlerMethodArgumentResolver;
import org.lnu.is.web.rest.processor.resolver.limit.DefaultLimitParameterResolver;
import org.lnu.is.web.rest.processor.resolver.limit.LimitParameterResolver;
import org.lnu.is.web.rest.processor.resolver.offset.DefaultOffsetParameterResolver;
import org.lnu.is.web.rest.processor.resolver.offset.OffsetParameterResolver;
import org.lnu.is.web.rest.processor.resolver.order.OrderByFieldResolver;
import org.lnu.is.web.rest.processor.resolver.parameters.DefaultMultipleParameterRetriever;
import org.lnu.is.web.rest.processor.resolver.parameters.DefaultParametersRetriever;
import org.lnu.is.web.rest.processor.resolver.parameters.MultipleParameterRetriever;
import org.lnu.is.web.rest.processor.resolver.resource.DefaultResourceParameterResolver;
import org.lnu.is.web.rest.processor.resolver.resource.ResourceParameterResolver;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Collections;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

public abstract class AbstractControllerTest {
	
	protected MockMvc mockMvc;
	
	private ObjectMapper objectMapper = new ObjectMapper();

	private PagedRequestHandlerMethodArgumentResolver pagedRequestArgumentResolver;
	
	@Mock
	private OrderByFieldResolver orderByFieldResolver;

	private OffsetParameterResolver offsetParameterResolver = new DefaultOffsetParameterResolver();
	
	private LimitParameterResolver limitParameterResolver = new DefaultLimitParameterResolver();
	
	private ResourceParameterResolver resourceParameterResolver = new DefaultResourceParameterResolver();

	private DefaultParametersRetriever parametersRetriever = new DefaultParametersRetriever();

	@Before
	public void setup() {
		when(orderByFieldResolver.getOrdersBy(anyString(), any())).thenReturn(Collections.<OrderBy>emptyList());

		MultipleParameterRetriever multipleParameterRetriever = new DefaultMultipleParameterRetriever();
		parametersRetriever.setMultipleParameterRetriever(multipleParameterRetriever);

		pagedRequestArgumentResolver = new PagedRequestHandlerMethodArgumentResolver();
		pagedRequestArgumentResolver.setOrderByFieldResolver(orderByFieldResolver);
		pagedRequestArgumentResolver.setOffsetParameterResolver(offsetParameterResolver);
		pagedRequestArgumentResolver.setLimitParameterResolver(limitParameterResolver);
		pagedRequestArgumentResolver.setResourceParamterResolver(resourceParameterResolver);
		pagedRequestArgumentResolver.setParametersRetriever(parametersRetriever);

		this.mockMvc = MockMvcBuilders.standaloneSetup(getUnit())
				.setValidator(getValidator())
				.setCustomArgumentResolvers(pagedRequestArgumentResolver)
				.alwaysDo(print())
				.build();
	}
	
    private LocalValidatorFactoryBean getValidator() {
        return new LocalValidatorFactoryBean();
    }
    
	protected abstract BaseController getUnit();

	/**
	 * Method for configuring object mapper to write from fields
	 * or from getters.
	 * @param flag flag
	 */
	private void writeFromFields(final boolean flag) {
		if (flag) {
			objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

			objectMapper.setVisibility(PropertyAccessor.ALL, Visibility.NONE);
			objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		} else {

			objectMapper = new ObjectMapper();

		}
	}

	/**
	 * Get's serialized json from resource.
	 * @param object object.
	 * @param writeFromFields write from fields
	 * @return String json.
	 * @throws JsonProcessingException exception, that can be throwned.
	 */
	protected String getJson(final Object object, final boolean writeFromFields) throws JsonProcessingException {
		writeFromFields(writeFromFields);
		return objectMapper.writeValueAsString(object);
	}

	/**
	 * Method for getting json using getters
	 * @param object
	 * @return
	 * @throws Exception
	 */
	protected String getJson(final Object object) throws Exception {
		writeFromFields(false);
		return objectMapper.writeValueAsString(object);
	}

}
