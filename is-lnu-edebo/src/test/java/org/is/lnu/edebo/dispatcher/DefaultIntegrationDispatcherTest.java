package org.is.lnu.edebo.dispatcher;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.camel.CamelContext;
import org.apache.camel.ExchangePattern;
import org.apache.camel.ProducerTemplate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.resource.person.PersonResource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultIntegrationDispatcherTest {

	@Mock
	private CamelContext camelContext;
	
	@Mock
	private ProducerTemplate producerTemplate;
	
	private Boolean enabled = true;
	
	private String endpointUri = "endpoint uri";
	
	@InjectMocks
	private DefaultIntegrationDispatcher<PersonResource> unit;

	@Before
	public void init() {
		unit.setEnabled(enabled);
		unit.setEndpointUri(endpointUri);
	}
	
	@Test
	public void testDispatch() throws Exception {
		// Given
		PersonResource resource = new PersonResource();

		// When
		when(camelContext.createProducerTemplate()).thenReturn(producerTemplate);
		unit.dispatch(resource);

		// Then
		verify(camelContext).createProducerTemplate();
		verify(producerTemplate).stop();
		verify(producerTemplate).sendBody(endpointUri, ExchangePattern.InOut, resource);
	}
}
