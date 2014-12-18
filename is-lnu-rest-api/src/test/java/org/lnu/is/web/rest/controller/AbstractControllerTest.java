package org.lnu.is.web.rest.controller;

import org.junit.Before;
import org.lnu.is.web.rest.processor.resolver.PaginationArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractControllerTest {
	
	protected MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(getUnit()).setCustomArgumentResolvers(new PaginationArgumentResolver()).build();
	}
	
	protected abstract BaseController getUnit();

	private ObjectMapper objectMapper = new ObjectMapper();

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

}
