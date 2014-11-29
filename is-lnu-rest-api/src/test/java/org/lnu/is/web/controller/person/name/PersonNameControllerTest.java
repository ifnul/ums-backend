package org.lnu.is.web.controller.person.name;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
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
import org.lnu.is.facade.resource.person.name.PersonNameResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class PersonNameControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<PersonNameResource, Long> facade;
	
	@InjectMocks
	private PersonNameController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreatePersonName() throws Exception {
		// Given
    	Long personId = 1L;
    	
    	PersonNameResource personNameResource = new PersonNameResource();
		personNameResource.setPersonId(personId);
		
		// When
    	String request = getJson(personNameResource, true);
		String response = getJson(personNameResource, false);
    	
		when(facade.createResource(any(PersonNameResource.class))).thenReturn(personNameResource);
		
    	// Then
		mockMvc.perform(post("/persons/{0}/names", personId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(personNameResource);
	}
    
    @Test
	public void testUpdatePersonName() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	PersonNameResource personNameResource = new PersonNameResource();
		personNameResource.setPersonId(personId);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Person Name Updated");
		
		// When
    	String request = getJson(personNameResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/persons/{personId}/names/{id}", personId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, personNameResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	PersonNameResource personNameResource = new PersonNameResource();
		personNameResource.setPersonId(personId);

		// When
		String response = getJson(personNameResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(personNameResource);
		
		// Then
    	mockMvc.perform(get("/persons/{personId}/names/{id}", personId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeletePersonName() throws Exception {
		// Given
    	Long personId = 2L;
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/persons/{personId}/names/{id}", personId, id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
    //TODO: Write test with person Id path variable.
	public void testGetPersonNames() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 2L;
    	
    	PersonNameResource personNameResource = new PersonNameResource();
    	personNameResource.setId(id);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/persons/{0}/names", personId);
		List<PersonNameResource> entities = Arrays.asList(personNameResource);
    	PagedResultResource<PersonNameResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PersonNameResource resource = new PersonNameResource();
		resource.setPersonId(personId);
		PagedRequest<PersonNameResource> pagedRequest = new PagedRequest<PersonNameResource>(resource, offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<PersonNameResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/persons/{0}/names", personId)
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}
    
}
