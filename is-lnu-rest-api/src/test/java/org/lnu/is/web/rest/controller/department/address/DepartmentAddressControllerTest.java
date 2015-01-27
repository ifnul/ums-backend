package org.lnu.is.web.rest.controller.department.address;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
import org.lnu.is.resource.department.address.DepartmentAddressResource;
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
public class DepartmentAddressControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<DepartmentAddressResource, Long> facade;
	
	@InjectMocks
	private DepartmentAddressController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateDepartmentAddress() throws Exception {
		// Given
    	Long departmentId = 1L;
    	Long id = 2L;
    	DepartmentAddressResource departmentAddressResource = new DepartmentAddressResource();
    	departmentAddressResource.setId(id);
		
		// When
    	String request = getJson(departmentAddressResource, true);
		String response = getJson(departmentAddressResource, false);
    	
		when(facade.createResource(any(DepartmentAddressResource.class))).thenReturn(departmentAddressResource);
		
    	// Then
		mockMvc.perform(post("/departments/{departmentId}/addresses", departmentId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(departmentAddressResource);
	}
    
    @Test
	public void testUpdateDepartmentAddress() throws Exception {
		// Given
    	Long departmentId = 2L;
    	Long id = 1L;
    	
    	DepartmentAddressResource departmentAddressResource = new DepartmentAddressResource();
    	departmentAddressResource.setId(id);
    	departmentAddressResource.setDepartmentId(departmentId);
    	
		MessageResource responseResource = new MessageResource(MessageType.INFO, "DepartmentAddress Updated");
		
		// When
    	String request = getJson(departmentAddressResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/departments/{departmentId}/addresses/{addressId}", departmentId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, departmentAddressResource);
	}
    
    @Test
	public void testGetAddress() throws Exception {
		// Given
    	Long departmentId = 1L;
    	Long id = 2L;
    	
    	DepartmentAddressResource departmentAddressResource = new DepartmentAddressResource();
    	departmentAddressResource.setId(id);
    	departmentAddressResource.setDepartmentId(departmentId);

		// When
		String response = getJson(departmentAddressResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(departmentAddressResource);
		
		// Then
    	mockMvc.perform(get("/departments/{departmentId}/addresses/{addressId}", departmentId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testGetDepartmentPapers() throws Exception {
		// Given
    	Long id = 1L;
    	Long departmentId = 2L;
    	
    	DepartmentAddressResource departmentPaperResource = new DepartmentAddressResource();
    	departmentPaperResource.setId(id);
    	departmentPaperResource.setDepartmentId(departmentId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/departments/{0}/addresses", departmentId);
		List<DepartmentAddressResource> entities = Arrays.asList(departmentPaperResource);
    	PagedResultResource<DepartmentAddressResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		DepartmentAddressResource resource = new DepartmentAddressResource();
		resource.setDepartmentId(departmentId);
		PagedRequest<DepartmentAddressResource> pagedRequest = new PagedRequest<DepartmentAddressResource>(resource, offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<DepartmentAddressResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/departments/{departmentId}/addresses", departmentId)
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
		Long departmentId = 2L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/departments/{departmentId}/addresses/{id}", departmentId, id));
		
		verify(facade).getResource(id);
	}
}
