package org.lnu.is.web.controller.person.award;

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
import org.lnu.is.facade.facade.person.award.PersonAwardFacade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.person.award.PersonAwardResource;
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
public class PersonAwardControllerTest extends AbstractControllerTest {

	@Mock
	private PersonAwardFacade personAwardFacade;
	
	@InjectMocks
	private PersonAwardController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreatePersonAward() throws Exception {
		// Given
    	Long personId = 1L;
    	
    	PersonAwardResource personAwardResource = new PersonAwardResource();
		
		// When
    	String request = getJson(personAwardResource, true);
		String response = getJson(personAwardResource, false);
    	
		when(personAwardFacade.createAward(any(PersonAwardResource.class))).thenReturn(personAwardResource);
		
    	// Then
		mockMvc.perform(post("/persons/{0}/awards", personId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(personAwardFacade).createAward(personAwardResource);
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
		
		verify(personAwardFacade).updateAward(id, personAwardResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	PersonAwardResource personAwardResource = new PersonAwardResource();

		// When
		String response = getJson(personAwardResource, false);
		
		when(personAwardFacade.getAward(anyLong())).thenReturn(personAwardResource);
		
		// Then
    	mockMvc.perform(get("/persons/{personId}/awards/{id}", personId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(personAwardFacade).getAward(id);
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
    	
    	verify(personAwardFacade).removeAward(id);
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
		when(personAwardFacade.getAwards(Matchers.<PagedRequest<PersonAwardResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/persons/{personId}/awards", personId)
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(personAwardFacade).getAwards(pagedRequest);
	}
    
}
