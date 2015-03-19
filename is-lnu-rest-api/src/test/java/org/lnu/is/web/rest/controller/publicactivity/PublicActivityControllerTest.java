package org.lnu.is.web.rest.controller.publicactivity;

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
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.publicactivity.PublicActivityResource;
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
public class PublicActivityControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<PublicActivityResource, Long> facade;
	
	@InjectMocks
	private PublicActivityController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreatePublicActivity() throws Exception {
		// Given
    	
    	PublicActivityResource personResource = new PublicActivityResource();
    	personResource.setBegDate(new Date());
		
		// When
    	String request = getJson(personResource, true);
		String response = getJson(personResource, false);
    	
		when(facade.createResource(any(PublicActivityResource.class))).thenReturn(personResource);
		
    	// Then
		mockMvc.perform(post("/publicactivities")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(personResource);
	}
    
    @Test
	public void testUpdatePublicActivity() throws Exception {
		// Given
    	Long id = 1L;
    	
    	PublicActivityResource personResource = new PublicActivityResource();
    	personResource.setId(id);
    	personResource.setBegDate(new Date());
		
		MessageResource responseResource = new MessageResource(MessageType.INFO);
		
		// When
    	String request = getJson(personResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/publicactivities/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, personResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	
    	PublicActivityResource personResource = new PublicActivityResource();
    	personResource.setId(id);
    	personResource.setBegDate(new Date());

		// When
		String response = getJson(personResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(personResource);
		
		// Then
    	mockMvc.perform(get("/publicactivities/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeletePublicActivity() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/publicactivities/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetPublicActivitys() throws Exception {
		// Given
    	Long id = 1L;
    	
    	PublicActivityResource personResource = new PublicActivityResource();
    	personResource.setId(id);
    	personResource.setBegDate(new Date());

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/publicactivities";
		List<PublicActivityResource> entities = Arrays.asList(personResource);
    	PagedResultResource<PublicActivityResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<PublicActivityResource> pagedRequest = new PagedRequest<PublicActivityResource>(new PublicActivityResource(), offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<PublicActivityResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/publicactivities")
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
		mockMvc.perform(get("/publicactivities/{id}", id));
		
		verify(facade).getResource(id);
	}
}
