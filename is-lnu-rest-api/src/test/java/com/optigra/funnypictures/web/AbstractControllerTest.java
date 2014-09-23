package com.optigra.funnypictures.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AbstractControllerTest {

	protected ObjectMapper objectMapper = new ObjectMapper();

	protected void writeFromFields(final boolean flag) {
		if (flag) {
			objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

			objectMapper.setVisibility(PropertyAccessor.ALL, Visibility.NONE);
			objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		} else {

			objectMapper = new ObjectMapper();

		}
	}

	protected String getJson(final Object object, final boolean writeFromFields) throws JsonProcessingException {
		writeFromFields(writeFromFields);
		return objectMapper.writeValueAsString(object);
	}

}
