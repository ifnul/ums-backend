package org.lnu.is.web.rest.controller.system;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.lnu.is.web.rest.constant.Constants;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.springframework.mock.web.MockHttpSession;

@RunWith(Parameterized.class)
public class SystemControllerTest extends AbstractControllerTest {

	private SystemController unit = new SystemController();

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 200 }, { 300}, {400}, {403}});
	}

	private int status;

    public SystemControllerTest(final int status) {
    	this.status = status;
    }
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

	@Test
	public void testError() throws Exception {
		mockMvc.perform(get("/error/{status}", status))
			.andExpect(status().is(status));
	}
	
	@Test
	public void testErrorWithOtherParameters() throws Exception {
		Integer notFoundStatus = 404;
		String message = "message";
		MockHttpSession session = new MockHttpSession();
		session.setAttribute(Constants.JAVAX_SERVLET_ERROR_MESSAGE, message);
		session.setAttribute(Constants.JAVAX_SERVLET_ERROR_STATUS_CODE, notFoundStatus);
		
		mockMvc.perform(get("/error/{status}", notFoundStatus)
				.session(session))
			.andExpect(status().is(notFoundStatus));
	}
}
