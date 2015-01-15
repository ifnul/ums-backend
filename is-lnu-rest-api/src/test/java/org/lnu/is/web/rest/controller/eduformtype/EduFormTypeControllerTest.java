package org.lnu.is.web.rest.controller.eduformtype;

import static org.mockito.Matchers.anyLong;
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
import org.lnu.is.resource.eduformtype.EduFormTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EduFormTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<EduFormTypeResource, Long> facade;
	
	@InjectMocks
	private EduFormTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
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
		when(facade.getResources(Matchers.<PagedRequest<EduFormTypeResource>>any())).thenReturn(expected);
    	String response = getJson(expected, false);

		// Then
    	mockMvc.perform(get("/eduformtypes")
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
		EduFormTypeResource expected = new EduFormTypeResource();
		expected.setName(name);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/eduformtypes/{id}", id))
			.andExpect(status().isOk())
			.andExpect(content().string(response));
		
		verify(facade).getResource(id);
	}
}
