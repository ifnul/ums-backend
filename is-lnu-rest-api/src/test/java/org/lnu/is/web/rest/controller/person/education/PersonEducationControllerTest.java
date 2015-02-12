package org.lnu.is.web.rest.controller.person.education;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.AccessDeniedException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.education.PersonEducationResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class PersonEducationControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<PersonEducationResource, Long> facade;

    @InjectMocks
    private PersonEducationController unit;

    @Override
    protected BaseController getUnit() {
    	return unit;
    }

    @Test
    public void testCreatePersonEducation() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
		PersonEducationResource personEducationResource = new PersonEducationResource();
		personEducationResource.setId(id);
	
		// When
		String request = getJson(personEducationResource, true);
		String response = getJson(personEducationResource, false);
	
		when(facade.createResource(any(PersonEducationResource.class)))
			.thenReturn(personEducationResource);
	
		// Then
		mockMvc.perform(
			post("/persons/{personId}/educations", personId).contentType(
				MediaType.APPLICATION_JSON).content(request))
			.andExpect(status().isCreated())
			.andExpect(content().string(response));
	
		verify(facade).createResource(personEducationResource);
    }

    @Test
    public void testUpdatePersonEducation() throws Exception {
		// Given
		Long personId = 2L;
		Long id = 1L;
	
		PersonEducationResource personEducationResource = new PersonEducationResource();
		personEducationResource.setId(id);
		personEducationResource.setPersonId(personId);
	
		MessageResource responseResource = new MessageResource(
			MessageType.INFO, "PersonEducation Updated");
	
		// When
		String request = getJson(personEducationResource, true);
		String response = getJson(responseResource, false);
	
		// Then
		mockMvc.perform(
			put("/persons/{personId}/educations/{educationId}", personId, id)
				.contentType(MediaType.APPLICATION_JSON).content(
					request)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).updateResource(id, personEducationResource);
    }

    @Test
    public void testDeleteDepatmentEducation() throws Exception {
		// Given
		Long personId = 2L;
		Long educationId = 1L;
	
		// When
	
		// Then
		mockMvc.perform(
			delete("/persons/{personId}/educations/{educationId}",
				personId, educationId)).andExpect(status().is(204));
	
		verify(facade).removeResource(educationId);
    }

    @Test
    public void testGetEducation() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
	
		PersonEducationResource personEducationResource = new PersonEducationResource();
		personEducationResource.setId(id);
		personEducationResource.setPersonId(personId);
	
		// When
		String response = getJson(personEducationResource, false);
	
		when(facade.getResource(anyLong())).thenReturn(
			personEducationResource);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/educations/{educationId}",
				personId, id)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).getResource(id);
    }

    @Test
    public void testGetPersonPapers() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
	
		PersonEducationResource departmentPaperResource = new PersonEducationResource();
		departmentPaperResource.setId(id);
		departmentPaperResource.setPersonId(personId);
	
		long count = 100;
		int limit = 25;
		Integer offset = 10;
		String uri = MessageFormat.format("/persons/{0}/educations",
			personId);
		List<PersonEducationResource> entities = Arrays
			.asList(departmentPaperResource);
		PagedResultResource<PersonEducationResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
	
		PersonEducationResource resource = new PersonEducationResource();
		resource.setPersonId(personId);
		PagedRequest<PersonEducationResource> pagedRequest = new PagedRequest<PersonEducationResource>(
			resource, offset, limit);
	
		// When
		when(
			facade.getResources(Matchers
				.<PagedRequest<PersonEducationResource>> any()))
			.thenReturn(expectedResource);
		String response = getJson(expectedResource, false);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/educations", personId)
				.param("offset", String.valueOf(offset)).param("limit",
					String.valueOf(limit)))
			.andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).getResources(pagedRequest);
    }

    @Test(expected = AccessDeniedException.class)
    public void testGetResourceWithAccessDeniedException() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
	
		// When
		doThrow(AccessDeniedException.class).when(facade)
			.getResource(anyLong());
	
		// Then
		mockMvc.perform(get("/persons/{personId}/educations/{id}",
			personId, id));
	
		verify(facade).getResource(id);
    }
}
