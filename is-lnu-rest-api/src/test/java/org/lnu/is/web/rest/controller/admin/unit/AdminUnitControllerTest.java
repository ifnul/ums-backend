package org.lnu.is.web.rest.controller.admin.unit;

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
import org.lnu.is.resource.adminunit.AdminUnitResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.admin.unit.AdminUnitController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class AdminUnitControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<AdminUnitResource, AdminUnitResource, Long> facade;

    @InjectMocks
    private AdminUnitController unit;

    @Override
    protected BaseController getUnit() {
        return unit;
    }

    @Test
    public void testGetAdminUnits() throws Exception {
        // Given
        String name = "all difficult";
        AdminUnitResource resource = new AdminUnitResource();
        resource.setName(name);

        List<AdminUnitResource> entities = Arrays.asList(resource);

        int offset = 0;
        int limit = 20;
        long count = 1;
        PagedResultResource<AdminUnitResource> expected = new PagedResultResource<>("/adminunits");
        expected.setResources(entities);
        expected.setOffset(offset);
        expected.setLimit(limit);
        expected.setCount(count);

        AdminUnitResource paramResource = new AdminUnitResource();
        paramResource.setName(name);

        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        PagedRequest<AdminUnitResource> request = new PagedRequest<AdminUnitResource>(paramResource, offset, limit, Collections.<OrderBy>emptyList(), params);

        // When
        when(facade.getResources(Matchers.<PagedRequest<AdminUnitResource>>any())).thenReturn(expected);
        String response = getJson(expected, false);

        // Then
        mockMvc.perform(get("/adminunits")
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
        AdminUnitResource expected = new AdminUnitResource();
        expected.setName(name);
        expected.setId(id);

        // When
        when(facade.getResource(anyLong())).thenReturn(expected);
        String response = getJson(expected, false);

        // Then
        mockMvc.perform(get("/adminunits/{id}", id))
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
        mockMvc.perform(get("/adminunits/{id}", id));

        verify(facade).getResource(id);

    }

    @Test
    public void testCreateAdminUnit() throws Exception {
        // Given
        AdminUnitResource adminUnitResource = new AdminUnitResource();

        // When
        String request = getJson(adminUnitResource, true);
        String response = getJson(adminUnitResource, false);

        when(facade.createResource(any(AdminUnitResource.class))).thenReturn(adminUnitResource);

        // Then
        mockMvc.perform(post("/adminunits")
                .contentType(MediaType.APPLICATION_JSON)
                .content(request))
                .andExpect(status().isCreated())
                .andExpect(content().string(response));

        verify(facade).createResource(adminUnitResource);
    }

    @Test
    public void testUpdateAdminUnit() throws Exception {
        // Given
        Long id = 1L;
        AdminUnitResource adminUnitResource = new AdminUnitResource();
        adminUnitResource.setId(id);

        MessageResource responseResource = new MessageResource(MessageType.INFO, "Admin Unit Updated");

        // When
        String request = getJson(adminUnitResource, true);
        String response = getJson(responseResource, false);


        // Then
        mockMvc.perform(put("/adminunits/{id}", id)
                .contentType(MediaType.APPLICATION_JSON)
                .content(request))
                .andExpect(status().isOk())
                .andExpect(content().string(response));

        verify(facade).updateResource(id, adminUnitResource);
    }

    @Test
    public void testDeleteAdminUnit() throws Exception {
        // Given
        Long id = 1L;

        // When

        // Then
        mockMvc.perform(delete("/adminunits/{id}", id))
                .andExpect(status().is(204));

        verify(facade).removeResource(id);
    }
}
