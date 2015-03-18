package org.lnu.is.web.rest.controller.person.enrolmentsubject;

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
import org.lnu.is.resource.person.enrolmentsubject.PersonEnrolmentSubjectResource;
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
public class PersonEnrolmentSubjectControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<PersonEnrolmentSubjectResource, Long> facade;

	@InjectMocks
	private PersonEnrolmentSubjectController unit;

	@Override
	protected BaseController getUnit() {
		return unit;
	}

	@Test
	public void testCreatePersonEnrolmentSubject() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;
		PersonEnrolmentSubjectResource personEnrolmentSubjectResource = new PersonEnrolmentSubjectResource();
		personEnrolmentSubjectResource.setId(id);

		// When
		String request = getJson(personEnrolmentSubjectResource, true);
		String response = getJson(personEnrolmentSubjectResource, false);

		when(facade.createResource(any(PersonEnrolmentSubjectResource.class))).thenReturn(personEnrolmentSubjectResource);

		// Then
		mockMvc.perform(post("/persons/{personId}/enrolmentsubjects", personId).contentType(MediaType.APPLICATION_JSON).content(request))
				.andExpect(status().isCreated()).andExpect(content().string(response));

		verify(facade).createResource(personEnrolmentSubjectResource);
	}

	@Test
	public void testUpdatePersonEnrolmentSubject() throws Exception {
		// Given
		Long personId = 2L;
		Long id = 1L;

		PersonEnrolmentSubjectResource personEnrolmentSubjectResource = new PersonEnrolmentSubjectResource();
		personEnrolmentSubjectResource.setId(id);
		personEnrolmentSubjectResource.setPersonId(personId);

		MessageResource responseResource = new MessageResource(MessageType.INFO, "Person Enrolment Subject Updated");

		// When
		String request = getJson(personEnrolmentSubjectResource, true);
		String response = getJson(responseResource, false);

		// Then
		mockMvc.perform(
				put("/persons/{personId}/enrolmentsubjects/{enrolmentSubjectId}", personId, id).contentType(MediaType.APPLICATION_JSON).content(
						request)).andExpect(status().isOk()).andExpect(content().string(response));

		verify(facade).updateResource(id, personEnrolmentSubjectResource);
	}

	@Test
	public void testDeletePersonEnrolmentSubject() throws Exception {
		// Given
		Long personId = 2L;
		Long enrolmentSubjectId = 1L;

		// When

		// Then
		mockMvc.perform(delete("/persons/{personId}/enrolmentsubjects/{enrolmentSubjectId}", personId, enrolmentSubjectId)).andExpect(
				status().is(204));

		verify(facade).removeResource(enrolmentSubjectId);
	}

	@Test
	public void testGetPersonEnrolmentSubjects() throws Exception {
		// Given
		Long personId = 1L;
		Long id = 2L;

		PersonEnrolmentSubjectResource personEnrolmentSubjectResource = new PersonEnrolmentSubjectResource();
		personEnrolmentSubjectResource.setId(id);
		personEnrolmentSubjectResource.setPersonId(personId);

		// When
		String response = getJson(personEnrolmentSubjectResource, false);

		when(facade.getResource(anyLong())).thenReturn(personEnrolmentSubjectResource);

		// Then
		mockMvc.perform(get("/persons/{personId}/enrolmentsubjects/{enrolmentSubjectId}", personId, id)).andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(facade).getResource(id);
	}

	@Test
	public void testGetEnrolmentSubjects() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;

		PersonEnrolmentSubjectResource enrolmentSubjectResource = new PersonEnrolmentSubjectResource();
		enrolmentSubjectResource.setId(id);
		enrolmentSubjectResource.setPersonId(personId);

		long count = 100;
		int limit = 25;
		Integer offset = 10;
		String uri = MessageFormat.format("/persons/{0}/enrolmentsubjects", personId);
		List<PersonEnrolmentSubjectResource> entities = Arrays.asList(enrolmentSubjectResource);
		PagedResultResource<PersonEnrolmentSubjectResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);

		PersonEnrolmentSubjectResource resource = new PersonEnrolmentSubjectResource();
		resource.setPersonId(personId);
		PagedRequest<PersonEnrolmentSubjectResource> pagedRequest = new PagedRequest<PersonEnrolmentSubjectResource>(resource, offset, limit, Collections.<OrderBy>emptyList());

		// When
		when(facade.getResources(Matchers.<PagedRequest<PersonEnrolmentSubjectResource>> any())).thenReturn(expectedResource);
		String response = getJson(expectedResource, false);

		// Then
		mockMvc.perform(
				get("/persons/{personId}/enrolmentsubjects", personId).param("offset", String.valueOf(offset)).param("limit", String.valueOf(limit)))
				.andExpect(status().isOk()).andExpect(content().string(response));

		verify(facade).getResources(pagedRequest);
	}

	@Test(expected = AccessDeniedException.class)
	public void testGetResourceWithAccessDeniedException() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;

		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());

		// Then
		mockMvc.perform(get("/persons/{personId}/enrolmentsubjects/{id}", personId, id));

		verify(facade).getResource(id);
	}
}
