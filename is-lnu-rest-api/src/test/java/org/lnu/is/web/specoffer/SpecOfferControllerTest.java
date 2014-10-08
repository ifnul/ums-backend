package org.lnu.is.web.specoffer;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.specoffer.SpecOfferFacade;
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
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(specOfferFacade).createSpecOffer(specOfferResource);
	}
}
