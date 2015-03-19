package org.lnu.is.web.rest.controller.markscale.exchange;

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
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.markscale.exchange.MarkscaleExchangeResource;
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
public class MarkscaleExchangeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<MarkscaleExchangeResource, Long> facade;
	
	@InjectMocks
	private MarkscaleExchangeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateMarkscaleExchange() throws Exception {
		// Given
    	Long markscaleId = 1L;
    	Long id = 2L;
    	MarkscaleExchangeResource markscaleExchangeResource = new MarkscaleExchangeResource();
    	markscaleExchangeResource.setId(id);
		
		// When
    	String request = getJson(markscaleExchangeResource, true);
		String response = getJson(markscaleExchangeResource, false);
    	
		when(facade.createResource(any(MarkscaleExchangeResource.class))).thenReturn(markscaleExchangeResource);
		
    	// Then
		mockMvc.perform(post("/markscales/{markscaleId}/exchanges", markscaleId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(markscaleExchangeResource);
	}
    
    @Test
	public void testUpdateMarkscaleExchange() throws Exception {
		// Given
    	Long markscaleId = 2L;
    	Long id = 1L;
    	
    	MarkscaleExchangeResource markscaleExchangeResource = new MarkscaleExchangeResource();
    	markscaleExchangeResource.setId(id);
    	markscaleExchangeResource.setMarkscaleId(markscaleId);
    	
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Markscale Exchange Updated");
		
		// When
    	String request = getJson(markscaleExchangeResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/markscales/{markscaleId}/exchanges/{contactId}", markscaleId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, markscaleExchangeResource);
	}
    
    @Test
	public void testDeleteDepatmentExchange() throws Exception {
    	// Given
    	Long personId = 2L;
    	Long contactId = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/markscales/{markscaleId}/exchanges/{contactId}", personId, contactId))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(contactId);
	}

    
    @Test
	public void testGetExchange() throws Exception {
		// Given
    	Long markscaleId = 1L;
    	Long id = 2L;
    	
    	MarkscaleExchangeResource markscaleExchangeResource = new MarkscaleExchangeResource();
    	markscaleExchangeResource.setId(id);
    	markscaleExchangeResource.setMarkscaleId(markscaleId);

		// When
		String response = getJson(markscaleExchangeResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(markscaleExchangeResource);
		
		// Then
    	mockMvc.perform(get("/markscales/{markscaleId}/exchanges/{contactId}", markscaleId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testGetMarkscaleSpecialties() throws Exception {
		// Given
    	Long id = 1L;
    	Long markscaleId = 2L;
    	
    	MarkscaleExchangeResource markscalePaperResource = new MarkscaleExchangeResource();
    	markscalePaperResource.setId(id);
    	markscalePaperResource.setMarkscaleId(markscaleId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/markscales/{0}/exchanges", markscaleId);
		List<MarkscaleExchangeResource> entities = Arrays.asList(markscalePaperResource);
    	PagedResultResource<MarkscaleExchangeResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		MarkscaleExchangeResource resource = new MarkscaleExchangeResource();
		resource.setMarkscaleId(markscaleId);
		PagedRequest<MarkscaleExchangeResource> pagedRequest = new PagedRequest<MarkscaleExchangeResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<MarkscaleExchangeResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/markscales/{markscaleId}/exchanges", markscaleId)
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
		Long markscaleId = 2L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/markscales/{markscaleId}/exchanges/{id}", markscaleId, id));
		
		verify(facade).getResource(id);
	}
}
