package org.lnu.configuration.converters;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

/**
 * Custom Spring Swagger Mvc Plugin.
 * @author ivanursul
 *
 */
public class CustomSwaggerSpringMvcPlugin extends SwaggerSpringMvcPlugin {

	/**
	 * Default constructor.
	 * @param springSwaggerConfig springSwaggerConfig.
	 */
	public CustomSwaggerSpringMvcPlugin(final SpringSwaggerConfig springSwaggerConfig) {
		super(springSwaggerConfig);
		directModelSubstitute(XMLGregorianCalendar.class, Date.class);
	}

}
