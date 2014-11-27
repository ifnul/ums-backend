package org.lnu.is.web.controller.eduformtype;

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
import org.lnu.is.facade.facade.eduformtype.EduFormTypeFacade;
import org.lnu.is.facade.resource.eduformtype.EduFormTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class EduFormTypeControllerTest extends AbstractControllerTest {

	@Mock
	private EduFormTypeFacade eduFormTypeFacade;
	
	@InjectMocks
	private EduFormTypeController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testGetEduFormTypes() throws Exception {
		// Given
    	String name = "form type 1";
		EduFormTypeResource resource = new EduFormTypeResource();
		resource.setName(name);
		
		List<EduFormTypeResource> entities = Arrays.asList(resource);


		Integer offset = 0;
		long count = 1;
		Integer limit = 38;
		PagedResultResource<EduFormTypeResource> expected = new PagedResultResource<>("/eduformtypes");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		EduFormTypeResource paramResource = new EduFormTypeResource();
		paramResource.setName(name);
		PagedRequest<EduFormTypeResource> request = new PagedRequest<EduFormTypeResource>(paramResource, offset, limit);
		
		// When
		when(eduFormTypeFacade.getEntities(Matchers.<PagedRequest<EduFormTypeResource>>any())).thenReturn(expected);
    	String response = getJson(expected, false);

		// Then
    	mockMvc.perform(get("/eduformtypes")
    			.param("name", name))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(eduFormTypeFacade).getEntities(request);
	}
}
