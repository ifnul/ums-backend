package org.lnu.is.web.specoffer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.specoffer.SpecOfferFacade;
import org.lnu.is.web.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferControllerTest extends AbstractControllerTest {

	@Mock
	private SpecOfferFacade specOfferFacade;
	
	@InjectMocks
	private SpecOfferController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreateSpecOffer() throws Exception {
		// Given

		// When

		// Then
    	assertEquals(true, true);
	}
}
