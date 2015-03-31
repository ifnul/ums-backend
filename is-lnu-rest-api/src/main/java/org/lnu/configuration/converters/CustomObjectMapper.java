package org.lnu.configuration.converters;

import org.lnu.is.web.rest.constant.Constants;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.mangofactory.swagger.configuration.SwaggerApiListingJsonSerializer;
import com.mangofactory.swagger.configuration.SwaggerResourceListingJsonSerializer;
import com.wordnik.swagger.model.ApiListing;
import com.wordnik.swagger.model.ResourceListing;

/**
 * Custom Object Mapper.
 * @author ivanursul
 */
public class CustomObjectMapper extends ObjectMapper {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public CustomObjectMapper() {
		super();
		setSerializationInclusion(Include.NON_NULL);

		SimpleModule module = new SimpleModule("JSONModule", new Version(2, 1, 5, null, null, null));
		module.addSerializer(ApiListing.class, new SwaggerApiListingJsonSerializer());
		
		module.addSerializer(ResourceListing.class, new SwaggerResourceListingJsonSerializer());
		
		registerModule(module);
		
		setDateFormat(Constants.DATE_FORMAT);
	}
}
