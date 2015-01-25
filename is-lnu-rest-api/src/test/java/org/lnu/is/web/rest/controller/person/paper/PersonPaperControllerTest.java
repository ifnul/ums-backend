package org.lnu.is.web.rest.controller.person.paper;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.AccessDeniedException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.paper.PersonPaperResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class PersonPaperControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<PersonPaperResource, Long> facade;
	
	@InjectMocks
	private PersonPaperController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
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
    	
		when(facade.createResource(any(PersonPaperResource.class))).thenReturn(personPaperResource);
		
    	// Then
		mockMvc.perform(post("/persons/{0}/papers", personId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(personPaperResource);
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
		
		verify(facade).updateResource(id, personPaperResource);
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
		
		when(facade.getResource(anyLong())).thenReturn(personPaperResource);
		
		// Then
    	mockMvc.perform(get("/persons/{personId}/papers/{id}", personId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
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
    	
    	verify(facade).removeResource(id);
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
		when(facade.getResources(Matchers.<PagedRequest<PersonPaperResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/persons/{personId}/papers", personId)
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}

	@Test(expected = AccessDeniedException.class)
	public void testGetResourceWithAccessDeniedException() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/persons/{personId}/papers/{id}", personId, id));
		
		verify(facade).getResource(id);
	}
}
