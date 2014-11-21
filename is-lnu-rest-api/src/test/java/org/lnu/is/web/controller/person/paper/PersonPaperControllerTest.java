package org.lnu.is.web.controller.person.paper;

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
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.person.paper.PersonPaperFacade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.person.paper.PersonPaperResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.lnu.is.web.controller.person.paper.PersonPaperController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class PersonPaperControllerTest extends AbstractControllerTest {

	@Mock
	private PersonPaperFacade personPaperFacade;
	
	@InjectMocks
	private PersonPaperController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreatePersonPaper() throws Exception {
		// Given
    	Long personId = 1L;
    	
    	PersonPaperResource personPaperResource = new PersonPaperResource();
    	personPaperResource.setDocDate(new Date());
		personPaperResource.setPersonId(personId);
		
		// When
    	String request = getJson(personPaperResource, true);
		String response = getJson(personPaperResource, false);
    	
		when(personPaperFacade.createPersonPaper(any(PersonPaperResource.class))).thenReturn(personPaperResource);
		
    	// Then
		mockMvc.perform(post("/persons/{0}/papers", personId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(personPaperFacade).createPersonPaper(personPaperResource);
	}
    
    @Test
	public void testUpdatePersonPaper() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	PersonPaperResource personPaperResource = new PersonPaperResource();
    	personPaperResource.setDocDate(new Date());
		personPaperResource.setPersonId(personId);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Person Paper Updated");
		
		// When
    	String request = getJson(personPaperResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/persons/{personId}/papers/{id}", personId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(personPaperFacade).updatePersonPaper(id, personPaperResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	PersonPaperResource personPaperResource = new PersonPaperResource();
    	personPaperResource.setDocDate(new Date());
		personPaperResource.setPersonId(personId);

		// When
		String response = getJson(personPaperResource, false);
		
		when(personPaperFacade.getPersonPaper(anyLong())).thenReturn(personPaperResource);
		
		// Then
    	mockMvc.perform(get("/persons/{personId}/papers/{id}", personId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(personPaperFacade).getPersonPaper(id);
	}
    
    @Test
	public void testDeletePersonPaper() throws Exception {
		// Given
    	Long personId = 2L;
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/persons/{personId}/papers/{id}", personId, id))
    		.andExpect(status().is(204));
    	
    	verify(personPaperFacade).removePersonPaper(id);
	}
    
    @Test
	public void testGetPersonPapers() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 2L;
    	String docNum = "docNum";
    	
    	PersonPaperResource personPaperResource = new PersonPaperResource();
    	personPaperResource.setId(id);
		personPaperResource.setDocNum(docNum);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/persons/{0}/papers", personId);
		List<PersonPaperResource> entities = Arrays.asList(personPaperResource);
    	PagedResultResource<PersonPaperResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PersonPaperResource resource = new PersonPaperResource();
		resource.setPersonId(personId);
		PagedRequest<PersonPaperResource> pagedRequest = new PagedRequest<PersonPaperResource>(resource, offset, limit);
		
		// When
		when(personPaperFacade.getPersonPapers(Matchers.<PagedRequest<PersonPaperResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/persons/{personId}/papers", personId)
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(personPaperFacade).getPersonPapers(pagedRequest);
	}
    
}
