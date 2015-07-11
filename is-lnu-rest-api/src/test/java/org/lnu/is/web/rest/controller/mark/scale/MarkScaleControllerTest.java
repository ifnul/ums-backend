package org.lnu.is.web.rest.controller.mark.scale;

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
import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.mark.scale.MarkScaleResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.mark.scale.MarkScaleController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class MarkScaleControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<MarkScaleResource, MarkScaleResource, Long> facade;
	
	@InjectMocks
	private MarkScaleController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateMarkScale() throws Exception {
		// Given
    	String abbrName = "abbrName";
		String name = "name";
    	
    	MarkScaleResource markScaleResource = new MarkScaleResource();
    	markScaleResource.setAbbrName(abbrName);
    	markScaleResource.setName(name);
		
		// When
    	String request = getJson(markScaleResource, true);
		String response = getJson(markScaleResource, false);
    	
		when(facade.createResource(any(MarkScaleResource.class))).thenReturn(markScaleResource);
		
    	// Then
		mockMvc.perform(post("/marks/scales")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(markScaleResource);
	}
    
    @Test
	public void testUpdateMarkScale() throws Exception {
		// Given
    	Long id = 1L;
    	String abbrName = "abbrName";
		String name = "name";
    	
    	MarkScaleResource markScaleResource = new MarkScaleResource();
    	markScaleResource.setId(id);
    	markScaleResource.setAbbrName(abbrName);
    	markScaleResource.setName(name);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "MarkScale Updated");
		
		// When
    	String request = getJson(markScaleResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/marks/scales/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, markScaleResource);
	}
    
    @Test
	public void testGetMarkScale() throws Exception {
		// Given
    	Long id = 1L;
    	String abbrName = "abbrName";
    	String name = "name";
    	
    	MarkScaleResource markScaleResource = new MarkScaleResource();
    	markScaleResource.setId(id);
    	markScaleResource.setAbbrName(abbrName);
    	markScaleResource.setName(name);

		// When
		String response = getJson(markScaleResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(markScaleResource);
		
		// Then
    	mockMvc.perform(get("/marks/scales/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeleteMarkScale() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/marks/scales/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetMarkScales() throws Exception {
		// Given
    	Long id = 1L;
    	String abbrName = "abbrName";
    	String name = "name";
    	
    	MarkScaleResource markScaleResource = new MarkScaleResource();
    	markScaleResource.setId(id);
    	markScaleResource.setAbbrName(abbrName);
    	markScaleResource.setName(name);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/marks/scales";
		List<MarkScaleResource> entities = Arrays.asList(markScaleResource);
    	PagedResultResource<MarkScaleResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);

		Map<String, Object> params = new HashMap<>();
		params.put("offset", String.valueOf(offset));
		params.put("limit", String.valueOf(limit));
		PagedRequest<MarkScaleResource> pagedRequest = new PagedRequest<MarkScaleResource>(new MarkScaleResource(), offset, limit, Collections.<OrderBy>emptyList(), params);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<MarkScaleResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/marks/scales")
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
		mockMvc.perform(get("/marks/scales/{id}", id));
		
		verify(facade).getResource(id);
	}
}
