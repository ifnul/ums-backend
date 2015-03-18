package org.lnu.is.web.rest.controller.broadcasting;

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
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.OrderBy;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
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
public class BroadcastingControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<BroadcastingMessageResource, Long> facade;
	
	@InjectMocks
	private BroadcastingController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateBroadcastingMessage() throws Exception {
		// Given
		Long group1 = 1L;
		Long group2 = 2L;
    	List<Long> groups = Arrays.asList(group1, group2);
    	
    	String recipient1 = "recipient1@edu.lviv.ua";
		String recipient2 = "recipient2@edu.lviv.ua";
		List<String> recipient = Arrays.asList(recipient1, recipient2);
    	String content = "content";
    	String topic = "topic";
    	
    	BroadcastingMessageResource resource = new BroadcastingMessageResource();
		resource.setContent(content);
		resource.setTopic(topic);
		resource.setRecipients(recipient);
		resource.setGroups(groups);
		
		// When
    	String request = getJson(resource, true);
		String response = getJson(resource, false);
    	
		when(facade.createResource(any(BroadcastingMessageResource.class))).thenReturn(resource);
		
    	// Then
		mockMvc.perform(post("/broadcastings")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(resource);
	}
    
    @Test
	public void testUpdateBroadcastingMessage() throws Exception {
		// Given
    	Long id = 1L;
		Long group1 = 1L;
		Long group2 = 2L;
    	List<Long> groups = Arrays.asList(group1, group2);
    	
    	String recipient1 = "recipient1@edu.lviv.ua";
		String recipient2 = "recipient2@edu.lviv.ua";
		List<String> recipient = Arrays.asList(recipient1, recipient2);
    	String content = "content";
    	String topic = "topic";
    	
    	BroadcastingMessageResource resource = new BroadcastingMessageResource();
		resource.setContent(content);
		resource.setTopic(topic);
		resource.setRecipients(recipient);
		resource.setGroups(groups);
    	resource.setId(id);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO);
		
		// When
    	String request = getJson(resource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/broadcastings/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, resource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
		Long group1 = 1L;
		Long group2 = 2L;
    	List<Long> groups = Arrays.asList(group1, group2);
    	
    	String recipient1 = "recipient1@edu.lviv.ua";
		String recipient2 = "recipient2@edu.lviv.ua";
		List<String> recipient = Arrays.asList(recipient1, recipient2);
    	String content = "content";
    	String topic = "topic";
    	
    	BroadcastingMessageResource resource = new BroadcastingMessageResource();
		resource.setContent(content);
		resource.setTopic(topic);
		resource.setRecipients(recipient);
		resource.setGroups(groups);
    	resource.setId(id);

		// When
		String response = getJson(resource, false);
		
		when(facade.getResource(anyLong())).thenReturn(resource);
		
		// Then
    	mockMvc.perform(get("/broadcastings/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeleteBroadcastingMessage() throws Exception {
		// Given
    	Long id = 1L;

    	// Then
    	mockMvc.perform(delete("/broadcastings/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetBroadcastingMessages() throws Exception {
		// Given
    	Long id = 1L;
		Long group1 = 1L;
		Long group2 = 2L;
    	List<Long> groups = Arrays.asList(group1, group2);
    	
    	String recipient1 = "recipient1@edu.lviv.ua";
		String recipient2 = "recipient2@edu.lviv.ua";
		List<String> recipient = Arrays.asList(recipient1, recipient2);
    	String content = "content";
    	String topic = "topic";
    	
    	BroadcastingMessageResource resource = new BroadcastingMessageResource();
		resource.setContent(content);
		resource.setTopic(topic);
		resource.setRecipients(recipient);
		resource.setGroups(groups);
    	resource.setId(id);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/broadcastings";
		List<BroadcastingMessageResource> entities = Arrays.asList(resource);
    	PagedResultResource<BroadcastingMessageResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<BroadcastingMessageResource> pagedRequest = new PagedRequest<BroadcastingMessageResource>(new BroadcastingMessageResource(), offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<BroadcastingMessageResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/broadcastings")
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
		mockMvc.perform(get("/broadcastings/{id}", id));
		
		verify(facade).getResource(id);
	}
	
}
