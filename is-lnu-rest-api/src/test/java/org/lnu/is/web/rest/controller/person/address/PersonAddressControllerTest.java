package org.lnu.is.web.rest.controller.person.address;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.person.address.PersonAddressResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.person.address.PersonAddressController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class PersonAddressControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<PersonAddressResource, Long> facade;
	
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
    	
		when(facade.createResource(any(PersonAddressResource.class))).thenReturn(personAddressResource);
		
    	// Then
		mockMvc.perform(post("/persons/{personId}/addresses", personId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(personAddressResource);
	}
    
    @Test
	public void testUpdatePersonAddress() throws Exception {
		// Given
    	Long personId = 2L;
    	Long id = 1L;
    	
    	PersonAddressResource personAddressResource = new PersonAddressResource();
    	personAddressResource.setId(id);
    	personAddressResource.setPersonId(personId);
    	
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Person address updated");
		
		// When
    	String request = getJson(personAddressResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/persons/{persinId}/addresses/{addressId}", personId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, personAddressResource);
	}
    
    @Test
	public void testGetAddress() throws Exception {
		// Given
    	Long personId = 1L;
    	Long id = 2L;
    	
    	PersonAddressResource personAddressResource = new PersonAddressResource();
    	personAddressResource.setId(id);
    	personAddressResource.setPersonId(personId);

		// When
		String response = getJson(personAddressResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(personAddressResource);
		
		// Then
    	mockMvc.perform(get("/persons/{personId}/addresses/{addressId}", personId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testGetPersonPapers() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 2L;
    	
    	PersonAddressResource personPaperResource = new PersonAddressResource();
    	personPaperResource.setId(id);
    	personPaperResource.setPersonId(personId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/persons/{0}/addresses", personId);
		List<PersonAddressResource> entities = Arrays.asList(personPaperResource);
    	PagedResultResource<PersonAddressResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PersonAddressResource resource = new PersonAddressResource();
		resource.setPersonId(personId);
		PagedRequest<PersonAddressResource> pagedRequest = new PagedRequest<PersonAddressResource>(resource, offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<PersonAddressResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/persons/{personId}/addresses", personId)
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}
}
