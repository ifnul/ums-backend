package org.lnu.is.web.rest.controller.enrolment;

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
import org.lnu.is.domain.OrderBy;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.enrolment.EnrolmentResource;
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
public class EnrolmentControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<EnrolmentResource, Long> facade;
	
	@InjectMocks
	private EnrolmentController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateEnrolment() throws Exception {
		// Given
    	Long id  = 1L;
    	String docNum = "docNum";
    	
    	EnrolmentResource enrolmentResource = new EnrolmentResource();
    	enrolmentResource.setId(id);
    	enrolmentResource.setBegDate(new Date());
    	enrolmentResource.setDocNum(docNum);
		
		// When
    	String request = getJson(enrolmentResource, true);
		String response = getJson(enrolmentResource, false);
    	
		when(facade.createResource(any(EnrolmentResource.class))).thenReturn(enrolmentResource);
		
    	// Then
		mockMvc.perform(post("/enrolments")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(enrolmentResource);
	}
    
    @Test
	public void testUpdateEnrolment() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	EnrolmentResource enrolmentResource = new EnrolmentResource();
    	enrolmentResource.setId(id);
    	enrolmentResource.setBegDate(new Date());
    	enrolmentResource.setDocNum(docNum);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Enrolment Updated");
		
		// When
    	String request = getJson(enrolmentResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/enrolments/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, enrolmentResource);
	}
    
    @Test
	public void testGetEnrolment() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	EnrolmentResource enrolmentResource = new EnrolmentResource();
    	enrolmentResource.setId(id);
    	enrolmentResource.setBegDate(new Date());
    	enrolmentResource.setDocNum(docNum);

		// When
		String response = getJson(enrolmentResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(enrolmentResource);
		
		// Then
    	mockMvc.perform(get("/enrolments/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testRemoveEnrolment() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/enrolments/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetEnrolments() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	EnrolmentResource enrolmentResource = new EnrolmentResource();
    	enrolmentResource.setId(id);
    	enrolmentResource.setBegDate(new Date());
    	enrolmentResource.setDocNum(docNum);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/enrolments";
		List<EnrolmentResource> entities = Arrays.asList(enrolmentResource);
    	PagedResultResource<EnrolmentResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<EnrolmentResource> pagedRequest = new PagedRequest<EnrolmentResource>(new EnrolmentResource(), offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<EnrolmentResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/enrolments")
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
		mockMvc.perform(get("/enrolments/{id}", id));
		
		verify(facade).getResource(id);
	}
}
