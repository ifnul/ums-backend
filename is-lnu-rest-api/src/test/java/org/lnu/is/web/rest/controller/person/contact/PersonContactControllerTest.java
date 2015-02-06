package org.lnu.is.web.rest.controller.person.contact;

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
import org.lnu.is.resource.person.contact.PersonContactResource;
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
public class PersonContactControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<PersonContactResource, Long> facade;

    @InjectMocks
    private PersonContactController unit;

    @Override
    protected BaseController getUnit() {
	return unit;
    }

    @Test
    public void testCreatePersonContact() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
		PersonContactResource personContactResource = new PersonContactResource();
		personContactResource.setId(id);
	
		// When
		String request = getJson(personContactResource, true);
		String response = getJson(personContactResource, false);
	
		when(facade.createResource(any(PersonContactResource.class)))
			.thenReturn(personContactResource);
	
		// Then
		mockMvc.perform(
			post("/persons/{personId}/contacts", personId).contentType(
				MediaType.APPLICATION_JSON).content(request))
			.andExpect(status().isCreated())
			.andExpect(content().string(response));
	
		verify(facade).createResource(personContactResource);
    }

    @Test
    public void testUpdatePersonContact() throws Exception {
		// Given
		Long personId = 2L;
		Long id = 1L;
	
		PersonContactResource personContactResource = new PersonContactResource();
		personContactResource.setId(id);
		personContactResource.setPersonId(personId);
	
		MessageResource responseResource = new MessageResource(
			MessageType.INFO, "PersonContact Updated");
	
		// When
		String request = getJson(personContactResource, true);
		String response = getJson(responseResource, false);
	
		// Then
		mockMvc.perform(
			put("/persons/{personId}/contacts/{contactId}", personId, id)
				.contentType(MediaType.APPLICATION_JSON).content(
					request)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).updateResource(id, personContactResource);
    }

    @Test
    public void testDeleteDepatmentContact() throws Exception {
		// Given
		Long personId = 2L;
		Long contactId = 1L;
	
		// When
	
		// Then
		mockMvc.perform(
			delete("/persons/{personId}/contacts/{contactId}",
				personId, contactId)).andExpect(status().is(204));
	
		verify(facade).removeResource(contactId);
    }

    @Test
    public void testGetContact() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
	
		PersonContactResource personContactResource = new PersonContactResource();
		personContactResource.setId(id);
		personContactResource.setPersonId(personId);
	
		// When
		String response = getJson(personContactResource, false);
	
		when(facade.getResource(anyLong())).thenReturn(
			personContactResource);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/contacts/{contactId}",
				personId, id)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).getResource(id);
    }

    @Test
    public void testGetPersonPapers() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
	
		PersonContactResource departmentPaperResource = new PersonContactResource();
		departmentPaperResource.setId(id);
		departmentPaperResource.setPersonId(personId);
	
		long count = 100;
		int limit = 25;
		Integer offset = 10;
		String uri = MessageFormat.format("/persons/{0}/contacts",
			personId);
		List<PersonContactResource> entities = Arrays
			.asList(departmentPaperResource);
		PagedResultResource<PersonContactResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
	
		PersonContactResource resource = new PersonContactResource();
		resource.setPersonId(personId);
		PagedRequest<PersonContactResource> pagedRequest = new PagedRequest<PersonContactResource>(
			resource, offset, limit);
	
		// When
		when(
			facade.getResources(Matchers
				.<PagedRequest<PersonContactResource>> any()))
			.thenReturn(expectedResource);
		String response = getJson(expectedResource, false);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/contacts", personId)
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
		mockMvc.perform(get("/persons/{personId}/contacts/{id}",
			personId, id));
	
		verify(facade).getResource(id);
    }
}
