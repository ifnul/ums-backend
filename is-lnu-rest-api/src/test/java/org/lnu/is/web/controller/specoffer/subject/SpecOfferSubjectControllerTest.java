package org.lnu.is.web.controller.specoffer.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.specoffer.subject.SpecOfferSubjectFacade;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferSubjectControllerTest extends AbstractControllerTest {

	@Mock
	private SpecOfferSubjectFacade specOfferFacade;
	
	@InjectMocks
	private SpecOfferSubjectController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void test() throws Exception {
		// Given

		// When

		// Then
    	assertEquals(true, true);
	}
}
