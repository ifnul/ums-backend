package org.lnu.configuration.converters;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

/**
 * Custom Spring Swagger Mvc Plugin.
 * @author ivanursul
 *
 */
public class CustomSwaggerSpringMvcPlugin extends SwaggerSpringMvcPlugin {

	/**
	 * Default constructor.
	 * @param springSwaggerConfig
	 */
	public CustomSwaggerSpringMvcPlugin(final SpringSwaggerConfig springSwaggerConfig) {
		super(springSwaggerConfig);
		directModelSubstitute(XMLGregorianCalendar.class, Date.class);
	}

}
