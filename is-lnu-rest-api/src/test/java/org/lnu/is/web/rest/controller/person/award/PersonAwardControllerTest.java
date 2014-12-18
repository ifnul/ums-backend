package org.lnu.is.web.rest.controller.person.award;

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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.person.award.PersonAwardResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class PersonAwardControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<PersonAwardResource, Long> facade;
	
	@InjectMocks
	private PersonAwardController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    
    @Test
	public void testCreatePersonAward() throws Exception {
		// Given
    	Long personId = 1L;
    	
    	PersonAwardResource personAwardResource = new PersonAwardResource();
		
		// When
    	String request = getJson(personAwardResource, true);
		String response = getJson(personAwardResource, false);
    	
		when(facade.createResource(any(PersonAwardResource.class))).thenReturn(personAwardResource);
		
    	// Then
		mockMvc.perform(post("/persons/{0}/awards", personId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(personAwardResource);
	}
    
    @Test
	public void testUpdatePersonAward() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	PersonAwardResource personAwardResource = new PersonAwardResource();
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Person Award Updated");
		
		// When
    	String request = getJson(personAwardResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/persons/{personId}/awards/{id}", personId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, personAwardResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	PersonAwardResource personAwardResource = new PersonAwardResource();

		// When
		String response = getJson(personAwardResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(personAwardResource);
		
		// Then
    	mockMvc.perform(get("/persons/{personId}/awards/{id}", personId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeletePersonAward() throws Exception {
		// Given
    	Long personId = 2L;
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/persons/{personId}/awards/{id}", personId, id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetPersonAwards() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 2L;
    	
    	PersonAwardResource personAwardResource = new PersonAwardResource();
    	personAwardResource.setId(id);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/persons/{0}/awards", personId);
		List<PersonAwardResource> entities = Arrays.asList(personAwardResource);
    	PagedResultResource<PersonAwardResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PersonAwardResource resource = new PersonAwardResource();
		resource.setPersonId(personId);
		PagedRequest<PersonAwardResource> pagedRequest = new PagedRequest<PersonAwardResource>(resource, offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<PersonAwardResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/persons/{personId}/awards", personId)
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}
    
}
