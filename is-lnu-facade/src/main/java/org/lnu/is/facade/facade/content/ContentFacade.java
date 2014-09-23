package org.lnu.is.facade.facade.content;

import org.lnu.is.facade.resources.content.ContentResource;

public interface ContentFacade {

	ContentResource getContent(String uri);
	
	void storeContent(ContentResource resource);
}