package org.lnu.is.web.rest.controller.enrolment.status;

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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.enrolment.status.EnrolmentStatusResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
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
public class EnrolmentStatusControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<EnrolmentStatusResource, Long> facade;

    @InjectMocks
    private EnrolmentStatusController unit;

    @Override
    protected BaseController getUnit() {
	return unit;
    }

    @Test
    public void testCreateEnrolmentStatus() throws Exception {
	// Given
	Long id = 1L;
	Long enrolmentId = 2L;

	EnrolmentStatusResource enrolmentResource = new EnrolmentStatusResource();
	enrolmentResource.setId(id);
	enrolmentResource.setEnrolmentId(enrolmentId);

	// When
	String request = getJson(enrolmentResource, true);
	String response = getJson(enrolmentResource, false);

	when(facade.createResource(any(EnrolmentStatusResource.class)))
		.thenReturn(enrolmentResource);

	// Then
	mockMvc.perform(
		post("/enrolments/{enrolmentId}/statuses", enrolmentId)
			.contentType(MediaType.APPLICATION_JSON).content(
				request)).andExpect(status().isCreated())
		.andExpect(content().string(response));

	verify(facade).createResource(enrolmentResource);
    }

    @Test    
    public void testUpdateEnrolmentStatus() throws Exception {
	// Given
	Long id = 1L;
	Long enrolmentId = 2L;

	EnrolmentStatusResource enrolmentResource = new EnrolmentStatusResource();
	enrolmentResource.setId(id);
	enrolmentResource.setEnrolmentId(enrolmentId);

	MessageResource responseResource = new MessageResource(
		MessageType.INFO, "EnrolmentStatus Updated");

	// When
	String request = getJson(enrolmentResource, true);
	String response = getJson(responseResource, false);

	// Then
	mockMvc.perform(
		put("/enrolments/{enrolmentId}/statuses/{id}", enrolmentId, id)
			.contentType(MediaType.APPLICATION_JSON).content(
				request)).andExpect(status().isOk())
		.andExpect(content().string(response));

	verify(facade).updateResource(id, enrolmentResource);
    }

    @Test
    public void testGetEnrolmentStatus() throws Exception {
	// Given
	Long id = 1L;
	Long enrolmentId = 2L;

	EnrolmentStatusResource enrolmentResource = new EnrolmentStatusResource();
	enrolmentResource.setId(id);
	enrolmentResource.setEnrolmentId(enrolmentId);

	// When
	String response = getJson(enrolmentResource, false);

	when(facade.getResource(anyLong())).thenReturn(enrolmentResource);

	// Then
	mockMvc.perform(
		get("/enrolments/{enrolmentId}/statuses/{id}", enrolmentId, id))
		.andExpect(status().isOk())
		.andExpect(content().string(response));

	verify(facade).getResource(id);
    }

    @Test
    public void testRemoveEnrolmentStatus() throws Exception {
	// Given
	Long id = 1L;
	Long enrolmentId = 2L;

	// When

	// Then
	mockMvc.perform(
		delete("/enrolments/{enrolmentId}/statuses/{id}", enrolmentId,
			id)).andExpect(status().is(204));

	verify(facade).removeResource(id);
    }

    @Test
    public void testGetEnrolmentStatuss() throws Exception {
	// Given
	Long id = 1L;
	Long enrolmentId = 2L;

	EnrolmentStatusResource enrolmentResource = new EnrolmentStatusResource();
	enrolmentResource.setId(id);
	enrolmentResource.setEnrolmentId(enrolmentId);

	long count = 100;
	int limit = 25;
	Integer offset = 10;
	String uri = "/enrolments";
	List<EnrolmentStatusResource> entities = Arrays
		.asList(enrolmentResource);
	PagedResultResource<EnrolmentStatusResource> expectedResource = new PagedResultResource<>();
	expectedResource.setCount(count);
	expectedResource.setLimit(limit);
	expectedResource.setOffset(offset);
	expectedResource.setUri(uri);
	expectedResource.setResources(entities);

	EnrolmentStatusResource resource = new EnrolmentStatusResource();
	resource.setEnrolmentId(enrolmentId);
	PagedRequest<EnrolmentStatusResource> pagedRequest = new PagedRequest<EnrolmentStatusResource>(
		resource, offset, limit, Collections.<OrderBy> emptyList());

	// When
	when(
		facade.getResources(Matchers
			.<PagedRequest<EnrolmentStatusResource>> any()))
		.thenReturn(expectedResource);
	String response = getJson(expectedResource, false);

	// Then
	mockMvc.perform(
		get("/enrolments/{enrolmentId}/statuses", enrolmentId).param(
			"offset", String.valueOf(offset)).param("limit",
			String.valueOf(limit))).andExpect(status().isOk())
		.andExpect(content().string(response));

	verify(facade).getResources(pagedRequest);
    }

    @Test(expected = AccessDeniedException.class)
    public void testGetResourceWithAccessDeniedException() throws Exception {
	// Given
	Long id = 1L;
	Long enrolmentId = 2L;

	// When
	doThrow(AccessDeniedException.class).when(facade)
		.getResource(anyLong());

	// Then
	mockMvc.perform(get("/enrolments/{enrolmentId}/statuses/{id}",
		enrolmentId, id));

	verify(facade).getResource(id);
    }
}