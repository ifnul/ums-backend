package org.lnu.is.web.rest.controller.session;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.session.SessionFacade;
import org.lnu.is.resource.session.SessionResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SessionControllerTest extends AbstractControllerTest {

	@Mock
	private SessionFacade facade;
	
	@InjectMocks
	private SessionController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

	@Test
	public void testGetCurrentSession() throws Exception {
		// Given
		SessionResource sessionResource = new SessionResource();

		// When
		when(facade.getCurrentSession()).thenReturn(sessionResource);
		String response = getJson(sessionResource);
		
		// Then
		mockMvc.perform(get("/sessions/current"))
			.andExpect(status().isOk())
			.andExpect(content().string(response));
		
		verify(facade).getCurrentSession();
	}
}
