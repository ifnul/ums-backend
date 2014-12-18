package org.lnu.is.web.rest.controller.order;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.order.OrderResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<OrderResource, Long> facade;
	
	@InjectMocks
	private OrderController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateOrder() throws Exception {
		// Given
    	String docNum = "docNum";
    	
    	OrderResource orderResource = new OrderResource();
		orderResource.setDocNum(docNum);
		
		// When
    	String request = getJson(orderResource, true);
		String response = getJson(orderResource, false);
    	
		when(facade.createResource(any(OrderResource.class))).thenReturn(orderResource);
		
    	// Then
		mockMvc.perform(post("/orders")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(orderResource);
	}
    
    @Test
	public void testUpdateOrder() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	OrderResource orderResource = new OrderResource();
    	orderResource.setId(id);
		orderResource.setDocNum(docNum);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Order Updated");
		
		// When
    	String request = getJson(orderResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/orders/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, orderResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	OrderResource orderResource = new OrderResource();
    	orderResource.setId(id);
		orderResource.setDocNum(docNum);

		// When
		String response = getJson(orderResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(orderResource);
		
		// Then
    	mockMvc.perform(get("/orders/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeleteOrder() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/orders/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetOrders() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	OrderResource orderResource = new OrderResource();
    	orderResource.setId(id);
		orderResource.setDocNum(docNum);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/orders";
		List<OrderResource> entities = Arrays.asList(orderResource);
    	PagedResultResource<OrderResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<OrderResource> pagedRequest = new PagedRequest<OrderResource>(new OrderResource(), offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<OrderResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/orders")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}
  
}
