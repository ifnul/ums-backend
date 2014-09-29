package org.lnu.is.content.service;

import org.lnu.is.content.model.Content;

public interface ContentService {

	/**
	 * Saves content by Content object.
	 * @param content content.
	 */
	void saveContent(Content content);

	/**
	 * Get's content by path.
	 * @param path path.
	 * @return Content.
	 */
	Content getContentByPath(String path);

}
