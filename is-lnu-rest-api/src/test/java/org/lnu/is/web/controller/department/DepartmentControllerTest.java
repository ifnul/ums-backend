package org.lnu.is.web.controller.department;

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
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.department.DepartmentFacade;
import org.lnu.is.facade.resource.department.DepartmentResource;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class DepartmentControllerTest extends AbstractControllerTest {

	@Mock
	private DepartmentFacade departmentFacade;
	
	@InjectMocks
	private DepartmentController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreateDepartment() throws Exception {
		// Given
    	String name = "fsd department";
    	String abbrName = "fds";
    	String email = "email";
    	String manager = "manager";
    	String phone = "phone";
    	
    	DepartmentResource departmentResource = new DepartmentResource();
    	departmentResource.setBegDate(new Date());
    	departmentResource.setEndDate(new Date());
		departmentResource.setAbbrName(abbrName );
		departmentResource.setName(name);
		departmentResource.setEmail(email);
		departmentResource.setManager(manager);
		departmentResource.setPhone(phone);
		
		
		// When
    	String request = getJson(departmentResource, true);
		String response = getJson(departmentResource, false);
    	
		when(departmentFacade.createDepartment(any(DepartmentResource.class))).thenReturn(departmentResource);
		
    	// Then
		mockMvc.perform(post("/departments")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(departmentFacade).createDepartment(departmentResource);
	}
    
    @Test
	public void testUpdateDepartment() throws Exception {
		// Given
    	Long id = 1L;
    	String name = "fsd department";
    	String abbrName = "fds";
    	String email = "email";
    	String manager = "manager";
    	String phone = "phone";
    	
    	DepartmentResource departmentResource = new DepartmentResource();
    	departmentResource.setId(id);
    	departmentResource.setBegDate(new Date());
    	departmentResource.setEndDate(new Date());
		departmentResource.setAbbrName(abbrName );
		departmentResource.setName(name);
		departmentResource.setEmail(email);
		departmentResource.setManager(manager);
		departmentResource.setPhone(phone);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Department Updated");
		
		// When
    	String request = getJson(departmentResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/departments/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(departmentFacade).updateDepartment(id, departmentResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	String name = "fsd department";
    	String abbrName = "fds";
    	String email = "email";
    	String manager = "manager";
    	String phone = "phone";
    	
    	DepartmentResource departmentResource = new DepartmentResource();
    	departmentResource.setId(id);
    	departmentResource.setBegDate(new Date());
    	departmentResource.setEndDate(new Date());
		departmentResource.setAbbrName(abbrName );
		departmentResource.setName(name);
		departmentResource.setEmail(email);
		departmentResource.setManager(manager);
		departmentResource.setPhone(phone);

		// When
		String response = getJson(departmentResource, false);
		
		when(departmentFacade.getDepartment(anyLong())).thenReturn(departmentResource);
		
		// Then
    	mockMvc.perform(get("/departments/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(departmentFacade).getDepartment(id);
	}
    
    @Test
	public void testDeleteDepartment() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/departments/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(departmentFacade).removeDepartment(id);
	}
    
    @Test
	public void testGetDepartments() throws Exception {
		// Given
    	Long id = 1L;
    	String name = "fsd department";
    	String abbrName = "fds";
    	String email = "email";
    	String manager = "manager";
    	String phone = "phone";
    	
    	DepartmentResource departmentResource = new DepartmentResource();
    	departmentResource.setId(id);
    	departmentResource.setBegDate(new Date());
    	departmentResource.setEndDate(new Date());
		departmentResource.setAbbrName(abbrName );
		departmentResource.setName(name);
		departmentResource.setEmail(email);
		departmentResource.setManager(manager);
		departmentResource.setPhone(phone);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/departments";
		List<DepartmentResource> entities = Arrays.asList(departmentResource);
    	PagedResultResource<DepartmentResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setEntities(entities);
		
		PagedRequest<DepartmentResource> pagedRequest = new PagedRequest<DepartmentResource>(new DepartmentResource(), offset, limit);
		
		// When
		when(departmentFacade.getDepartments(Matchers.<PagedRequest<DepartmentResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/departments")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(departmentFacade).getDepartments(pagedRequest);
	}
}
