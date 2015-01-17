package org.lnu.is.web.rest.controller.system;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;

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
}
