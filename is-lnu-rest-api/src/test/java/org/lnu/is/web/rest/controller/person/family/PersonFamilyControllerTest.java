package org.lnu.is.web.rest.controller.person.family;

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
import org.lnu.is.domain.OrderBy;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.family.PersonFamilyResource;
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
public class PersonFamilyControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<PersonFamilyResource, Long> facade;

    @InjectMocks
    private PersonFamilyController unit;

    @Override
    protected BaseController getUnit() {
	return unit;
    }

    @Test
    public void testCreatePersonFamily() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
		PersonFamilyResource personFamilyResource = new PersonFamilyResource();
		personFamilyResource.setId(id);
	
		// When
		String request = getJson(personFamilyResource, true);
		String response = getJson(personFamilyResource, false);
	
		when(facade.createResource(any(PersonFamilyResource.class)))
			.thenReturn(personFamilyResource);
	
		// Then
		mockMvc.perform(
			post("/persons/{personId}/families", personId).contentType(
				MediaType.APPLICATION_JSON).content(request))
			.andExpect(status().isCreated())
			.andExpect(content().string(response));
	
		verify(facade).createResource(personFamilyResource);
    }

    @Test
    public void testUpdatePersonFamily() throws Exception {
		// Given
		Long personId = 2L;
		Long id = 1L;
	
		PersonFamilyResource personFamilyResource = new PersonFamilyResource();
		personFamilyResource.setId(id);
		personFamilyResource.setPersonId(personId);
	
		MessageResource responseResource = new MessageResource(
			MessageType.INFO, "PersonFamily Updated");
	
		// When
		String request = getJson(personFamilyResource, true);
		String response = getJson(responseResource, false);
	
		// Then
		mockMvc.perform(
			put("/persons/{personId}/families/{contactId}", personId, id)
				.contentType(MediaType.APPLICATION_JSON).content(
					request)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).updateResource(id, personFamilyResource);
    }

    @Test
    public void testDeleteDepatmentFamily() throws Exception {
		// Given
		Long personId = 2L;
		Long contactId = 1L;
	
		// When
	
		// Then
		mockMvc.perform(
			delete("/persons/{personId}/families/{contactId}",
				personId, contactId)).andExpect(status().is(204));
	
		verify(facade).removeResource(contactId);
    }

    @Test
    public void testGetFamily() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
	
		PersonFamilyResource personFamilyResource = new PersonFamilyResource();
		personFamilyResource.setId(id);
		personFamilyResource.setPersonId(personId);
	
		// When
		String response = getJson(personFamilyResource, false);
	
		when(facade.getResource(anyLong())).thenReturn(
			personFamilyResource);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/families/{contactId}",
				personId, id)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).getResource(id);
    }

    @Test
    public void testGetPersonPapers() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
	
		PersonFamilyResource departmentPaperResource = new PersonFamilyResource();
		departmentPaperResource.setId(id);
		departmentPaperResource.setPersonId(personId);
	
		long count = 100;
		int limit = 25;
		Integer offset = 10;
		String uri = MessageFormat.format("/persons/{0}/families",
			personId);
		List<PersonFamilyResource> entities = Arrays
			.asList(departmentPaperResource);
		PagedResultResource<PersonFamilyResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
	
		PersonFamilyResource resource = new PersonFamilyResource();
		resource.setPersonId(personId);
		PagedRequest<PersonFamilyResource> pagedRequest = new PagedRequest<PersonFamilyResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
	
		// When
		when(
			facade.getResources(Matchers
				.<PagedRequest<PersonFamilyResource>> any()))
			.thenReturn(expectedResource);
		String response = getJson(expectedResource, false);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/families", personId)
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
		mockMvc.perform(get("/persons/{personId}/families/{id}",
			personId, id));
	
		verify(facade).getResource(id);
    }
}
