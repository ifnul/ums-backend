package com.optigra.funnypictures.facade.facade.content;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.io.InputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.optigra.funnypictures.content.model.Content;
import com.optigra.funnypictures.content.service.ContentService;
import com.optigra.funnypictures.facade.resources.content.ContentResource;
import com.optigra.funnypictures.facade.resources.content.ContentResourceNamingStrategy;
import com.optigra.funnypictures.model.content.MimeType;

@RunWith(MockitoJUnitRunner.class)
public class DefaultContentFacadeTest {

	@Mock
	private ContentService contentService;
	
	@Mock
	private ContentResourceNamingStrategy namingStrategy; 
	
	@Mock
	private InputStream contentStream;
	
	@InjectMocks
	private DefaultContentFacade unit = new DefaultContentFacade();
	
	@Captor
	ArgumentCaptor<Content> contentCaptor;
	
	@Test
	public void testGetContent() throws Exception {
		// Given 
		String uri = "test-file.png";
		MimeType mimeType =  MimeType.IMAGE_PNG_PNG;
		ContentResource expectedContent = new ContentResource();
		expectedContent.setMimeType(mimeType );
		expectedContent.setPath(uri);
			
		Content content = new Content();
		content.setMimeType(mimeType);
		content.setPath(uri);

		// When
		when(contentService.getContentByPath(uri)).thenReturn(content);
		
		ContentResource actualContent = unit.getContent(uri);
		
		// Then
		assertEquals(expectedContent, actualContent);
	}
	
	@Test
	public void testStoreContent() throws Exception {
		//Given
		ContentResource resource = new ContentResource();
		resource.setContentStream(contentStream);
		
		//When
		Object identifier = new String("identifier");
		when(namingStrategy.createIdentifier(Mockito.any(ContentResource.class))).thenReturn(identifier);
		unit.storeContent(resource);
		
		//Then
		Mockito.verify(contentService).saveContent(contentCaptor.capture());
		Content actualContent = contentCaptor.getValue();
		assertSame(contentStream, actualContent.getContentStream());
		assertEquals(identifier.toString(), actualContent.getPath());
	}
}
