package org.lnu.is.web.rest.controller.partner;

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
import org.lnu.is.facade.resource.partner.PartnerResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class PartnerControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<PartnerResource, Long> facade;
	
	@InjectMocks
	private PartnerController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreatePartner() throws Exception {
		// Given
    	PartnerResource partnerResource = new PartnerResource();
    	partnerResource.setBegDate(new Date());
		
		// When
    	String request = getJson(partnerResource, true);
		String response = getJson(partnerResource, false);
    	
		when(facade.createResource(any(PartnerResource.class))).thenReturn(partnerResource);
		
    	// Then
		mockMvc.perform(post("/partners")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(partnerResource);
	}
    
    @Test
	public void testUpdatePartner() throws Exception {
		// Given
    	Long id = 1L;
    	
    	PartnerResource partnerResource = new PartnerResource();
    	partnerResource.setId(id);
    	partnerResource.setBegDate(new Date());
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Partner Updated");
		
		// When
    	String request = getJson(partnerResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/partners/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, partnerResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	
    	PartnerResource partnerResource = new PartnerResource();
    	partnerResource.setId(id);
    	partnerResource.setBegDate(new Date());

		// When
		String response = getJson(partnerResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(partnerResource);
		
		// Then
    	mockMvc.perform(get("/partners/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeletePartner() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/partners/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetPartners() throws Exception {
		// Given
    	Long id = 1L;
    	
    	PartnerResource partnerResource = new PartnerResource();
    	partnerResource.setId(id);
    	partnerResource.setBegDate(new Date());

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/partners";
		List<PartnerResource> entities = Arrays.asList(partnerResource);
    	PagedResultResource<PartnerResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<PartnerResource> pagedRequest = new PagedRequest<PartnerResource>(new PartnerResource(), offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<PartnerResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/partners")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}
  
}
