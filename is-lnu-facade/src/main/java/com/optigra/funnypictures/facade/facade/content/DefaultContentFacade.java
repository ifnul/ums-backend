package com.optigra.funnypictures.facade.facade.content;

import java.io.InputStream;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.optigra.funnypictures.content.model.Content;
import com.optigra.funnypictures.content.service.ContentService;
import com.optigra.funnypictures.facade.resources.content.ContentResource;
import com.optigra.funnypictures.facade.resources.content.ContentResourceNamingStrategy;

@Component("contentFacade")
public class DefaultContentFacade implements ContentFacade {

	private static final Logger LOG = LoggerFactory.getLogger(DefaultContentFacade.class);

	@Resource(name = "contentService")
	private ContentService contentService;
	
	@Resource(name = "namingStrategy")
	private ContentResourceNamingStrategy namingStrategy; 

	@Override
	public ContentResource getContent(String uri) {
		LOG.info("Get content by uri: {}", uri);
		
		Content content = contentService.getContentByPath(uri);

		// TODO: IP - Implement converter
		ContentResource contentResource = new ContentResource();
		contentResource.setContentStream(content.getContentStream());
		contentResource.setMimeType(content.getMimeType());
		contentResource.setPath(uri);

		return contentResource;
	}

	@Override
	public void storeContent(ContentResource resource) {
		
		Object identifier = namingStrategy.createIdentifier(resource);
		LOG.info("Store content with identifier: %s", identifier);
		
		InputStream contentStream = resource.getContentStream();
		Content content = new Content();
		content.setContentStream(contentStream);
		content.setPath(identifier.toString());		
		contentService.saveContent(content);
		
	}
}
