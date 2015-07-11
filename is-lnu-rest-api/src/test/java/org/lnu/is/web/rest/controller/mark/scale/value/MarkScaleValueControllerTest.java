package org.lnu.is.web.rest.controller.mark.scale.value;

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
import org.lnu.is.resource.mark.scale.value.MarkScaleValueResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.mark.scale.value.MarkScaleValueController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class MarkScaleValueControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<MarkScaleValueResource, MarkScaleValueResource, Long> facade;

    @InjectMocks
    private MarkScaleValueController unit;

    @Override
    protected BaseController getUnit() {
        return unit;
    }

    @Test
    public void testCreateMarkScaleValue() throws Exception {
        // Given
        Long markScaleId = 1L;
        Long id = 2L;
        MarkScaleValueResource markScaleValueResource = new MarkScaleValueResource();
        markScaleValueResource.setId(id);

        // When
        String request = getJson(markScaleValueResource, true);
        String response = getJson(markScaleValueResource, false);

        when(facade.createResource(any(MarkScaleValueResource.class))).thenReturn(markScaleValueResource);

        // Then
        mockMvc.perform(post("/marks/scales/{markScaleId}/values", markScaleId)
                .contentType(MediaType.APPLICATION_JSON)
                .content(request))
                .andExpect(status().isCreated())
                .andExpect(content().string(response));

        verify(facade).createResource(markScaleValueResource);
    }

    @Test
    public void testUpdateMarkScaleValue() throws Exception {
        // Given
        Long markScaleId = 2L;
        Long id = 1L;

        MarkScaleValueResource markScaleValueResource = new MarkScaleValueResource();
        markScaleValueResource.setId(id);
        markScaleValueResource.setMarkScaleId(markScaleId);

        MessageResource responseResource = new MessageResource(MessageType.INFO, "MarkScale Value Updated");

        // When
        String request = getJson(markScaleValueResource, true);
        String response = getJson(responseResource, false);


        // Then
        mockMvc.perform(put("/marks/scales/{markScaleId}/values/{contactId}", markScaleId, id)
                .contentType(MediaType.APPLICATION_JSON)
                .content(request))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).updateResource(id, markScaleValueResource);
    }

    @Test
    public void testDeleteDepatmentValue() throws Exception {
        // Given
        Long personId = 2L;
        Long contactId = 1L;

        // When

        // Then
        mockMvc.perform(delete("/marks/scales/{markScaleId}/values/{contactId}", personId, contactId))
                .andExpect(status().is(204));

        verify(facade).removeResource(contactId);
    }


    @Test
    public void testGetValue() throws Exception {
        // Given
        Long markScaleId = 1L;
        Long id = 2L;

        MarkScaleValueResource markScaleValueResource = new MarkScaleValueResource();
        markScaleValueResource.setId(id);
        markScaleValueResource.setMarkScaleId(markScaleId);

        // When
        String response = getJson(markScaleValueResource, false);

        when(facade.getResource(anyLong())).thenReturn(markScaleValueResource);

        // Then
        mockMvc.perform(get("/marks/scales/{markScaleId}/values/{contactId}", markScaleId, id))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).getResource(id);
    }

    @Test
    public void testGetMarkScaleSpecialties() throws Exception {
        // Given
        Long id = 1L;
        Long markScaleId = 2L;

        MarkScaleValueResource markScalePaperResource = new MarkScaleValueResource();
        markScalePaperResource.setId(id);
        markScalePaperResource.setMarkScaleId(markScaleId);

        long count = 100;
        int limit = 25;
        Integer offset = 10;
        String uri = MessageFormat.format("/marks/scales/{0}/values", markScaleId);
        List<MarkScaleValueResource> entities = Arrays.asList(markScalePaperResource);
        PagedResultResource<MarkScaleValueResource> expectedResource = new PagedResultResource<>();
        expectedResource.setCount(count);
        expectedResource.setLimit(limit);
        expectedResource.setOffset(offset);
        expectedResource.setUri(uri);
        expectedResource.setResources(entities);

        MarkScaleValueResource resource = new MarkScaleValueResource();
        resource.setMarkScaleId(markScaleId);

        Map<String, Object> params = new HashMap<>();
        params.put("offset", String.valueOf(offset));
        params.put("limit", String.valueOf(limit));
        params.put("markScaleId", String.valueOf(markScaleId));
        PagedRequest<MarkScaleValueResource> pagedRequest = new PagedRequest<MarkScaleValueResource>(resource, offset, limit, Collections.<OrderBy>emptyList(), params);

        // When
        when(facade.getResources(Matchers.<PagedRequest<MarkScaleValueResource>>any())).thenReturn(expectedResource);
        String response = getJson(expectedResource, false);

        // Then
        mockMvc.perform(get("/marks/scales/{markScaleId}/values", markScaleId)
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
        Long markScaleId = 2L;

        // When
        doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());

        // Then
        mockMvc.perform(get("/marks/scales/{markScaleId}/values/{id}", markScaleId, id));

        verify(facade).getResource(id);
    }
}
