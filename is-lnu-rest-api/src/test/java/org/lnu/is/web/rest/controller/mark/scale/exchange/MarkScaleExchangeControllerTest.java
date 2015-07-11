package org.lnu.is.web.rest.controller.mark.scale.exchange;

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
import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.mark.scale.exchange.MarkScaleExchangeResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.mark.scale.exchange.MarkScaleExchangeController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class MarkScaleExchangeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<MarkScaleExchangeResource, MarkScaleExchangeResource, Long> facade;
	
	@InjectMocks
	private MarkScaleExchangeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateMarkScaleExchange() throws Exception {
		// Given
    	Long markScaleId = 1L;
    	Long id = 2L;
    	MarkScaleExchangeResource markScaleExchangeResource = new MarkScaleExchangeResource();
    	markScaleExchangeResource.setId(id);
		
		// When
    	String request = getJson(markScaleExchangeResource, true);
		String response = getJson(markScaleExchangeResource, false);
    	
		when(facade.createResource(any(MarkScaleExchangeResource.class))).thenReturn(markScaleExchangeResource);
		
    	// Then
		mockMvc.perform(post("/marks/scales/{markScaleId}/exchanges", markScaleId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(markScaleExchangeResource);
	}
    
    @Test
	public void testUpdateMarkScaleExchange() throws Exception {
		// Given
    	Long markScaleId = 2L;
    	Long id = 1L;
    	
    	MarkScaleExchangeResource markScaleExchangeResource = new MarkScaleExchangeResource();
    	markScaleExchangeResource.setId(id);
    	markScaleExchangeResource.setMarkScaleId(markScaleId);
    	
		MessageResource responseResource = new MessageResource(MessageType.INFO, "MarkScale Exchange Updated");
		
		// When
    	String request = getJson(markScaleExchangeResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/marks/scales/{markScaleId}/exchanges/{contactId}", markScaleId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, markScaleExchangeResource);
	}
    
    @Test
	public void testDeleteDepatmentExchange() throws Exception {
    	// Given
    	Long personId = 2L;
    	Long contactId = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/marks/scales/{markScaleId}/exchanges/{contactId}", personId, contactId))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(contactId);
	}

    
    @Test
	public void testGetExchange() throws Exception {
		// Given
    	Long markScaleId = 1L;
    	Long id = 2L;
    	
    	MarkScaleExchangeResource markScaleExchangeResource = new MarkScaleExchangeResource();
    	markScaleExchangeResource.setId(id);
    	markScaleExchangeResource.setMarkScaleId(markScaleId);

		// When
		String response = getJson(markScaleExchangeResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(markScaleExchangeResource);
		
		// Then
    	mockMvc.perform(get("/marks/scales/{markScaleId}/exchanges/{contactId}", markScaleId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testGetMarkScaleSpecialties() throws Exception {
		// Given
    	Long id = 1L;
    	Long markScaleId = 2L;
    	
    	MarkScaleExchangeResource markScalePaperResource = new MarkScaleExchangeResource();
    	markScalePaperResource.setId(id);
    	markScalePaperResource.setMarkScaleId(markScaleId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/marks/scales/{0}/exchanges", markScaleId);
		List<MarkScaleExchangeResource> entities = Arrays.asList(markScalePaperResource);
    	PagedResultResource<MarkScaleExchangeResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		MarkScaleExchangeResource resource = new MarkScaleExchangeResource();
		resource.setMarkScaleId(markScaleId);

		Map<String, Object> params = new HashMap<>();
		params.put("offset", String.valueOf(offset));
		params.put("limit", String.valueOf(limit));
		params.put("markScaleId", String.valueOf(markScaleId));
		PagedRequest<MarkScaleExchangeResource> pagedRequest = new PagedRequest<MarkScaleExchangeResource>(resource, offset, limit, Collections.<OrderBy>emptyList(),params);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<MarkScaleExchangeResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/marks/scales/{markScaleId}/exchanges", markScaleId)
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
		Long markScaleId = 2L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/marks/scales/{markScaleId}/exchanges/{id}", markScaleId, id));
		
		verify(facade).getResource(id);
	}
}
