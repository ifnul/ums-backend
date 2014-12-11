package org.lnu.is.web.controller.timeperiod.type;

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
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.type.TimePeriodTypeResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class TimePeriodTypeControllerTest extends AbstractControllerTest {
	
	@Mock
	private Facade<TimePeriodTypeResource, Long> facade;
	
	@InjectMocks
	private TimePeriodTypeController unit;
	
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
	}
	
	@Test
	public void testGetTimePeriodTypes() throws Exception {
		// Given
		String name = "all difficult";
		String abbrName = "ad";
		TimePeriodTypeResource resource = new TimePeriodTypeResource();
		resource.setName(name);
		resource.setAbbrName(abbrName);
		
		List<TimePeriodTypeResource> entities = Arrays.asList(resource);
		
		int offset = 0;
		int limit = 20;
		long count = 1;
		PagedResultResource<TimePeriodTypeResource> expected = new PagedResultResource<>("/timeperiods/types");
		expected.setResources(entities);
		expected.setOffset(offset);
		expected.setLimit(limit);
		expected.setCount(count);
		
		TimePeriodTypeResource paramResource = new TimePeriodTypeResource();
		paramResource.setName(name);
		paramResource.setAbbrName(abbrName);		
		
		PagedRequest<TimePeriodTypeResource> request = new PagedRequest<TimePeriodTypeResource>(paramResource, offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<TimePeriodTypeResource>>any())).thenReturn(expected);
		String response = getJson(expected, false);
		
		// Then
		mockMvc.perform(get("/timeperiods/types")
				.param("name", name)
				.param("abbrName", abbrName))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).getResources(request);
	}

}
