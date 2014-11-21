package org.lnu.is.web.controller.person.address;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.person.address.PersonAddressFacade;
import org.lnu.is.facade.resource.person.address.PersonAddressResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class PersonAddressControllerTest extends AbstractControllerTest {

	@Mock
	private PersonAddressFacade personAddressFacade;
	
	@InjectMocks
	private PersonAddressController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreatePersonAddress() throws Exception {
		// Given
    	Long personId = 1L;
    	Long id = 2L;
    	PersonAddressResource personAddressResource = new PersonAddressResource();
    	personAddressResource.setId(id);
		
		// When
    	String request = getJson(personAddressResource, true);
		String response = getJson(personAddressResource, false);
    	
		when(personAddressFacade.createAddress(any(PersonAddressResource.class))).thenReturn(personAddressResource);
		
    	// Then
		mockMvc.perform(post("/persons/{personId}/addresses", personId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(personAddressFacade).createAddress(personAddressResource);
	}
    
}
