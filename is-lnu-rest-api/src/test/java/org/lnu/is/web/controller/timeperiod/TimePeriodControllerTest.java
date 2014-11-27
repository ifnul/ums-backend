package org.lnu.is.web.controller.timeperiod;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.timeperiod.TimePeriodFacade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.TimePeriodResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class TimePeriodControllerTest extends AbstractControllerTest {

	@Mock
	private TimePeriodFacade timePeriodFacade;
	
	@InjectMocks
	private TimePeriodController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testGetTimePeriods() throws Exception {
		// Given
    	Long id = 1L;
    	TimePeriodResource entity1 = new TimePeriodResource();
    	entity1.setId(id);
    	entity1.setBegDate(new Date());
    	entity1.setEndDate(new Date());

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/specoffers";
		List<TimePeriodResource> entities = Arrays.asList(entity1);
    	PagedResultResource<TimePeriodResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<TimePeriodResource> pagedRequest = new PagedRequest<TimePeriodResource>(new TimePeriodResource(), offset, limit);
		
		// When
		when(timePeriodFacade.getEntities(Matchers.<PagedRequest<TimePeriodResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/timeperiods")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(timePeriodFacade).getEntities(pagedRequest);
	}
}
