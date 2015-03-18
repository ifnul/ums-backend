package org.lnu.is.web.rest.controller.enrolment.benefit;

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
import org.lnu.is.resource.enrolment.benefit.EnrolmentBenefitResource;
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
public class EnrolmentBenefitControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<EnrolmentBenefitResource, Long> facade;
	
	@InjectMocks
	private EnrolmentBenefitController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateEnrolmentBenefit() throws Exception {
		// Given
    	Long id  = 1L;
    	Long enrolmentId = 2L;
    	Long benefitId = 3L;
    	
    	EnrolmentBenefitResource resource = new EnrolmentBenefitResource();
    	resource.setId(id);
		resource.setEnrolmentId(enrolmentId);
		resource.setBenefitId(benefitId);
		
		// When
    	String request = getJson(resource, true);
		String response = getJson(resource, false);
    	
		when(facade.createResource(any(EnrolmentBenefitResource.class))).thenReturn(resource);
		
    	// Then
		mockMvc.perform(post("/enrolments/{enrolmentId}/benefits", enrolmentId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(resource);
	}
    
    @Test
	public void testUpdateEnrolmentBenefit() throws Exception {
		// Given
    	Long id  = 1L;
    	Long enrolmentId = 2L;
    	Long benefitId = 3L;
    	
    	EnrolmentBenefitResource resource = new EnrolmentBenefitResource();
    	resource.setId(id);
		resource.setEnrolmentId(enrolmentId);
		resource.setBenefitId(benefitId);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "EnrolmentBenefit Updated");
		
		// When
    	String request = getJson(resource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/enrolments/{enrolmentId}/benefits/{id}", enrolmentId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, resource);
	}
    
    @Test
	public void testGetEnrolmentBenefit() throws Exception {
		// Given
    	Long id  = 1L;
    	Long enrolmentId = 2L;
    	Long benefitId = 3L;
    	
    	EnrolmentBenefitResource resource = new EnrolmentBenefitResource();
    	resource.setId(id);
		resource.setEnrolmentId(enrolmentId);
		resource.setBenefitId(benefitId);

		// When
		String response = getJson(resource, false);
		
		when(facade.getResource(anyLong())).thenReturn(resource);
		
		// Then
    	mockMvc.perform(get("/enrolments/{enrolmentId}/benefits/{id}", enrolmentId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testRemoveEnrolmentBenefit() throws Exception {
		// Given
    	Long id = 1L;
    	Long enrolmentId = 2L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/enrolments/{enrolmentId}/benefits/{id}", enrolmentId, id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetEnrolmentBenefits() throws Exception {
		// Given
    	Long id  = 1L;
    	Long enrolmentId = 2L;
    	Long benefitId = 3L;
    	
    	EnrolmentBenefitResource resource = new EnrolmentBenefitResource();
    	resource.setId(id);
		resource.setEnrolmentId(enrolmentId);
		resource.setBenefitId(benefitId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/enrolments";
		List<EnrolmentBenefitResource> entities = Arrays.asList(resource);
    	PagedResultResource<EnrolmentBenefitResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		EnrolmentBenefitResource pagedResource = new EnrolmentBenefitResource();
		pagedResource.setEnrolmentId(enrolmentId);
		PagedRequest<EnrolmentBenefitResource> pagedRequest = new PagedRequest<EnrolmentBenefitResource>(pagedResource, offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<EnrolmentBenefitResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/enrolments/{enrolmentId}/benefits", enrolmentId)
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}
    
    @Test
    public void testGetAllEnrolmentBenefits() throws Exception {
    	// Given
    	Long id  = 1L;
    	Long enrolmentId = 2L;
    	Long benefitId = 3L;
    	
    	EnrolmentBenefitResource resource = new EnrolmentBenefitResource();
    	resource.setId(id);
    	resource.setEnrolmentId(enrolmentId);
    	resource.setBenefitId(benefitId);
    	
    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/enrolments";
    	List<EnrolmentBenefitResource> entities = Arrays.asList(resource);
    	PagedResultResource<EnrolmentBenefitResource> expectedResource = new PagedResultResource<>();
    	expectedResource.setCount(count);
    	expectedResource.setLimit(limit);
    	expectedResource.setOffset(offset);
    	expectedResource.setUri(uri);
    	expectedResource.setResources(entities);
    	
    	EnrolmentBenefitResource pagedResource = new EnrolmentBenefitResource();
    	PagedRequest<EnrolmentBenefitResource> pagedRequest = new PagedRequest<EnrolmentBenefitResource>(pagedResource, offset, limit, Collections.<OrderBy>emptyList());
    	
    	// When
    	when(facade.getResources(Matchers.<PagedRequest<EnrolmentBenefitResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);
    	
    	// Then
    	mockMvc.perform(get("/enrolments/benefits", enrolmentId)
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    			.andExpect(status().isOk())
    			.andExpect(content().string(response));
    	
    	verify(facade).getResources(pagedRequest);
    }

	@Test(expected = AccessDeniedException.class)
	public void testGetResourceWithAccessDeniedException() throws Exception {
		// Given
    	Long id  = 1L;
    	Long enrolmentId = 2L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/enrolments/{enrolmentId}/benefits/{id}", enrolmentId, id));
		
		verify(facade).getResource(id);
	}
}
