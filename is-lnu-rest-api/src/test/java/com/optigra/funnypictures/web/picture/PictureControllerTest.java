package com.optigra.funnypictures.web.picture;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.optigra.funnypictures.facade.facade.picture.PictureFacade;
import com.optigra.funnypictures.facade.resources.message.MessageResource;
import com.optigra.funnypictures.facade.resources.message.MessageType;
import com.optigra.funnypictures.facade.resources.picture.PictureResource;
import com.optigra.funnypictures.facade.resources.search.PagedRequest;
import com.optigra.funnypictures.facade.resources.search.PagedResultResource;
import com.optigra.funnypictures.web.AbstractControllerTest;

@RunWith(MockitoJUnitRunner.class)
public class PictureControllerTest extends AbstractControllerTest {

	@InjectMocks
	private PictureController unit;
	
	@Mock
	private PictureFacade pictureFacade;
	
	private MockMvc mockMvc;
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testGetPictures() throws Exception {
		// Given
    	PictureResource entity1 = new PictureResource();
    	entity1.setId(1L);
    	entity1.setName("Picture1");
    	entity1.setUrl("url");

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/pictures";
		List<PictureResource> entities = Arrays.asList(entity1);
    	PagedResultResource<PictureResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setEntities(entities);
    	
		PagedRequest pagedRequest = new PagedRequest(offset, limit);
		
		// When
    	String expectedResponse = objectMapper.writeValueAsString(expectedResource);
    	when(pictureFacade.getPictures(any(PagedRequest.class))).thenReturn(expectedResource);
    	
		// Then
    	mockMvc.perform(get("/pictures")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(expectedResponse));
    	
    	verify(pictureFacade).getPictures(pagedRequest);
	}
    
    @Test
    public void testPostPictures() throws Exception{
    	
    	// Given

    	Long id = 2L;
    	String name = "Name";
    	String url = "Url";
    	PictureResource inputEntity = new PictureResource();
    	inputEntity.setId(id);
    	inputEntity.setName(name);
		inputEntity.setUrl(url);
		
    	// When
    	
		String expectedResponse = objectMapper.writeValueAsString(inputEntity);
		when(pictureFacade.createPicture(any(PictureResource.class))).thenReturn(inputEntity);
	
    	// Then
    	
		mockMvc.perform(post("/pictures")
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(getJson(inputEntity, true)))
    			.andExpect(status().isOk())
    			.andExpect(content().string(expectedResponse));
    	
    }

    @Test
    public void testUpdatePictures() throws Exception{
    	
    	// Given
    	
    	Long id = 2L;
    	String name = "Name";
    	String url = "Url";
    	PictureResource inputEntity = new PictureResource();
    	inputEntity.setId(id);
    	inputEntity.setName(name);
    	inputEntity.setUrl(url);
    	
    	// When
    	MessageResource expectedResource = new MessageResource(MessageType.INFO, "Picture Resource updated");
    	String expectedResponse = objectMapper.writeValueAsString(expectedResource);
    	
    	// Then
    	
    	mockMvc.perform(put("/pictures/{id}", id)
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(getJson(inputEntity, true)))
    			.andExpect(status().isOk())
    			.andExpect(content().string(expectedResponse));
    	verify(pictureFacade).updatePicture(id, inputEntity);
    }
    
}
