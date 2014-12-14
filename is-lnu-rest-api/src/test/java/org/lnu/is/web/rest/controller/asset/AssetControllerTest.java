package org.lnu.is.web.rest.controller.asset;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.asset.AssetResource;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.asset.AssetController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class AssetControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<AssetResource, Long> facade;
	
	@InjectMocks
	private AssetController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreateAsset() throws Exception {
		// Given
    	AssetResource assetResource = new AssetResource();
		
		// When
    	String request = getJson(assetResource, true);
		String response = getJson(assetResource, false);
    	
		when(facade.createResource(any(AssetResource.class))).thenReturn(assetResource);
		
    	// Then
		mockMvc.perform(post("/assets")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(assetResource);
	}
    
    @Test
	public void testUpdateAsset() throws Exception {
		// Given
    	Long id = 1L;
    	AssetResource assetResource = new AssetResource();
    	assetResource.setId(id);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Asset Updated");
		
		// When
    	String request = getJson(assetResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/assets/{id}", id)
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
    	AssetResource assetResource = new AssetResource();
    	assetResource.setId(id);

		// When
		String response = getJson(assetResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(assetResource);
		
		// Then
    	mockMvc.perform(get("/assets/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testDeleteAsset() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/assets/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(id);
	}
    
    @Test
	public void testGetAssets() throws Exception {
		// Given
    	Long id = 1L;
    	AssetResource assetResource = new AssetResource();
    	assetResource.setId(id);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/assets";
		List<AssetResource> entities = Arrays.asList(assetResource);
    	PagedResultResource<AssetResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<AssetResource> pagedRequest = new PagedRequest<AssetResource>(new AssetResource(), offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<AssetResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/assets")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}
}
