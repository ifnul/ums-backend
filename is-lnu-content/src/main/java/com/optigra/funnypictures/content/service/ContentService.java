package com.optigra.funnypictures.content.service;

import com.optigra.funnypictures.content.model.Content;

public interface ContentService {

	void saveContent(Content content);

	Content getContentByPath(String path);

}
