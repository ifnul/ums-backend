package org.lnu.is.web.rest.controller.publicactivity.award;

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
import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.publicactivity.award.PublicActivityAwardResource;
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
public class PublicActivityAwardControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<PublicActivityAwardResource, PublicActivityAwardResource, Long> facade;

    @InjectMocks
    private PublicActivityAwardController unit;

    @Override
    protected BaseController getUnit() {
        return unit;
    }

    @Test
    public void testCreate() throws Exception {
        // Given
        Long publicActivityId = 1L;
        PublicActivityAwardResource resource = new PublicActivityAwardResource();
        resource.setPublicActivityId(publicActivityId);
        resource.setBegDate(new Date());

        // When
        String request = getJson(resource, true);
        String response = getJson(resource, false);

        when(facade.createResource(any(PublicActivityAwardResource.class)))
                .thenReturn(resource);

        // Then
        mockMvc.perform(
                post("/publicactivities/{publicActivityId}/awards",
                        publicActivityId).contentType(
                        MediaType.APPLICATION_JSON).content(request))
                .andExpect(status().isCreated())
                .andExpect(content().string(response));

        verify(facade).createResource(resource);
    }

    @Test
    public void testUpdate() throws Exception {
        // Given
        Long id = 1L;
        Long publicActivityId = 1L;
        PublicActivityAwardResource resource = new PublicActivityAwardResource();
        resource.setPublicActivityId(publicActivityId);
        resource.setBegDate(new Date());
        resource.setId(id);

        MessageResource responseResource = new MessageResource(MessageType.INFO);

        // When
        String request = getJson(resource, true);
        String response = getJson(responseResource, false);

        // Then
        mockMvc.perform(
                put("/publicactivities/{publicActivityId}/awards/{id}",
                        publicActivityId, id).contentType(
                        MediaType.APPLICATION_JSON).content(request))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).updateResource(id, resource);
    }

    @Test
    public void testGetResource() throws Exception {
        // Given
        Long id = 1L;
        Long publicActivityId = 1L;
        PublicActivityAwardResource resource = new PublicActivityAwardResource();
        resource.setPublicActivityId(publicActivityId);
        resource.setBegDate(new Date());
        resource.setId(id);

        // When
        String response = getJson(resource, false);

        when(facade.getResource(anyLong())).thenReturn(resource);

        // Then
        mockMvc.perform(
                get("/publicactivities/{publicActivityId}/awards/{id}",
                        publicActivityId, id)).andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).getResource(id);
    }

    @Test
    public void testDelete() throws Exception {
        // Given
        Long id = 1L;
        Long publicActivityId = 2L;
        // When

        // Then
        mockMvc.perform(
                delete("/publicactivities/{publicActivityId}/awards/{id}",
                        publicActivityId, id)).andExpect(status().is(204));

        verify(facade).removeResource(id);
    }

    @Test
    public void testGetResources() throws Exception {
        // Given
        Long id = 1L;
        Long publicActivityId = 1L;
        PublicActivityAwardResource resource = new PublicActivityAwardResource();
        resource.setPublicActivityId(publicActivityId);
        resource.setBegDate(new Date());
        resource.setId(id);

        long count = 100;
        int limit = 25;
        Integer offset = 10;
        String uri = "/publicactivities";
        List<PublicActivityAwardResource> entities = Arrays.asList(resource);
        PagedResultResource<PublicActivityAwardResource> expectedResource = new PagedResultResource<>();
        expectedResource.setCount(count);
        expectedResource.setLimit(limit);
        expectedResource.setOffset(offset);
        expectedResource.setUri(uri);
        expectedResource.setResources(entities);

        PublicActivityAwardResource parameters = new PublicActivityAwardResource();
        parameters.setPublicActivityId(publicActivityId);

        Map<String, Object> params = new HashMap<>();
        params.put("offset", String.valueOf(offset));
        params.put("limit", String.valueOf(limit));
        params.put("publicActivityId", String.valueOf(publicActivityId));
        PagedRequest<PublicActivityAwardResource> pagedRequest = new PagedRequest<PublicActivityAwardResource>(
                parameters, offset, limit, Collections.<OrderBy>emptyList(), params);

        // When
        when(facade.getResources(Matchers.<PagedRequest<PublicActivityAwardResource>>any()))
                .thenReturn(expectedResource);
        String response = getJson(expectedResource, false);

        // Then
        mockMvc.perform(get("/publicactivities/{publicActivityId}/awards", publicActivityId)
                .param("offset", String.valueOf(offset))
                .param("limit", String.valueOf(limit)))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).getResources(pagedRequest);
    }

    @Test(expected = AccessDeniedException.class)
    public void testGetResourceWithAccessDeniedException() throws Exception {
        // Given
        Long id = 1L;
        Long publicActivityId = 2L;

        // When
        doThrow(AccessDeniedException.class).when(facade)
                .getResource(anyLong());

        // Then
        mockMvc.perform(get("/publicactivities/{publicActivityId}/awards/{id}",
                publicActivityId, id));

        verify(facade).getResource(id);
    }
}
