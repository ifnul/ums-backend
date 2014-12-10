package org.is.lnu;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.ModelCamelContext;
import org.apache.camel.test.spring.CamelSpringJUnit4ClassRunner;
import org.apache.camel.test.spring.MockEndpoints;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;


@RunWith(CamelSpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/egde-context.xml"})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@MockEndpoints("direct:result")
public class ApacheCamelTest {

    @Autowired
    protected ModelCamelContext context;
 
    @Produce(uri = "direct:start")
    protected ProducerTemplate template;
 
    @EndpointInject(uri = "mock:result")
    protected MockEndpoint endpoint;

	@Test
	@DirtiesContext
	public void testCamel() throws Exception {
		// Given
		Object body = "body";
		int messageCount = 1;
		
		// When
		template.sendBody("direct:start", body);
		
		// Then
		endpoint.expectedMessageCount(messageCount);
		endpoint.assertIsSatisfied();
	}

}