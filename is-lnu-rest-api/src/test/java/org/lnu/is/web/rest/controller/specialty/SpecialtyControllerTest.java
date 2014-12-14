package org.lnu.is.web.rest.controller.specialty;

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
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specialty.SpecialtyResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.specialty.SpecialtyController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class SpecialtyControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<SpecialtyResource, Long> facade;
	
	@InjectMocks
	private SpecialtyController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreateSpecialty() throws Exception {
		// Given
    	String name = "fsd specialty";
    	Long specialtyTypeId = 25L;
    	String abbrName = "fds";
    	String cipher = "534tgfds";
    	
    	SpecialtyResource specialtyResource = new SpecialtyResource();
    	specialtyResource.setBegDate(new Date());
    	specialtyResource.setEndDate(new Date());
		specialtyResource.setAbbrName(abbrName );
		specialtyResource.setCipher(cipher);
		specialtyResource.setName(name);
		specialtyResource.setSpecialtyTypeId(specialtyTypeId);
		
		
		// When
    	String request = getJson(specialtyResource, true);
		String response = getJson(specialtyResource, false);
    	
		when(facade.createResource(any(SpecialtyResource.class))).thenReturn(specialtyResource);
		
    	// Then
		mockMvc.perform(post("/specialties")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(specialtyResource);
	}
    
    @Test
	public void testUpdateSpecialty() throws Exception {
		// Given
    	Long id = 1L;
    	String name = "fsd specialty";
    	Long specialtyTypeId = 25L;
    	String abbrName = "fds";
    	String cipher = "534tgfds";
    	
    	SpecialtyResource specialtyResource = new SpecialtyResource();
    	specialtyResource.setId(id);
    	specialtyResource.setBegDate(new Date());
    	specialtyResource.setEndDate(new Date());
		specialtyResource.setAbbrName(abbrName );
		specialtyResource.setCipher(cipher);
		specialtyResource.setName(name);
		specialtyResource.setSpecialtyTypeId(specialtyTypeId);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Specialty Updated");
		
		// When
    	String request = getJson(specialtyResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/specialties/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, specialtyResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	String name = "fsd specialty";
    	Long specialtyTypeId = 25L;
    	String abbrName = "fds";
    	String cipher = "534tgfds";
    	
    	SpecialtyResource specialtyResource = new SpecialtyResource();
    	specialtyResource.setId(id);
    	specialtyResource.setBegDate(new Date());
    	specialtyResource.setEndDate(new Date());
		specialtyResource.setAbbrName(abbrName );
		specialtyResource.setCipher(cipher);
		specialtyResource.setName(name);
		specialtyResource.setSpecialtyTypeId(specialtyTypeId);

		// When
		String response = getJson(specialtyResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(specialtyResource);
		
		// Then
    	mockMvc.perform(get("/specialties/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeleteSpecialty() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/specialties/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetSpecialtys() throws Exception {
		// Given
    	Long id = 1L;
    	String name = "fsd specialty";
    	Long specialtyTypeId = 25L;
    	String abbrName = "fds";
    	String cipher = "534tgfds";
    	
    	SpecialtyResource specialtyResource = new SpecialtyResource();
    	specialtyResource.setId(id);
    	specialtyResource.setBegDate(new Date());
    	specialtyResource.setEndDate(new Date());
		specialtyResource.setAbbrName(abbrName );
		specialtyResource.setCipher(cipher);
		specialtyResource.setName(name);
		specialtyResource.setSpecialtyTypeId(specialtyTypeId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/specialties";
		List<SpecialtyResource> entities = Arrays.asList(specialtyResource);
    	PagedResultResource<SpecialtyResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<SpecialtyResource> pagedRequest = new PagedRequest<SpecialtyResource>(new SpecialtyResource(), offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<SpecialtyResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/specialties")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}
}
