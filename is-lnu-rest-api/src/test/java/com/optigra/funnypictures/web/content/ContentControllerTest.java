package com.optigra.funnypictures.web.content;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.FileItemIterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.optigra.funnypictures.facade.facade.content.ContentFacade;
import com.optigra.funnypictures.facade.resources.content.ContentResource;
import com.optigra.funnypictures.model.content.MimeType;

/**
 * @date Mar 20, 2014
 * @author Iurii Parfeniuk
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ContentControllerTest{
    
    @Mock
    private ContentFacade contentFacade;
    
    @Mock
    private ServletFileUpload fileUpload;
    
    @Mock
    private FileItemIterator fileItemIterator;
    
    @Mock
    private FileItemStream fileItemStream;
    
    @InjectMocks
    private ContentController unit;
    
    @Captor
    private ArgumentCaptor<ContentResource> contentResourceCaptor;
    
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
    public void testGetContentByPath() throws Exception {
        // Given
        String contentPath = "/contentPath";
        String content = "very large content";
        InputStream inputStream = new ByteArrayInputStream(content.getBytes());
        
        ContentResource contentResource = new ContentResource();
        contentResource.setContentStream(inputStream);
        contentResource.setMimeType(MimeType.IMAGE_PNG_PNG);
        
		// When
        when(contentFacade.getContent(anyString())).thenReturn(contentResource);

        // Then
        mockMvc.perform(get("/content")
                .param("contentPath", contentPath))
            .andExpect(status().isOk());
        
        verify(contentFacade).getContent(contentPath);
    }
    
    @SuppressWarnings("unchecked")
	@Test
	public void testPostContent() throws Exception {
    	//Given
    	byte[] content = new byte[]{1, 2, 3, 4, 5};
    	InputStream contentStream = new ByteArrayInputStream(content);
    	
    	//When
    	when(fileUpload.getItemIterator(any(HttpServletRequest.class))).thenReturn(fileItemIterator);
    	when(fileItemIterator.hasNext()).thenReturn(true).thenReturn(false);
    	when(fileItemIterator.next()).thenReturn(fileItemStream).thenThrow(NoSuchElementException.class);
    	when(fileItemStream.getContentType()).thenReturn("multipart/form-data");
    	when(fileItemStream.isFormField()).thenReturn(false);
    	when(fileItemStream.openStream()).thenReturn(contentStream);
		
    	//Then
    	mockMvc.perform(post("/content").contentType(MediaType.MULTIPART_FORM_DATA).content(content)).andExpect(status().isOk());
    	verify(fileItemStream).openStream();
    	verify(contentFacade).storeContent(contentResourceCaptor.capture());
    	ContentResource actualContentResource = contentResourceCaptor.getValue();
    	assertSame(contentStream, actualContentResource.getContentStream());
	}
}
