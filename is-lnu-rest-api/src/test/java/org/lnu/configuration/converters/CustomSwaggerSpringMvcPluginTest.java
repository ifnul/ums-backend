package org.lnu.configuration.converters;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;

public class CustomSwaggerSpringMvcPluginTest {

	@Test
	public void testCustomSpringMvnPlugin() throws Exception {
		// Given
		SpringSwaggerConfig springSwaggerConfig = new SpringSwaggerConfig();

		// When
		CustomSwaggerSpringMvcPlugin unit = new CustomSwaggerSpringMvcPlugin(springSwaggerConfig);

		// Then
		assertNotNull(unit);
	}
	
}
