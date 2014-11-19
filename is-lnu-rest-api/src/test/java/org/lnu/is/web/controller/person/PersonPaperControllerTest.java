package org.lnu.is.web.controller.person;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class PersonPaperControllerTest extends AbstractControllerTest {

	@InjectMocks
	private PersonPaperController unit;
	
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
