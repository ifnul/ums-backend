package org.lnu.is.web.rest.controller.person.pension;

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
import org.lnu.is.resource.person.pension.PersonPensionResource;
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
public class PersonPensionControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<PersonPensionResource, Long> facade;

    @InjectMocks
    private PersonPensionController unit;

    @Override
    protected BaseController getUnit() {
	return unit;
    }

    @Test
    public void testCreatePersonPension() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
		PersonPensionResource personPensionResource = new PersonPensionResource();
		personPensionResource.setId(id);
	
		// When
		String request = getJson(personPensionResource, true);
		String response = getJson(personPensionResource, false);
	
		when(facade.createResource(any(PersonPensionResource.class)))
			.thenReturn(personPensionResource);
	
		// Then
		mockMvc.perform(
			post("/persons/{personId}/pensions", personId).contentType(
				MediaType.APPLICATION_JSON).content(request))
			.andExpect(status().isCreated())
			.andExpect(content().string(response));
	
		verify(facade).createResource(personPensionResource);
    }

    @Test
    public void testUpdatePersonPension() throws Exception {
		// Given
		Long personId = 2L;
		Long id = 1L;
	
		PersonPensionResource personPensionResource = new PersonPensionResource();
		personPensionResource.setId(id);
		personPensionResource.setPersonId(personId);
	
		MessageResource responseResource = new MessageResource(MessageType.INFO);
	
		// When
		String request = getJson(personPensionResource, true);
		String response = getJson(responseResource, false);
	
		// Then
		mockMvc.perform(put("/persons/{personId}/pensions/{contactId}", personId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
	
		verify(facade).updateResource(id, personPensionResource);
    }

    @Test
    public void testDeleteDepatmentPension() throws Exception {
		// Given
		Long personId = 2L;
		Long contactId = 1L;
	
		// When
	
		// Then
		mockMvc.perform(
			delete("/persons/{personId}/pensions/{contactId}",
				personId, contactId)).andExpect(status().is(204));
	
		verify(facade).removeResource(contactId);
    }

    @Test
    public void testGetPension() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
	
		PersonPensionResource personPensionResource = new PersonPensionResource();
		personPensionResource.setId(id);
		personPensionResource.setPersonId(personId);
	
		// When
		String response = getJson(personPensionResource, false);
	
		when(facade.getResource(anyLong())).thenReturn(
			personPensionResource);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/pensions/{contactId}",
				personId, id)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).getResource(id);
    }

    @Test
    public void testGetPersonPapers() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
	
		PersonPensionResource departmentPaperResource = new PersonPensionResource();
		departmentPaperResource.setId(id);
		departmentPaperResource.setPersonId(personId);
	
		long count = 100;
		int limit = 25;
		Integer offset = 10;
		String uri = MessageFormat.format("/persons/{0}/pensions",
			personId);
		List<PersonPensionResource> entities = Arrays
			.asList(departmentPaperResource);
		PagedResultResource<PersonPensionResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
	
		PersonPensionResource resource = new PersonPensionResource();
		resource.setPersonId(personId);
		PagedRequest<PersonPensionResource> pagedRequest = new PagedRequest<PersonPensionResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
	
		// When
		when(
			facade.getResources(Matchers
				.<PagedRequest<PersonPensionResource>> any()))
			.thenReturn(expectedResource);
		String response = getJson(expectedResource, false);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/pensions", personId)
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
		mockMvc.perform(get("/persons/{personId}/pensions/{id}",
			personId, id));
	
		verify(facade).getResource(id);
    }
}
