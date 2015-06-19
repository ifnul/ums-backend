package org.lnu.is.web.rest.controller.department.contact;

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
import org.lnu.is.resource.department.contact.DepartmentContactResource;
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
public class DepartmentContactControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<DepartmentContactResource, DepartmentContactResource, Long> facade;
	
	@InjectMocks
	private DepartmentContactController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateDepartmentContact() throws Exception {
		// Given
    	Long departmentId = 1L;
    	Long id = 2L;
    	DepartmentContactResource departmentContactResource = new DepartmentContactResource();
    	departmentContactResource.setId(id);
		
		// When
    	String request = getJson(departmentContactResource, true);
		String response = getJson(departmentContactResource, false);
    	
		when(facade.createResource(any(DepartmentContactResource.class))).thenReturn(departmentContactResource);
		
    	// Then
		mockMvc.perform(post("/departments/{departmentId}/contacts", departmentId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(departmentContactResource);
	}
    
    @Test
	public void testUpdateDepartmentContact() throws Exception {
		// Given
    	Long departmentId = 2L;
    	Long id = 1L;
    	
    	DepartmentContactResource departmentContactResource = new DepartmentContactResource();
    	departmentContactResource.setId(id);
    	departmentContactResource.setDepartmentId(departmentId);
    	
		MessageResource responseResource = new MessageResource(MessageType.INFO, "DepartmentContact Updated");
		
		// When
    	String request = getJson(departmentContactResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/departments/{departmentId}/contacts/{contactId}", departmentId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, departmentContactResource);
	}
    
    @Test
	public void testDeleteDepatmentContact() throws Exception {
    	// Given
    	Long personId = 2L;
    	Long contactId = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/departments/{departmentId}/contacts/{contactId}", personId, contactId))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(contactId);
	}

    
    @Test
	public void testGetContact() throws Exception {
		// Given
    	Long departmentId = 1L;
    	Long id = 2L;
    	
    	DepartmentContactResource departmentContactResource = new DepartmentContactResource();
    	departmentContactResource.setId(id);
    	departmentContactResource.setDepartmentId(departmentId);

		// When
		String response = getJson(departmentContactResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(departmentContactResource);
		
		// Then
    	mockMvc.perform(get("/departments/{departmentId}/contacts/{contactId}", departmentId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testGetDepartmentPapers() throws Exception {
		// Given
    	Long id = 1L;
    	Long departmentId = 2L;
    	
    	DepartmentContactResource departmentPaperResource = new DepartmentContactResource();
    	departmentPaperResource.setId(id);
    	departmentPaperResource.setDepartmentId(departmentId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/departments/{0}/contacts", departmentId);
		List<DepartmentContactResource> entities = Arrays.asList(departmentPaperResource);
    	PagedResultResource<DepartmentContactResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		DepartmentContactResource resource = new DepartmentContactResource();
		resource.setDepartmentId(departmentId);
		PagedRequest<DepartmentContactResource> pagedRequest = new PagedRequest<DepartmentContactResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<DepartmentContactResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/departments/{departmentId}/contacts", departmentId)
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
		mockMvc.perform(get("/departments/{departmentId}/contacts/{id}", departmentId, id));
		
		verify(facade).getResource(id);
	}
}
