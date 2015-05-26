package org.lnu.is.web.rest.controller.degree;

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
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.degree.DegreeResource;
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
public class DegreeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<DegreeResource, Long> facade;
	
	@InjectMocks
	private DegreeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateDegree() throws Exception {
		// Given
    	DegreeResource benefitResource = new DegreeResource();
		
		// When
    	String request = getJson(benefitResource, true);
		String response = getJson(benefitResource, false);
    	
		when(facade.createResource(any(DegreeResource.class))).thenReturn(benefitResource);
		
    	// Then
		mockMvc.perform(post("/degrees")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(benefitResource);
	}
    
    @Test
	public void testUpdateDegree() throws Exception {
		// Given
    	Long id = 1L;
    	DegreeResource benefitResource = new DegreeResource();
    	benefitResource.setId(id);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Degree updated");
		
		// When
    	String request = getJson(benefitResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/degrees/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, benefitResource);
	}
    
    @Test
	public void testGetResourceById() throws Exception {
		// Given
    	Long id = 1L;
    	DegreeResource benefitResource = new DegreeResource();
    	benefitResource.setId(id);

		// When
		String response = getJson(benefitResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(benefitResource);
		
		// Then
    	mockMvc.perform(get("/degrees/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeleteDegree() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/degrees/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetDegrees() throws Exception {
		// Given
    	Long id = 1L;
    	DegreeResource benefitResource = new DegreeResource();
    	benefitResource.setId(id);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/degrees";
		List<DegreeResource> entities = Arrays.asList(benefitResource);
    	PagedResultResource<DegreeResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<DegreeResource> pagedRequest = new PagedRequest<DegreeResource>(new DegreeResource(), offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<DegreeResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/degrees")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}
    
    @Test
    public void testGetPersonDegrees() throws Exception {
    	// Given
    	Long id = 1L;
    	Long personId = 2L;
    	DegreeResource benefitResource = new DegreeResource();
    	benefitResource.setId(id);
    	
    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/degrees";
    	List<DegreeResource> entities = Arrays.asList(benefitResource);
    	PagedResultResource<DegreeResource> expectedResource = new PagedResultResource<>();
    	expectedResource.setCount(count);
    	expectedResource.setLimit(limit);
    	expectedResource.setOffset(offset);
    	expectedResource.setUri(uri);
    	expectedResource.setResources(entities);
    	
    	DegreeResource resource = new DegreeResource();
    	resource.setPersonId(personId);
		PagedRequest<DegreeResource> pagedRequest = new PagedRequest<DegreeResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
    	
    	// When
    	when(facade.getResources(Matchers.<PagedRequest<DegreeResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);
    	
		// Then
    	mockMvc.perform(get("/degrees")
    			.param("personId", String.valueOf(personId))
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
		mockMvc.perform(get("/degrees/{id}", id));
		
		verify(facade).getResource(id);
	}
}