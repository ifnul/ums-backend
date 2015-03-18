package org.lnu.is.web.rest.controller.timeperiod;

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
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.timeperiod.TimePeriodResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class TimePeriodControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<TimePeriodResource, Long> facade;
	
	@InjectMocks
	private TimePeriodController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateTimePeriod() throws Exception {
		// Given
    	TimePeriodResource timePeriodResource = new TimePeriodResource();
    	timePeriodResource.setBegDate(new Date());
		
		// When
    	String request = getJson(timePeriodResource, true);
		String response = getJson(timePeriodResource, false);
    	
		when(facade.createResource(any(TimePeriodResource.class))).thenReturn(timePeriodResource);
		
    	// Then
		mockMvc.perform(post("/timeperiods")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(timePeriodResource);
	}
    
    @Test
	public void testUpdateTimePeriod() throws Exception {
		// Given
    	Long id = 1L;
    	TimePeriodResource timePeriodResource = new TimePeriodResource();
    	timePeriodResource.setId(id);
    	timePeriodResource.setBegDate(new Date());
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "TimePeriod Updated");
		
		// When
    	String request = getJson(timePeriodResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/timeperiods/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, timePeriodResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	TimePeriodResource timePeriodResource = new TimePeriodResource();
    	timePeriodResource.setId(id);
    	timePeriodResource.setBegDate(new Date());

		// When
		String response = getJson(timePeriodResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(timePeriodResource);
		
		// Then
    	mockMvc.perform(get("/timeperiods/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeleteTimePeriod() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/timeperiods/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetTimePeriods() throws Exception {
		// Given
    	Long id = 1L;
    	TimePeriodResource entity1 = new TimePeriodResource();
    	entity1.setId(id);
    	entity1.setBegDate(new Date());
    	entity1.setEndDate(new Date());

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/timeperiods";
		List<TimePeriodResource> entities = Arrays.asList(entity1);
    	PagedResultResource<TimePeriodResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<TimePeriodResource> pagedRequest = new PagedRequest<TimePeriodResource>(new TimePeriodResource(), offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<TimePeriodResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/timeperiods")
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
		mockMvc.perform(get("/timeperiods/{id}", id));
		
		verify(facade).getResource(id);
	}
}
