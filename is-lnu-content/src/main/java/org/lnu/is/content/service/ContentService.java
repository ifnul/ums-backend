package org.lnu.is.content.service;

import org.lnu.is.content.model.Content;

public interface ContentService {

	void saveContent(Content content);

	Content getContentByPath(String path);

}
