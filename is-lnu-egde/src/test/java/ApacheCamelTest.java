import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.DirtiesContext;


public class ApacheCamelTest extends CamelSpringTestSupport {

	@Override
	protected AbstractApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("/egde-context.xml");
	}

	@Test
	@DirtiesContext
	public void testCamel() throws Exception {
		// Given
		Object body = "body";
		int messageCount = 1;
		MockEndpoint endpoint = getMockEndpoint("mock:result");

		// When
		template.sendBody("direct:start", body);

		// Then
		endpoint.expectedMessageCount(messageCount);
		endpoint.assertIsSatisfied();
	}

}
