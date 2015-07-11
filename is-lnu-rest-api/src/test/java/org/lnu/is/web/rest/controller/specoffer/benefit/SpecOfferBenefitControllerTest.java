package org.lnu.is.web.rest.controller.specoffer.benefit;

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
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.specoffer.benefit.SpecOfferBenefitResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferBenefitControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<SpecOfferBenefitResource, SpecOfferBenefitResource, Long> facade;
	
	@InjectMocks
	private SpecOfferBenefitController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateSpecOfferBenefit() throws Exception {
		// Given
    	Long personId = 1L;
    	
    	SpecOfferBenefitResource specOfferBenefitResource = new SpecOfferBenefitResource();
		
		// When
    	String request = getJson(specOfferBenefitResource, true);
		String response = getJson(specOfferBenefitResource, false);
    	
		when(facade.createResource(any(SpecOfferBenefitResource.class))).thenReturn(specOfferBenefitResource);
		
    	// Then
		mockMvc.perform(post("/specoffers/{0}/benefits", personId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(specOfferBenefitResource);
	}
    
    @Test
	public void testUpdateSpecOfferBenefit() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	SpecOfferBenefitResource specOfferBenefitResource = new SpecOfferBenefitResource();
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Spec Offer Benefit Updated");
		
		// When
    	String request = getJson(specOfferBenefitResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/specoffers/{0}/benefits/{id}", personId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, specOfferBenefitResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 1L;
    	
    	SpecOfferBenefitResource specOfferBenefitResource = new SpecOfferBenefitResource();

		// When
		String response = getJson(specOfferBenefitResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(specOfferBenefitResource);
		
		// Then
    	mockMvc.perform(get("/specoffers/{0}/benefits/{id}", personId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeleteSpecOfferBenefit() throws Exception {
		// Given
    	Long personId = 2L;
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/specoffers/{0}/benefits/{id}", personId, id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetSpecOfferBenefits() throws Exception {
		// Given
    	Long id = 1L;
    	Long specOfferId = 2L;
    	
    	SpecOfferBenefitResource specOfferBenefitResource = new SpecOfferBenefitResource();
    	specOfferBenefitResource.setId(id);
    	specOfferBenefitResource.setSpecOfferId(specOfferId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/specoffers/{0}/benefits", specOfferId);
		List<SpecOfferBenefitResource> entities = Arrays.asList(specOfferBenefitResource);
    	PagedResultResource<SpecOfferBenefitResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		SpecOfferBenefitResource resource = new SpecOfferBenefitResource();
		resource.setSpecOfferId(specOfferId);

		Map<String, Object> params = new HashMap<>();
		params.put("offset", String.valueOf(offset));
		params.put("limit", String.valueOf(limit));
		params.put("specOfferId", String.valueOf(specOfferId));
		PagedRequest<SpecOfferBenefitResource> pagedRequest = new PagedRequest<SpecOfferBenefitResource>(resource, offset, limit, Collections.<OrderBy>emptyList(), params);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<SpecOfferBenefitResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/specoffers/{0}/benefits", specOfferId)
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
		mockMvc.perform(get("/specoffers/{specOfferId}/benefits/{id}", specOfferId, id));
		
		verify(facade).getResource(id);
	}
}
