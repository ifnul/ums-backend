package org.lnu.is.web.rest.controller.person.language;


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
import org.lnu.is.resource.person.language.PersonLanguageResource;
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
public class PersonLanguageControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<PersonLanguageResource, PersonLanguageResource, Long> facade;

    @InjectMocks
    private PersonLanguageController unit;

    @Override
    protected BaseController getUnit() {
    	return unit;
    }

    @Test
    public void testCreatePersonLanguage() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
		PersonLanguageResource personLanguageResource = new PersonLanguageResource();
		personLanguageResource.setId(id);
	
		// When
		String request = getJson(personLanguageResource, true);
		String response = getJson(personLanguageResource, false);
	
		when(facade.createResource(any(PersonLanguageResource.class)))
			.thenReturn(personLanguageResource);
	
		// Then
		mockMvc.perform(
			post("/persons/{personId}/languages", personId).contentType(
				MediaType.APPLICATION_JSON).content(request))
			.andExpect(status().isCreated())
			.andExpect(content().string(response));
	
		verify(facade).createResource(personLanguageResource);
    }

    @Test
    public void testUpdatePersonLanguage() throws Exception {
		// Given
		Long personId = 2L;
		Long id = 1L;
	
		PersonLanguageResource personLanguageResource = new PersonLanguageResource();
		personLanguageResource.setId(id);
		personLanguageResource.setPersonId(personId);
	
		MessageResource responseResource = new MessageResource(
			MessageType.INFO, "PersonLanguage Updated");
	
		// When
		String request = getJson(personLanguageResource, true);
		String response = getJson(responseResource, false);
	
		// Then
		mockMvc.perform(
			put("/persons/{personId}/languages/{languageId}", personId, id)
				.contentType(MediaType.APPLICATION_JSON).content(
					request)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).updateResource(id, personLanguageResource);
    }

    @Test
    public void testDeleteDepatmentLanguage() throws Exception {
		// Given
		Long personId = 2L;
		Long languageId = 1L;
	
		// When
	
		// Then
		mockMvc.perform(
			delete("/persons/{personId}/languages/{languageId}",
				personId, languageId)).andExpect(status().is(204));
	
		verify(facade).removeResource(languageId);
    }

    @Test
    public void testGetLanguage() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
	
		PersonLanguageResource personLanguageResource = new PersonLanguageResource();
		personLanguageResource.setId(id);
		personLanguageResource.setPersonId(personId);
	
		// When
		String response = getJson(personLanguageResource, false);
	
		when(facade.getResource(anyLong())).thenReturn(
			personLanguageResource);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/languages/{languageId}",
				personId, id)).andExpect(status().isOk())
			.andExpect(content().string(response));
	
		verify(facade).getResource(id);
    }

    @Test
    public void testGetPersonPapers() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
	
		PersonLanguageResource departmentPaperResource = new PersonLanguageResource();
		departmentPaperResource.setId(id);
		departmentPaperResource.setPersonId(personId);
	
		long count = 100;
		int limit = 25;
		Integer offset = 10;
		String uri = MessageFormat.format("/persons/{0}/languages",
			personId);
		List<PersonLanguageResource> entities = Arrays
			.asList(departmentPaperResource);
		PagedResultResource<PersonLanguageResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
	
		PersonLanguageResource resource = new PersonLanguageResource();
		resource.setPersonId(personId);
		PagedRequest<PersonLanguageResource> pagedRequest = new PagedRequest<PersonLanguageResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
	
		// When
		when(
			facade.getResources(Matchers
				.<PagedRequest<PersonLanguageResource>> any()))
			.thenReturn(expectedResource);
		String response = getJson(expectedResource, false);
	
		// Then
		mockMvc.perform(
			get("/persons/{personId}/languages", personId)
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
		mockMvc.perform(get("/persons/{personId}/languages/{id}",
			personId, id));
	
		verify(facade).getResource(id);
    }
}