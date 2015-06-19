package org.lnu.is.web.rest.controller.person.work;

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
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.work.PersonWorkResource;
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
public class PersonWorkControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<PersonWorkResource, PersonWorkResource, Long> facade;

    @InjectMocks
    private PersonWorkController unit;

    @Override
    protected BaseController getUnit() {
	return unit;
    }

    @Test
    public void testCreatePersonWork() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
		PersonWorkResource personWorkResource = new PersonWorkResource();
		personWorkResource.setId(id);
	
		// When
		String request = getJson(personWorkResource, true);
		String response = getJson(personWorkResource, false);
	
		when(facade.createResource(any(PersonWorkResource.class)))
			.thenReturn(personWorkResource);
	
		// Then
		mockMvc.perform(
			post("/persons/{personId}/works", personId).contentType(
				MediaType.APPLICATION_JSON).content(request))
			.andExpect(status().isCreated())
			.andExpect(content().string(response));
	
		verify(facade).createResource(personWorkResource);
    }

    @Test
    public void testUpdatePersonWork() throws Exception {
		// Given
		Long personId = 2L;
		Long id = 1L;
	
		PersonWorkResource personWorkResource = new PersonWorkResource();
		personWorkResource.setId(id);
		personWorkResource.setPersonId(personId);
	
		MessageResource responseResource = new MessageResource(
			MessageType.INFO, "PersonWork Updated");
	
		// When
		String request = getJson(personWorkResource, true);
		String response = getJson(responseResource, false);
	
		// Then
		mockMvc.perform(
			put("/persons/{personId}/works/{workId}", personId, id)
				.contentType(MediaType.APPLICATION_JSON).content(
					request)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).updateResource(id, personWorkResource);
    }

    @Test
    public void testDeleteDepatmentWork() throws Exception {
		// Given
		Long personId = 2L;
		Long workId = 1L;
	
		// When
	
		// Then
		mockMvc.perform(
			delete("/persons/{personId}/works/{workId}",
				personId, workId)).andExpect(status().is(204));
	
		verify(facade).removeResource(workId);
    }

    @Test
    public void testGetWork() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
	
		PersonWorkResource personWorkResource = new PersonWorkResource();
		personWorkResource.setId(id);
		personWorkResource.setPersonId(personId);
	
		// When
		String response = getJson(personWorkResource, false);
	
		when(facade.getResource(anyLong())).thenReturn(
			personWorkResource);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/works/{workId}",
				personId, id)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).getResource(id);
    }

    @Test
    public void testGetPersonPapers() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
	
		PersonWorkResource departmentPaperResource = new PersonWorkResource();
		departmentPaperResource.setId(id);
		departmentPaperResource.setPersonId(personId);
	
		long count = 100;
		int limit = 25;
		Integer offset = 10;
		String uri = MessageFormat.format("/persons/{0}/works",
			personId);
		List<PersonWorkResource> entities = Arrays
			.asList(departmentPaperResource);
		PagedResultResource<PersonWorkResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
	
		PersonWorkResource resource = new PersonWorkResource();
		resource.setPersonId(personId);
		PagedRequest<PersonWorkResource> pagedRequest = new PagedRequest<PersonWorkResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
	
		// When
		when(
			facade.getResources(Matchers
				.<PagedRequest<PersonWorkResource>> any()))
			.thenReturn(expectedResource);
		String response = getJson(expectedResource, false);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/works", personId)
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
		mockMvc.perform(get("/persons/{personId}/works/{id}",
			personId, id));
	
		verify(facade).getResource(id);
    }
}
