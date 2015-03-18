package org.lnu.is.web.rest.controller.asset.address;

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
import org.lnu.is.domain.OrderBy;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.asset.address.AssetAddressResource;
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
public class AssetAddressControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<AssetAddressResource, Long> facade;
	
	@InjectMocks
	private AssetAddressController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreateAssetAddress() throws Exception {
		// Given
    	AssetAddressResource assetResource = new AssetAddressResource();
		
		// When
    	String request = getJson(assetResource, true);
		String response = getJson(assetResource, false);
    	
		when(facade.createResource(any(AssetAddressResource.class))).thenReturn(assetResource);
		
    	// Then
		mockMvc.perform(post("/assets/1/addresses")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(assetResource);
	}
    
    @Test
	public void testUpdateAssetAddress() throws Exception {
		// Given
    	Long id = 1L;
    	AssetAddressResource assetResource = new AssetAddressResource();
    	assetResource.setId(id);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "AssetAddress Updated");
		
		// When
    	String request = getJson(assetResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/assets/1/addresses/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, assetResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	AssetAddressResource assetResource = new AssetAddressResource();
    	assetResource.setId(id);

		// When
		String response = getJson(assetResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(assetResource);
		
		// Then
    	mockMvc.perform(get("/assets/1/addresses/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeleteAssetAddress() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/assets/1/addresses/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetAssetAddresss() throws Exception {
		// Given
    	Long id = 1L;
    	AssetAddressResource assetResource = new AssetAddressResource();
    	assetResource.setId(id);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/assets/1/addresses";
		List<AssetAddressResource> entities = Arrays.asList(assetResource);
    	PagedResultResource<AssetAddressResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		Long assetId = 5L;
		AssetAddressResource resource = new AssetAddressResource();
		resource.setAssetId(assetId);
		PagedRequest<AssetAddressResource> pagedRequest = new PagedRequest<AssetAddressResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<AssetAddressResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/assets/{assetid}/addresses", assetId)
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}
    
    @Test
    public void testGetAddresss() throws Exception {
    	// Given
    	Long id = 1L;
    	AssetAddressResource assetResource = new AssetAddressResource();
    	assetResource.setId(id);
    	
    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/assets/1/addresses";
    	List<AssetAddressResource> entities = Arrays.asList(assetResource);
    	PagedResultResource<AssetAddressResource> expectedResource = new PagedResultResource<>();
    	expectedResource.setCount(count);
    	expectedResource.setLimit(limit);
    	expectedResource.setOffset(offset);
    	expectedResource.setUri(uri);
    	expectedResource.setResources(entities);
    	
    	AssetAddressResource resource = new AssetAddressResource();
    	PagedRequest<AssetAddressResource> pagedRequest = new PagedRequest<AssetAddressResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
    	
    	// When
    	when(facade.getResources(Matchers.<PagedRequest<AssetAddressResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);
    	
    	// Then
    	mockMvc.perform(get("/assets/addresses")
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
		mockMvc.perform(get("/assets/1/addresses/{id}", id));
		
		verify(facade).getResource(id);
	}
}
