package org.lnu.is.web.rest.controller.benefit;

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
import org.lnu.is.resource.benefit.BenefitResource;
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
public class BenefitControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<BenefitResource, BenefitResource, Long> facade;

    @InjectMocks
    private BenefitController unit;

    @Override
    protected BaseController getUnit() {
        return unit;
    }

    @Test
    public void testCreateBenefit() throws Exception {
        // Given
        BenefitResource benefitResource = new BenefitResource();

        // When
        String request = getJson(benefitResource, true);
        String response = getJson(benefitResource, false);

        when(facade.createResource(any(BenefitResource.class))).thenReturn(benefitResource);

        // Then
        mockMvc.perform(post("/benefits")
                .contentType(MediaType.APPLICATION_JSON)
                .content(request))
                .andExpect(status().isCreated())
                .andExpect(content().string(response));

        verify(facade).createResource(benefitResource);
    }

    @Test
    public void testUpdateBenefit() throws Exception {
        // Given
        Long id = 1L;
        BenefitResource benefitResource = new BenefitResource();
        benefitResource.setId(id);

        MessageResource responseResource = new MessageResource(MessageType.INFO, "Benefit updated");

        // When
        String request = getJson(benefitResource, true);
        String response = getJson(responseResource, false);


        // Then
        mockMvc.perform(put("/benefits/{id}", id)
                .contentType(MediaType.APPLICATION_JSON)
                .content(request))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).updateResource(id, benefitResource);
    }

    @Test
    public void testGetSpecoffer() throws Exception {
        // Given
        Long id = 1L;
        BenefitResource benefitResource = new BenefitResource();
        benefitResource.setId(id);

        // When
        String response = getJson(benefitResource, false);

        when(facade.getResource(anyLong())).thenReturn(benefitResource);

        // Then
        mockMvc.perform(get("/benefits/{id}", id))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).getResource(id);
    }

    @Test
    public void testDeleteBenefit() throws Exception {
        // Given
        Long id = 1L;

        // When

        // Then
        mockMvc.perform(delete("/benefits/{id}", id))
                .andExpect(status().is(204));

        verify(facade).removeResource(id);
    }

    @Test
    public void testGetBenefits() throws Exception {
        // Given
        Long id = 1L;
        BenefitResource benefitResource = new BenefitResource();
        benefitResource.setId(id);

        long count = 100;
        int limit = 25;
        Integer offset = 10;
        String uri = "/benefits";
        List<BenefitResource> entities = Arrays.asList(benefitResource);
        PagedResultResource<BenefitResource> expectedResource = new PagedResultResource<>();
        expectedResource.setCount(count);
        expectedResource.setLimit(limit);
        expectedResource.setOffset(offset);
        expectedResource.setUri(uri);
        expectedResource.setResources(entities);

        Map<String, Object> params = new HashMap<>();
        params.put("offset", String.valueOf(offset));
        params.put("limit", String.valueOf(limit));
        PagedRequest<BenefitResource> pagedRequest = new PagedRequest<BenefitResource>(new BenefitResource(), offset, limit, Collections.<OrderBy>emptyList(), params);

        // When
        when(facade.getResources(Matchers.<PagedRequest<BenefitResource>>any())).thenReturn(expectedResource);
        String response = getJson(expectedResource, false);

        // Then
        mockMvc.perform(get("/benefits")
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

        // When
        doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());

        // Then
        mockMvc.perform(get("/benefits/{id}", id));

        verify(facade).getResource(id);
    }
}
