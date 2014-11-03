package org.lnu.is.web.controller.department;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.department.DepartmentFacade;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class DepartmentControllerTest extends AbstractControllerTest {

	@Mock
	private DepartmentFacade departmentFacade;
	
	@InjectMocks
	private DepartmentController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
	@Test
	public void testTest() throws Exception {
		// Given

		// When

		// Then
		assertEquals(true, true);
	}
}
