package org.lnu.is.web.rest.controller.department.name;

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
import org.lnu.is.resource.department.name.DepartmentNameResource;
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
public class DepartmentNameControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<DepartmentNameResource, Long> facade;
	
	@InjectMocks
	private DepartmentNameController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateDepartmentName() throws Exception {
		// Given
    	Long departmentId = 1L;
    	Long id = 2L;
    	DepartmentNameResource departmentNameResource = new DepartmentNameResource();
    	departmentNameResource.setId(id);
		
		// When
    	String request = getJson(departmentNameResource, true);
		String response = getJson(departmentNameResource, false);
    	
		when(facade.createResource(any(DepartmentNameResource.class))).thenReturn(departmentNameResource);
		
    	// Then
		mockMvc.perform(post("/departments/{departmentId}/names", departmentId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(departmentNameResource);
	}
    
    @Test
	public void testUpdateDepartmentName() throws Exception {
		// Given
    	Long departmentId = 2L;
    	Long id = 1L;
    	
    	DepartmentNameResource departmentNameResource = new DepartmentNameResource();
    	departmentNameResource.setId(id);
    	departmentNameResource.setDepartmentId(departmentId);
    	
		MessageResource responseResource = new MessageResource(MessageType.INFO, "DepartmentName Updated");
		
		// When
    	String request = getJson(departmentNameResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/departments/{departmentId}/names/{nameId}", departmentId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, departmentNameResource);
	}
    
    @Test
	public void testDeleteDepatmentName() throws Exception {
    	// Given
    	Long personId = 2L;
    	Long nameId = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/departments/{departmentId}/names/{nameId}", personId, nameId))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(nameId);
	}

    
    @Test
	public void testGetName() throws Exception {
		// Given
    	Long departmentId = 1L;
    	Long id = 2L;
    	
    	DepartmentNameResource departmentNameResource = new DepartmentNameResource();
    	departmentNameResource.setId(id);
    	departmentNameResource.setDepartmentId(departmentId);

		// When
		String response = getJson(departmentNameResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(departmentNameResource);
		
		// Then
    	mockMvc.perform(get("/departments/{departmentId}/names/{nameId}", departmentId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testGetDepartmentPapers() throws Exception {
		// Given
    	Long id = 1L;
    	Long departmentId = 2L;
    	
    	DepartmentNameResource departmentPaperResource = new DepartmentNameResource();
    	departmentPaperResource.setId(id);
    	departmentPaperResource.setDepartmentId(departmentId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/departments/{0}/names", departmentId);
		List<DepartmentNameResource> entities = Arrays.asList(departmentPaperResource);
    	PagedResultResource<DepartmentNameResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		DepartmentNameResource resource = new DepartmentNameResource();
		resource.setDepartmentId(departmentId);
		PagedRequest<DepartmentNameResource> pagedRequest = new PagedRequest<DepartmentNameResource>(resource, offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<DepartmentNameResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/departments/{departmentId}/names", departmentId)
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
		mockMvc.perform(get("/departments/{departmentId}/names/{id}", departmentId, id));
		
		verify(facade).getResource(id);
	}
}
