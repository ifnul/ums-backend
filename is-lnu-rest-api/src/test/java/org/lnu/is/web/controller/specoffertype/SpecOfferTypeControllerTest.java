package org.lnu.is.web.controller.specoffertype;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.specoffertype.SpecOfferTypeFacade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffertype.SpecOfferTypeResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferTypeControllerTest extends AbstractControllerTest {

	@Mock
	private SpecOfferTypeFacade specOfferTypeFacade;
	
	@InjectMocks
	private SpecOfferTypeController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testGetSpecOfferTypes() throws Exception {
		// Given
    	String name = "name";
		SpecOfferTypeResource resource = new SpecOfferTypeResource();
		resource.setName(name);
		
		List<SpecOfferTypeResource> entities = Arrays.asList(resource);


		Integer offset = 0;
		long count = 1;
		Integer limit = 20;
		PagedResultResource<SpecOfferTypeResource> expected = new PagedResultResource<>("/specoffertypes");
		expected.setEntities(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		SpecOfferTypeResource paramResource = new SpecOfferTypeResource();
		paramResource.setName(name);
		PagedRequest<SpecOfferTypeResource> request = new PagedRequest<SpecOfferTypeResource>(paramResource, offset, limit);
		
		// When
		when(specOfferTypeFacade.getSpecOfferTypes(Matchers.<PagedRequest<SpecOfferTypeResource>>any())).thenReturn(expected);
    	String response = getJson(expected, false);

		// Then
    	mockMvc.perform(get("/specoffertypes")
    			.param("name", name))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(specOfferTypeFacade).getSpecOfferTypes(request);
	}
}
