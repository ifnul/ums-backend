package org.lnu.is.web.rest.controller.enrolment.foreign.type;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.AccessDeniedException;
import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.enrolment.foreign.type.EnrolmentForeignTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.enrolment.foreign.type.EnrolmentForeignTypeController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EnrolmentForeignTypeControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<EnrolmentForeignTypeResource, EnrolmentForeignTypeResource, Long> facade;

    @InjectMocks
    private EnrolmentForeignTypeController unit;

    @Override
    protected BaseController getUnit() {
        return unit;
    }

    @Test
    public void testGetEnrolmentForeignTypes() throws Exception {
        // Given
        String name = "AddressN";
        Integer offset = 0;
        Integer limit = 20;
        long count = 1;

        EnrolmentForeignTypeResource resource = new EnrolmentForeignTypeResource();
        resource.setName(name);

        List<EnrolmentForeignTypeResource> entities = Arrays.asList(resource);
        PagedResultResource<EnrolmentForeignTypeResource> expected = new PagedResultResource<>("/enrolmentforeignes/types");
        expected.setResources(entities);
        expected.setCount(count);
        expected.setLimit(limit);
        expected.setOffset(offset);

        EnrolmentForeignTypeResource paramResource = new EnrolmentForeignTypeResource();
        paramResource.setName(name);

        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        PagedRequest<EnrolmentForeignTypeResource> request = new PagedRequest<EnrolmentForeignTypeResource>(paramResource, offset, limit, Collections.<OrderBy>emptyList(), params);

        // When
        when(facade.getResources(Matchers.<PagedRequest<EnrolmentForeignTypeResource>>any())).thenReturn(expected);
        String response = getJson(expected, false);

        // Then
        mockMvc.perform(get("/enrolmentforeignes/types")
                .param("name", name))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).getResources(request);

    }

    @Test
    public void testGetResource() throws Exception {
        // Given
        Long id = 1L;
        String name = "all difficult";
        String abbrName = "ad";
        EnrolmentForeignTypeResource expected = new EnrolmentForeignTypeResource();
        expected.setName(name);
        expected.setAbbrName(abbrName);
        expected.setId(id);

        // When
        when(facade.getResource(anyLong())).thenReturn(expected);
        String response = getJson(expected, false);

        // Then
        mockMvc.perform(get("/enrolmentforeignes/types/{id}", id))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).getResource(id);
    }

    @Test(expected = AccessDeniedException.class)
    public void testGetResourceWithAccessDeniedException() throws Exception {
        // Given
        Long id = 1L;

        // When
        doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());

        // Then
        mockMvc.perform(get("/enrolmentforeignes/types/{id}", id));

        verify(facade).getResource(id);
    }
}
