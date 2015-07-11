package org.lnu.is.web.rest.controller.person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.PersonResource;
import org.lnu.is.resource.person.PersonResourceList;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

import java.nio.file.AccessDeniedException;
import java.util.*;

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

@RunWith(MockitoJUnitRunner.class)
public class PersonControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<PersonResource, PersonResourceList, Long> facade;
	
	@InjectMocks
	private PersonController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreatePerson() throws Exception {
		// Given
    	String docNum = "docNum";
    	
    	PersonResource personResource = new PersonResource();
    	personResource.setBegDate(new Date());
		personResource.setDocNum(docNum);
		
		// When
    	String request = getJson(personResource, true);
		String response = getJson(personResource, false);
    	
		when(facade.createResource(any(PersonResource.class))).thenReturn(personResource);
		
    	// Then
		mockMvc.perform(post("/persons")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(personResource);
	}
    
    @Test
	public void testUpdatePerson() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	PersonResource personResource = new PersonResource();
    	personResource.setId(id);
    	personResource.setBegDate(new Date());
		personResource.setDocNum(docNum);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO);
		
		// When
    	String request = getJson(personResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/persons/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, personResource);
	}
    
    @Test
	public void testGetResource() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	PersonResource personResource = new PersonResource();
    	personResource.setId(id);
    	personResource.setBegDate(new Date());
		personResource.setDocNum(docNum);

		// When
		String response = getJson(personResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(personResource);
		
		// Then
    	mockMvc.perform(get("/persons/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeletePerson() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/persons/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetPersons() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	PersonResource personResource = new PersonResource();
    	personResource.setId(id);
    	personResource.setBegDate(new Date());
		personResource.setDocNum(docNum);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/persons";
		List<PersonResource> entities = Arrays.asList(personResource);
    	PagedResultResource<PersonResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);

		Map<String, Object> params = new HashMap<>();
		params.put("offset", String.valueOf(offset));
		params.put("limit", String.valueOf(limit));
		PagedRequest<PersonResourceList> pagedRequest = new PagedRequest<PersonResourceList>(new PersonResourceList(), offset, limit, Collections.<OrderBy>emptyList(), params);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<PersonResourceList>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/persons")
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
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/persons/{id}", id));
		
		verify(facade).getResource(id);
	}
}
