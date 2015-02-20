package org.lnu.is.web.rest.controller.markscale.value;

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
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.markscale.value.MarkscaleValueResource;
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
public class MarkscaleValueControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<MarkscaleValueResource, Long> facade;
	
	@InjectMocks
	private MarkscaleValueController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateMarkscaleValue() throws Exception {
		// Given
    	Long markscaleId = 1L;
    	Long id = 2L;
    	MarkscaleValueResource markscaleValueResource = new MarkscaleValueResource();
    	markscaleValueResource.setId(id);
		
		// When
    	String request = getJson(markscaleValueResource, true);
		String response = getJson(markscaleValueResource, false);
    	
		when(facade.createResource(any(MarkscaleValueResource.class))).thenReturn(markscaleValueResource);
		
    	// Then
		mockMvc.perform(post("/markscales/{markscaleId}/values", markscaleId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(markscaleValueResource);
	}
    
    @Test
	public void testUpdateMarkscaleValue() throws Exception {
		// Given
    	Long markscaleId = 2L;
    	Long id = 1L;
    	
    	MarkscaleValueResource markscaleValueResource = new MarkscaleValueResource();
    	markscaleValueResource.setId(id);
    	markscaleValueResource.setMarkscaleId(markscaleId);
    	
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Markscale Value Updated");
		
		// When
    	String request = getJson(markscaleValueResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/markscales/{markscaleId}/values/{contactId}", markscaleId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, markscaleValueResource);
	}
    
    @Test
	public void testDeleteDepatmentValue() throws Exception {
    	// Given
    	Long personId = 2L;
    	Long contactId = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/markscales/{markscaleId}/values/{contactId}", personId, contactId))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(contactId);
	}

    
    @Test
	public void testGetValue() throws Exception {
		// Given
    	Long markscaleId = 1L;
    	Long id = 2L;
    	
    	MarkscaleValueResource markscaleValueResource = new MarkscaleValueResource();
    	markscaleValueResource.setId(id);
    	markscaleValueResource.setMarkscaleId(markscaleId);

		// When
		String response = getJson(markscaleValueResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(markscaleValueResource);
		
		// Then
    	mockMvc.perform(get("/markscales/{markscaleId}/values/{contactId}", markscaleId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testGetMarkscaleSpecialties() throws Exception {
		// Given
    	Long id = 1L;
    	Long markscaleId = 2L;
    	
    	MarkscaleValueResource markscalePaperResource = new MarkscaleValueResource();
    	markscalePaperResource.setId(id);
    	markscalePaperResource.setMarkscaleId(markscaleId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/markscales/{0}/values", markscaleId);
		List<MarkscaleValueResource> entities = Arrays.asList(markscalePaperResource);
    	PagedResultResource<MarkscaleValueResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		MarkscaleValueResource resource = new MarkscaleValueResource();
		resource.setMarkscaleId(markscaleId);
		PagedRequest<MarkscaleValueResource> pagedRequest = new PagedRequest<MarkscaleValueResource>(resource, offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<MarkscaleValueResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/markscales/{markscaleId}/values", markscaleId)
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
		mockMvc.perform(get("/markscales/{markscaleId}/values/{id}", markscaleId, id));
		
		verify(facade).getResource(id);
	}
}
