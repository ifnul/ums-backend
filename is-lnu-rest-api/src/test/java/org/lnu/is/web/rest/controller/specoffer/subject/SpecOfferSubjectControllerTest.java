package org.lnu.is.web.rest.controller.specoffer.subject;

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
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.specoffer.subject.SpecOfferSubjectResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferSubjectControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<SpecOfferSubjectResource, SpecOfferSubjectResource, Long> facade;
	
	@InjectMocks
	private SpecOfferSubjectController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateSpecOfferSubject() throws Exception {
		// Given
    	Long personId = 1L;
    	
    	SpecOfferSubjectResource specOfferSubjectResource = new SpecOfferSubjectResource();
		
		// When
    	String request = getJson(specOfferSubjectResource, true);
		String response = getJson(specOfferSubjectResource, false);
    	
		when(facade.createResource(any(SpecOfferSubjectResource.class))).thenReturn(specOfferSubjectResource);
		
    	// Then
		mockMvc.perform(post("/specoffers/{0}/subjects", personId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(specOfferSubjectResource);
	}
    
    @Test
	public void testUpdateSpecOfferSubject() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	SpecOfferSubjectResource specOfferSubjectResource = new SpecOfferSubjectResource();
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Spec Offer Subject Updated");
		
		// When
    	String request = getJson(specOfferSubjectResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/specoffers/{0}/subjects/{id}", personId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, specOfferSubjectResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	SpecOfferSubjectResource specOfferSubjectResource = new SpecOfferSubjectResource();

		// When
		String response = getJson(specOfferSubjectResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(specOfferSubjectResource);
		
		// Then
    	mockMvc.perform(get("/specoffers/{0}/subjects/{id}", personId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeleteSpecOfferSubject() throws Exception {
		// Given
    	Long personId = 2L;
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/specoffers/{0}/subjects/{id}", personId, id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetSpecOfferSubjects() throws Exception {
		// Given
    	Long id = 1L;
    	Long specOfferId = 2L;
    	
    	SpecOfferSubjectResource specOfferSubjectResource = new SpecOfferSubjectResource();
    	specOfferSubjectResource.setId(id);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/persons/{0}/benefits", specOfferId);
		List<SpecOfferSubjectResource> entities = Arrays.asList(specOfferSubjectResource);
    	PagedResultResource<SpecOfferSubjectResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		SpecOfferSubjectResource resource = new SpecOfferSubjectResource();
		resource.setSpecOfferId(specOfferId);
		PagedRequest<SpecOfferSubjectResource> pagedRequest = new PagedRequest<SpecOfferSubjectResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<SpecOfferSubjectResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/specoffers/{0}/subjects", specOfferId)
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
		Long specOfferId = 2L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/specoffers/{specOfferId}/subjects/{id}", specOfferId, id));
		
		verify(facade).getResource(id);
	}
}
