package org.lnu.is.web.specoffer;

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
import org.lnu.is.facade.facade.specoffer.SpecOfferFacade;
import org.lnu.is.facade.resources.message.MessageResource;
import org.lnu.is.facade.resources.message.MessageType;
import org.lnu.is.facade.resources.search.PagedRequest;
import org.lnu.is.facade.resources.search.PagedResultResource;
import org.lnu.is.facade.resources.specoffer.SpecOfferResource;
import org.lnu.is.web.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferControllerTest extends AbstractControllerTest {

	@Mock
	private SpecOfferFacade specOfferFacade;
	
	@InjectMocks
	private SpecOfferController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreateSpecOffer() throws Exception {
		// Given
    	String note = "Note";
    	Integer licCount = 24;
    	Long eduFormTypeId = 1L;
    	String docNum = "docNum";
    	Long departmentId = 23L;
    	
    	SpecOfferResource specOfferResource = new SpecOfferResource();
    	specOfferResource.setBegDate(new Date());
    	specOfferResource.setEndDate(new Date());
		specOfferResource.setDepartmentId(departmentId);
		specOfferResource.setDocNum(docNum);
		specOfferResource.setEduFormTypeId(eduFormTypeId);
		specOfferResource.setLicCount(licCount);
		specOfferResource.setNote(note);
		
		
		// When
    	String request = getJson(specOfferResource, true);
		String response = getJson(specOfferResource, false);
    	
		when(specOfferFacade.createSpecOffer(any(SpecOfferResource.class))).thenReturn(specOfferResource);
		
    	// Then
		mockMvc.perform(post("/specoffers")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(specOfferFacade).createSpecOffer(specOfferResource);
	}
    
    @Test
	public void testUpdateSpecOffer() throws Exception {
		// Given
    	Long id = 1L;
    	String note = "Note";
    	Integer licCount = 24;
    	Long eduFormTypeId = 1L;
    	String docNum = "docNum";
    	Long departmentId = 23L;
    	
    	SpecOfferResource specOfferResource = new SpecOfferResource();
    	specOfferResource.setId(id);
    	specOfferResource.setBegDate(new Date());
    	specOfferResource.setEndDate(new Date());
		specOfferResource.setDepartmentId(departmentId);
		specOfferResource.setDocNum(docNum);
		specOfferResource.setEduFormTypeId(eduFormTypeId);
		specOfferResource.setLicCount(licCount);
		specOfferResource.setNote(note);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "SpecOffer Updated");
		
		// When
    	String request = getJson(specOfferResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/specoffers/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(specOfferFacade).updateSpecOffer(id, specOfferResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	String note = "Note";
    	Integer licCount = 24;
    	Long eduFormTypeId = 1L;
    	String docNum = "docNum";
    	Long departmentId = 23L;
    	
    	SpecOfferResource specOfferResource = new SpecOfferResource();
    	specOfferResource.setId(id);
    	specOfferResource.setBegDate(new Date());
    	specOfferResource.setEndDate(new Date());
		specOfferResource.setDepartmentId(departmentId);
		specOfferResource.setDocNum(docNum);
		specOfferResource.setEduFormTypeId(eduFormTypeId);
		specOfferResource.setLicCount(licCount);
		specOfferResource.setNote(note);

		// When
		String response = getJson(specOfferResource, false);
		
		when(specOfferFacade.getSpecOffer(anyLong())).thenReturn(specOfferResource);
		
		// Then
    	mockMvc.perform(get("/specoffers/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(specOfferFacade).getSpecOffer(id);
	}
    
    @Test
	public void testDeleteSpecOffer() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/specoffers/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(specOfferFacade).removeSpecOffer(id);
	}
    
    @Test
	public void testGetSpecOffers() throws Exception {
		// Given
    	Long id = 1L;
    	String note = "Note";
    	Integer licCount = 24;
    	Long eduFormTypeId = 1L;
    	String docNum = "docNum";
    	Long departmentId = 23L;
    	
    	SpecOfferResource entity1 = new SpecOfferResource();
    	entity1.setId(id);
    	entity1.setBegDate(new Date());
    	entity1.setEndDate(new Date());
		entity1.setDepartmentId(departmentId);
		entity1.setDocNum(docNum);
		entity1.setEduFormTypeId(eduFormTypeId);
		entity1.setLicCount(licCount);
		entity1.setNote(note);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/specoffers";
		List<SpecOfferResource> entities = Arrays.asList(entity1);
    	PagedResultResource<SpecOfferResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setEntities(entities);
		
		PagedRequest pagedRequest = new PagedRequest(offset, limit);
		
		// When
		when(specOfferFacade.getSpecOffers(any(PagedRequest.class))).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/specoffers")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(specOfferFacade).getSpecOffers(pagedRequest);
	}
}
