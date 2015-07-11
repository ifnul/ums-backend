package org.lnu.is.web.rest.controller.specoffer.wave;

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
import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.specoffer.wave.SpecOfferWaveResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferWaveControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<SpecOfferWaveResource, SpecOfferWaveResource, Long> facade;

    @InjectMocks
    private SpecOfferWaveController unit;

    @Override
    protected BaseController getUnit() {
        return unit;
    }

    @Test
    public void testCreateSpecOfferWave() throws Exception {
        // Given
        Long specOfferId = 1L;

        SpecOfferWaveResource specOfferSubjectResource = new SpecOfferWaveResource();

        // When
        String request = getJson(specOfferSubjectResource, true);
        String response = getJson(specOfferSubjectResource, false);

        when(facade.createResource(any(SpecOfferWaveResource.class)))
                .thenReturn(specOfferSubjectResource);

        // Then
        mockMvc.perform(
                post("/specoffers/{0}/waves", specOfferId).contentType(
                        MediaType.APPLICATION_JSON).content(request))
                .andExpect(status().isCreated())
                .andExpect(content().string(response));

        verify(facade).createResource(specOfferSubjectResource);
    }

    @Test
    public void testUpdateSpecOfferWave() throws Exception {
        // Given
        Long id = 1L;
        Long specOfferId = 1L;

        SpecOfferWaveResource specOfferSubjectResource = new SpecOfferWaveResource();

        MessageResource responseResource = new MessageResource(MessageType.INFO);

        // When
        String request = getJson(specOfferSubjectResource, true);
        String response = getJson(responseResource, false);

        // Then
        mockMvc.perform(
                put("/specoffers/{0}/waves/{id}", specOfferId, id).contentType(
                        MediaType.APPLICATION_JSON).content(request))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).updateResource(id, specOfferSubjectResource);
    }

    @Test
    public void testGetSpecoffer() throws Exception {
        // Given
        Long id = 1L;
        Long specOfferId = 1L;

        SpecOfferWaveResource specOfferSubjectResource = new SpecOfferWaveResource();

        // When
        String response = getJson(specOfferSubjectResource, false);

        when(facade.getResource(anyLong()))
                .thenReturn(specOfferSubjectResource);

        // Then
        mockMvc.perform(get("/specoffers/{0}/waves/{id}", specOfferId, id))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).getResource(id);
    }

    @Test
    public void testDeleteSpecOfferWave() throws Exception {
        // Given
        Long specOfferId = 2L;
        Long id = 1L;

        // When

        // Then
        mockMvc.perform(delete("/specoffers/{0}/waves/{id}", specOfferId, id))
                .andExpect(status().is(204));

        verify(facade).removeResource(id);
    }

    @Test
    public void testGetSpecOfferWaves() throws Exception {
        // Given
        Long id = 1L;
        Long specOfferId = 2L;

        SpecOfferWaveResource specOfferSubjectResource = new SpecOfferWaveResource();
        specOfferSubjectResource.setId(id);

        long count = 100;
        int limit = 25;
        Integer offset = 10;
        String uri = MessageFormat.format("/persons/{0}/waves", specOfferId);
        List<SpecOfferWaveResource> entities = Arrays.asList(specOfferSubjectResource);
        PagedResultResource<SpecOfferWaveResource> expectedResource = new PagedResultResource<>();
        expectedResource.setCount(count);
        expectedResource.setLimit(limit);
        expectedResource.setOffset(offset);
        expectedResource.setUri(uri);
        expectedResource.setResources(entities);

        SpecOfferWaveResource resource = new SpecOfferWaveResource();
        resource.setSpecOfferId(specOfferId);

        Map<String, Object> params = new HashMap<>();
        params.put("offset", String.valueOf(offset));
        params.put("limit", String.valueOf(limit));
        params.put("specOfferId", String.valueOf(specOfferId));

        PagedRequest<SpecOfferWaveResource> pagedRequest = new PagedRequest<SpecOfferWaveResource>(
                resource, offset, limit, Collections.<OrderBy>emptyList(), params);

        // When
        when(facade.getResources(Matchers.<PagedRequest<SpecOfferWaveResource>>any())).thenReturn(expectedResource);
        String response = getJson(expectedResource, false);

        // Then
        mockMvc.perform(get("/specoffers/{0}/waves", specOfferId)
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
        Long specOfferId = 2L;

        // When
        doThrow(AccessDeniedException.class).when(facade)
                .getResource(anyLong());

        // Then
        mockMvc.perform(get("/specoffers/{specOfferId}/waves/{id}",
                specOfferId, id));

        verify(facade).getResource(id);
    }
}
