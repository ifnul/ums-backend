package org.lnu.is.web.rest.controller.education.type;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.education.type.EducationTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EducationTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<EducationTypeResource, Long> facade;
	
	@InjectMocks
	private EducationTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}
    
    @Test
	public void testGetEducationTypes() throws Exception {
		// Given
    	String name = "form type 1";
		EducationTypeResource resource = new EducationTypeResource();
		resource.setName(name);
		
		List<EducationTypeResource> entities = Arrays.asList(resource);


		Integer offset = 0;
		long count = 1;
		Integer limit = 20;
		PagedResultResource<EducationTypeResource> expected = new PagedResultResource<>("/educations/types");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		EducationTypeResource paramResource = new EducationTypeResource();
		paramResource.setName(name);
		PagedRequest<EducationTypeResource> request = new PagedRequest<EducationTypeResource>(paramResource, offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<EducationTypeResource>>any())).thenReturn(expected);
    	String response = getJson(expected, false);

		// Then
    	mockMvc.perform(get("/educations/types")
    			.param("name", name))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(request);
	}
}
