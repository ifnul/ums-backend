package org.lnu.is.web.rest.controller.education.form.type;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.AccessDeniedException;
import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.education.form.type.EducationFormTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.education.form.type.EducationFormTypeController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EducationFormTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<EducationFormTypeResource, EducationFormTypeResource, Long> facade;
	
	@InjectMocks
	private EducationFormTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}
    
    @Test
	public void testGetEduFormTypes() throws Exception {
		// Given
    	String name = "form type 1";
		EducationFormTypeResource resource = new EducationFormTypeResource();
		resource.setName(name);
		
		List<EducationFormTypeResource> entities = Arrays.asList(resource);


		Integer offset = 0;
		long count = 1;
		Integer limit = 38;
		PagedResultResource<EducationFormTypeResource> expected = new PagedResultResource<>("/eduformtypes");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		EducationFormTypeResource paramResource = new EducationFormTypeResource();
		paramResource.setName(name);

		Map<String, Object> params = new HashMap<>();
		params.put("name", name);
		PagedRequest<EducationFormTypeResource> request = new PagedRequest<EducationFormTypeResource>(paramResource, offset, limit, Collections.<OrderBy>emptyList(), params);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<EducationFormTypeResource>>any())).thenReturn(expected);
    	String response = getJson(expected, false);

		// Then
    	mockMvc.perform(get("/educations/forms/types")
    			.param("name", name))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(request);
	}
    
	@Test
	public void testGetResource() throws Exception {
		// Given
		Long id = 1L;
		String name = "all difficult";
		EducationFormTypeResource expected = new EducationFormTypeResource();
		expected.setName(name);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/educations/forms/types/{id}", id))
			.andExpect(status().isOk())
			.andExpect(content().string(response));
		
		verify(facade).getResource(id);
	}

	@Test(expected = AccessDeniedException.class)
	public void testGetResourceWithAccessDeniedException() throws Exception {
		// Given
		Long id = 1L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/educations/forms/types/{id}", id));
		
		verify(facade).getResource(id);
	}
}
